public class Monkey implements Climable, Takeable, Eatable {
    private String name;

    public Monkey(String name){
        this.name = name;
    }

    @Override
    public void Climable() {
        System.out.println("Monkey climb!");
    }

    @Override
    public void Takeable(Monkey monkey) {
        System.out.println("this monkey takes on its back another monkey with name: " + monkey.name);
    }

    @Override
    public String eatable(String foodName){
        return "Monkey eat " + foodName + ".";
    }
}
