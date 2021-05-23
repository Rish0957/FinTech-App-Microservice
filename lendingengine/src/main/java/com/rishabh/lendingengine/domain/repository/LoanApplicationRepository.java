package com.rishabh.lendingengine.domain.repository;

import com.rishabh.lendingengine.application.model.LoanRequest;
import com.rishabh.lendingengine.domain.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication,Long> {
}
