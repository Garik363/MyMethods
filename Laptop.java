package MyMethods;

public class Laptop{
    int id;//порядковый номер
    String manufacturer;//производитель
    int releaseyear;//год выпуска
    String color;//цвет
    int weight;//вес в кг
    int ram;//в gb
    int hdd;// в gb
    String os;

    public Laptop(int id, String manufacturer, int releaseyear, String color, int weight,  int ram, int hdd, String os) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.releaseyear = releaseyear;
        this.color = color;
        this.weight = weight;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
    
    }

   public int getId() {
       return id;
   }
    
    public String getColor() {
        return color;
    }
    public int getReleseyear() {
        return releaseyear;
    }
    public int getWeight() {
        return weight;
    }
    public int getStorage() {
        return hdd;
    }
    public int getRam() {
        return ram;
    }
    public String getOs() {
        return os;
    }
    public String getManufacturer() {
        return manufacturer;
    }
   
    @Override
    public String toString() {
        return "Ноутбук {" +
                "id='" + id + '\'' +
                ", manufacturer=" + manufacturer +
                ", releaseyear=" + releaseyear +
                ", color=" + color +
                ", weight=" + weight +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                '}';
    }
}
    


