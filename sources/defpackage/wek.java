package defpackage;

import io.netty.handler.codec.http.HttpObjectDecoder;

/* renamed from: wek reason: default package */
public class wek extends HttpObjectDecoder {
    private static final wel f = new wel(999, "Unknown");

    public wek(int i, int i2, int i3, boolean z) {
        super(i, i2, i3, true, z);
    }

    public final wec a(String[] strArr) {
        return new wdp(wen.a(strArr[0]), new wel(Integer.parseInt(strArr[1]), strArr[2]), this.e);
    }

    public final wec e() {
        return new wdj(wen.a, f, this.e);
    }
}
