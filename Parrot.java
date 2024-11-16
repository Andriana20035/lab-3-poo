public class Parrot implements Pet {
    private String name;

    public Parrot(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " is playing and chirping happily!");
    }
}
