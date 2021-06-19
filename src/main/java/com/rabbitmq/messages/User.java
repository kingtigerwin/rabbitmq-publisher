package com.rabbitmq.messages;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class User implements Serializable {

    private final Long Id;
    private final String name;
}
