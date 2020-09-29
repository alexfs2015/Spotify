package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.spotlets.eventshub.artistconcerts.ArtistConcertsFragment;

/* renamed from: jpu reason: default package */
public final class jpu {
    private final jst a;
    private final fpt b;
    private final String c;
    private final Intent d;

    public jpu(fpt fpt, jst jst, String str, Intent intent) {
        this.b = fpt;
        this.a = jst;
        this.c = str;
        this.d = intent;
    }

    public final jol a() {
        Bundle extras = this.d.getExtras();
        String h = this.a.h();
        switch (this.a.b) {
            case ARTIST:
            case ARTIST_AUTOPLAY:
                return mwg.a((String) fay.a(this.a.q()), this.b, this.a.n());
            case ARTIST_CONCERT:
                return iko.a(h, extras, this.b);
            case ARTIST_CONCERTS:
                return ArtistConcertsFragment.b(h);
            case ARTIST_BIOGRAPHY:
            case ARTIST_ABOUT:
                iro c2 = iro.c(h);
                fpu.a(c2.ae(), this.b);
                return c2;
            case ARTIST_RELEASES:
                return mwl.a(this.a, this.c, this.b);
            default:
                return jol.c;
        }
    }
}
