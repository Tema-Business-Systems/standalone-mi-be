package com.transport.tracking.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "XTMSG2DELDOCS")
public class OpenDocs {


    @Column(name= "ROUTESTATUS")
    private String routeStatus;
    @Column(name= "SITE")
    private String site;
    @Id
    @Column(name= "DOCNUM")
    private String docnum;
    @Column(name= "ADRESCODE")
    private String adrescode;
    @Column(name= "ADRESNAME")
    private String adresname;
    @Column(name= "DOCDATE")
    private Date docdate;
    @Column(name= "DLVYSTATUS")
    private String dlvystatus;
    @Column(name= "DOCTYPE")
    private String doctype;
    @Column(name= "BPCODE")
    private String bpcode;
    @Column(name= "BPNAME")
    private String bpname;
    @Column(name= "TRIPNO")
    private String tripno;
    @Column(name= "VRCODE")
    private String vrcode;
    @Column(name= "SEQ")
    private String seq;
    @Column(name= "VEHICLECODE")
    private String vehicleCode;
    @Column(name= "DRIVERCODE")
    private String drivercode;
}
