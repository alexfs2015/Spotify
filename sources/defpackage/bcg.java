package defpackage;

import com.google.android.exoplayer2.upstream.cache.Cache;

/* renamed from: bcg reason: default package */
public final class bcg implements a {
    private final Cache a;
    private final a b;
    private final a c;
    private final a d;
    private final int e;
    private final a f;

    public bcg(Cache cache, a aVar) {
        this(cache, aVar, 0);
    }

    private bcg(Cache cache, a aVar, int i) {
        this(cache, aVar, 0, 2097152);
    }

    private bcg(Cache cache, a aVar, int i, long j) {
        this(cache, aVar, new bbx(), new bce(cache, 2097152), i, null);
    }

    private bcg(Cache cache, a aVar, a aVar2, a aVar3, int i, a aVar4) {
        this.a = cache;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = i;
        this.f = null;
    }

    public final /* synthetic */ bbn a() {
        Cache cache = this.a;
        bbn a2 = this.b.a();
        bbn a3 = this.c.a();
        a aVar = this.d;
        bcf bcf = new bcf(cache, a2, a3, aVar != null ? aVar.a() : null, this.e, this.f);
        return bcf;
    }
}
