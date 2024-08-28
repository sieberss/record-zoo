import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Owner mueller = new Owner(1, "Hans", "Müller");
        Owner miller = new Owner(2, "Paul", "Miller");
        Species panda = new Species("panda bear", 1200);
        Species polar = new Species("polar bear", 7500);
        Species cow = new Species("cow", 0);
        Animal knut = new Animal(12, "Knut", polar, 16, mueller);
        Animal bao = new Animal(18, "Bao Bao", panda, 8, miller);
        Animal sabine = new Animal(3, "Sabine", cow, 11, mueller);
        System.out.println(knut);
        System.out.println(bao);;
        System.out.println(sabine);
        Animal knut2 = new Animal(13, "Knut", polar, 16, mueller);
        System.out.println(knut.equals(knut2));
        Animal knut3 = knut2.withId(12);
        System.out.println(knut.equals(knut3));
        System.out.println(knut2.equals(knut3));

        Zoo zoo = new Zoo(new HashMap<>());
        zoo.animals().put(knut.id(), knut);
        zoo.animals().put(bao.id(), bao);
        zoo.animals().put(sabine.id(), sabine);
        System.out.println(zoo.getTotalFoodRequirement());
    }
}
