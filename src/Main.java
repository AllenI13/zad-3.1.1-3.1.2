public class Main {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe("Black", 2,210);
        System.out.println("Szafa 1");
        System.out.println("Liczba drzwi :" + wardrobe.doorsNumber);
        System.out.println("Kolor :" + wardrobe.colour);
        System.out.println("Wysokość :" + wardrobe.height);
        Wardrobe wardrobe2 = new Wardrobe("Brown", 1,150);
        System.out.println("Szafa 2");
        System.out.println("Liczba drzwi :" + wardrobe2.doorsNumber);
        System.out.println("Kolor :" + wardrobe2.colour);
        System.out.println("Wysokość :" + wardrobe2.height);
    }
}
