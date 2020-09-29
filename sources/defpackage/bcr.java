package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.Loader.d;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: bcr reason: default package */
public final class bcr<T> implements d {
    public final bcg a;
    public final int b;
    public final bcs c;
    public volatile T d;
    private final a<? extends T> e;

    /* renamed from: bcr$a */
    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public bcr(bce bce, Uri uri, int i, a<? extends T> aVar) {
        this(bce, new bcg(uri, 3), 4, aVar);
    }

    private bcr(bce bce, bcg bcg, int i, a<? extends T> aVar) {
        this.c = new bcs(bce);
        this.a = bcg;
        this.b = i;
        this.e = aVar;
    }

    public final void a() {
    }

    public final void b() {
        bcs bcs = this.c;
        bcs.a = 0;
        bcf bcf = new bcf(bcs, this.a);
        try {
            bcf.a();
            this.d = this.e.a((Uri) bdl.a(this.c.a()), bcf);
        } finally {
            ben.a((Closeable) bcf);
        }
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
}
