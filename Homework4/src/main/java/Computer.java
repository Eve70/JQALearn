

 class Computer {
    int year;
    double price;
    String operationSystem;

    public int Computer() {
        this.year = 1990;
        this.price = 2500.00;
        this.operationSystem = "iOS";

        void display(this.year,this.price, this.operationSystem){
            System.out.println("First computer is named Computer1 with year" + this.year + "and price " +this.price +"and OS" +this.operationSystem);
        }

        static void comparePrice() {
        double price1 = 10.0;
        double price2 = 20.0;
        System.out.println(Integer.compare((int) price1, (int) price2));
            if (price1>price2){
                return -1;}
                else if(price2>price1){
                    return 1;}
                    else{
                        return 0;
                    }
                }
            }
    public static void main(String args[]){
        Computer Computer1= new Computer();
        Computer1.year=1991;
        Computer1.price=2000.00;
        Computer1.operationSystem= "MS";

        class ComputerPrices() {
            System.out.println("First computer is named Computer1 with year" + Computer1.year + "and price " +Computer1.price +"and OS" +Computer1.operationSystem);
        }
        dosplay(2000, 3000.00, "Something");
}
}