package com.qualitesoft.models;


import lombok.Data;

import java.util.List;


@Data
public class ShipmentDetails {

  private String shipmentType;

  private String readyForPickup;

  private String customerPONumber;

  private String serviceLevel;

  private String specialInstructions;

  private Location pickupLocation;

  private Location dropoffLocation;

  private List<ShipmentItems> shipmentItems;

  private String orderId;

  private String bookedDate;

  private String quotePrice;

  private String wayBillNumber;

  private String trackingNumber;

  private String carrierName;
}
