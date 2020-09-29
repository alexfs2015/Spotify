package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.util.List;
import java.util.UUID;

/* renamed from: kct reason: default package */
public final class kct {
    private final kdo a;
    private final boolean b;
    private final List<kdm> c;
    private final xah d;

    /* renamed from: kct$a */
    public static class a implements xae {
        public final xal a(defpackage.xae.a aVar) {
            return aVar.a(aVar.a().a().b("X-rid", UUID.randomUUID().toString().replace("-", "")).a());
        }
    }

    public kct(xah xah, kdo kdo, boolean z, List<kdm> list) {
        this.d = xah;
        this.a = kdo;
        this.b = z;
        this.c = list;
    }

    public final kdg a(kaa kaa, bci bci, Cache cache) {
        fbp.a(kaa);
        for (kdm kdm : this.c) {
            if (kdm.a(kaa)) {
                return kdm.a(kaa, this.d, bci, cache, this.b, this.a);
            }
        }
        defpackage.bce.a fbe = new fbe(this.d, null, bci);
        return new kdd(Uri.parse(kaa.d()), cache == null ? fbe : new bcx(cache, fbe));
    }
}
