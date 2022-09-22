public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[5];
        animals[0] = "dog";
        animals[1] = "cat";
        animals[2] = "mouse";
        animals[3] = "bird";
        animals[4] = "fish";
        System.out.println(animals[3]);
        int numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");
    }

}
