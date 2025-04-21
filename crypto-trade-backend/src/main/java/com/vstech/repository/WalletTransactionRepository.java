package com.vstech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vstech.domain.WalletTransactionType;
import com.vstech.model.Wallet;
import com.vstech.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction,Long> {

    List<WalletTransaction> findByWalletOrderByDateDesc(Wallet wallet);

}
