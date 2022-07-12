package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int summ = 0;
        while(number != 0){
            summ += number % 10;
            number = number / 10;
        }
        System.out.println(summ);
    }
}

