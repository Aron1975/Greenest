package Greenest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusarTest {

    Vaxter v = new Kaktusar("Bobo", 13);
    Kaktusar k = new Kaktusar(" ", 0.01);

    @Test
    void testGetVatskeTyp() {
        assert (v.getVatskeTyp().sort.equals("Mineralvatten"));
        assert (v.getVatskeTyp()==VatskeTyp.MINERALVATTEN);
        assert (v.getVatskeTyp().toString().equals("MINERALVATTEN"));
        assert (!v.getVatskeTyp().toString().equals("KRANVATTEN"));
        assert (!v.getVatskeTyp().sort.equals("MINERALVATTEN"));

    }

    @Test
    void testRaknaUtVatskebehov() {
        assert(v.raknaUtVatskebehov()==0.02);
        assert(k.raknaUtVatskebehov()==0.02);
        assert(v.raknaUtVatskebehov()!=0);
        assert(k.raknaUtVatskebehov()!=1);

    }
}