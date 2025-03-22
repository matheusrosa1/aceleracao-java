package secao03.aula02;

public class Barbarian extends PlayableCharacter {
    @Override
    public void move() {
        System.out.println("O bárbaro pega impulso...");
        super.move();
    }
}
