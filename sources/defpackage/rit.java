package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: rit reason: default package */
public final class rit implements rev<View> {
    private final rix a;

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
    }

    public final int b() {
        return R.id.home_promo_view;
    }

    public rit(rix rix) {
        this.a = (rix) fay.a(rix);
    }

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        riw riw = (riw) fqf.a(view, riw.class);
        gzv text = gzt.text();
        riw.a(text.title());
        riw.b(text.subtitle());
        riw.c(text.accessory());
        gzw main = gzt.images().main();
        String str = null;
        String uri = main != null ? main.uri() : null;
        if (main != null) {
            str = main.placeholder();
        }
        riw.a(uri, str);
        has.a(gum.c).a("click").a(gzt).a(view).a();
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        Context context = viewGroup.getContext();
        rix rix = this.a;
        fay.a(context);
        riv riv = new riv(context, rix.a, rix.b, viewGroup);
        fqf.a(riv);
        return riv.getView();
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD);
    }
}
