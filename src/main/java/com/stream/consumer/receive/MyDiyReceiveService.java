package com.stream.consumer.receive;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MyDiyReceiveService {

    String INPUT = "MyReceiveChannel";

    @Input("MyReceiveChannel")
    SubscribableChannel MyReceiveChannel();
}
