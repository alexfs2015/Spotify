package io.netty.handler.codec;

public class EncoderException extends CodecException {
    private static final long serialVersionUID = -5086121160476476774L;

    public EncoderException() {
    }

    public EncoderException(String str) {
        super(str);
    }

    public EncoderException(Throwable th) {
        super(th);
    }
}
