package defpackage;

import android.content.res.Resources;
import android.os.Parcelable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.music.R;

/* renamed from: ndx reason: default package */
public final class ndx implements ndz {
    public final gwp a;
    public final gwr b;
    public Parcelable c;
    private final kts d;
    private final Resources e;

    static {
        HubsImmutableComponentBundle.builder().a("verified", true).a();
    }

    public ndx(gwr gwr, gwp gwp, Resources resources, kts kts) {
        this.b = (gwr) fbp.a(gwr);
        this.a = (gwp) fbp.a(gwp);
        this.e = (Resources) fbp.a(resources);
        this.d = (kts) fbp.a(kts);
    }

    public final void a() {
        if (this.c == null) {
            this.a.a(hbb.b().c(hcx.builder().a((hck) HubsCommonComponent.LOADING_SPINNER).a()).a(), false);
        }
    }

    public final void a(hcs hcs) {
        this.a.a(this.d.call(hcs), false);
        this.a.a(this.c);
        this.c = null;
    }

    public final void b() {
        SpotifyIconV2 spotifyIconV2 = SpotifyIconV2.ARTIST;
        String string = this.e.getString(R.string.error_general_title);
        String string2 = this.e.getString(R.string.error_general_body);
        this.a.a(hdb.builder().c(hcx.builder().a((hck) HubsGlueComponent.EMPTY_VIEW).a(hcw.builder().a((Enum<?>) spotifyIconV2)).a(hcy.builder().a(string).d(string2)).a()).a(), false);
    }
}
