package com.expense.smartexpensemanagement.controller;

import com.expense.smartexpensemanagement.entity.Budget;
import com.expense.smartexpensemanagement.service.BudgetService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/budgets")
public class BudgetController {

    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @PostMapping
    public Budget addBudget(@Valid @RequestBody Budget budget) {
        return budgetService.addBudget(budget);
    }

    @GetMapping
    public List<Budget> getAllBudgets() {
        return budgetService.getAllBudgets();
    }

    @PutMapping("/{id}")
    public Budget updateBudget(
            @PathVariable Long id,
            @Valid @RequestBody Budget budget) {

        return budgetService.updateBudget(id, budget);
    }

    @DeleteMapping("/{id}")
    public String deleteBudget(@PathVariable Long id) {
        budgetService.deleteBudget(id);
        return "Budget deleted successfully!";
    }
}