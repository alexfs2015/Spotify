package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.browse.component.findcard.FindCardView;
import com.squareup.picasso.Picasso;
import java.util.EnumSet;

/* renamed from: lza reason: default package */
public final class lza extends defpackage.gxl.a<a> {
    private final HubsGlueImageDelegate a;
    private final Picasso b;
    private final boolean c;

    /* renamed from: lza$a */
    static class a extends defpackage.gwi.c.a<View> {
        private final lyz b;
        private final HubsGlueImageDelegate c;
        private final Picasso d;

        a(lyz lyz, HubsGlueImageDelegate hubsGlueImageDelegate, Picasso picasso) {
            super(lyz.a);
            this.b = lyz;
            this.c = hubsGlueImageDelegate;
            this.d = picasso;
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            hdj.a(this.a, hcm, aVar, iArr);
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            String title = hcm.text().title();
            if (fbo.a(title)) {
                Assertion.b("title is missing");
            }
            this.b.b.b.setText(title);
            Optional c2 = Optional.c(hcm.images().main());
            if (c2.b()) {
                wgx wgx = this.b.c;
                hcp hcp = (hcp) c2.c();
                Drawable a = this.c.a(hcp.placeholder(), (ImageConfig) HubsGlueImageConfig.CARD);
                this.d.a(this.c.a(hcp.uri())).a(a).b(a).a(wgx);
            }
            String string = hcm.custom().string("backgroundColor");
            if (!TextUtils.isEmpty(string)) {
                int parseColor = Color.parseColor(string);
                this.b.a(parseColor, parseColor);
            } else {
                StringBuilder sb = new StringBuilder("background is missing for title=");
                sb.append(title);
                sb.append(" uri=");
                sb.append(hcm.metadata().string("uri"));
                Assertion.b(sb.toString());
            }
            hdl.a(gwm.c).a("click").a(hcm).a(this.a).a();
        }
    }

    public lza(HubsGlueImageDelegate hubsGlueImageDelegate, Picasso picasso, boolean z) {
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
        this.b = (Picasso) fbp.a(picasso);
        this.c = z;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD, Trait.ONE_COLUMN);
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        lyz lyz = new lyz(viewGroup.getContext(), viewGroup);
        boolean z = this.c;
        if (z) {
            FindCardView findCardView = lyz.b;
            findCardView.c = z;
            findCardView.a.c = z;
        }
        return new a(lyz, this.a, this.b);
    }
}
