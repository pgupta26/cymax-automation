package com.qualitesoft.models;


import lombok.Data;

import java.util.List;


@Data
public class ShipmentItems {

  private String quantity;

  private String packageType;

  private String weight;

  private String dimensionLength;

  private String dimensionWidth;

  private String dimensionHeight;

  private String category;

  private String declaredValue;

  private String detailedDescription;

  private List<PalletItems> palletItems;
}
