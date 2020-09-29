package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.features.browse.view.BrowseRoundedCornerImageView;
import com.squareup.picasso.Picasso;
import java.util.EnumSet;

/* renamed from: lyy reason: default package */
public final class lyy extends defpackage.gxl.a<a> {
    private final HubsGlueImageDelegate a;
    private final Picasso b;
    private final boolean c;

    /* renamed from: lyy$a */
    static class a extends defpackage.gwi.c.a<View> {
        private final FrameLayout b;
        private final TextView c;
        private final BrowseRoundedCornerImageView d;
        private final HubsGlueImageDelegate e;
        private final Picasso f;

        a(View view, HubsGlueImageDelegate hubsGlueImageDelegate, Picasso picasso, boolean z) {
            super(view);
            this.b = (FrameLayout) ip.d(view, (int) R.id.background);
            this.c = (TextView) ip.d(view, (int) R.id.find_title_text);
            this.d = (BrowseRoundedCornerImageView) ip.d(view, (int) R.id.find_category_card_background);
            this.e = hubsGlueImageDelegate;
            this.f = picasso;
            if (z) {
                this.d.setScaleX(-1.0f);
            }
            fzy.b(this.c);
            fzy.a(view);
            vfz.a(this.b).b(this.d).a(this.c).a();
        }

        public final void a(hcm hcm, defpackage.gwi.a<View> aVar, int... iArr) {
            hdj.a(this.a, hcm, aVar, iArr);
        }

        public final void a(hcm hcm, gwm gwm, b bVar) {
            String title = hcm.text().title();
            boolean z = true;
            Assertion.a(!fbo.a(title), "title is missing");
            hcp background = hcm.images().background();
            if (background == null) {
                z = false;
            }
            StringBuilder sb = new StringBuilder("background is missing for title=");
            sb.append(title);
            sb.append(" uri=");
            sb.append(hcm.metadata().string("uri"));
            Assertion.a(z, sb.toString());
            BrowseRoundedCornerImageView browseRoundedCornerImageView = this.d;
            if (background != null) {
                Drawable a = this.e.a(background.placeholder(), (ImageConfig) HubsGlueImageConfig.CARD);
                this.f.a(this.e.a(background.uri())).a(a).b(a).a((ImageView) browseRoundedCornerImageView);
            } else {
                this.f.d(browseRoundedCornerImageView);
                browseRoundedCornerImageView.setImageDrawable(null);
            }
            hdl.a(gwm.c).a("click").a(hcm).a(this.a).a();
            this.c.setText(title);
            BrowseRoundedCornerImageView browseRoundedCornerImageView2 = this.d;
            browseRoundedCornerImageView2.b = browseRoundedCornerImageView2.a;
        }
    }

    public lyy(HubsGlueImageDelegate hubsGlueImageDelegate, Picasso picasso, boolean z) {
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
        this.b = (Picasso) fbp.a(picasso);
        this.c = z;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD, Trait.ONE_COLUMN);
    }

    public final /* synthetic */ defpackage.gwi.c.a b(ViewGroup viewGroup, gwm gwm) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.find_category_card, viewGroup, false), this.a, this.b, this.c);
    }
}
