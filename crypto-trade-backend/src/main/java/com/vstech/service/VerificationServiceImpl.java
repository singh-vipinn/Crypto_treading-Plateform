package com.vstech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vstech.domain.VerificationType;
import com.vstech.model.User;
import com.vstech.model.VerificationCode;
import com.vstech.repository.VerificationRepository;
import com.vstech.utils.OtpUtils;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.Random;

@Service
public class VerificationServiceImpl implements VerificationService{

    @Autowired
    private VerificationRepository verificationRepository;

    @Override
    public VerificationCode sendVerificationOTP(User user, VerificationType verificationType) {

        VerificationCode verificationCode = new VerificationCode();

        verificationCode.setOtp(OtpUtils.generateOTP());
        verificationCode.setUser(user);
        verificationCode.setVerificationType(verificationType);

        return verificationRepository.save(verificationCode);
    }

    @Override
    public VerificationCode findVerificationById(Long id) throws Exception {
        Optional<VerificationCode> verificationCodeOption=verificationRepository.findById(id);
        if(verificationCodeOption.isEmpty()){
            throw new Exception("verification not found");
        }
        return verificationCodeOption.get();
    }

    @Override
    public VerificationCode findUsersVerification(User user) throws Exception {
        return verificationRepository.findByUserId(user.getId());
    }

    @Override
    public Boolean VerifyOtp(String opt, VerificationCode verificationCode) {
        return opt.equals(verificationCode.getOtp());
    }

    @Override
    public void deleteVerification(VerificationCode verificationCode) {
        verificationRepository.delete(verificationCode);
    }


}
