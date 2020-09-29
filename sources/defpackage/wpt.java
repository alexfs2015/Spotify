package defpackage;

/* renamed from: wpt reason: default package */
final class wpt extends wor {
    private final woz e;

    wpt(wpu wpu, wwc wwc, String str, woz woz) {
        super(wpu, wwc, str, woz instanceof wpc, woz instanceof wpi);
        if (woz != null) {
            this.e = woz;
            return;
        }
        throw new NullPointerException("handler");
    }

    public final woz t() {
        return this.e;
    }
}
