package org.msgpack.core;

import java.math.BigInteger;

public class MessageIntegerOverflowException extends MessageTypeException {
    private final BigInteger bigInteger;

    public MessageIntegerOverflowException(BigInteger bigInteger2) {
        this.bigInteger = bigInteger2;
    }

    public String getMessage() {
        return this.bigInteger.toString();
    }
}
