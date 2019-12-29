public class Main {

    public static void main(String[] args) {
        Climable monkey1 = new Monkey("First");
        Eatable monkey2 = new Monkey("Second");
        Takeable monkey3 = new Monkey("Thrid");
         monkey3.Takeable((Monkey) monkey1);
        System.out.println(monkey2.eatable("fruits"));
         monkey1.Climable();
    }
}
