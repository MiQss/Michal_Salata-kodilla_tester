public class Grades {
    private final int []grades;
    private int size;

    public Grades(){
        this.grades=new int[10];
        this.size=0;
    }
    public void add (int value){
        if (this.size==10){
            return;
        }
        this.grades[this.size]=value;
        this.size++;
    }

    public double last() {
        if (size==0){
            System.out.println("Brak ocen");
            return 0;
        }
        return grades[size-1];
    }

    public double average() {
        double sum=0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum/size;
    }
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(1);
        grades.add(2);
        grades.add(3);
        grades.add(2);
        grades.add(5);
        System.out.println("Ostatnia ocena:"+ grades.last());
        System.out.println("Średnia ocen:"+ grades.average());
    }

}
