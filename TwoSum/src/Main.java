/*
Amaç toplamları verilen hedefe karşılık gelecek iki sayıyı bulmak
 */
public class Main {
    public static void main(String[] args) {
        calculate(new BruteForce());
        calculate(new TwoPassHashTable());
        calculate(new OnePassHashTable());
    }

    public static void calculate(TwoSumCalculator calculator){
        var values = new int[]{1,3,2,6};
        var result = calculator.twoSum(values,8);
        for (var item: result) {
            System.out.println(values[item]);
        }
    }
}
