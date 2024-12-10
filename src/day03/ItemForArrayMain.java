package day03;

public class ItemForArrayMain {

    public static void main(String[] args) {
        ItemForArray[] items = new ItemForArray[3];

        ItemForArray item1 = new ItemForArray("컵", 10000);
        ItemForArray item2 = new ItemForArray("연필", 1000);
        ItemForArray item3 = new ItemForArray("바나나", 3000);

        System.out.println(item1.getName());
        System.out.println(item2.getName());
        System.out.println(item3.getName());

        System.out.println(item1.getPrice());
        System.out.println(item2.getPrice());
        System.out.println(item3.getPrice());

        items[0] = item1;
        items[1] = item2;
        items[2] = item3;

        int sum = 0;
        for (ItemForArray item : items) {
            System.out.println("상품: " + item.getName() + ", 가격: " + item.getPrice());
            sum += item.getPrice();
        }
        System.out.println("총 가격: " + sum);
    }
}
