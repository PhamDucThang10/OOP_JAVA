package aims.cart;

import aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public final static int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemOrdered = new ArrayList<>();

    public int getNumberOrdered() {
        return itemOrdered.size();
    }

    public List<Media> getItemOrdered() {
        return itemOrdered;
    }

    public void addMedia(Media m) {
        if (itemOrdered.size() <= MAX_NUMBERS_ORDERED && !itemOrdered.contains(m)) {
            itemOrdered.add(m);
            System.out.println("The media has been added");
        } else {
            System.out.println("The cart is almost full");
        }
    }

    public void removeMedia(Media m) {
        itemOrdered.remove(m);
        System.out.println(m.getTitle() + "has been deleted");
    }

    public float totalCost() {
        float sum = 0f;
        for (Media m : itemOrdered) {
            sum += m.getCost();
        }
        return sum;
    }

    public Media searchByTitle(String title) {
        for (Media m : itemOrdered) {
            if (m.getTitle().equals(title)) return m;
        }
        return null;
    }

    public void filterByTitle(String title) {
        for (Media m : itemOrdered) {
            if (m.getTitle().contains(title)) {
                System.out.println(m.toString());
            }
        }
    }

    public void filterById(int id) {
        for (Media m : itemOrdered) {
            if (m.getId() == id) {
                System.out.println(m.toString());
            }
        }
    }

    public void sortByTitle() {
        itemOrdered.sort(new MediaComparatorByTitleCost());

    }

    public void sortByCost() {
        itemOrdered.sort(new MediaComparatorByCostTitle());
    }

    public void removeAllItem() {
        itemOrdered.clear();
    }


//    public void print() {
//        System.out.println("***********************CART***********************");
//        for (int i = 0; i < qtyOrdered; i++) {
//            System.out.println(itemsOrdered[i].toString());
//        }
//        System.out.println("**************************************************");
//    }
//
//    public DigitalVideoDisc searchByID(int number) {
//        for (int i = 0; i < qtyOrdered; i++) {
//            if (itemsOrdered[i].getId() == number) {
//                System.out.println("Found: " + itemsOrdered[i].toString());
//                return itemsOrdered[i];
//            }
//        }
//        System.out.println("Item not found.");
//        return null;
//    }
//
//    public DigitalVideoDisc searchByTitle(String keyword) {
//        for (int i = 0; i < qtyOrdered; i++) {
//            if (itemsOrdered[i].isMatch(keyword)) {
//                System.out.println("Found: " + itemsOrdered[i].toString());
//                return itemsOrdered[i];
//            }
//        }
//        System.out.println("Item not found.");
//        return null;
//    }
}