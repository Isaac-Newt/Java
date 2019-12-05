package abstract_classes;

public class Pdf extends Abstract implements Type, MemoryAllocation{
    
    Pdf(String name) {
        setName(name);
    }

    @Override
    public String AllocateMemory() {
        return "Memory Is Allocated";
    }

    @Override
    public String DefineType() {
        return "PDF is defined as a type";
    }

    @Override
    public String Display() {
        return "Pdf files are displayed";
    }
    
    @Override
    public String toString() {
        String output;
        output = getName() + ": " + Display() + ", " + AllocateMemory() + ", " + DefineType();
        return output;
    }

}
