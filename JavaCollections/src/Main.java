public class Main {

    public static void main(String[] args) {
        Home myHome = new Home();

        myHome.addDevice(new Device("Чайник", 1000, 10, true, "Medium"));
        myHome.addDevice(new Device("Плита", 5000, 100, false, "High"));
        myHome.addDevice(new Device("Стиральная машина", 5000, 100, false, "High"));
        myHome.addDevice(new Device("Светильник", 100, 4, true, "Medium"));
        myHome.addDevice(new Device("Компьютер", 500, 20, false, "Medium"));
        myHome.addDevice(new Device("Ноутбук", 500, 15, true, "Medium"));
        myHome.addDevice(new Device("Холодильник", 2000, 50, true, "High"));
        myHome.addDevice(new Device("Зарядное для телефона", 100, 2, true, "Low"));
        myHome.addDevice(new Device("Модем", 100, 5, true, "Low"));
        myHome.addDevice(new Device("Бойлер", 5000, 100, false, "High"));

        System.out.println("Потребляемая мощность" + myHome.currentHomePower());
        System.out.println("Потребляемый ампераж" + myHome.currentHomeAmperage());

        myHome.printDevices();
        myHome.sortDevicesByMaxPower();
        System.out.println("-----------------");
        System.out.println("                 ");
        System.out.println("-----------------");
        myHome.printDevices();

        System.out.println("-----------------");
        System.out.println("                 ");
        System.out.println("-----------------");
        myHome.searchEnabled();
    }
}
