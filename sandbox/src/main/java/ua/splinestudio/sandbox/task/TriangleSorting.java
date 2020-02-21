package ua.splinestudio.sandbox.task;


import java.util.TreeSet;
import java.util.Scanner;

/*
Разработать консольную программу, выполняющую вывод треугольников в порядке убывания их площади.
После добавления каждого нового треугольника программа спрашивает, хочет ли пользователь добавить ещё один.
Если пользователь ответит “y” или “yes” (без учёта регистра), программа попросит ввести данные для ещё одного
треугольника, в противном случае – выводит результат в консоль.
•	Расчёт площади треугольника должны производится по формуле Герона.
•	Каждый треугольник определяется именем и длинами его сторон.
Формат ввода (разделитель - запятая):
<имя>, <длина стороны>, <длина стороны>, <длина стороны>
• Приложение должно обрабатывать ввод чисел с плавающей точкой.
• Ввод должен быть нечувствителен к регистру, пробелам, табам.
• Вывод данных должен быть следующем примере:
============= Triangles list: ===============
1. [Triangle first]: 17.23 сm
2. [Triangle 22]: 13 cm
3. [Triangle 1]: 1.5 cm
 */

public class TriangleSorting {

  public static void main(String[] args) {
    TreeSet<Triangle> triangleSet = new TreeSet<Triangle>();
    Scanner sc = new Scanner(System.in);
    while (true) {
      String[] dataTriangle = InputData.getData(sc);
      ValidateDataForTriangle validData = ValidateDataForTriangle.checkValidData(dataTriangle);
      if (validData.sideA != 0 && validData.sideB != 0 && validData.sideC != 0) {
        Triangle triangle = new Triangle(validData.name, validData.sideA,
                validData.sideB, validData.sideC);
        triangleSet.add(triangle);
      }
      else{
        System.out.println("Inputted data is incorrect");
      }
      System.out.println("If you want to add another triangle enter 'y' or 'yes':");
      String answer = sc.nextLine().toLowerCase().trim();
      if (answer.equals("y") || answer.equals("yes")) {
        continue;
      }
      break;
    }
    sc.close();
    Display.displaySetTriangle(triangleSet);
  }
}