import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Ship extends Thread {
    public static class ShipDownload extends Ship {
        private final Port port;
        private int cargo;

        public ShipDownload(Port port, int cargo) {
            this.port = port;
            this.cargo = cargo;
        }

        @Override
        public void run() {
            this.port.add(this.cargo);
        }
    }
    public static class ShipUpload extends Ship {
        private final Port port;

        public ShipUpload(Port port) {
            this.port = port;
        }

        @Override
        public void run() {
            this.port.del();
        }
    }

}
