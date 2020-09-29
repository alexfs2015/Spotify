package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import io.reactivex.functions.Function;

/* renamed from: nsx reason: default package */
public final class nsx implements Function<nsw<gzz>, gzz> {
    private final nss a;

    public final /* synthetic */ Object apply(Object obj) {
        nsw nsw = (nsw) obj;
        if (nsw.b != null) {
            nss nss = this.a;
            return gyi.a(SpotifyIconV2.WARNING, nss.b, nss.c, nss.a("made-for-you-hub-error-empty-view"));
        }
        gzz gzz = (gzz) nsw.a;
        if (gzz != null && !gzz.body().isEmpty()) {
            return gzz;
        }
        nss nss2 = this.a;
        return gyi.a(SpotifyIconV2.MIX, nss2.h, nss2.i, nss.a("made-for-you-hub-no-results-empty-view"));
    }

    nsx(nss nss) {
        this.a = (nss) fay.a(nss);
    }
}
