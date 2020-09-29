package defpackage;

import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource.a;
import com.google.android.exoplayer2.upstream.HttpDataSource.c;

/* renamed from: atd reason: default package */
public final class atd extends a {
    private final a a;
    private final String b;
    private final bcu c;
    private final wzo d;

    public atd(a aVar, String str) {
        this(aVar, str, null, null);
    }

    private atd(a aVar, String str, bcu bcu, wzo wzo) {
        this.a = aVar;
        this.b = str;
        this.c = null;
        this.d = null;
    }

    public final /* synthetic */ HttpDataSource a(c cVar) {
        atc atc = new atc(this.a, this.b, null, this.d, cVar);
        bcu bcu = this.c;
        if (bcu != null) {
            atc.a(bcu);
        }
        return atc;
    }
}
