package aims.store;

import aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public static final int MAX_NUMBERS_INSTORE = 50;
    private List<Media> itemslnStore = new ArrayList<>();
    private int quantity = 0;

    public void addMedia(Media... m_list) {
        for (Media m : m_list) {
            if (m == null) continue;
            if (quantity > MAX_NUMBERS_INSTORE) break;
            itemslnStore.add(m);
            quantity++;
        }
    }

    public void removeMedia(Media m) {
        itemslnStore.remove(m);
        quantity--;
    }

    public ArrayList<Media> getItemsInStore(){
        return (ArrayList<Media>) itemslnStore;
    }

//    public void print() {
//        System.out.println("***********************STORE***********************");
//        for (int i = 0; i < quantity; i++) {
//            System.out.println(itemslnStore[i].toString());
//        }
//        System.out.println("**************************************************");
//    }
}