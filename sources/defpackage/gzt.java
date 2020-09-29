package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.mobile.android.util.Assertion;
import com.squareup.picasso.Picasso;
import java.util.EnumSet;

@Deprecated
/* renamed from: gzt reason: default package */
public final class gzt extends gzu<frn> {
    private final HubsGlueImageDelegate a;

    public gzt(HubsGlueImageDelegate hubsGlueImageDelegate) {
        super(EnumSet.of(Trait.CARD, Trait.ONE_COLUMN), frn.class);
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
        fqv.d();
        frn a2 = frp.a(context, viewGroup);
        a2.a(true);
        return a2;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, b bVar) {
        frn frn = (frn) fqy;
        String title = hcm.text().title();
        boolean z = true;
        Assertion.a(!fbo.a(title), "title is missing");
        hcp background = hcm.images().background();
        if (background == null) {
            z = false;
        }
        Assertion.a(z, "background is missing");
        ImageView a2 = frn.a();
        Picasso b = this.a.b();
        if (background != null) {
            Drawable a3 = this.a.a(background.placeholder(), (ImageConfig) HubsGlueImageConfig.CARD);
            b.a(this.a.a(background.uri())).a(a3).b(a3).a(a2);
        } else {
            b.d(a2);
            a2.setImageDrawable(null);
        }
        gwj.a(gwm, frn.getView(), hcm);
        frn.a((CharSequence) title);
        frn.a((SpotifyIconV2) a.a.a(hcm.images().icon()).d());
    }
}
