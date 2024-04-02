package com.qualitesoft.runner;


import com.qualitesoft.models.ShipmentDetails;
import lombok.Getter;
import lombok.Setter;


public final class World {

  @Getter
  @Setter
  private static ShipmentDetails shipmentDetails;


  private World () {

  }

}
