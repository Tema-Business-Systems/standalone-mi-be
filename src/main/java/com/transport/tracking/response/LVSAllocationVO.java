package com.transport.tracking.response;


import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Getter
@Setter
public class LVSAllocationVO {


      private String prhnum;
      private int lineno;
      private String site;
      private float count;
      private String prod;
      private float qty;
      private String lot;
      private int stagflg;
	  private String vrnum;

}
