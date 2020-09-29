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

/* renamed from: lvb reason: default package */
public final class lvb extends defpackage.gvl.a<a> {
    private final HubsGlueImageDelegate a;
    private final Picasso b;
    private final boolean c;

    /* renamed from: lvb$a */
    static class a extends defpackage.gui.c.a<View> {
        private final lva b;
        private final HubsGlueImageDelegate c;
        private final Picasso d;

        public final void a(gzt gzt, gum gum, b bVar) {
            String title = gzt.text().title();
            if (fax.a(title)) {
                Assertion.b("title is missing");
            }
            this.b.b.b.setText(title);
            Optional c2 = Optional.c(gzt.images().main());
            if (c2.b()) {
                vsr vsr = this.b.c;
                gzw gzw = (gzw) c2.c();
                Drawable a = this.c.a(gzw.placeholder(), (ImageConfig) HubsGlueImageConfig.CARD);
                this.d.a(this.c.a(gzw.uri())).a(a).b(a).a(vsr);
            }
            String string = gzt.custom().string("backgroundColor");
            if (!TextUtils.isEmpty(string)) {
                int parseColor = Color.parseColor(string);
                this.b.a(parseColor, parseColor);
            } else {
                StringBuilder sb = new StringBuilder("background is missing for title=");
                sb.append(title);
                sb.append(" uri=");
                sb.append(gzt.metadata().string("uri"));
                Assertion.b(sb.toString());
            }
            has.a(gum.c).a("click").a(gzt).a(this.a).a();
        }

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
            haq.a(this.a, gzt, aVar, iArr);
        }

        a(lva lva, HubsGlueImageDelegate hubsGlueImageDelegate, Picasso picasso) {
            super(lva.a);
            this.b = lva;
            this.c = hubsGlueImageDelegate;
            this.d = picasso;
        }
    }

    public lvb(HubsGlueImageDelegate hubsGlueImageDelegate, Picasso picasso, boolean z) {
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
        this.b = (Picasso) fay.a(picasso);
        this.c = z;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD, Trait.ONE_COLUMN);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        lva lva = new lva(viewGroup.getContext(), viewGroup);
        boolean z = this.c;
        if (z) {
            FindCardView findCardView = lva.b;
            findCardView.c = z;
            findCardView.a.c = z;
        }
        return new a(lva, this.a, this.b);
    }
}
