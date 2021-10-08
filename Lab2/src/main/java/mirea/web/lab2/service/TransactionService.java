package mirea.web.lab2.service;

import mirea.web.lab2.dto.RefillRequest;

import java.util.UUID;

public interface TransactionService {

    UUID initTransaction();

    void makeTransaction(RefillRequest request);

    Double getAccountBalance();
}
