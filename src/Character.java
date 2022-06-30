import Enumerator_Interface.Race;
import Enumerator_Interface.SkillBase;

import java.util.ArrayList;
import java.util.List;

public class Character implements SkillBase {
    private final String name;
    private final Race race;
    private int lifePoints;
    private final List<Skill> skills;
    private final int physicalForce;

    private final float baseAttackProbability;
    private final float abilityToDodge;
    private final float physicalEndurance;

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
