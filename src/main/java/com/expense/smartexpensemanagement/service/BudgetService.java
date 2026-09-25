package com.expense.smartexpensemanagement.service;

import com.expense.smartexpensemanagement.entity.Budget;
import com.expense.smartexpensemanagement.repository.BudgetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    private final BudgetRepository budgetRepository;

    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    public Budget addBudget(Budget budget) {
        return budgetRepository.save(budget);
    }

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }
    public Budget updateBudget(Long id, Budget updatedBudget) {
        Budget existingBudget = budgetRepository.findById(id).orElse(null);

        if (existingBudget == null) {
            return null;
        }

        existingBudget.setMonth(updatedBudget.getMonth());
        existingBudget.setAmount(updatedBudget.getAmount());

        return budgetRepository.save(existingBudget);
    }
    public void deleteBudget(Long id) {
        budgetRepository.deleteById(id);
    }
}