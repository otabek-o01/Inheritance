package Laptop;

public class Electronici {
    protected String brend;
    protected double price;

    public Electronici(String brend, double price) {
        this.brend = brend;
        this.price = price;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showinfo() {
        System.out.print("Brend = " + brend + ", Narxi: $" + price);
    }
}

class Computer extends Electronici {
    private int ramSize;

    public Computer(String brend, double price, int ramSize) {
        super(brend, price);
        this.ramSize = ramSize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.print(", RamSize = " + ramSize + " (GB)");
    }
}

class PC extends Computer {
    private int monitorSize;

    public PC(String brend, double price, int ramSize, int monitorSize) {
        super(brend, price, ramSize);
        this.monitorSize = monitorSize;
    }

    public int getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(int monitorSize) {
        this.monitorSize = monitorSize;
    }

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println(", MonitorSize = " + monitorSize + " (PC)");
    }
}

class Laptop extends Computer {
    private int batterylife;

    public Laptop(String brend, double price, int ramSize, int batterylife) {
        super(brend, price, ramSize);
        this.batterylife = batterylife;
    }

    public int getBatterylife() {
        return batterylife;
    }

    public void setBatteryLife(int batterylife) {
        this.batterylife = batterylife;
    }

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println(", Batterylife = " + batterylife + " soat (Laptop)");
    }
}

class Sounds extends Electronici {
    private int PowerWats;

    public Sounds(String brend, double price, int PowerWats) {
        super(brend, price);
        this.PowerWats = PowerWats;
    }

    public int getPowerWats() {
        return PowerWats;
    }

    public void setPowerWats(int powerWatts) {
        this.PowerWats = powerWatts;
    }

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.print(", PowerWats = " + PowerWats + " (W)");
    }
}

class Subwoofer extends Sounds {
    private boolean hasExtraBass;

    public Subwoofer(String brend, double price, int Powerwats, boolean hasExtraBass) {
        super(brend, price, Powerwats);
        this.hasExtraBass = hasExtraBass;
    }

    public boolean getHasExtraBass() {
        return hasExtraBass;
    }

    public void setHasExtraBass(boolean hasExtraBass) {
        this.hasExtraBass = hasExtraBass;
    }

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println(", HasExtra Bass = " + (hasExtraBass ? "bor" : "yo'q") + " (Subwoofer)");
    }
}

class LoudSpeakers extends Sounds {
    private String SpeakerType;

    public LoudSpeakers(String brend, double price, int Powerwats, String SpeakerType) {
        super(brend, price, Powerwats);
        this.SpeakerType = SpeakerType;
    }

    public String getSpeakerType() {
        return SpeakerType;
    }

    public void setSpeakersType(String SpeakerType) {
        this.SpeakerType = SpeakerType;
    }

    @Override
    public void showinfo() {
        super.showinfo();
        System.out.println(", Kolonka turi: " + SpeakerType + " (LoudSpeakers)");
    }
}

class Main {
    public static void main(String[] args) {
        PC PC = new PC("HP", 800.0, 16, 24);
        Laptop Laptop = new Laptop("Asus", 1200.0, 32, 8);
        Subwoofer Sub = new Subwoofer("Sony", 300.0, 500, true);
        LoudSpeakers Speaker = new LoudSpeakers("JBL", 150.0, 100, "Zo'r Kalonka 2 ");

        System.out.println("--- Elektronika qurilmalari haqida ma'lumot ---");
        PC.showinfo();
        Laptop.showinfo();
        Sub.showinfo();
        Speaker.showinfo();
    }
}
