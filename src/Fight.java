import java.util.Random;

public class Fight {

    private final Character character1;
    private final Character character2;

    public Fight(Character character1, Character character2) {
        this.character1 = character1;
        this.character2 = character2;
    }

    public void autoFight() {
        int counterFighter = new Random().nextInt(10);

        while (character1.getLifePoints() > 0 && character2.getLifePoints() > 0) {
            Character striker = counterFighter % 2 == 0 ? character1 : character2;
            Character defender = counterFighter % 2 == 0 ? character2 : character1;

            Skill skill = selectedAttack(striker);
            boolean probabilityAttackGo = probabilityAttackGo(skill, defender);

            System.out.println(striker.getName() + " Attacca con " + skill.getNameSkill());

            if (probabilityAttackGo) {
                attack(skill, defender);
                System.out.println(defender.getName() + " viene colpito e gli restano " + defender.getLifePoints() + " life points");
            } else {
                System.out.println(defender.getName() + " riesce ad evitare l'attacco");
            }

            System.out.println();
            counterFighter++;
        }

        System.out.println();
        Character winnerIs = character1.getLifePoints() > character2.getLifePoints() ? character1 : character2;
        System.out.println(winnerIs.getName() + " HA VINTO!");
    }

    private Skill selectedAttack(Character striker) {
        int random = new Random().nextInt(6);
        if (random <= 3) {
            return striker.getSkills().get(random);
        } else {
            return striker.skillBase();
        }
    }

    private boolean probabilityAttackGo(Skill skill, Character defender) {
        double probability = skill.getProbabiltyAttackHit() * defender.getAbilityToDodge();
        return probability <= Math.random();
    }

    private void attack(Skill skill, Character defender) {
        int damage = Math.round(skill.getDamage() * defender.getPhysicalEndurance());
        defender.setLifePoints(defender.getLifePoints() - damage);
    }
}
