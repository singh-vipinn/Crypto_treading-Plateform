package com.vstech.service;

import java.util.List;

import com.vstech.domain.WalletTransactionType;
import com.vstech.model.Wallet;
import com.vstech.model.WalletTransaction;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
