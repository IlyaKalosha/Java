import java.util.Objects;

public class Device implements Comparable{
    private String name;
    private int power;
    private int amperage;
    private boolean isEnabled;
    private String type;

    public Device(String name, int power, int amperage, boolean isEnabled, String type){
        this.name = name;
        this.power = power;
        this.amperage = amperage;
        this.isEnabled = isEnabled;
        this.type = type;
    }

    public Device(){
        this.name = "";
        this.power = 0;
        this.amperage = 0;
        this.isEnabled = false;
        this.type = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAmperage() {
        return amperage;
    }

    public void setAmperage(int amperage) {
        this.amperage = amperage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power, amperage, isEnabled, type);
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", amperage=" + amperage +
                ", isEnabled=" + isEnabled +
                ", type='" + type + '\'' +
                '}';
    }
    @Override
    public int compareTo(Object device){
        device = (Device)device;
        int comparePower = ((Device) device).power;
        return this.power - comparePower;
    }
}
