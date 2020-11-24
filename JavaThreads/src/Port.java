import java.util.LinkedList;
import java.util.Queue;

public class Port {

    private Queue<Integer> data = new LinkedList<Integer>();

    public synchronized void add(int e) {
        while (this.data.size() > 3) {
            System.out.println("Извините порт перегружен, " + Thread.currentThread().getName() + " ожидает очереди когда произведётся отгрузка из порта");
            try {
                wait();
            } catch (InterruptedException e1) {
                System.out.println("итеррапт перехвачен");
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e3) {
            e3.printStackTrace();
        }
        this.data.add(e);
        System.out.println(Thread.currentThread().getName() + " Доставил груз в порт, текущая загруженность порта " + this.data.size() + " из 3");
        notifyAll();
    }

    public synchronized int del() {
        while (this.data.size() == 0) {
            System.out.println("Извините, в порту груз отсутствует, " + Thread.currentThread().getName() + " ожидает очереди когда груз поступит в порт");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("итеррапт перехвачен");
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int rsl = this.data.poll();
        System.out.println(Thread.currentThread().getName() + " Произвёл отгрузку из порта, текущая заполненность порта " + this.data.size() + " из 3");
        notifyAll();
        return rsl;
    }
}
