package com.fx;

public class OrderDetail {
    private Integer id;
    private Integer orderId;
    private Integer itermId;
    private Integer itemNum;
    private Item item;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getItermId() {
        return itermId;
    }

    public void setItermId(Integer itermId) {
        this.itermId = itermId;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", itermId=" + itermId +
                ", itemNum=" + itemNum +
                ", item=" + item +
                '}';
    }
}
