package com.octavioserrago.FinanzMate.service;

import com.octavioserrago.FinanzMate.model.Income;
import com.octavioserrago.FinanzMate.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeService {

    @Autowired
    private IncomeRepository incomeRepository;

    // Método para obtener todos los Ingresos
    public List<Income> getAllIncomes() {
        try {
            return incomeRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener los ingresos", e);
        }
    }

    // Método para guardar un nuevo Ingreso
    public Income saveIncome(Income income) {
        try {
            return incomeRepository.save(income);
        } catch (Exception e) {
            // Aquí podrías registrar el error o manejarlo de alguna forma
            throw new RuntimeException("Error al guardar el ingreso", e);
        }
    }
}
