package defpackage;

import com.google.android.exoplayer2.upstream.cache.Cache;

/* renamed from: bcx reason: default package */
public final class bcx implements a {
    private final Cache a;
    private final a b;
    private final a c;
    private final a d;
    private final int e;
    private final a f;

    public bcx(Cache cache, a aVar) {
        this(cache, aVar, 0);
    }

    private bcx(Cache cache, a aVar, int i) {
        this(cache, aVar, 0, 2097152);
    }

    private bcx(Cache cache, a aVar, int i, long j) {
        this(cache, aVar, new bco(), new bcv(cache, 2097152), i, null);
    }

    private bcx(Cache cache, a aVar, a aVar2, a aVar3, int i, a aVar4) {
        this.a = cache;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = i;
        this.f = null;
    }

    public final /* synthetic */ bce a() {
        Cache cache = this.a;
        bce a2 = this.b.a();
        bce a3 = this.c.a();
        a aVar = this.d;
        bcw bcw = new bcw(cache, a2, a3, aVar != null ? aVar.a() : null, this.e, this.f);
        return bcw;
    }
}
