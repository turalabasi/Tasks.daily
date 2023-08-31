package Task1;

public class Main {
    public static void main(String[] args) {
    //1)Single responsibility principle
        //Java-da hər bir sinifin bir işi olmalıdır.
        // Dəqiq desək, sinfi dəyişmək üçün yalnız bir səbəb olmalıdır.
        // Vahid məsuliyyət prinsipinə (SRP) əməl etməyən Java sinifinin nümunəsi budur:

//        public class Vehicle {
//            public void printDetails() {}
//            public double calculateValue() {}
//            public void addVehicleToDB() {}
//        }  Avtomobil sinfinin üç ayrı məsuliyyəti var: hesabat, hesablama və verilənlər bazası.
//        SRP tətbiq etməklə yuxarıdakı sinfi ayrı-ayrı məsuliyyətlərə malik üç sinfə ayıra bilərik.

   //2)Open-closed principle;
        //Proqram təminatı obyektləri (məsələn, siniflər, modullar, funksiyalar) genişləndirmə üçün açıq,
        // lakin modifikasiya  üçün bağlanmalıdır.

//        public class VehicleCalculations {
//            public double calculateValue(Vehicle v) {
//                if (v instanceof Car) {
//                    return v.getValue() * 0.8;
//                    if (v instanceof Bike) {
//                        return v.getValue() * 0.5;
//
//                    }
//                }
//                Tutaq ki, biz indi Truck adlı başqa bir subclass əlavə etmək istəyirik. Open-Closed Prinsipə zidd olan başqa if ifadəsi əlavə etməklə yuxarıdakı sinfi dəyişdirməli olacağıq.
//                        Car və Truck alt sinifləri üçün hesablamaValue metodunu ləğv etmək daha yaxşı yanaşma olardı:
//
//                public class Vehicle {
//                    public double calculateValue() {...}
//                }
//                public class Car extends Vehicle {
//                    public double calculateValue() {
//                        return this.getValue() * 0.8;
//                    }
//                    public class Truck extends Vehicle{
//                        public double calculateValue() {
//                            return this.getValue() * 0.9;
//                        }
       // Başqa bir Vehiclenövü əlavə etmək başqa bir alt sinif yaratmaq və Avtomobil sinfindən uzanmaq qədər sadədir.
    }

   // 3)Liskov Əvəzetmə Prinsipi (LSP) miras iyerarxiyalarına tətbiq edilir ki,
    // törəmə siniflər onların əsas sinifləri üçün tamamilə əvəz edilə bilən olmalıdır.
   // Liskov Əvəzetmə Prinsipi (LSP) bildirir ki,
    // supersinifin obyektləri proqramın düzgünlüyünə təsir etmədən onun alt siniflərinin obyektləri ilə əvəz edilə bilər.
    // Başqa sözlə, alt siniflər kodun davranışını pozmadan öz supersiniflərini əvəz edə bilməlidirlər.
//   class Rectangle {
//       protected int width;
//       protected int height;
//
//       public Rectangle(int width, int height) {
//           this.width = width;
//           this.height = height;
//       }
//
//       public int getWidth() {
//           return width;
//       }
//
//       public void setWidth(int width) {
//           this.width = width;
//       }
//
//       public int getHeight() {
//           return height;
//       }
//
//       public void setHeight(int height) {
//           this.height = height;
//       }
//
//       public int getArea() {
//           return width * height;
//       }
//   }
//
//    class Square extends Rectangle {
//        public Square(int side) {
//            super(side, side);
//        }
//
//        @Override
//        public void setWidth(int width) {
//            super.setWidth(width);
//            super.setHeight(width);
//        }
//
//        @Override
//        public void setHeight(int height) {
//            super.setWidth(height);
//            super.setHeight(height);
//        }
//    }
//
//    public class LiskovSubstitutionExample {
//        public static void main(String[] args) {
//            Rectangle rectangle = new Rectangle(5, 10);
//            useRectangle(rectangle);
//
//            // Using Liskov Substitution
//            Rectangle square = new Square(5);
//            useRectangle(square);
//        }
//
//        public static void useRectangle(Rectangle rectangle) {
//            int width = rectangle.getWidth();
//            int height = rectangle.getHeight();
//            rectangle.setWidth(2);
//            rectangle.setHeight(4);
//
//            // Check if the area is preserved
//            System.out.println("Area before modification: " + (width * height));
//            System.out.println("Area after modification: " + rectangle.getArea());
//        }
//    }

    //4) Interface segregation principle;
   // Bir sinif istifadə etmədiyi interfeysləri tətbiq etməyə məcbur edilməməlidir.
    //Müştərilər istifadə etmədikləri interfeyslərdən asılı olmağa məcbur edilməməlidirlər.

//    public interface Vehicle {
//        public void drive();
//        public void stop();
//        public void refuel();
//        public void openDoors();
//    }
//    public class Bike implements Vehicle {
//
//        // Can be implemented
//        public void drive() {...}
//        public void stop() {...}
//        public void refuel() {...}
//
//        // Can not be implemented
//        public void openDoors() {...}
//    }
//Gördüyümüz kimi, Velosiped sinifinin openDoors() metodunu tətbiq etməsinin mənası yoxdur,
// çünki velosipedin qapıları yoxdur! Bunu düzəltmək üçün ISP interfeyslərin çoxsaylı,
// kiçik birləşmiş interfeyslərə bölünməsini təklif edir ki,
// heç bir sinif hər hansı bir interfeysi və buna görə də ehtiyac duymadığı
// metodları həyata keçirməyə məcbur olmasın.


    //5)Dependency inversion principle

   // Dependency Inversion Principle (DIP) bildirir ki, biz konkret tətbiqlər (siniflər) əvəzinə
   // abstraksiyalardan (interfeyslər və abstrakt siniflər) asılı olmalıyıq.
    //Abstraksiyalar təfərrüatlardan asılı olmamalıdır; əvəzinə təfərrüatlar abstraksiyalardan asılı olmalıdır.

//    public interface Engine {
//        public void start();
//    }

//    public class Car {
//        private Engine engine;
//        public Car(Engine e) {
//            engine = e;
//        }
//        public void start() {
//            engine.start();
//        }
//    }
//    public class PetrolEngine implements Engine {
//        public void start() {...}
//    }
//    public class DieselEngine implements Engine {
//        public void start() {...}
//    }



}
