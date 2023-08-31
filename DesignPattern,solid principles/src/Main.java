//Task.4) Builder den istifadə edərək CoffeeShop yaradın
public class Main {
    public static void main(String[] args) {


          CoffeeShop coffeeShop = new CoffeeShop.Builder()
                  .name("sons of Anarchy")
                  .address("mirali qashqai")
                  .capacity(348)
                  .milk(true)
                  .build();


        System.out.println("Coffeeshop name : " + coffeeShop.getName());
        System.out.println("Coffeeshop address : " + coffeeShop.getAddress());
        System.out.println("Coffeeshop capacity : " + coffeeShop.getCapacity());
        System.out.println("ismilky? : " + coffeeShop.ismilky());
    }


}
