package defpackage;

import android.content.res.Resources;
import android.os.Parcelable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.R;

/* renamed from: myw reason: default package */
public final class myw implements myy {
    public final gup a;
    public final gur b;
    public Parcelable c;
    private final kqj d;
    private final Resources e;

    public myw(gur gur, gup gup, Resources resources, kqj kqj) {
        this.b = (gur) fay.a(gur);
        this.a = (gup) fay.a(gup);
        this.e = (Resources) fay.a(resources);
        this.d = (kqj) fay.a(kqj);
    }

    public final void a(gzz gzz) {
        this.a.a(this.d.call(gzz), false);
        this.a.a(this.c);
        this.c = null;
    }

    public final void a() {
        if (this.c == null) {
            this.a.a(gyi.b().c(hae.builder().a((gzr) HubsCommonComponent.LOADING_SPINNER).a()).a(), false);
        }
    }

    public final void b() {
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.ARTIST;
        String string = this.e.getString(R.string.error_general_title);
        String string2 = this.e.getString(R.string.error_general_body);
        this.a.a(hai.builder().c(hae.builder().a((gzr) HubsGlueComponent.EMPTY_VIEW).a(had.builder().a((Enum<?>) spotifyIconV2)).a(haf.builder().a(string).d(string2)).a()).a(), false);
    }

    static {
        HubsImmutableComponentBundle.builder().a("verified", true).a();
    }
}
