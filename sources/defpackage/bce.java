package defpackage;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;

/* renamed from: bce reason: default package */
public final class bce implements a {
    private final Cache a;
    private final long b;
    private final int c;

    public bce(Cache cache, long j) {
        this(cache, j, 20480);
    }

    private bce(Cache cache, long j, int i) {
        this.a = cache;
        this.b = j;
        this.c = 20480;
    }

    public final bbm a() {
        return new CacheDataSink(this.a, this.b, this.c);
    }
}
