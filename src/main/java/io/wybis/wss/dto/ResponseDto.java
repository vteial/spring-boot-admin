package io.wybis.wss.dto;

import lombok.Data;

@Data
class ResponseDto {

    static final int UNKNOWN = -2;

    static final int FORBIDDEN = -1;

    static final int SUCCESS = 0;

    static final int ERROR = 1;

    static final int WARNING = 2;

    int type;

    String message;

    Object data;

    Object model;
}
