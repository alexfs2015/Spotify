package defpackage;

import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.components.common.HubsCommonComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.music.R;

/* renamed from: nfg reason: default package */
public final class nfg implements nfi {
    public final gwp a;
    public Parcelable b;
    private final gwr c;
    private final Resources d;

    public nfg(gwr gwr, gwp gwp, Resources resources) {
        this.c = (gwr) fbp.a(gwr);
        this.a = (gwp) fbp.a(gwp);
        this.d = (Resources) fbp.a(resources);
    }

    public final void a() {
        if (this.b == null) {
            this.a.a(hbb.b().c(hcx.builder().a((hck) HubsCommonComponent.LOADING_SPINNER).a()).a(), false);
        }
    }

    public final void a(hcs hcs) {
        this.a.a(hcs, false);
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
        this.a.a(hdb.builder().c(hcx.builder().a((hck) HubsGlueComponent.EMPTY_VIEW).a(hcw.builder().a((Enum<?>) spotifyIconV2)).a(hcy.builder().a(string).d(string2)).a()).a(), false);
    }
}
