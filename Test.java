import java.io.File;
import java.io.RandomAccessFile;

class Test {
    public static void main(String[] args) {
                RandomAccessFile raf = null;
                try {
                        (new File("Automobiles.bin")).delete();
                        raf = new RandomAccessFile("Automobiles.bin", "rw");
                        (new Car(raf)).save(raf);
                        (new Truck(raf)).save(raf);
                        (new Bus(raf)).save(raf);
                } catch (Exception e) {
                        e.printStackTrace();
                } finally {
                        try {   raf.close();    } catch (Exception e) {}
                }
                
                loadAndPrint();
        }

        private static void loadAndPrint() {
                RandomAccessFile raf = null;
                try {
                        raf = new RandomAccessFile("Automobiles.bin", "r");
                        System.out.println(new Car(raf));
                        System.out.println(new Truck(raf));
                        System.out.println(new Bus(raf));
                } catch (Exception e) {
                        e.printStackTrace();
                } finally {
                        try {   raf.close();    } catch (Exception e) {}
                }
        }
}

class Car extends Automobile{

    String registration_number;
    public Car(RandomAccessFile raf) {
        super(raf);
        
    }

   @Override
    public void save(RandomAccessFile raf) {
        System.out.println("Save called from Car");
    }
    @Override
    public void load(RandomAccessFile raf) {
        System.out.println("load called from Car");
    }

}
class Truck extends Automobile{

    double maxCapacity;
    public Truck(RandomAccessFile raf) {
        super(raf);
        
    }

    @Override
    public void save(RandomAccessFile raf) {
        System.out.println("Save called from Truck");
    }
    @Override
    public void load(RandomAccessFile raf) {
        System.out.println("load called from Truck");
    }

}
class Bus extends Automobile{

    int numberofWheel;

    public Bus(RandomAccessFile raf) {
        super(raf);
        
    }

    @Override
    public void save(RandomAccessFile raf) {
        System.out.println("Save called from Bus");
    }
    @Override
    public void load(RandomAccessFile raf) {
        System.out.println("load called from Bus");
    }

}

abstract class Automobile{
	String vin;
	double gasTankSize,currentGasLevelcurrentmiles,milesperGallon;
	boolean isAutomatic;

    public Automobile(RandomAccessFile raf){
        System.out.println("Automobile Constructor");
    }

    public void save(RandomAccessFile raf) {
        System.out.println("Save called from Parent");
    }

    public void load(RandomAccessFile raf) {
        System.out.println("Load called from Parent");
    }
	

}