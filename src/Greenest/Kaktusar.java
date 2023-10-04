package Greenest;

public class Kaktusar extends Vaxter{

    private String vaxtTyp = "Kaktus";  //Inkapsling, privata variabler, mm..

    private VatskeTyp vatskeTyp = VatskeTyp.MINERALVATTEN;

    public Kaktusar() {             //Polymorfism
    }

    public Kaktusar(String namn) {  //Polymorfism
        super(namn);
    }

    public Kaktusar(String namn, double langd) {    //Polymorfism
        super(namn, langd);

    }

    public VatskeTyp getVatskeTyp() {  //Polymorfism, inkapsling
        return vatskeTyp;
    }

    public String getVaxtTyp() {         //Polymorfism, inkapsling
        return vaxtTyp;
    }

    @Override
    public double raknaUtVatskebehov() {    //Polymorfism
        return (double)2/100;
    }

    @Override                       //Polymorfism
    public void printMe() {
        System.out.println("Kaktus{" +
                "namn='" + this.getNamn() + '\'' +
                ", langd=" + this.getLangd() +
                '}');
    }

    @Override                       //Polymorfism
    public String vaxtInfo() {
        String message = String.format("Växttyp: " + this.vaxtTyp +
                ", namn='" + this.getNamn() + '\'' +
                ", längd=" + this.getLangd() + "m" +
                ", vätska='" + this.getVatskeTyp().sort + '\'' +
                ", vätskebehov='" + this.raknaUtVatskebehov() + "liter/dag" + '\'');

        return message;
    }
}