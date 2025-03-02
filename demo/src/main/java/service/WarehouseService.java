package service;


import pojo.Warehouse;

public interface WarehouseService {
    int addWarehouse(Warehouse warehouse);  // 添加仓库 ‌:ml-citation{ref="1,7" data="citationList"}
    Warehouse getWarehouseById(String id);  // 查询仓库详情
}
