package com.octavioserrago.FinanzMate.controller;


import com.octavioserrago.FinanzMate.model.Income;
import com.octavioserrago.FinanzMate.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/incomes")
public class IncomeController {

    @Autowired
    private IncomeService incomeService;

    // GET: /api/incomes - Retrieve all incomes
    @GetMapping
    public List<Income> getAllIncomes() {
        System.out.println("GET request received at /api/incomes");
        List<Income> incomes = incomeService.getAllIncomes();

        if (incomes.isEmpty()) {
            System.out.println("No incomes found in the database");
        } else {
            System.out.println("Retrieved incomes: " + incomes);
        }

        return incomes;
    }

    // POST: /api/incomes - Create a new income
    @PostMapping
    public Income createIncome(@RequestBody Income income) {
        System.out.println("POST request received at /api/incomes with expense data: " + income);
        Income savedIncome = incomeService.saveIncome(income);

        System.out.println("Income created: " + savedIncome);
        return savedIncome;
    }
}
