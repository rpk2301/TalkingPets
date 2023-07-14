public abstract class Pet {


    private String name;
    public Pet()
    {
    this.name = "Default pet name";
    }
    public Pet(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String setName(String name)
    {
        this.name = name;
        return name;
    }
    public abstract String speak();




}
