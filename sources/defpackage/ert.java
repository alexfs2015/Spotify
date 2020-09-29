package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: ert reason: default package */
final class ert implements Runnable {
    private final ers a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map<String, List<String>> f;

    private ert(String str, ers ers, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        bxo.a(ers);
        this.a = ers;
        this.b = i;
        this.c = th;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }

    /* synthetic */ ert(String str, ers ers, int i, Throwable th, byte[] bArr, Map map, byte b2) {
        this(str, ers, i, th, bArr, map);
    }

    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }
}
