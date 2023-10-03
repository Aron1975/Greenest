package Greenest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmerTest {

    Palmer p = new Palmer("Palme", 1.8);

    @Test
    void testRaknaUtVatskebehov() {
        assert(p.raknaUtVatskebehov()==0.5*1.8);
        assert(p.raknaUtVatskebehov()!=0);
        assert(p.raknaUtVatskebehov()!=0.5*2);
        assert(p.raknaUtVatskebehov()!=0.6*1.8);

    }

    @Test
    void testVaxtTyp() {
        assert(p.getVaxtTyp().equals("Palm"));
        assert(!p.getVaxtTyp().equals("Kaktus"));
        assert(!p.getVaxtTyp().equals("Palme"));
    }
}