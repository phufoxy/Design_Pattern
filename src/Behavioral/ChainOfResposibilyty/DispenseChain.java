package Behavioral.ChainOfResposibilyty;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
