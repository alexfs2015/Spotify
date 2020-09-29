package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import io.reactivex.functions.Function;

/* renamed from: ntl reason: default package */
public final class ntl implements Function<ho<Boolean, gzz>, gzz> {
    private final nss a;

    public final /* synthetic */ Object apply(Object obj) {
        ho hoVar = (ho) obj;
        gzz gzz = (gzz) hoVar.b;
        if (!((Boolean) fay.a(hoVar.a)).booleanValue()) {
            boolean z = false;
            if (gyi.a(gzz) && !gzz.overlays().isEmpty()) {
                if ("made-for-you-hub-error-empty-view".equals(((gzt) gzz.overlays().get(0)).custom().string("tag"))) {
                    z = true;
                }
            }
            if (z) {
                nss nss = this.a;
                if (!nss.a.a()) {
                    return gyi.a(SpotifyIconV2.OFFLINE, nss.d, nss.e, nss.a("made-for-you-hub-no-network-empty-view"));
                }
                gzz = gyi.a(SpotifyIconV2.OFFLINE, nss.f, nss.g, nss.a("made-for-you-hub-no-spotify-service-empty-view"));
            }
        }
        return gzz;
    }

    public ntl(nss nss) {
        this.a = nss;
    }
}
