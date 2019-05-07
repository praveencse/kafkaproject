package com.prave.kafka;

import com.prave.kafka.consumer.Receiver;
import com.prave.kafka.producer.Sender;
import com.prave.model.Bar;
import com.prave.model.DeviceLocation;
import com.prave.model.Foo;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.kafka.listener.MessageListenerContainer;
import org.springframework.kafka.test.rule.KafkaEmbedded;
import org.springframework.kafka.test.utils.ContainerTestUtils;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringKafkaApplicationTest {

  private final static String BAR_TOPIC = "bar.t";
  private final static String FOO_TOPIC = "foo.t";
  private final static String DEVICELOC_TOPIC = "devicelocation.t";

  @Autowired
  private Sender sender;

  @Autowired
  private Receiver receiver;

  @Autowired
  private KafkaListenerEndpointRegistry kafkaListenerEndpointRegistry;

  @ClassRule
  public static KafkaEmbedded embeddedKafka = new KafkaEmbedded(1, true, BAR_TOPIC, FOO_TOPIC,DEVICELOC_TOPIC);

  @Before
  public void setUp() throws Exception {
    // wait until the partitions are assigned
    for (MessageListenerContainer messageListenerContainer : kafkaListenerEndpointRegistry
        .getListenerContainers()) {
      ContainerTestUtils.waitForAssignment(messageListenerContainer,
          embeddedKafka.getPartitionsPerTopic());
    }
  }

  @Test
  public void testReceive() throws Exception {
    sender.send(BAR_TOPIC, new Bar("bar"));
    sender.send(FOO_TOPIC, new Foo("foo"));

    receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
    assertThat(receiver.getLatch().getCount()).isEqualTo(0);
  }
  
    @Test
  public void testReceiveDeviceLocation() throws Exception {
    sender.send(DEVICELOC_TOPIC, new DeviceLocation("1","2","3","4","5","6","7","8","9","10","11","12","13","14"));
    /*  PlaceName: "COGCONSR&D,"
        area : "VarthurKodi",
        fullAddress : "7, WhitefieldMainRoad, Opp.VarthurLake, VarthurKodi, Bengaluru, Karnataka560066, India",
        pName : "COGCONSR&D",
        placeType : "Office",
        time_taken: 0,
        latitude: 12.9576044,
        mapPlaceName: Office,
        is_not_tagged_place: 0,
        time: 1556189746495,
        PlaceTime: "25-Apr-201916: 25: 46",
        ongitude: 77.7442255,
        city: "Bengaluru",
        mode: "Still"
   */
    sender.send(DEVICELOC_TOPIC, new DeviceLocation("COGCONSR&D","VarthurKodi","\"7, WhitefieldMainRoad, Opp.VarthurLake, VarthurKodi, Bengaluru, Karnataka560066, India",
                                "COGCONSR&D","Office","0", "12.9576044","Office","0","1556189746495","25-Apr-201916: 25: 46","77.7442255","Bengaluru","mode"));
   
    receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
    assertThat(receiver.getLatch().getCount()).isEqualTo(0);
    
  }
}
