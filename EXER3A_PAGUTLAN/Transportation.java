public class Transportation {
    private String name;

    public Transportation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + " is moving...");
    }
}