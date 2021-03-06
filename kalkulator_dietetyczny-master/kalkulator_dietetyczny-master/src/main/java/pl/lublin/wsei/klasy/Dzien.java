package pl.lublin.wsei.klasy;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Dzien implements Serializable {
    private final LocalDate timestamp = LocalDate.now();
    private LinkedList<Posilek> posilki;

    public Dzien(List<Posilek> posilki) {
        this.posilki = new LinkedList<>();
        this.posilki.addAll(posilki);
    }

    public Dzien() {
        this.posilki = new LinkedList<>();
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public String printTimeStamp() {
        return timestamp.getYear() + "-" + timestamp.getMonthValue() + "-" + timestamp.getDayOfMonth();
    }
}
