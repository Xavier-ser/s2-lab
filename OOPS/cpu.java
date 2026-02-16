class cpu{
    double price;

    cpu(double price){
        this.price = price;
    }

    class processor{
        int cores;
        String manufacturer;
        
        processor(int cores, String manufacturer){
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
        void display(){
            System.out.println("Processor Cores: "+ cores);
            System.out.println("Processor Manufacturer: "+ manufacturer);

        }

    }

    static class ram{
        int memory;
        String manufacturer;

        ram(int memory, String manufacturer){
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display(){
            System.out.println("Memory Size: "+ memory);
            System.out.println("Memory Manufacturer: "+ manufacturer);
        }
    }

    public static void main(String[] args){
        cpu cpu_obj = new cpu(65000);

        cpu.processor processor_obj = cpu_obj.new processor(16, "Intel");
        cpu.ram ram_obj = new ram(32, "Samsung");
    
        System.out.println("Cpu Price: "+cpu_obj.price);
        processor_obj.display();
        ram_obj.display();
    }
}
