package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bcs reason: default package */
public final class bcs implements bce {
    public long a;
    public Uri b = Uri.EMPTY;
    public Map<String, List<String>> c = Collections.emptyMap();
    private final bce d;

    public bcs(bce bce) {
        this.d = (bce) bdl.a(bce);
    }

    public final int a(byte[] bArr, int i, int i2) {
        int a2 = this.d.a(bArr, i, i2);
        if (a2 != -1) {
            this.a += (long) a2;
        }
        return a2;
    }

    public final long a(bcg bcg) {
        this.b = bcg.a;
        this.c = Collections.emptyMap();
        long a2 = this.d.a(bcg);
        this.b = (Uri) bdl.a(a());
        this.c = b();
        return a2;
    }

    public final Uri a() {
        return this.d.a();
    }

    public final void a(bcu bcu) {
        this.d.a(bcu);
    }

    public final Map<String, List<String>> b() {
        return this.d.b();
    }

    public final void c() {
        this.d.c();
    }
}
