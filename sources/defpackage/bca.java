package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.Loader.d;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: bca reason: default package */
public final class bca<T> implements d {
    public final bbp a;
    public final int b;
    public final bcb c;
    public volatile T d;
    private final a<? extends T> e;

    /* renamed from: bca$a */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public final void a() {
    }

    public bca(bbn bbn, Uri uri, int i, a<? extends T> aVar) {
        this(bbn, new bbp(uri, 3), 4, aVar);
    }

    private bca(bbn bbn, bbp bbp, int i, a<? extends T> aVar) {
        this.c = new bcb(bbn);
        this.a = bbp;
        this.b = i;
        this.e = aVar;
    }

    public final long c() {
        return this.c.a;
    }

    public final Uri d() {
        return this.c.b;
    }

    public final Map<String, List<String>> e() {
        return this.c.c;
    }

    public final void b() {
        bcb bcb = this.c;
        bcb.a = 0;
        bbo bbo = new bbo(bcb, this.a);
        try {
            bbo.a();
            this.d = this.e.a((Uri) bcu.a(this.c.a()), bbo);
        } finally {
            bdw.a((Closeable) bbo);
        }
    }
}
