package com.octavioserrago.FinanzMate.repository;

import com.octavioserrago.FinanzMate.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
