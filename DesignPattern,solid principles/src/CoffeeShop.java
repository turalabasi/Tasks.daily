public class CoffeeShop {
        private String name;
        private String address;
        private int capacity;
        private boolean milk;

    private CoffeeShop(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.capacity = builder.capacity;
        this.milk = builder.milk;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean ismilky() {
        return milk;
    }


    public static class Builder{

        String name;
        String address;
        int capacity;
        boolean milk;



        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder capacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder milk(boolean milk) {
            this.milk = milk;
            return this;
        }
        public CoffeeShop build() {
            return new CoffeeShop(this);
        }
        }


    }






