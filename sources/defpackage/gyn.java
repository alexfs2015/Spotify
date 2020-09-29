package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import java.util.EnumSet;

@Deprecated
/* renamed from: gyn reason: default package */
public final class gyn extends gyo<frn> {
    private final HubsGlueImageDelegate a;

    public gyn(HubsGlueImageDelegate hubsGlueImageDelegate) {
        super(EnumSet.of(Trait.CARD, Trait.ONE_COLUMN), frn.class);
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
        fqv.d();
        return frp.a(context, viewGroup);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, b bVar) {
        frn frn = (frn) fqy;
        this.a.a(frn.a(), hcm.images().background(), HubsGlueImageConfig.CARD);
        gwj.a(gwm, frn.getView(), hcm);
        frn.a((CharSequence) hcm.text().title());
        String icon = hcm.images().icon();
        if (!fbo.a(icon)) {
            frn.a((SpotifyIconV2) a.a.a(icon).a(SpotifyIconV2.TRACK));
        }
        frn.a(!fbn.a(hcm.custom().string("glue:variant", "rounded"), "standard"));
    }
}
