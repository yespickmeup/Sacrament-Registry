package spires.good_moral_records;

import java.util.Date;

public class GoodMoralRecord {
    public final long id;
    public final String protocolNo;
    public final String personName;
    public final String residence;
    public final String sex;
    public final String purpose;
    public final Date issuedOn;
    public final String signingPriest;
    public final String priestDesignation;
    public final String remarks;
    public final String createdBy;

    public GoodMoralRecord(long id, String protocolNo, String personName,
            String residence, String sex, String purpose, Date issuedOn,
            String signingPriest, String priestDesignation, String remarks,
            String createdBy) {
        this.id = id;
        this.protocolNo = protocolNo;
        this.personName = personName;
        this.residence = residence;
        this.sex = sex;
        this.purpose = purpose;
        this.issuedOn = issuedOn;
        this.signingPriest = signingPriest;
        this.priestDesignation = priestDesignation;
        this.remarks = remarks;
        this.createdBy = createdBy;
    }
}
