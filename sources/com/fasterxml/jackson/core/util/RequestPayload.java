package com.fasterxml.jackson.core.util;

import java.io.IOException;
import java.io.Serializable;

public class RequestPayload implements Serializable {
    private static final long serialVersionUID = 1;
    protected String _charset;
    protected byte[] _payloadAsBytes;
    protected CharSequence _payloadAsText;

    public String toString() {
        byte[] bArr = this._payloadAsBytes;
        if (bArr == null) {
            return this._payloadAsText.toString();
        }
        try {
            return new String(bArr, this._charset);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
