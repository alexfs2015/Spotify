package defpackage;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: akz reason: default package */
final class akz extends OutputStream implements alb {
    final Map<akr, alc> a = new HashMap();
    int b;
    private final Handler c;
    private akr d;
    private alc e;

    akz(Handler handler) {
        this.c = handler;
    }

    /* access modifiers changed from: 0000 */
    public final void a(long j) {
        if (this.e == null) {
            this.e = new alc(this.c, this.d);
            this.a.put(this.d, this.e);
        }
        this.e.a(j);
        this.b = (int) (((long) this.b) + j);
    }

    public final void a(akr akr) {
        this.d = akr;
        this.e = akr != null ? (alc) this.a.get(akr) : null;
    }

    public final void write(int i) {
        a(1);
    }

    public final void write(byte[] bArr) {
        a((long) bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        a((long) i2);
    }
}
