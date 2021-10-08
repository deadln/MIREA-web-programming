package mirea.web.lab2.controller;

import lombok.RequiredArgsConstructor;
import mirea.web.lab2.dto.RefillRequest;
import mirea.web.lab2.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final TransactionService service;

    @GetMapping("/init_refill")
    public UUID initTransaction()
    {
        return service.initTransaction();
    }

    @PostMapping("/refill")
    public void makeTransaction(@RequestBody RefillRequest request)
    {
        service.makeTransaction(request);
    }

    @GetMapping("/account")
    public Double getAccountBalance()
    {
        return service.getAccountBalance();
    }
}
