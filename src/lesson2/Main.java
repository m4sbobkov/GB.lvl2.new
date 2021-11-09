package lesson2;

public class Main {
    public static final int ARRAY_SIZE = 4;
    public static void main(String[] args) {

        String[][] arr1 = {
                {"2", "1", "12", "3"},
                {"3", "3", "4", "5"},
                {"11", "3", "3"},
                {"1", "5", "12", "3"}
        };
        String[][] arr2 = {
                {"1", "5", "12", "3"},
                {"3", "3", "2", "5"},
                {"11", "3", "3", "Rambo"},
                {"1", "5", "12", "3"}
        };
        String[][] arr3 = {
                {"1", "5", "12", "3"},
                {"3", "3", "2", "5"},
                {"11", "3", "3", "-14"},
                {"1", "5", "12", "3"}
        };


    Summary(arr1);
    Summary(arr2);
    Summary(arr3);
    }

    static void Summary (String[][]  arr) {
        int sum = 0;
        checkArraySize(arr.length);
        for (int i = 0; i < arr.length; i++) {
            checkArraySize(arr[i].length);}

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try{
                    sum += Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException("В строке номер: " + (i+1) + ", " + (j+1) + " элемент массива, не является числом");
                }
            }
        }


        System.out.println("Сумма элементов массива: " + sum);


    }

    public static void checkArraySize (int length) throws MyArraySizeException {
        if (length != ARRAY_SIZE) {
            throw new MyArraySizeException("Array size now " + length + " Must be " + ARRAY_SIZE);
        }
    }
}
