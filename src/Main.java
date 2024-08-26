//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Operation evenCheck = (n) -> n % 2 == 0;
        System.out.println(sumOfEven(array, evenCheck));
    }

    public static int sumOfEven(int[] array, Operation operation) {
        int result = 0;
        for (int element: array) {
            if (operation.isEven(element)) {
                result  += element;
            }
        }
        return result;
    }
}

interface Operation {
    boolean isEven(int a);
}