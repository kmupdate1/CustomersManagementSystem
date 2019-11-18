package Entity;

import java.util.Date;

public class Items {
    private int itemsId;
    private String itemsName;
    private int itemsPrice;
    private Date itemsCreatedAt;
    private Date itemsUpdatedAt;

    public void setItemsId(int itemsId) {
        this.itemsId = itemsId;
    }

    public void setItemsName(String itemsName) {
        this.itemsName = itemsName;
    }

    public void setItemsPrice(int itemsPrice) {
        this.itemsPrice = itemsPrice;
    }

    public void setItemsCreatedAt(Date itemsCreatedAt) {
        this.itemsCreatedAt = itemsCreatedAt;
    }

    public void setItemsUpdatedAt(Date itemsUpdatedAt) {
        this.itemsUpdatedAt = itemsUpdatedAt;
    }


    public int getItemsId() {
        return itemsId;
    }

    public String getItemsName() {
        return itemsName;
    }

    public int getItemsPrice() {
        return itemsPrice;
    }

    public Date getItemsCreatedAt() {
        return itemsCreatedAt;
    }

    public Date getItemsUpdatedAt() {
        return itemsUpdatedAt;
    }
}
