public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe();
        wardrobe.height = 210;
        wardrobe.doorsNumber = 2;
        wardrobe.colour = "Black";
        System.out.println("Szafa 1");
        System.out.println("Liczba drzwi :" + wardrobe.doorsNumber);
        System.out.println("Kolor :" + wardrobe.colour);
        System.out.println("Wysokość :" + wardrobe.height);
        Wardrobe wardrobe2 = new Wardrobe();
        wardrobe2.height = 150;
        wardrobe2.doorsNumber = 1;
        wardrobe2.colour = "Brown";
        System.out.println("Szafa 2");
        System.out.println("Liczba drzwi :" + wardrobe2.doorsNumber);
        System.out.println("Kolor :" + wardrobe2.colour);
        System.out.println("Wysokość :" + wardrobe2.height);
    }
}
