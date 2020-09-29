package defpackage;

import io.netty.handler.codec.http.HttpObjectDecoder;

/* renamed from: wsq reason: default package */
public class wsq extends HttpObjectDecoder {
    private static final wsr f = new wsr(999, "Unknown");

    public wsq(int i, int i2, int i3, boolean z) {
        super(i, i2, i3, true, z);
    }

    public final wsi a(String[] strArr) {
        return new wrv(wst.a(strArr[0]), new wsr(Integer.parseInt(strArr[1]), strArr[2]), this.e);
    }

    public final wsi e() {
        return new wrp(wst.a, f, this.e);
    }
}
