package Greenest;

public class KottatandeVaxter extends Vaxter{//} implements VaxtInterface { //implementerar interface

    private String vaxtTyp = "Köttätande växt";
    //private String vatskeTyp = "Proteindryck";  //Inkapsling
    private VatskeTyp vatskeTyp = VatskeTyp.PROTEINDRYCK;

    public KottatandeVaxter() { //Polymorfism
    }

    public KottatandeVaxter(String namn) {  //Polymorfism
        super(namn);
    }

    public KottatandeVaxter(String namn, double langd) {    //Polymorfism
        super(namn, langd);
    }

    public VatskeTyp getVatskeTyp() {  //Inkapsling, polymorfism
        return vatskeTyp;
    }

    public String getVaxtTyp() {
        return vaxtTyp;
    }

    @Override
    public double raknaUtVatskebehov() {    //Polymorfism
       /* double vatskebehov;
        vatskebehov = 0.1 + (0.2 * this.getLangd());
        return vatskebehov;*/
        return (0.1 + (0.2 * this.getLangd()));
    }

    @Override
    public void printMe() {             //Polymorfism
        System.out.println("Köttätande Växt{" +
                "namn='" + this.getNamn() + '\'' +
                ", langd=" + this.getLangd() +
                '}');
    }

    @Override
    public String vaxtInfo() {
        String message = String.format("Växttyp: " + vaxtTyp +
                ", namn='" + this.getNamn() + '\'' +
                ", längd=" + this.getLangd() + "m" +
                ", vätska='" + this.getVatskeTyp().sort + '\'' +
                ", vätskebehov='" + this.raknaUtVatskebehov() + "liter/dag" + '\'');

        return message;
    }
}
