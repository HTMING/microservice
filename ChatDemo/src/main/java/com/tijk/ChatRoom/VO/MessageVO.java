package com.tijk.ChatRoom.VO;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MessageVO {

    private Integer userNum;

    private Integer type;

    private String message;
}
