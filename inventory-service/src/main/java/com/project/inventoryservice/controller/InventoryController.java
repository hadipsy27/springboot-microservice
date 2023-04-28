package com.project.inventoryservice.controller;

import com.project.inventoryservice.dto.InventoryResponse;
import com.project.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

//    http:localhost:9997/api/inventory?skuCode=iphone_13&skuCode=iphone_13_red
    @GetMapping
    @ResponseStatus(value = org.springframework.http.HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
