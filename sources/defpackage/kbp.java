package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.cache.Cache;

/* renamed from: kbp reason: default package */
public final class kbp implements kbm {
    private final kaz a;
    private final rnf b;
    private final Handler c;
    private final kbn d;
    private final jjf e;

    public kbp(Looper looper, kbn kbn, kaz kaz, rnf rnf, jjf jjf) {
        this.c = new Handler(looper);
        this.d = kbn;
        this.a = kaz;
        this.b = rnf;
        this.e = jjf;
    }

    public final kbg a(jya jya, wmb wmb, bbr bbr, Cache cache, boolean z, kbo kbo) {
        wmb wmb2;
        a aVar;
        Cache cache2 = cache;
        String replace = jya.d().replace("spotify-video://", "");
        if (this.d.a().b()) {
            String replace2 = ((String) this.d.a().c()).replace("{type}", "json").replace("{source_id}", replace);
            int b2 = this.d.b();
            if (!(b2 > 0 && jya.a().hashCode() % b2 == 0)) {
                jya jya2 = jya;
                wmb2 = wmb;
            } else {
                a b3 = wmb.b();
                b3.g = new kbr(this.e, this.a, replace2, jya);
                b3.a(new a());
                wmb2 = b3.a();
            }
            a fan = new fan(wmb2, null, bbr);
            if (cache2 == null) {
                aVar = fan;
            } else {
                aVar = new bcg(cache2, fan);
            }
            kay kay = new kay(this.b, jya, null, Uri.parse(replace2), aVar, this.c, kbo, 2, new a(aVar, this.a), this.d, z);
            return kay;
        }
        throw new IllegalStateException("Unable to create Spotify Manifest url. Manifest url template not found");
    }

    public final boolean a(jya jya) {
        return jya.d().startsWith("spotify-video");
    }
}
