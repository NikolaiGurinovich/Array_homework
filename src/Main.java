import java.awt.geom.QuadCurve2D;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
       //int [] array = new int[] {0,1,2,7,4,5,6};

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        //Task1
        System.out.println("Task 1");

        for (int num:array) {
            System.out.println(num);
        }

        System.out.println("-------------");

        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }

        //Task2
        /*System.out.println("Task2");

        Arrays.sort(array);
        System.out.println(array[0]);
        System.out.println(array[array.length-1]);*/

        //Task3
        System.out.println("Task3");
        int minIndex = 0;
        int maxIndex = 0;
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                minIndex = i;
            }
            if (array[i] > max) {
                maxIndex = i;
            }

        }
        System.out.println("min - " + minIndex);
        System.out.println("max - " + maxIndex);

        //Task4
        System.out.println("Task4");
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == 0) {
                count++;
            }
        }
        if (count != 0){
            System.out.println("Количество нулевых элементов - " + count);
        } else {
            System.out.println("Нулевые элементы отсутствуют");
        }

        //Task5
        /*System.out.println("Task5");
        int [] copyArray = Arrays.copyOf(array,array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = copyArray[array.length-1-i];
            System.out.println(array[i]);
        }*/

        //Task6
        /*System.out.println("Task6");
        int [] copyArray = Arrays.copyOf(array,array.length);
        Arrays.sort(copyArray);
        boolean isEqal = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != copyArray[i]) {
                isEqal = false;
            } else {
                isEqal = true;
            }
        }
        System.out.println(isEqal);*/

        //Task*
        System.out.println("Task*");
        int result = 0;
        for (int i =array.length -1 , n = 0; i >= 0; i--, n++ ) {
            int num = (int) Math.pow(10, i);
            result += array[n] * num;
        }
        System.out.println(result);
        result += 1;
        System.out.println(result);

        for (int i = array.length - 1 , n = 0; i >= 0; i--, n++ ) {
            int num = (int) Math.pow(10, i);
            if ( n == 0) {
                array[n] = result / num;
            } else {
                double a = (int) (result / Math.pow(10, i + 1)) * Math.pow(10, i + 1);
                array[n] = (int) (result - a) / num ;
            }
        }
        System.out.println(Arrays.toString(array));




    }

}