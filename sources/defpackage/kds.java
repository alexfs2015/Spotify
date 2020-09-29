package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.List;

/* renamed from: kds reason: default package */
public final class kds extends ayb implements kdm {
    private final Handler a;
    private kaa b;
    private kdo c;

    public kds(Looper looper) {
        this.a = new Handler(looper);
    }

    public final kdg a(kaa kaa, xah xah, bci bci, Cache cache, boolean z, kdo kdo) {
        Cache cache2 = cache;
        this.b = kaa;
        this.c = kdo;
        a fbe = new fbe(xah, null, bci);
        if (cache2 != null) {
            fbe = new bcx(cache2, fbe);
        }
        Uri parse = Uri.parse(kaa.d());
        a aVar = new a(fbe);
        aVar.g = true;
        azn azn = new azn(parse, aVar.a, aVar.b, aVar.e, aVar.f, aVar.d.createTracker(aVar.a, aVar.f, aVar.c), false, null, 0);
        azn.a(this.a, (ayh) this);
        return new kdl(azn) {
            public final keb a() {
                return null;
            }

            public final kdk c() {
                return null;
            }
        };
    }

    public final void a(int i, a aVar, b bVar, c cVar) {
        if (this.c != null && cVar.a == 4) {
            this.c.a(this.b);
        }
    }

    public final void a(int i, a aVar, b bVar, c cVar, IOException iOException, boolean z) {
        if (this.c != null && cVar.a == 4) {
            this.c.a(this.b, (Exception) iOException);
        }
    }

    public final boolean a(kaa kaa) {
        return kaa.d().endsWith(".m3u8");
    }

    public final void b(int i, a aVar, b bVar, c cVar) {
        if (this.c != null && cVar.a == 4) {
            this.c.a(this.b, (List<kai>) ImmutableList.d());
        }
    }

    public final void b(int i, a aVar, c cVar) {
        kdo kdo = this.c;
        if (kdo != null) {
            kdo.a(this.b, cVar.b, cVar.c, cVar.f);
        }
    }
}
