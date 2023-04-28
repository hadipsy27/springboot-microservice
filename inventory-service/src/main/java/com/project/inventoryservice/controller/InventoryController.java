package com.project.inventoryservice.controller;

import com.project.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping("/{skuCode}")
    @ResponseStatus(value = org.springframework.http.HttpStatus.OK)
    public boolean skuCode(@PathVariable String skuCode) {
        return inventoryService.isInStock(skuCode);
    }
}
