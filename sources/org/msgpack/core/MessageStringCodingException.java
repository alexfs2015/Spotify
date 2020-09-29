package org.msgpack.core;

import java.nio.charset.CharacterCodingException;

public class MessageStringCodingException extends MessagePackException {
    public MessageStringCodingException(CharacterCodingException characterCodingException) {
        super((Throwable) characterCodingException);
    }

    public /* bridge */ /* synthetic */ Throwable getCause() {
        return (CharacterCodingException) super.getCause();
    }
}
