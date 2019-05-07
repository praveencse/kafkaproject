package com.prave.kafka.consumer;

import com.prave.model.Bar;
import com.prave.model.DeviceLocation;
import com.prave.model.Foo;
import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;


public class Receiver {

  private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

  private CountDownLatch latch = new CountDownLatch(3);

  public CountDownLatch getLatch() {
    return latch;
  }

  @KafkaListener(topics = "${kafka.topic.bar}")
  public void receiveBar(Bar bar) {
    LOGGER.info("received {}", bar.toString());
    latch.countDown();
  }

  @KafkaListener(topics = "${kafka.topic.foo}")
  public void receiveFoo(Foo foo) {
    LOGGER.info("received {}", foo.toString());
    latch.countDown();
  }
   @KafkaListener(topics = "devicelocation.t")
  public void receiveDeviceLoc(DeviceLocation dloc) {
    LOGGER.info("received {}", dloc.toString());
    latch.countDown();
  }
}
