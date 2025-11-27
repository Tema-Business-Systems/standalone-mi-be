package com.transport.tracking.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "XTMSPCKSO")
public class PcktsBySO {


    @Column(name= "PRHNUM_0")
    private String prhnum;
    @Column(name= "ORINUM_0")
    private String sorder;
    @Id
    @Column(name= "ROWID")
    private String rowid;


}
