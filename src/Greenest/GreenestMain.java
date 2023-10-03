package Greenest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GreenestMain {

    private List<Vaxter> vaxterList = new ArrayList<>();

    public GreenestMain() {
        Palmer p1 = new Palmer("Laura", 5);
        Palmer p2 = new Palmer("Olof", 1);
        Kaktusar k1 = new Kaktusar("Igge", 0.2);
        KottatandeVaxter kv1 = new KottatandeVaxter("MeatLoaf", 0.7);
        Kaktusar k2 = new Kaktusar("Sticky", 2.7);
        Vaxter v1 = new KottatandeVaxter();
        v1.setNamn("Sticky");
        v1.setLangd(2);

        vaxterList.add(p1);
        vaxterList.add(p2);
        vaxterList.add(k1);
        vaxterList.add(kv1);
        vaxterList.add(k2);
        vaxterList.add(v1);

        skrivUtAllaVaxter();
        int vaxtPaPlatsNr;
        while (true) {
            int selection = 0;
            while (true) {
                String inputNamn = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");
                if (inputNamn == null) {
                    break;
                }

                if ((vaxtPaPlatsNr = kontrolleraAttVaxtenFinns(inputNamn)) != -1) {
                    String message = String.format("%s ska ha %.2f liter %s/dag.", vaxterList.get(vaxtPaPlatsNr).getNamn(), vaxterList.get(vaxtPaPlatsNr).raknaUtVatskebehov(), vaxterList.get(vaxtPaPlatsNr).getVatskeTyp());
                    JOptionPane.showMessageDialog(null, message);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Växten finns inte. Försök igen.");
                }
            }

            String[] options = {"JA", "NEJ"};
            selection = JOptionPane.showOptionDialog(null, "Vill du ha info om en annan växt?", "Greenest",
                    JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (selection == 1) {
                break;
            }
        }
    }

    public int kontrolleraAttVaxtenFinns(String vaxtNamn) {
        for (int i = 0; i < vaxterList.size(); i++) {
            if ((vaxterList.get(i).getNamn()).equals(vaxtNamn)) {
                return i;
            }
        }
        return -1;
    }


    /*public void skrivUtVaxter(VaxtInterface v) {
        v.printMe();
    }*/
    public void skrivUtVaxter(Vaxter v) {
        v.printMe();
    }

    public void skrivUtAllaVaxter() {
        for (int i = 0; i < vaxterList.size(); i++) {
            skrivUtVaxter(vaxterList.get(i));
        }
    }

    public static void main(String[] args) {
        GreenestMain greenest = new GreenestMain();
    }
}

