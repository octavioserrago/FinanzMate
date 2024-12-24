package com.octavioserrago.FinanzMate.controller;

import com.octavioserrago.FinanzMate.model.Expense;
import com.octavioserrago.FinanzMate.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    // GET: /api/expenses - Retrieve all expenses
    @GetMapping
    public List<Expense> getAllExpenses() {
        System.out.println("GET request received at /api/expenses");
        List<Expense> expenses = expenseService.getAllExpenses();

        if (expenses.isEmpty()) {
            System.out.println("No expenses found in the database");
        } else {
            System.out.println("Retrieved expenses: " + expenses);
        }

        return expenses;
    }

    // POST: /api/expenses - Create a new expense
    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        System.out.println("POST request received at /api/expenses with expense data: " + expense);
        Expense savedExpense = expenseService.saveExpense(expense);

        System.out.println("Expense created: " + savedExpense);
        return savedExpense;
    }
}
