package pr4;

public class HumanTest {
    public static void main(String[] args) {
        Human person = new Human("Чёрные", 42, 42);

        System.out.println("Человек: " + person.getHead().getHairColor() + " волосы; " + "левая нога размером " + person.getLeftLeg().getSize() + "; " + "правая нога размером " + person.getRightLeg().getSize() + ";");

        person.getLeftHand().wave();

        System.out.println("Машет ли человек рукой? Левая рука - " + person.getLeftHand().isWaving() +
                           "; Правая рука - " + person.getRightHand().isWaving() + ".");
    }
}
