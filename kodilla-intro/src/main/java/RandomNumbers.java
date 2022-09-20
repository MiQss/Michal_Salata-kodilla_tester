import java.util.Random;

public class RandomNumbers {
    int i = 30;
    int j = 0;

    public int random() {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
            System.out.println(sum);
            if (i>temp){
                i=temp;
            }
            if (j<temp){
                i=temp;
            }
        }
        return result;
    }
    public int minimum(){
        return i;
    }
    public int maksimum(){
        return j;
    }
    }




