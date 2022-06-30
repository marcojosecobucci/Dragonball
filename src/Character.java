import Enumerator_Interface.Race;
import Enumerator_Interface.SkillBase;

import java.util.ArrayList;
import java.util.List;

public class Character implements SkillBase {
    private String name;
    private Race race;
    private int lifePoints;
    private List<Skill> skills;
    private int physicalForce;

    private float baseAttackProbability;
    private float abilityToDodge;
    private float physicalEndurance;

    public Character(String name, Race race, int lifePoints, List<Skill> skills, int physicalForce, float baseAttackProbability, float abilityToDodge, float physicalEndurance) {
        this.name = name;
        this.race = race;
        this.lifePoints = lifePoints;
        this.skills = skills;
        this.physicalForce = physicalForce;
        this.baseAttackProbability = baseAttackProbability;
        this.abilityToDodge = abilityToDodge;
        this.physicalEndurance = physicalEndurance;
    }

    public String getName() {
        return name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public int getPhysicalForce() {
        return physicalForce;
    }

    public float getAbilityToDodge() {
        return abilityToDodge;
    }

    public float getPhysicalEndurance() {
        return physicalEndurance;
    }

    @Override
    public Skill skillBase() {
        return new Skill("skill base", physicalForce, baseAttackProbability);
    }
}
