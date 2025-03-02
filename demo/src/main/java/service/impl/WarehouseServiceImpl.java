package service.impl;

import lombok.RequiredArgsConstructor;
import mapper.WarehouseMapper;
import org.springframework.stereotype.Service;
import pojo.Warehouse;
import service.WarehouseService;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class WarehouseServiceImpl implements WarehouseService {
    private final WarehouseMapper warehouseMapper;

    @Override
    public int addWarehouse(Warehouse warehouse) {
        warehouse.setCreateTime(LocalDateTime.now());
        return warehouseMapper.insert(warehouse);  // 调用Mapper层 ‌:ml-citation{ref="1,6" data="citationList"}
    }

    @Override
    public Warehouse getWarehouseById(String id) {
        return warehouseMapper.selectById(id);
    }
}
