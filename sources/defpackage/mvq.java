package defpackage;

import android.content.res.Resources;
import android.os.Parcelable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.music.R;

/* renamed from: mvq reason: default package */
public final class mvq implements mvs {
    public final gup a;
    public final gur b;
    public Parcelable c;
    private final Resources d;

    public mvq(gur gur, gup gup, Resources resources) {
        this.b = (gur) fay.a(gur);
        this.a = (gup) fay.a(gup);
        this.d = (Resources) fay.a(resources);
    }

    public final void a(gzz gzz) {
        this.a.a(gzz, false);
        this.a.a(this.c);
        this.c = null;
    }

    public final void a(int i) {
        this.b.a(i);
    }

    public final void a() {
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.ALBUM;
        String string = this.d.getString(R.string.error_general_title);
        String string2 = this.d.getString(R.string.error_general_body);
        this.a.a(hai.builder().c(hae.builder().a((gzr) HubsGlueComponent.EMPTY_VIEW).a(had.builder().a((Enum<?>) spotifyIconV2)).a(haf.builder().a(string).d(string2)).a()).a(), false);
    }

    public final void b() {
        if (this.c == null) {
            this.a.a(gyi.b().c(hae.builder().a((gzr) HubsCommonComponent.LOADING_SPINNER).a()).a(), false);
        }
    }
}
