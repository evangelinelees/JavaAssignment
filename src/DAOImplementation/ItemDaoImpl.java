package DAOImplementation;

import DAOImplementation.ItemDao;
import Models.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements ItemDao {
    private List<Item> itemList = new ArrayList<>();

    @Override
    public void addItem(Item item) {
        itemList.add(item);
    }

    @Override
    public Item getItemById(int itemId) {
        for (Item item : itemList) {
            if (item.getItemId() == itemId) { // Updated method
                return item;
            }
        }
        return null; // Return null if not found
    }

    @Override
    public void updateItem(Item item) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getItemId() == item.getItemId()) { // Updated method
                itemList.set(i, item);
                return; // Item updated, exit the method
            }
        }
    }

    @Override
    public void deleteItem(int itemId) {
        itemList.removeIf(item -> item.getItemId() == itemId); // Updated method
    }

    @Override
    public List<Item> getAllItems() {
        return new ArrayList<>(itemList); // Return a copy of the item list
    }
}
