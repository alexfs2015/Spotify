package com.spotify.cosmos.session.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(include = As.EXISTING_PROPERTY, property = "type", use = Id.NAME)
@JsonSubTypes({@Type(name = "sessionInfo", value = SessionInfo.class), @Type(name = "codeSuccess", value = CodeSuccess.class), @Type(name = "codeRequired", value = CodeRequired.class), @Type(name = "bootstrapRequired", value = BootstrapRequired.class)})
public interface LoginResponseBody {
    public static final String BOOTSTRAP_REQUIRED = "bootstrapRequired";
    public static final String CODE_REQUIRED = "codeRequired";
    public static final String CODE_SUCCESS = "codeSuccess";
    public static final String SESSION_INFO = "sessionInfo";
}
