
public class Skill implements Enumerator_Interface.Skill {
    private String nameSkill;
    private int damage;
    private double probabiltyAttackHit;

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
