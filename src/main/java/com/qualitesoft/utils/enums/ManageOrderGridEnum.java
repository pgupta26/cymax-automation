package com.qualitesoft.utils.enums;


import lombok.Getter;


@Getter
public enum ManageOrderGridEnum {

  ID(3),
  CUSTOMER_PO(4),
  BOOKED_DATE(5),
  READY_FOR_PICK_UP(6),
  STATUS(7),
  CANCEL_REQUESTED(8),
  TYPE(9),
  WAY_BILL(10),
  TRACKING(11),
  QUOTED_PRICE(12);

  private final Integer index;


  ManageOrderGridEnum (Integer index) {

    this.index = index;
  }


  public static Integer getColumnIndex (String columnName) {

    return ManageOrderGridEnum.valueOf(columnName).getIndex();
  }
}
