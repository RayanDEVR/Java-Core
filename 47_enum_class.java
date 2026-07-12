enum Laptop
{
    HP(1000), MacBook(1500), Lenovo(1700), Asus(2000);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}


class EnumClass {
    public static void main(String[] args) {
        Laptop[] lap = Laptop.values();
        
        for (Laptop l : lap){
            System.out.println(l + ": " + l.getPrice());
        }

    }
}
