import java.util.*;

class Cart {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> itemName = new ArrayList<>();
    ArrayList<Integer> price = new ArrayList<>();

    public void addItems() {
        System.out.print("Enter item name: ");
        itemName.add(sc.next());
        System.out.print("Enter item price: ");
        price.add(sc.nextInt());
    }

    public void showItems() {
        System.out.println();
        System.out.println("Shopping cart");
        System.out.println();
        for (int i = 0; i < itemName.size(); i++) {
            System.out.println(
                    i + 1 + "\t" + itemName.get(i).toString() + "\t" + price.get(i).toString());
        }
    }

    public void deleteItems() {
        System.out.print("Enter the number of item to delete: ");
        int n = sc.nextInt();
        itemName.remove(n - 1);
        price.remove(n - 1);
    }

    public void updateItems() {
        System.out.println("Enter the number of item you want to update");
        int n = sc.nextInt();
        System.out.print("Enter item name: ");
        itemName.set(n - 1, sc.next());
        System.out.print("Enter item price: ");
        price.set(n - 1, sc.nextInt());
    }

    public void order() {
        System.out.println("Enter the item you want to order");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("Order successfull");
        System.out.println("Item name: " + itemName.get(n - 1));
        System.out.println("Item name: " + price.get(n - 1));
        System.out.println();
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart c = new Cart();
        int ch = 0;
        while (true) {
            System.out.println();
            System.out.println("Enter 1 to add item");
            System.out.println("Enter 2 to delete item");
            System.out.println("Enter 3 to see items");
            System.out.println("Enter 4 to update items");
            System.out.println("Enter 5 to order an item");
            System.out.println("Enter 6 to exit");
            System.out.println();
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    c.addItems();
                    break;
                case 2:
                    c.deleteItems();
                    break;
                case 3:
                    c.showItems();
                    break;
                case 4:
                    c.updateItems();
                    break;
                case 5:
                    c.order();
                    break;
                case 6:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
