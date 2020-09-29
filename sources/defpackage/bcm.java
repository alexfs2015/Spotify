package defpackage;

import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource.a;
import com.google.android.exoplayer2.upstream.HttpDataSource.c;

/* renamed from: bcm reason: default package */
public final class bcm extends a {
    private final String a;
    private final bcu b;
    private final int c;
    private final int d;
    private final boolean e;

    public bcm(String str, bcu bcu) {
        this(str, bcu, 8000, 8000, false);
    }

    private bcm(String str, bcu bcu, int i, int i2, boolean z) {
        this.a = str;
        this.b = bcu;
        this.c = 8000;
        this.d = 8000;
        this.e = false;
    }

    public final /* synthetic */ HttpDataSource a(c cVar) {
        bcl bcl = new bcl(this.a, null, this.c, this.d, this.e, cVar);
        bcu bcu = this.b;
        if (bcu != null) {
            bcl.a(bcu);
        }
        return bcl;
    }
}
