package com.expense.smartexpensemanagement.repository;

import com.expense.smartexpensemanagement.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
}