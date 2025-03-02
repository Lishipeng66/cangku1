package pojo;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Warehouse {
    private String warehouseId;  // 仓库编号 ‌:ml-citation{ref="3,4" data="citationList"}
    private String warehouseName; // 仓库名称
    private String address;       // 仓库地址（可选扩展字段）
    private LocalDateTime createTime; // 创建时间
}