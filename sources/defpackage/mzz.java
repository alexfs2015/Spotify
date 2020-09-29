package defpackage;

import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.music.R;

/* renamed from: mzz reason: default package */
public final class mzz implements nab {
    public final gup a;
    public Parcelable b;
    private final gur c;
    private final Resources d;

    public mzz(gur gur, gup gup, Resources resources) {
        this.c = (gur) fay.a(gur);
        this.a = (gup) fay.a(gup);
        this.d = (Resources) fay.a(resources);
    }

    public final void a() {
        if (this.b == null) {
            this.a.a(gyi.b().c(hae.builder().a((gzr) HubsCommonComponent.LOADING_SPINNER).a()).a(), false);
        }
    }

    public final void a(gzz gzz) {
        this.a.a(gzz, false);
        this.a.a(this.b);
        this.b = null;
    }

    public final View b() {
        return this.c.e();
    }

    public final void c() {
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.TRACK;
        String string = this.d.getString(R.string.error_general_title);
        String string2 = this.d.getString(R.string.error_general_body);
        this.a.a(hai.builder().c(hae.builder().a((gzr) HubsGlueComponent.EMPTY_VIEW).a(had.builder().a((Enum<?>) spotifyIconV2)).a(haf.builder().a(string).d(string2)).a()).a(), false);
    }
}
