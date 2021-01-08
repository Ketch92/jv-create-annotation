package core.basesyntax.model;

import java.util.Objects;

public class Bet {
    private int bet;
    private double risk;
    
    public Bet(int bet, double risk) {
        this.bet = bet;
        this.risk = risk;
    }
    
    public int getBet() {
        return bet;
    }
    
    public void setBet(int bet) {
        this.bet = bet;
    }
    
    public double getRisk() {
        return risk;
    }
    
    public void setRisk(double risk) {
        this.risk = risk;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o.getClass().equals(Bet.class))) {
            return false;
        }
        Bet bet1 = (Bet) o;
        return bet == bet1.bet && Double.compare(bet1.risk, risk) == 0;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(bet, risk);
    }
    
    @Override
    public String toString() {
        return "Bet{"
               + "bet=" + bet
               + ", risk=" + risk
               + '}';
    }
}
