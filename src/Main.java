public class Main {
    public static void main(String[] args) {
        String[][] str = {
                {"55", "85", "99", "100"},
                {"2", "86", "99", "7"},
                {"454", "12", "55", "88"},
                {"44", "12", "55", "88"},
        };
        try {
            arrayIn(str);
        } catch (MyArraySiseException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.err.println("Это   элемент[" + e.getI() + "]" + "[" + e.getJ() + "]");
        }


        System.out.println("END");
    }

    static void arrayIn(String[][] arr) throws MyArraySiseException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4 || arr[1].length != 4
                || arr[2].length != 4 || arr[3].length != 4) {
            //System.out.println("Исключение");
            throw new MyArraySiseException("Размер массива не 4х4! Дальнейшая работа не возможна!");

        } else {
            //System.out.println("нет исключения");
            int e = 0;
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        e = Integer.parseInt(arr[i][j]);
                        sum +=e;
                    } catch (NumberFormatException ex) {
                        ex.printStackTrace();
                        throw new MyArrayDataException("В элементе массива массива не подходящее значение", i, j);
                    }
                    System.out.print(e + "\t");
                    if (j == 3) System.out.print("\n");
                }
            }
            System.out.println("Сумма элементов массива:" + sum);
        }
    }
}
