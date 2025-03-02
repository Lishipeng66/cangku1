package controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pojo.Result;
import pojo.Warehouse;
import service.WarehouseService;

@RestController
@RequestMapping("/api/warehouses")
@RequiredArgsConstructor
public class WarehouseController {
    private final WarehouseService warehouseService;

    @PostMapping
    public Result addWarehouse(@RequestBody Warehouse warehouse) {
        int result = warehouseService.addWarehouse(warehouse);
        return result > 0 ? Result.success() : Result.fail("添加失败");  // 统一响应格式 ‌:ml-citation{ref="1,7" data="citationList"}
    }

    @GetMapping("/{id}")
    public Result getWarehouse(@PathVariable String id) {
        Warehouse warehouse = warehouseService.getWarehouseById(id);
        return warehouse != null ? Result.success(warehouse) : Result.fail("仓库不存在");
    }
}

// 统一响应实体
