package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.util.List;
import java.util.UUID;

/* renamed from: kat reason: default package */
public final class kat {
    private final kbo a;
    private final boolean b;
    private final List<kbm> c;
    private final wmb d;

    /* renamed from: kat$a */
    public static class a implements wly {
        public final wmf a(defpackage.wly.a aVar) {
            return aVar.a(aVar.a().a().b("X-rid", UUID.randomUUID().toString().replace("-", "")).a());
        }
    }

    public kat(wmb wmb, kbo kbo, boolean z, List<kbm> list) {
        this.d = wmb;
        this.a = kbo;
        this.b = z;
        this.c = list;
    }

    public final kbg a(jya jya, bbr bbr, Cache cache) {
        defpackage.bbn.a aVar;
        fay.a(jya);
        for (kbm kbm : this.c) {
            if (kbm.a(jya)) {
                return kbm.a(jya, this.d, bbr, cache, this.b, this.a);
            }
        }
        defpackage.bbn.a fan = new fan(this.d, null, bbr);
        if (cache == null) {
            aVar = fan;
        } else {
            aVar = new bcg(cache, fan);
        }
        return new kbd(Uri.parse(jya.d()), aVar);
    }
}
