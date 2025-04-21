package com.vstech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vstech.model.Coin;

public interface CoinRepository extends JpaRepository<Coin,String> {
}
