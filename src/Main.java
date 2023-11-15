public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(17000000, "MSI");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        CPU.Harddisk WD = myKomputer.new Harddisk(2, "Western Disk");

        CPU.Motherboard Mortar = myKomputer.new Motherboard("B360M-MORTAR", "MSI");

        CPU.powerSuply MWE = myKomputer.new powerSuply(550, "MSI");

        CPU.VGACard nvidia = myKomputer.new VGACard(2048, "Nvidia");

        myKomputer.getCPUInfo();
        i7.getProcessorInfo();
        rs32GB.getInfoRAM();
        WD.getInfoHarddisk();
        Mortar.getInfoMotherboard();
        MWE.getInfopowerSuply();
        nvidia.getInfoVGACard();

        // bikin object harddisk, vga, motherboard, powersupply
    }
}