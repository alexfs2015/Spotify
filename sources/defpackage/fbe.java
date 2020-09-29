package defpackage;

import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource.a;
import com.google.android.exoplayer2.upstream.HttpDataSource.c;

/* renamed from: fbe reason: default package */
public final class fbe extends a {
    private final a a;
    private final String b;
    private final bcu c;
    private final wzo d;

    public fbe(a aVar, String str, bcu bcu) {
        this(aVar, null, bcu, null);
    }

    private fbe(a aVar, String str, bcu bcu, wzo wzo) {
        this.a = aVar;
        this.b = str;
        this.c = bcu;
        this.d = null;
    }

    public final /* synthetic */ HttpDataSource a(c cVar) {
        fbd fbd = new fbd(this.a, this.b, null, this.d, cVar);
        bcu bcu = this.c;
        if (bcu != null) {
            fbd.a(bcu);
        }
        return fbd;
    }
}
