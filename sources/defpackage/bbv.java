package defpackage;

import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource.a;
import com.google.android.exoplayer2.upstream.HttpDataSource.c;

/* renamed from: bbv reason: default package */
public final class bbv extends a {
    private final String a;
    private final bcd b;
    private final int c;
    private final int d;
    private final boolean e;

    public bbv(String str, bcd bcd) {
        this(str, bcd, 8000, 8000, false);
    }

    private bbv(String str, bcd bcd, int i, int i2, boolean z) {
        this.a = str;
        this.b = bcd;
        this.c = 8000;
        this.d = 8000;
        this.e = false;
    }

    public final /* synthetic */ HttpDataSource a(c cVar) {
        bbu bbu = new bbu(this.a, null, this.c, this.d, this.e, cVar);
        bcd bcd = this.b;
        if (bcd != null) {
            bbu.a(bcd);
        }
        return bbu;
    }
}
