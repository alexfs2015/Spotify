package defpackage;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.Cache.CacheException;
import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: bcr reason: default package */
public final class bcr implements bch, Comparator<bcj> {
    private final long a;
    private final TreeSet<bcj> b = new TreeSet<>(this);
    private long c;

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        bcj bcj = (bcj) obj;
        bcj bcj2 = (bcj) obj2;
        if (bcj.f - bcj2.f == 0) {
            return bcj.compareTo(bcj2);
        }
        return bcj.f < bcj2.f ? -1 : 1;
    }

    public bcr(long j) {
        this.a = j;
    }

    public final void a(Cache cache, long j) {
        b(cache, j);
    }

    public final void a(Cache cache, bcj bcj) {
        this.b.add(bcj);
        this.c += bcj.c;
        b(cache, 0);
    }

    public final void a(bcj bcj) {
        this.b.remove(bcj);
        this.c -= bcj.c;
    }

    public final void a(Cache cache, bcj bcj, bcj bcj2) {
        a(bcj);
        a(cache, bcj2);
    }

    private void b(Cache cache, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            try {
                cache.b((bcj) this.b.first());
            } catch (CacheException unused) {
            }
        }
    }
}
