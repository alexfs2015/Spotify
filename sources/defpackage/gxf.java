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
/* renamed from: gxf reason: default package */
public final class gxf extends gxg<fqt> {
    private final HubsGlueImageDelegate a;

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, b bVar) {
        fqt fqt = (fqt) fqe;
        String title = gzt.text().title();
        boolean z = true;
        Assertion.a(!fax.a(title), "title is missing");
        gzw background = gzt.images().background();
        if (background == null) {
            z = false;
        }
        Assertion.a(z, "background is missing");
        ImageView a2 = fqt.a();
        Picasso b = this.a.b();
        if (background != null) {
            Drawable a3 = this.a.a(background.placeholder(), (ImageConfig) HubsGlueImageConfig.CARD);
            b.a(this.a.a(background.uri())).a(a3).b(a3).a(a2);
        } else {
            b.d(a2);
            a2.setImageDrawable(null);
        }
        guj.a(gum, fqt.getView(), gzt);
        fqt.a((CharSequence) title);
        fqt.a((SpotifyIconV2) a.a.a(gzt.images().icon()).d());
    }

    public gxf(HubsGlueImageDelegate hubsGlueImageDelegate) {
        super(EnumSet.of(Trait.CARD, Trait.ONE_COLUMN), fqt.class);
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
        fqb.d();
        fqt a2 = fqv.a(context, viewGroup);
        a2.a(true);
        return a2;
    }
}
