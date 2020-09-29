package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.spotlets.eventshub.artistconcerts.ArtistConcertsFragment;

/* renamed from: jsg reason: default package */
public final class jsg {
    private final jva a;
    private final fqn b;
    private final String c;
    private final Intent d;

    public jsg(fqn fqn, jva jva, String str, Intent intent) {
        this.b = fqn;
        this.a = jva;
        this.c = str;
        this.d = intent;
    }

    public final jqx a() {
        Bundle extras = this.d.getExtras();
        String h = this.a.h();
        switch (this.a.b) {
            case ARTIST:
            case ARTIST_AUTOPLAY:
                return nbh.a((String) fbp.a(this.a.q()), this.b, this.a.n());
            case ARTIST_CONCERT:
                return inb.a(h, extras, this.b);
            case ARTIST_CONCERTS:
                return ArtistConcertsFragment.b(h);
            case ARTIST_BIOGRAPHY:
            case ARTIST_ABOUT:
                itr c2 = itr.c(h);
                fqo.a(c2.ae(), this.b);
                return c2;
            case ARTIST_RELEASES:
                return nbm.a(this.a, this.c, this.b);
            default:
                return jqx.c;
        }
    }
}
