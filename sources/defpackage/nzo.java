package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import io.reactivex.functions.Function;

/* renamed from: nzo reason: default package */
public final class nzo implements Function<ho<Boolean, hcs>, hcs> {
    private final nyv a;

    public nzo(nyv nyv) {
        this.a = nyv;
    }

    public final /* synthetic */ Object apply(Object obj) {
        ho hoVar = (ho) obj;
        hcs hcs = (hcs) hoVar.b;
        if (!((Boolean) fbp.a(hoVar.a)).booleanValue()) {
            boolean z = false;
            if (hbb.a(hcs) && !hcs.overlays().isEmpty()) {
                if ("made-for-you-hub-error-empty-view".equals(((hcm) hcs.overlays().get(0)).custom().string("tag"))) {
                    z = true;
                }
            }
            if (z) {
                nyv nyv = this.a;
                if (!nyv.a.a()) {
                    return hbb.a(SpotifyIconV2.OFFLINE, nyv.d, nyv.e, nyv.a("made-for-you-hub-no-network-empty-view"));
                }
                hcs = hbb.a(SpotifyIconV2.OFFLINE, nyv.f, nyv.g, nyv.a("made-for-you-hub-no-spotify-service-empty-view"));
            }
        }
        return hcs;
    }
}
