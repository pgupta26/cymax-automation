package com.qualitesoft.utils.enums;


import lombok.Getter;


@Getter
public enum CarrierEnum {

  ABF_FREIGHT(11),
  CEVA(44),
  FC_TEST_CARRIER(222),
  UPS(1),
  YRC(9),
  ESTES(22),
  BTX_GLOBAL_LOGISTICS(291),
  FRAGILE_PAK(280);

  private final Integer index;


  CarrierEnum (Integer index) {

    this.index = index;
  }

  public static Integer getCarrierIndex(String carrierName) {

    return CarrierEnum.valueOf(carrierName).getIndex();
  }
}
