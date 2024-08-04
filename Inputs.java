package MyMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * LaptopIns Класс заполняет инфу про ноутбуки
 */
public class Inputs{
    public static List<Laptop> createLaptops() {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop(1, "Asus", 2013,"Black", 4, 8, 256, "Windows"));
        laptops.add(new Laptop(22, "Asus", 2012, "Red", 3, 4, 256, "Windows"));
        laptops.add(new Laptop(31, "Apple", 2020,"Silver", 2, 16, 512, "MacOS"));
        laptops.add(new Laptop(14, "Lenovo",2018, "White", 3, 16, 1024, "Linux"));
        laptops.add(new Laptop(6, "Huawei",2022, "Black", 4, 8, 750, "Windows"));
        laptops.add(new Laptop(41, "HP",2021,"Grey", 2, 16, 512, "Windows"));
        laptops.add(new Laptop(7, "Lenovo", 2017,"Blue", 2, 8, 750, "none"));
        return laptops;
    }
}


