package com.google.zxing.qrcode.decoder;

public enum ErrorCorrectionLevel {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    public final int bits;

    static {
        ErrorCorrectionLevel errorCorrectionLevel;
        ErrorCorrectionLevel errorCorrectionLevel2;
        ErrorCorrectionLevel errorCorrectionLevel3;
        ErrorCorrectionLevel errorCorrectionLevel4;
        ErrorCorrectionLevel[] errorCorrectionLevelArr = {errorCorrectionLevel2, errorCorrectionLevel, errorCorrectionLevel4, errorCorrectionLevel3};
    }

    private ErrorCorrectionLevel(int i) {
        this.bits = i;
    }
}
