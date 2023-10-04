package Greenest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GreenestMain {

    private List<Vaxter> vaxterList = new ArrayList<>();    //Polymorfism

    public GreenestMain() {
        Palmer p1 = new Palmer("Laura", 5);
        Palmer p2 = new Palmer("Olof", 1);
        Kaktusar k1 = new Kaktusar("Igge", 0.2);
        KottatandeVaxter kv1 = new KottatandeVaxter("MeatLoaf", 0.7);

        vaxterList.add(p1);
        vaxterList.add(p2);
        vaxterList.add(k1);
        vaxterList.add(kv1);

        while (true) {
            while (true) {
                String inputNamn = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");
                if (inputNamn == null) {
                    break;
                } else if (!kontrolleraAttVaxtenFinns(inputNamn)) {
                    JOptionPane.showMessageDialog(null, "Växten finns inte. Försök igen.");
                } else {
                    skrivUtValdVaxt(inputNamn);
                    break;
                }
            }

            String[] options = {"JA", "NEJ"};
            int selection = JOptionPane.showOptionDialog(null, "Vill du ha info om en annan växt?", "Greenest",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (selection == 1) {
                break;
            }
        }
    }

    public boolean kontrolleraAttVaxtenFinns(String vaxtNamn) {
        for (Vaxter v : vaxterList) {
            if (v.getNamn().equals(vaxtNamn)) {
                return true;
            }
        }
        return false;
    }

    public void skrivUtVaxter(VaxtInterface v) {    //Polymorfism
        v.printMe();
    }

    public void skrivUtVaxter(Vaxter v) { //Polymorfism
        v.printMe();
    }

    public void skrivUtAllaVaxter() {
        String message = "";
        for (Vaxter v : vaxterList) {
            message = message.concat(v.vaxtInfo() + "\n");
        }
        JOptionPane.showMessageDialog(null, message);

    }

    public void skrivUtValdVaxt(String namn) {
        String message = "";
        for (Vaxter v : vaxterList) {
            if (v.getNamn().equals(namn)) {
                message = message.concat(String.format("%sen %s ska ha %.2f liter %s/dag.\n",
                        v.getVaxtTyp(), v.getNamn(), v.raknaUtVatskebehov(), v.getVatskeTyp().sort));
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }

    public static void main(String[] args) {
        new GreenestMain();
    }
}

