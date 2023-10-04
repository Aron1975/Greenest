package Greenest;

public class Palmer extends Vaxter{

    private String vaxtTyp = "Palm";  //inkapsling, privata variabler med accessors get.., set..

    private VatskeTyp vatskeTyp = VatskeTyp.KRANVATTEN;

    public Palmer() {               //Polymorfism
    }

    public Palmer(String namn) {    //Polymorfism
        super(namn);
    }

    public Palmer(String namn, double langd) {  //Polymorfism
        super(namn, langd);
    }

    public VatskeTyp getVatskeTyp() {    //inkapsling, Polymorfism
        return vatskeTyp;
    }

    public String getVaxtTyp() {         //inkapsling, Polymorfism
        return vaxtTyp;
    }

    @Override
    public double raknaUtVatskebehov() {  //Polymorfism
        return (0.5 * this.getLangd());
    }

    @Override                       //Polymorfism
    public void printMe() {
        System.out.println("Palm{" +
                "namn='" + this.getNamn() + '\'' +
                ", langd=" + this.getLangd() + "m" +
                ", vätska='" + this.getVatskeTyp().sort + '\'' +
                ", vätskemängd='" + this.raknaUtVatskebehov() + "liter" + '\'' +
                '}');
    }

    @Override                       //Polymorfism
    public String vaxtInfo() {
        String message = String.format("Växttyp: " + vaxtTyp +
                ", namn='" + this.getNamn() + '\'' +
                ", längd=" + this.getLangd() + "m" +
                ", vätska='" + this.getVatskeTyp().sort + '\'' +
                ", vätskebehov='" + this.raknaUtVatskebehov() + "liter/dag" + '\'');

        return message;
    }
}