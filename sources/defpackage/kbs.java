package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;

/* renamed from: kbs reason: default package */
public final class kbs extends axk implements kbm {
    private final Handler a;
    private jya b;
    private kbo c;

    public kbs(Looper looper) {
        this.a = new Handler(looper);
    }

    public final kbg a(jya jya, wmb wmb, bbr bbr, Cache cache, boolean z, kbo kbo) {
        Cache cache2 = cache;
        this.b = jya;
        this.c = kbo;
        a fan = new fan(wmb, null, bbr);
        if (cache2 != null) {
            fan = new bcg(cache2, fan);
        }
        Uri parse = Uri.parse(jya.d());
        a aVar = new a(fan);
        aVar.g = true;
        ayw ayw = new ayw(parse, aVar.a, aVar.b, aVar.e, aVar.f, aVar.d.createTracker(aVar.a, aVar.f, aVar.c), false, null, 0);
        ayw.a(this.a, (axq) this);
        return new kbl(ayw) {
            public final kca a() {
                return null;
            }

            public final kbk c() {
                return null;
            }
        };
    }

    public final boolean a(jya jya) {
        return jya.d().endsWith(".m3u8");
    }

    public final void a(int i, a aVar, b bVar, c cVar) {
        if (this.c != null && cVar.a == 4) {
            this.c.a(this.b);
        }
    }

    public final void b(int i, a aVar, b bVar, c cVar) {
        if (this.c != null && cVar.a == 4) {
            this.c.a(this.b, (List<jyi>) ImmutableList.d());
        }
    }

    public final void a(int i, a aVar, b bVar, c cVar, IOException iOException, boolean z) {
        if (this.c != null && cVar.a == 4) {
            this.c.a(this.b, (Exception) iOException);
        }
    }

    public final void b(int i, a aVar, c cVar) {
        kbo kbo = this.c;
        if (kbo != null) {
            kbo.a(this.b, cVar.b, cVar.c, cVar.f);
        }
    }
}
