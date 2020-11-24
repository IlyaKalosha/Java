import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Home {
    ArrayList<Device> homeDevices;

    public Home(){
        homeDevices = new ArrayList<Device>();
    }

    public void addDevice(Device device){
        homeDevices.add(device);
    }

    public void deleteDevice(Device device){
        homeDevices.remove(device);
    }

    public void deleteDevice(String name){
        for (var deviceToDelete:
             homeDevices) {
            if(deviceToDelete.getName() == name)
                homeDevices.remove(deviceToDelete);
        }
    }

    public void clearHomeDevices(){
        homeDevices.clear();
    }

    public int currentHomePower(){
        int currentPower = 0;

        for (var device:
             homeDevices) {
            if(device.isEnabled())
                currentPower += device.getPower();
        }

        return currentPower;
    }

    public int currentHomeAmperage(){
        int currentAmperage = 0;

        for (var device:
                homeDevices) {
            if(device.isEnabled())
                currentAmperage += device.getAmperage();
        }

        return currentAmperage;
    }

    public void sortDevicesByMaxPower(){
        Collections.sort(homeDevices);
    }

    public void printDevices(){
        for (var device:
             homeDevices) {
            System.out.println(device.toString());
        }
    }

    public void searchByName(String name){
        for (var device:
             homeDevices) {
            if(device.getName() == name)
               System.out.println(device.toString());
        }
    }

    public void searchByPower(int power){
        for (var device:
                homeDevices) {
            if(device.getPower() == power)
                System.out.println(device.toString());
        }
    }

    public void searchByAmperage(int amperage){
        for (var device:
                homeDevices) {
            if(device.getAmperage() == amperage)
                System.out.println(device.toString());
        }
    }

    public void searchEnabled(){
        for (var device:
                homeDevices) {
            if(device.isEnabled() == true)
                System.out.println(device.toString());
        }
    }
    public void searchByType(String type){
        for (var device:
                homeDevices) {
            if(device.getType() == type)
                System.out.println(device.toString());
        }
    }
}
