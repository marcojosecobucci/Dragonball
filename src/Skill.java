
public class Skill implements Enumerator_Interface.Skill {
    private final String nameSkill;
    private final int damage;
    private final double probabiltyAttackHit;

    public Skill(String nameSkill, int damage, double probabiltyAttackHit) {
        this.nameSkill = nameSkill;
        this.damage = damage;
        this.probabiltyAttackHit = probabiltyAttackHit;
    }

    public String getNameSkill() {
        return nameSkill;
    }

    public int getDamage() {
        return damage;
    }

    public double getProbabiltyAttackHit() {
        return probabiltyAttackHit;
    }

    @Override
    public void skill() {

    }
}
