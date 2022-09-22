import java.util.Random;

public class RandomNumbers {
    int min = 30;
    int max = 0;

    public int random() {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
            System.out.println(sum);
            if (min>temp){
                min=temp;
            }
            if (max<temp){
                max=temp;
            }
        }
        return result;
    }
    public int minimum(){
        return min;
    }
    public int maksimum(){
        return max;
    }
    }




