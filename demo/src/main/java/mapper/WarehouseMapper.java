package mapper;

import org.apache.ibatis.annotations.*;
import pojo.Warehouse;

@Mapper
public interface WarehouseMapper {
    @Insert("INSERT INTO warehouse(warehouse_id, warehouse_name, address, create_time) " +
            "VALUES(#{warehouseId}, #{warehouseName}, #{address}, #{createTime})")
    int insert(Warehouse warehouse);  // 新增仓库 ‌:ml-citation{ref="5,6" data="citationList"}

    @Select("SELECT * FROM warehouse WHERE warehouse_id = #{id}")
    Warehouse selectById(String id);  // 根据ID查询 ‌:ml-citation{ref="6" data="citationList"}

    @Update("UPDATE warehouse SET warehouse_name=#{warehouseName}, address=#{address} " +
            "WHERE warehouse_id=#{warehouseId}")
    int update(Warehouse warehouse);  // 更新仓库信息

    @Delete("DELETE FROM warehouse WHERE warehouse_id=#{id}")
    int delete(String id);            // 删除仓库
}