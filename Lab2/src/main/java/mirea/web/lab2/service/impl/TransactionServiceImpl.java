package mirea.web.lab2.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mirea.web.lab2.dto.RefillRequest;
import mirea.web.lab2.service.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashSet;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private Double accountBalance = 0.0;
    private HashSet<UUID> transactions = new HashSet<UUID>();

    public UUID initTransaction(){
        UUID id = UUID.randomUUID();
        transactions.add(id);
        return id;
    }

    public void makeTransaction(RefillRequest request){
        if(transactions.contains(request.getId())){
            accountBalance += request.getSum();
            transactions.remove(request.getId());
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Transaction not found");
        }
    }

    public Double getAccountBalance(){
        return accountBalance;
    }
}
