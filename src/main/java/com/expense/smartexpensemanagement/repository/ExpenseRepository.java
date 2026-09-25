package com.expense.smartexpensemanagement.repository;

import com.expense.smartexpensemanagement.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}