package com.octavioserrago.FinanzMate.service;

import com.octavioserrago.FinanzMate.model.Expense;
import com.octavioserrago.FinanzMate.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    // Método para obtener todos los gastos
    public List<Expense> getAllExpenses() {
        try {
            return expenseRepository.findAll();
        } catch (Exception e) {
            // Aquí podrías registrar el error o manejarlo de alguna forma
            throw new RuntimeException("Error al obtener los gastos", e);
        }
    }

    // Método para guardar un nuevo gasto
    public Expense saveExpense(Expense expense) {
        try {
            return expenseRepository.save(expense);
        } catch (Exception e) {
            // Aquí podrías registrar el error o manejarlo de alguna forma
            throw new RuntimeException("Error al guardar el gasto", e);
        }
    }
}
