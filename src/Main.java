import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите ранг матрицы: ");
            try {
                int size = sc.nextInt();
                Matrix Matr = new Matrix(size, -99, 99);
                Matr.render();
                int max1 = Matr.getMaxItem(Matrix.M.MAIN_D);
                int max2 = Matr.getMaxItem(Matrix.M.SIDE_D);
                int max = (max1 > max2) ? max1 : max2;
                Matr.setItem(max);
                Matr.render();
            } catch (Exception error)
            {
                System.out.print(error);
            }
        }
    }
}