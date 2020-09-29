package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bcb reason: default package */
public final class bcb implements bbn {
    public long a;
    public Uri b = Uri.EMPTY;
    public Map<String, List<String>> c = Collections.emptyMap();
    private final bbn d;

    public bcb(bbn bbn) {
        this.d = (bbn) bcu.a(bbn);
    }

    public final void a(bcd bcd) {
        this.d.a(bcd);
    }

    public final long a(bbp bbp) {
        this.b = bbp.a;
        this.c = Collections.emptyMap();
        long a2 = this.d.a(bbp);
        this.b = (Uri) bcu.a(a());
        this.c = b();
        return a2;
    }

    public final int a(byte[] bArr, int i, int i2) {
        int a2 = this.d.a(bArr, i, i2);
        if (a2 != -1) {
            this.a += (long) a2;
        }
        return a2;
    }

    public final Uri a() {
        return this.d.a();
    }

    public final Map<String, List<String>> b() {
        return this.d.b();
    }

    public final void c() {
        this.d.c();
    }
}
