package edu.icet.model.dto.item;

import edu.icet.util.item.ItemCategory;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ItemDtoSave{
    private Integer id;
    private String name;
    private ItemCategory category;
    private String brand;
    private Integer qty;
    private Double price;
    private String description;

    private Object itemObject;
}
