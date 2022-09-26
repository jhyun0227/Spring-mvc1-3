package hello.itemservice.domain.item;

import lombok.Getter;
import lombok.Setter;

//@Data 예상치 못하게 동작할 가능성이있어서 핵심 도메인에는 사용하지 않는 것을 권장
@Getter @Setter
public class Item {

    private Long id;            //상품ID
    private String itemName;    //상품명
    private Integer price;      //가격  int는 null값을 넣을 수 없지만 Integer는 null값을 넣을 수 있다.
    private Integer quantity;   //수량

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
