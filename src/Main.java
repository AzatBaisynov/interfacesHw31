public class Main {

    public static void main(String[] args) {
        Banana banana1 = new Banana();
        Climable monkey1 = new Monkey("First");
        Eatable monkey2 = new Monkey("Second");
        Takeable monkey3 = new Monkey("Thrid");
         monkey3.Takeable((Monkey) monkey1);
         monkey2.eatFruit(banana1);
         monkey1.Climable();
    }
}
