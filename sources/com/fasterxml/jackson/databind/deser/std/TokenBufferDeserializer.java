package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.util.TokenBuffer;

@JacksonStdImpl
public class TokenBufferDeserializer extends StdScalarDeserializer<TokenBuffer> {
    private static final long serialVersionUID = 1;

    public TokenBufferDeserializer() {
        super(TokenBuffer.class);
    }

    /* access modifiers changed from: protected */
    public TokenBuffer createBufferInstance(JsonParser jsonParser) {
        return new TokenBuffer(jsonParser);
    }

    public TokenBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return createBufferInstance(jsonParser).deserialize(jsonParser, deserializationContext);
    }
}
