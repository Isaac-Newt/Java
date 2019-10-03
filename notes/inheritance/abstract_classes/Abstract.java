package abstract_classes;

public abstract class Abstract {
    String Name;
    
    public abstract String Display();
    
    public String getName() {
        return this.Name;
    }
    
    public void setName(String name) {
        this.Name = name;
    }
}
