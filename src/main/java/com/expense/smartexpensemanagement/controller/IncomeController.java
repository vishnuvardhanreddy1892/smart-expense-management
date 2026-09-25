package com.expense.smartexpensemanagement.controller;

import com.expense.smartexpensemanagement.entity.Income;
import com.expense.smartexpensemanagement.service.IncomeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/income")
public class IncomeController {

    private final IncomeService incomeService;

    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    @PostMapping
    public Income addIncome(@Valid @RequestBody Income income) {
        return incomeService.addIncome(income);
    }

    @GetMapping
    public List<Income> getAllIncome() {
        return incomeService.getAllIncome();
    }

    @DeleteMapping("/{id}")
    public String deleteIncome(@PathVariable Long id) {
        incomeService.deleteIncome(id);
        return "Income deleted successfully!";
    }

    @PutMapping("/{id}")
    public Income updateIncome(
            @PathVariable Long id,
            @Valid @RequestBody Income income) {

        return incomeService.updateIncome(id, income);
    }
}