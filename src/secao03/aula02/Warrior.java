package secao03.aula02;

public class Warrior extends PlayableCharacter {
    private String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void specialAttack() {
        if (!isAlive) {
            System.out.println("Personagem morreu e não pode usar seu ataque especial.");
            return;
        }

        System.out.println(this.getName() + " está usando seu ataque especial!");
    }

    @Override
    public void attack() {
        System.out.println("O guerreiro ataca com sua arma.");
    }
}
