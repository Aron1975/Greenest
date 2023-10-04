package Greenest;

public class KottatandeVaxter extends Vaxter{

    private String vaxtTyp = "Köttätande växt";     //Inkapsling

    private VatskeTyp vatskeTyp = VatskeTyp.PROTEINDRYCK;   //Inkapsling

    public KottatandeVaxter() { //Polymorfism
    }

    public KottatandeVaxter(String namn) {  //Polymorfism
        super(namn);
    }

    public KottatandeVaxter(String namn, double langd) {    //Polymorfism
        super(namn, langd);
    }

    public VatskeTyp getVatskeTyp() {   //Inkapsling, polymorfism
        return vatskeTyp;
    }

    public String getVaxtTyp() {        //Inkapsling, polymorfism
        return vaxtTyp;
    }

    @Override                               //Polymorfism
    public double raknaUtVatskebehov() {
        return (0.1 + (0.2 * this.getLangd()));
    }

    @Override                               //Polymorfism
    public void printMe() {
        System.out.println("Köttätande Växt{" +
                "namn='" + this.getNamn() + '\'' +
                ", langd=" + this.getLangd() +
                '}');
    }

    @Override                               //Polymorfism
    public String vaxtInfo() {
        String message = String.format("Växttyp: " + vaxtTyp +
                ", namn='" + this.getNamn() + '\'' +
                ", längd=" + this.getLangd() + "m" +
                ", vätska='" + this.getVatskeTyp().sort + '\'' +
                ", vätskebehov='" + this.raknaUtVatskebehov() + "liter/dag" + '\'');

        return message;
    }
}
