/*
Given an array of integers numbers and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/
public class Main {
    public static void main(String[] args) {
        calculate(new BruteForce());
        calculate(new TwoPassHashTable());
        calculate(new OnePassHashTable());
    }

    public static void calculate(TwoSumCalculator calculator) {
        var values = new int[]{1, 3, 2, 6};
        var result = calculator.twoSum(values, 8);
        for (var item : result) {
            System.out.println(values[item]);
        }
    }
}
