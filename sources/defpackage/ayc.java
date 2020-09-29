package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.Loader.d;
import java.util.List;
import java.util.Map;

/* renamed from: ayc reason: default package */
public abstract class ayc implements d {
    public final bbp e;
    public final int f;
    public final aqe g;
    public final int h;
    public final Object i;
    public final long j;
    public final long k;
    protected final bcb l;

    public ayc(bbn bbn, bbp bbp, int i2, aqe aqe, int i3, Object obj, long j2, long j3) {
        this.l = new bcb(bbn);
        this.e = (bbp) bcu.a(bbp);
        this.f = i2;
        this.g = aqe;
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
