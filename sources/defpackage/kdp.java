package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.cache.Cache;

/* renamed from: kdp reason: default package */
public final class kdp implements kdm {
    private final kcz a;
    private final rwl b;
    private final Handler c;
    private final kdn d;
    private final jlr e;

    public kdp(Looper looper, kdn kdn, kcz kcz, rwl rwl, jlr jlr) {
        this.c = new Handler(looper);
        this.d = kdn;
        this.a = kcz;
        this.b = rwl;
        this.e = jlr;
    }

    public final kdg a(kaa kaa, xah xah, bci bci, Cache cache, boolean z, kdo kdo) {
        xah xah2;
        Cache cache2 = cache;
        String replace = kaa.d().replace("spotify-video://", "");
        if (this.d.a().b()) {
            String replace2 = ((String) this.d.a().c()).replace("{type}", "json").replace("{source_id}", replace);
            int b2 = this.d.b();
            if (!(b2 > 0 && kaa.a().hashCode() % b2 == 0)) {
                kaa kaa2 = kaa;
                xah2 = xah;
            } else {
                a b3 = xah.b();
                b3.g = new kdr(this.e, this.a, replace2, kaa);
                b3.a(new a());
                xah2 = b3.a();
            }
            a fbe = new fbe(xah2, null, bci);
            a bcx = cache2 == null ? fbe : new bcx(cache2, fbe);
            kcy kcy = new kcy(this.b, kaa, null, Uri.parse(replace2), bcx, this.c, kdo, 2, new a(bcx, this.a), this.d, z);
            return kcy;
        }
        throw new IllegalStateException("Unable to create Spotify Manifest url. Manifest url template not found");
    }

    public final boolean a(kaa kaa) {
        return kaa.d().startsWith("spotify-video");
    }
}
