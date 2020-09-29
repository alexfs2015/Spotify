package com.google.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public fli unfinishedMessage = null;

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static InvalidProtocolBufferException c() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public static InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public static InvalidProtocolBufferException e() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    public static InvalidProtocolBufferException f() {
        return new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
    }

    public static InvalidProtocolBufferException g() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static InvalidProtocolBufferException h() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static InvalidProtocolBufferException i() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }
}
