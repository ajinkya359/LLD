package Builder;

class Desktop{
    private String ram, processor, graphcard;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphcard() {
        return graphcard;
    }

    public void setGraphcard(String graphcard) {
        this.graphcard = graphcard;
    }

    @Override
    public String toString() {
        return "Desktop [ram=" + ram + ", processor=" + processor + ", graphcard=" + graphcard + "]";
    }
    
}

abstract class DesktopBuilder{
    private Desktop desktop;

    public DesktopBuilder(){
        desktop = new Desktop();
    }

    abstract void buildProcessor();
    abstract void buildRam();
    abstract void buildGraphicsCard();

    public Desktop getDesktop() {
        return desktop;
    }
    
}

class AppleDesktopBuilder extends DesktopBuilder{

    @Override
    void buildGraphicsCard() {
        this.getDesktop().setGraphcard("Apple graph card");
        
    }

    @Override
    void buildProcessor() {
        this.getDesktop().setProcessor("Apple processor");
        
    }

    @Override
    void buildRam() {
        this.getDesktop().setRam("Apple Ram");
        
    }
}

class HPDesktopBuilder extends DesktopBuilder{

    @Override
    void buildGraphicsCard() {
        this.getDesktop().setGraphcard("HP graph card");
        
    }

    @Override
    void buildProcessor() {
        this.getDesktop().setProcessor("HP processor");
        
    }

    @Override
    void buildRam() {
        this.getDesktop().setRam("HP ram");
    }
}

class DellDesktopBuilder extends DesktopBuilder{

    @Override
    void buildGraphicsCard() {
        this.getDesktop().setGraphcard("Dell graph card");

    }

    @Override
    void buildProcessor() {
        this.getDesktop().setProcessor("Dell processor");

    }

    @Override
    void buildRam() {
        this.getDesktop().setRam("Dell ram");
    }
    
}

class Director{
    public static Desktop buildDesktop(DesktopBuilder builder){
        builder.buildGraphicsCard();
        builder.buildProcessor();
        builder.buildRam();
        return builder.getDesktop();
    }
}

public class Client {
    
    public static void main(String[] args) {
        DesktopBuilder builder = new DellDesktopBuilder();
        Desktop desktop = Director.buildDesktop(builder);
        System.out.println(desktop.toString());
    }
}
