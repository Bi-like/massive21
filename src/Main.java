
public class Main {
    public static void main(String[] args) {
        long array[];

        final int size = 100;

        array = new long[size];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < size ;i++){
            array[i] = array[i-1] + array[i-2];
            //ряд фибоначи - каждый элемент равен сумме двух предидущих элементов
           // array[i] = array[i-1] + 3*i;
        }

        for (int i = 0; i < size; i++){
            System.out.println(array[i]);
        }
    }
}