package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import java.util.EnumSet;

@Deprecated
/* renamed from: gwl reason: default package */
public final class gwl extends gwm<fqt> {
    private final HubsGlueImageDelegate a;

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, b bVar) {
        fqt fqt = (fqt) fqe;
        this.a.a(fqt.a(), gzt.images().background(), HubsGlueImageConfig.CARD);
        guj.a(gum, fqt.getView(), gzt);
        fqt.a((CharSequence) gzt.text().title());
        String icon = gzt.images().icon();
        if (!fax.a(icon)) {
            fqt.a((SpotifyIconV2) a.a.a(icon).a(SpotifyIconV2.TRACK));
        }
        fqt.a(!faw.a(gzt.custom().string("glue:variant", "rounded"), "standard"));
    }

    public gwl(HubsGlueImageDelegate hubsGlueImageDelegate) {
        super(EnumSet.of(Trait.CARD, Trait.ONE_COLUMN), fqt.class);
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
        fqb.d();
        return fqv.a(context, viewGroup);
    }
}
