package javaassignment.SalesManager;

public class Items {

    private String itemCode;
    private String itemName;
    private int quantity;
    private boolean needReorder;

    public Items(String itemCode, String itemName, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.quantity = quantity;
        this.needReorder = quantity <= 3;
    }
    
    



    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isNeedReorder() {
        return needReorder;
    }

    public void setNeedReorder(boolean needReorder) {
        this.needReorder = needReorder;
    }

    @Override
    public String toString() {
        return itemCode + " | " + itemName + " | " + quantity + " | " + (needReorder ? "Yes" : "No");
    }
}
