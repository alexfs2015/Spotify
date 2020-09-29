package defpackage;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.Cache.CacheException;
import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: bdi reason: default package */
public final class bdi implements bcy, Comparator<bda> {
    private final long a;
    private final TreeSet<bda> b = new TreeSet<>(this);
    private long c;

    public bdi(long j) {
        this.a = j;
    }

    private void b(Cache cache, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            try {
                cache.b((bda) this.b.first());
            } catch (CacheException unused) {
            }
        }
    }

    public final void a(bda bda) {
        this.b.remove(bda);
        this.c -= bda.c;
    }

    public final void a(Cache cache, long j) {
        b(cache, j);
    }

    public final void a(Cache cache, bda bda) {
        this.b.add(bda);
        this.c += bda.c;
        b(cache, 0);
    }

    public final void a(Cache cache, bda bda, bda bda2) {
        a(bda);
        a(cache, bda2);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        bda bda = (bda) obj;
        bda bda2 = (bda) obj2;
        return bda.f - bda2.f == 0 ? bda.compareTo(bda2) : bda.f < bda2.f ? -1 : 1;
    }
}
