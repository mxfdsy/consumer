package com.stream.consumer.receive;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**

 */
@EnableBinding(MyDiyReceiveService.class)
public class DiyReceiveService {


    @StreamListener(MyDiyReceiveService.INPUT)
    public void receive(Object payload){
        System.out.println(payload);
    }
}
