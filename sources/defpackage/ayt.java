package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.Loader.d;
import java.util.List;
import java.util.Map;

/* renamed from: ayt reason: default package */
public abstract class ayt implements d {
    public final bcg e;
    public final int f;
    public final aqv g;
    public final int h;
    public final Object i;
    public final long j;
    public final long k;
    protected final bcs l;

    public ayt(bce bce, bcg bcg, int i2, aqv aqv, int i3, Object obj, long j2, long j3) {
        this.l = new bcs(bce);
        this.e = (bcg) bdl.a(bcg);
        this.f = i2;
        this.g = aqv;
        this.h = i3;
        this.i = obj;
        this.j = j2;
        this.k = j3;
    }

    public final long c() {
        return this.l.a;
    }

    public final Uri d() {
        return this.l.b;
    }

    public final Map<String, List<String>> e() {
        return this.l.c;
    }
}
