package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: bcc reason: default package */
public final class bcc implements bbn {
    private final bbn a;
    private final bbm b;
    private boolean c;
    private long d;

    public bcc(bbn bbn, bbm bbm) {
        this.a = (bbn) bcu.a(bbn);
        this.b = (bbm) bcu.a(bbm);
    }

    public final void a(bcd bcd) {
        this.a.a(bcd);
    }

    public final long a(bbp bbp) {
        this.d = this.a.a(bbp);
        if (this.d == 0) {
            return 0;
        }
        if (bbp.f == -1) {
            long j = this.d;
            if (j != -1) {
                bbp = bbp.a(0, j);
            }
        }
        this.c = true;
        this.b.a(bbp);
        return this.d;
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        int a2 = this.a.a(bArr, i, i2);
        if (a2 > 0) {
            this.b.a(bArr, i, a2);
            long j = this.d;
            if (j != -1) {
                this.d = j - ((long) a2);
            }
        }
        return a2;
    }

    public final Uri a() {
        return this.a.a();
    }

    public final Map<String, List<String>> b() {
        return this.a.b();
    }

    public final void c() {
        try {
            this.a.c();
        } finally {
            if (this.c) {
                this.c = false;
                this.b.a();
            }
        }
    }
}
