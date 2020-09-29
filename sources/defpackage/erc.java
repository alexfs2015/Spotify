package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: erc reason: default package */
final class erc implements Runnable {
    private final erb a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map<String, List<String>> f;

    private erc(String str, erb erb, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        bwx.a(erb);
        this.a = erb;
        this.b = i;
        this.c = th;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }

    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }

    /* synthetic */ erc(String str, erb erb, int i, Throwable th, byte[] bArr, Map map, byte b2) {
        this(str, erb, i, th, bArr, map);
    }
}
