package com.fx;

public class OrderDetail {
    private int id;
    private int orderId;
    private int itermId;
    private int itemNum;
    private Item item;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItermId() {
        return itermId;
    }

    public void setItermId(int itermId) {
        this.itermId = itermId;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
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
