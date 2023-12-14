package com.crni99.bookstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crni99.bookstore.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String>{
	Optional<Account> findByusername(String username);
}