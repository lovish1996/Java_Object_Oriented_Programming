package source_code.labsheet_4;

public class Item {
    private int itemId;
    private double price;

    private String itemName;

    public Item(int itemId, double price, String itemName) {
        this.itemId = itemId;
        this.price = price;
        this.itemName = itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public double getPrice() {
        return price;
    }

    public String getItemName() {
        return itemName;
    }
}
