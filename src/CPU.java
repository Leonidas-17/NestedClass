import java.text.NumberFormat;
import java.util.Locale;
public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }
    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM + " Gb");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // inner class Harddisk
    public class Harddisk{
        int jumlahStorage;
        String manufacturer;

        Harddisk(int jumlahStorage, String manufacturer) {
            this.jumlahStorage = jumlahStorage;
            this.manufacturer = manufacturer;
        }

        public void getInfoHarddisk(){
            System.out.println("Jumlah Storage: " + this.jumlahStorage + " Tb");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }
    // inner class Motherboard
    public class Motherboard{
        String seri;
        String manufacturer;

        Motherboard(String seri, String manufacturer) {
            this.seri = seri;
            this.manufacturer = manufacturer;
        }

        public void getInfoMotherboard(){
            System.out.println("Seri: " + this.seri);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // inner class PowerSuply
    public class powerSuply{
        int power;
        String manufacturer;
        powerSuply(int power, String manufacturer){
            this.power = power;
            this.manufacturer = manufacturer;
        }

        public void getInfopowerSuply(){
            System.out.println("Daya : " + this.power + " W");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    // inner class VGACard
    public class VGACard{
        int vram;
        String manufacturer;

        VGACard(int vram, String manufacturer){
            this.vram = vram;
            this.manufacturer = manufacturer;
        }

        public void getInfoVGACard(){
            System.out.println("Daya : " + this.vram + " Mb");
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }

}