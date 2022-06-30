import Enumerator_Interface.Race;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Skill kaikoen = new Skill("Kaikoen", 70, 0.70);
        Skill kamehameha = new Skill("Kamehameha", 80, 0.60);
        Skill colpoDiLuce = new Skill("ColpoDiLuce", 60, 0.70);
        Skill triploCalcio = new Skill("triploCalcio", 40, 0.90);

        Character goku = new Character("Goku" , Race.Sayan, 200, Arrays.asList(kaikoen, kamehameha, colpoDiLuce, triploCalcio),
                30, 0.8f, 0.35f, 0.4f);

        Character vegeta = new Character("Vegeta" , Race.Sayan, 180, Arrays.asList(kaikoen, kamehameha, colpoDiLuce, triploCalcio),
                25, 0.8f, 0.45f, 0.3f);

        Fight fight = new Fight(goku, vegeta);

        fight.autoFight();
    }
}