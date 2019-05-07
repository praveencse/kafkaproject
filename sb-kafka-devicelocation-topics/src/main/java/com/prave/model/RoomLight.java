package com.prave.model;

public class RoomLight {

  private String room;
  private String status;

  public RoomLight() {}

  public RoomLight(String room,String status) {
    this.room = room;
    this.status = status;
  }

  public String getroom() {
    return room;
  }
  public String getStatus() {
      return status;
  }

  public void setroom(String room) {
    this.room = room;
  }
 public void setstatus(String status) {
    this.status = status;
  }
  @Override
  public String toString() {
    return "[ Room:" +  room + "]" + "," + "Status:" + status;
  }
}
