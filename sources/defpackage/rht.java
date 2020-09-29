package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.music.R;
import com.spotify.music.homecomponents.card.HomeCardViewBinder;
import com.spotify.music.homecomponents.card.HomeCardViewBinder.CardSize;
import com.spotify.music.homecomponents.card.HomeCardViewBinder.CardTextLines;
import com.squareup.picasso.Picasso;
import java.util.EnumSet;

/* renamed from: rht reason: default package */
public abstract class rht implements rev<View> {
    private final Context a;
    private final Picasso b;
    private final rhu c;
    private final gxw d;

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
    }

    /* access modifiers changed from: protected */
    public abstract CardSize c();

    protected rht(Context context, Picasso picasso, rhu rhu, gxw gxw) {
        this.a = context;
        this.b = picasso;
        this.c = rhu;
        this.d = gxw;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD, Trait.ONE_COLUMN);
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        rhs rhs = new rhs(viewGroup.getContext(), viewGroup, this.b, this.c);
        fqf.a(rhs);
        return rhs.getView();
    }

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        HomeCardViewBinder homeCardViewBinder = (HomeCardViewBinder) fqf.a(view, HomeCardViewBinder.class);
        homeCardViewBinder.a(c());
        a(homeCardViewBinder, gzt);
        homeCardViewBinder.a((CharSequence) gzt.text().title());
        homeCardViewBinder.b((CharSequence) gzt.text().subtitle());
        if (gzt.custom().boolValue("shuffleBadge", false)) {
            if (TextUtils.isEmpty(gzt.text().subtitle())) {
                homeCardViewBinder.a();
            } else {
                homeCardViewBinder.b();
            }
        }
        if (gzt.custom().boolValue("downloadedBadge", false)) {
            String title = gzt.text().title();
            String subtitle = gzt.text().subtitle();
            if (!fax.a(title)) {
                homeCardViewBinder.c();
            } else if (!fax.a(subtitle)) {
                homeCardViewBinder.d();
            }
        }
        boolean z = !TextUtils.isEmpty(gzt.text().subtitle());
        if ((!TextUtils.isEmpty(gzt.text().title())) && z) {
            homeCardViewBinder.a(CardTextLines.ONE_LINE);
            homeCardViewBinder.b(CardTextLines.ONE_LINE);
        }
        has.a(gum.c).a("click").a(gzt).a(homeCardViewBinder.getView()).a();
    }

    /* access modifiers changed from: protected */
    public final Drawable a(gzw gzw) {
        if (gzw == null || TextUtils.isEmpty(gzw.placeholder())) {
            return fr.a(this.a, (int) R.color.image_placeholder_color);
        }
        return this.d.a(gzw.placeholder(), HubsGlueImageConfig.CARD);
    }

    /* access modifiers changed from: protected */
    public void a(HomeCardViewBinder homeCardViewBinder, gzt gzt) {
        gzw main = gzt.images().main();
        Uri parse = (main == null || main.uri() == null) ? Uri.EMPTY : Uri.parse(main.uri());
        Drawable a2 = a(main);
        String str = "default";
        if (main != null) {
            str = main.custom().string("style", str);
        }
        homeCardViewBinder.a(parse, a2, str);
    }
}
