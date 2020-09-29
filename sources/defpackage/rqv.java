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

/* renamed from: rqv reason: default package */
public abstract class rqv implements rnx<View> {
    private final Context a;
    private final Picasso b;
    private final rqw c;
    private final hap d;
    private final boolean e;

    protected rqv(Context context, Picasso picasso, rqw rqw, hap hap, boolean z) {
        this.a = context;
        this.b = picasso;
        this.c = rqw;
        this.d = hap;
        this.e = z;
    }

    /* access modifiers changed from: protected */
    public final Drawable a(hcp hcp) {
        return (hcp == null || TextUtils.isEmpty(hcp.placeholder())) ? fr.a(this.a, (int) R.color.image_placeholder_color) : this.d.a(hcp.placeholder(), HubsGlueImageConfig.CARD);
    }

    public final View a(ViewGroup viewGroup, gwm gwm) {
        rqu rqu = new rqu(viewGroup.getContext(), viewGroup, this.b, this.c);
        fqz.a(rqu);
        return rqu.getView();
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD, Trait.ONE_COLUMN);
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        HomeCardViewBinder homeCardViewBinder = (HomeCardViewBinder) fqz.a(view, HomeCardViewBinder.class);
        homeCardViewBinder.a(c());
        a(homeCardViewBinder, hcm);
        homeCardViewBinder.a((CharSequence) hcm.text().title());
        homeCardViewBinder.b((CharSequence) hcm.text().subtitle());
        if (hcm.custom().boolValue("shuffleBadge", false)) {
            if (TextUtils.isEmpty(hcm.text().subtitle())) {
                homeCardViewBinder.a();
            } else {
                homeCardViewBinder.b();
            }
        }
        if (hcm.custom().boolValue("downloadedBadge", false)) {
            String title = hcm.text().title();
            String subtitle = hcm.text().subtitle();
            if (!fbo.a(title)) {
                homeCardViewBinder.c();
            } else if (!fbo.a(subtitle)) {
                homeCardViewBinder.d();
            }
        }
        boolean z = this.e;
        boolean z2 = !TextUtils.isEmpty(hcm.text().subtitle());
        if ((!TextUtils.isEmpty(hcm.text().title())) && z2) {
            homeCardViewBinder.a(CardTextLines.ONE_LINE);
            if (!z) {
                homeCardViewBinder.b(CardTextLines.ONE_LINE);
            }
        }
        hdl.a(gwm.c).a("click").a(hcm).a(homeCardViewBinder.getView()).a();
    }

    /* access modifiers changed from: protected */
    public void a(HomeCardViewBinder homeCardViewBinder, hcm hcm) {
        hcp main = hcm.images().main();
        Uri parse = (main == null || main.uri() == null) ? Uri.EMPTY : Uri.parse(main.uri());
        Drawable a2 = a(main);
        String str = "default";
        if (main != null) {
            str = main.custom().string("style", str);
        }
        homeCardViewBinder.a(parse, a2, str);
    }

    /* access modifiers changed from: protected */
    public abstract CardSize c();
}
