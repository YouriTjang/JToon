package nl.hr.cmi.inf.entities;

import java.time.Duration;
import java.time.LocalDateTime;

public class Contract {
    String energySupplier;
    float costPerYear;

    float stroomKosten;
    float stroomVasteLeveringskosten;

    float gasKosten;
    float gasVasteLeveringskosten;

    float eenmaligeKorting;

    LocalDateTime startDate;
    Duration duration;
}
