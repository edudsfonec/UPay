package api.upay.controller;


import api.upay.dto.TransactionDto;
import api.upay.model.Transaction;
import api.upay.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public ResponseEntity<String> itsok(){
        return ResponseEntity.ok("UPay is running");
    }

    @PostMapping
    public ResponseEntity<Void> createTransaction(@Valid @RequestBody TransactionDto transactionDto){
        if (transactionDto.getDataHora().isAfter(OffsetDateTime.now()) || transactionDto.getValor() <= 0) {
            return ResponseEntity.unprocessableEntity().build();
        }

        transactionService.addTransaction(new Transaction(transactionDto.getValor(), transactionDto.getDataHora()));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> clearTransactions() {
        transactionService.clearTransactions();
        return ResponseEntity.ok().build();
    }


}
