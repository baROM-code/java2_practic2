public class main {

    public static int summArray(String[][] arr) throws MyArraySizeException, MyArrayDataException{
        /**
         * Метод  вычисления суммы элементов массива
         * @param Строковый массив  размером [4,4], каждый элемент массива должен быть числом
         * @throws MyArraySizeException при размерности массива  отличном от [4,4],
         *         MyArrayDataException если элемент массива не число
         * @author baROM
         */

        if (arr.length != 4 || arr[0].length != 4 || arr[1].length != 4 || arr[2].length !=4 || arr[3].length != 4) throw new MyArraySizeException();

        int summArrayElements = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++ ){
                try {
                    summArrayElements += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("Не число в ячейке", i, j);
                }
            }
        return summArrayElements;
    }

    public static void main(String[] args) {

        String[][] arr1 =  new String[1][2];
        String[][] arr2 = {{"1", "2", "3", "4"},{"5", "qwerty", "7", "8"}, {"1", "2", "3", "4"}, {"5", "6", "7", "8"}};
        String[][] arr3 = {{"1", "2", "3", "4"},{"5", "6", "7", "8"}, {"1", "2", "3", "4"}, {"5", "6", "7", "8"}};

        System.out.println("* Обработка MyArraySizeException");
        try {
            System.out.println("Сумма элементов массива = " + summArray(arr1));
        } catch (MyArraySizeException e) {
            System.out.println("Размерность массива не [4,4]");
        } catch (MyArrayDataException e) {
            System.out.println("Не число в ячейке " + e.getIndex());
        }

        System.out.println("* Обработка MyArrayDataException");
        try {
            System.out.println("Сумма элементов массива = " + summArray(arr2));
        } catch (MyArraySizeException e) {
            System.out.println("Размерность массива не [4,4]");
        } catch (MyArrayDataException e) {
            System.out.println("Не число в ячейке " + e.getIndex());
            // e.printStackTrace();
        }

        System.out.println("* Все ОК");
        try {
            System.out.println("Сумма элементов массива = " + summArray(arr3));
        } catch (MyArraySizeException e) {
            System.out.println("Размерность массива не [4,4]");
        } catch (MyArrayDataException e) {
            System.out.println("Не число в ячейке " + e.getIndex());
        }
    }
}
