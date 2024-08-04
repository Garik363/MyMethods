package MyMethods;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        LaptopsMarket store = new LaptopsMarket(); // создаем  хранилище
        List<Laptop> laptops = Inputs.createLaptops(); // создаем ноуты в LaptopIns через createLaptops
        for (Laptop laptop : laptops) {
            store.addLaptop(laptop); // добавляем ноуты в хранилище
        }

        Scanner scanner = new Scanner(System.in);
        Map<Integer, Object> filters = new HashMap<>();// создаем фильтр для поиска
        while (true) {
            System.out.println( "______________________________________________________________________________________");
            System.out.println("Выберите параметры поиска, \nВведите цифру для выбора.\n" +
                    "Если ничего не найдено - сбросьте фильтр.\n" +
                    "______________________________________________________________________________________");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - HDD size");
            System.out.println("3 - ОС");
            System.out.println("4 - Производитель");
            System.out.println("5 - Вес");
            System.out.println("6 - Цвет");
            System.out.println("7 - Год выпуска");
            System.out.println("8 - Сброс фильтра");
            System.out.println("9 - Показать все ноутбуки");
            System.out.println("0 - Выход");
            System.out.println( "______________________________________________________________________________________");
            int choice;
            while (true) { // проверяем ввод на числа
                try {
                    choice = scanner.nextInt();
                    scanner.nextLine();// ждем новый ввод
                    break; // Ввод правильный
                } catch (InputMismatchException e) {// ошибка ввода
                    System.out.println("Введите число.");
                    scanner.next(); // неверный ввод, ждем новый ввод
                }
            }

            if (choice == 0) {
                System.out.println("Выход из программы.");
                break;
            } else if (choice == 8) {
                filters.clear(); // очищаем фильтр
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Введите мин ОЗУ(GB): ");
                    int minRam = scanner.nextInt();//тут не проверяется на число и если ввести буквы вылетает
                    filters.put(1, minRam);
                    break;
                case 2:
                    System.out.println("Введите мин HDD(GB): ");
                    int minStorage = scanner.nextInt();//тут не проверяется на число и если ввести буквы вылетает
                    filters.put(2, minStorage);
                    break;
                case 3:
                    System.out.println("Введите ОС: ");
                    String os = scanner.next();
                    filters.put(3, os);
                    break;
                case 4:
                    System.out.println("Введите Производителя: ");
                    String manufacturer = scanner.next();
                    filters.put(4, manufacturer);
                    break;
                case 5:
                    System.out.println("Введите Минимальный вес: ");
                    int minWeight = scanner.nextInt();
                    filters.put(5, minWeight);
                    break;
                case 6:
                    System.out.println("Введите Цвет: ");
                    String color = scanner.next();
                    filters.put(6, color);
                    break;
                case 7:
                    System.out.println("Введите Год выпуска: ");
                    int minReleaseyear = scanner.nextInt();
                    filters.put(7, minReleaseyear);
                    break;
                case 9:
                    filters.clear(); // очищаем фильтр
                    break;
                default:
                    System.out.println("Неверный выбор.");
                    continue;
            }
                Set<Laptop> fLaptops = store.filterLaptops(filters);
                System.out.println("============================================");
                for (Laptop laptop : fLaptops) {
                    System.out.println(laptop);
                }
                System.out.println("============================================");
                System.out.println("Всего: " + fLaptops.size()+" выбрано.");
                System.out.println("============================================");
                System.out.println("Выбрано: " + choice);
            }
        }
    }