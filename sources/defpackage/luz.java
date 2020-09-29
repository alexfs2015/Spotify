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

/* renamed from: luz reason: default package */
public final class luz extends defpackage.gvl.a<a> {
    private final HubsGlueImageDelegate a;
    private final Picasso b;
    private final boolean c;

    /* renamed from: luz$a */
    static class a extends defpackage.gui.c.a<View> {
        private final FrameLayout b;
        private final TextView c;
        private final BrowseRoundedCornerImageView d;
        private final HubsGlueImageDelegate e;
        private final Picasso f;

        a(View view, HubsGlueImageDelegate hubsGlueImageDelegate, Picasso picasso, boolean z) {
            super(view);
            this.b = (FrameLayout) ip.c(view, (int) R.id.background);
            this.c = (TextView) ip.c(view, (int) R.id.find_title_text);
            this.d = (BrowseRoundedCornerImageView) ip.c(view, (int) R.id.find_category_card_background);
            this.e = hubsGlueImageDelegate;
            this.f = picasso;
            if (z) {
                this.d.setScaleX(-1.0f);
            }
            fze.b(this.c);
            fze.a(view);
            uui.a(this.b).b(this.d).a(this.c).a();
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            String title = gzt.text().title();
            boolean z = true;
            Assertion.a(!fax.a(title), "title is missing");
            gzw background = gzt.images().background();
            if (background == null) {
                z = false;
            }
            StringBuilder sb = new StringBuilder("background is missing for title=");
            sb.append(title);
            sb.append(" uri=");
            sb.append(gzt.metadata().string("uri"));
            Assertion.a(z, sb.toString());
            BrowseRoundedCornerImageView browseRoundedCornerImageView = this.d;
            if (background != null) {
                Drawable a = this.e.a(background.placeholder(), (ImageConfig) HubsGlueImageConfig.CARD);
                this.f.a(this.e.a(background.uri())).a(a).b(a).a((ImageView) browseRoundedCornerImageView);
            } else {
                this.f.d(browseRoundedCornerImageView);
                browseRoundedCornerImageView.setImageDrawable(null);
            }
            has.a(gum.c).a("click").a(gzt).a(this.a).a();
            this.c.setText(title);
            BrowseRoundedCornerImageView browseRoundedCornerImageView2 = this.d;
            browseRoundedCornerImageView2.b = browseRoundedCornerImageView2.a;
        }

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
            haq.a(this.a, gzt, aVar, iArr);
        }
    }

    public luz(HubsGlueImageDelegate hubsGlueImageDelegate, Picasso picasso, boolean z) {
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
        this.b = (Picasso) fay.a(picasso);
        this.c = z;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD, Trait.ONE_COLUMN);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.find_category_card, viewGroup, false), this.a, this.b, this.c);
    }
}
