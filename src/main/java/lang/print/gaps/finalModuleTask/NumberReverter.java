package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        while (number !=0){
            System.out.print(number%10);
            number = number /10;
        }


    }
}
