public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price <=1000) {
            System.out.println("The price is good.");
        }
        else {
                System.out.println("This notebook is quite expensive.");
    }
}
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("Urządzenie jest lekkie.");
        } else if (this.weight <= 1600) {
            System.out.println("Urządzenie jest niezbyt cięzkie.");
        } else {
            System.out.println("Urządzenie jest bardzo ciężkie.");
        }
    }
        public void checkPriceandYear() {
            if (this.year > 2010 && this.price <1500){
                System.out.println("Niezły sprzęt.");
            } else if (this.year < 2005 && this.price <600) {
                System.out.println("Stary gruchot.");
            }
            else {
                System.out.println("Nowy i drogi.");
            }
        }
}
