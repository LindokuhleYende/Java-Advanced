package Tutorials;

public class Tutorial1 {
    public void log(int[] numbers){
        System.out.print(numbers[0]);
    }
    public static void main(String[] args){
        Tutorial1 tutorial1 = new Tutorial1();
        tutorial1.log(new int[]{1,2,3,4,5,6,7,8,9,10});
    }
}
