	package com.vstech.repository;
	
	import org.springframework.data.jpa.repository.JpaRepository;
	
	import com.vstech.domain.WithdrawalStatus;
	import com.vstech.model.Withdrawal;
	
	import java.util.List;
	
	public interface WithdrawalRepository extends JpaRepository<Withdrawal,Long> {
	    List<Withdrawal> findByUserId(Long userId);
	}
