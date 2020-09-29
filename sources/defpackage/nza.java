package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import io.reactivex.functions.Function;

/* renamed from: nza reason: default package */
public final class nza implements Function<nyz<hcs>, hcs> {
    private final nyv a;

    nza(nyv nyv) {
        this.a = (nyv) fbp.a(nyv);
    }

    public final /* synthetic */ Object apply(Object obj) {
        nyz nyz = (nyz) obj;
        if (nyz.b != null) {
            nyv nyv = this.a;
            return hbb.a(SpotifyIconV2.WARNING, nyv.b, nyv.c, nyv.a("made-for-you-hub-error-empty-view"));
        }
        hcs hcs = (hcs) nyz.a;
        if (hcs != null && !hcs.body().isEmpty()) {
            return hcs;
        }
        nyv nyv2 = this.a;
        return hbb.a(SpotifyIconV2.MIX, nyv2.h, nyv2.i, nyv.a("made-for-you-hub-no-results-empty-view"));
    }
}
