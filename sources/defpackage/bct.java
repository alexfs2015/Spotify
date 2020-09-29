package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: bct reason: default package */
public final class bct implements bce {
    private final bce a;
    private final bcd b;
    private boolean c;
    private long d;

    public bct(bce bce, bcd bcd) {
        this.a = (bce) bdl.a(bce);
        this.b = (bcd) bdl.a(bcd);
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

    public final long a(bcg bcg) {
        this.d = this.a.a(bcg);
        if (this.d == 0) {
            return 0;
        }
        if (bcg.f == -1) {
            long j = this.d;
            if (j != -1) {
                bcg = bcg.a(0, j);
            }
        }
        this.c = true;
        this.b.a(bcg);
        return this.d;
    }

    public final Uri a() {
        return this.a.a();
    }

    public final void a(bcu bcu) {
        this.a.a(bcu);
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
