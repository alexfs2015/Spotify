package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: rrv reason: default package */
public final class rrv implements rnx<View> {
    private final rrz a;

    public rrv(rrz rrz) {
        this.a = (rrz) fbp.a(rrz);
    }

    public final View a(ViewGroup viewGroup, gwm gwm) {
        Context context = viewGroup.getContext();
        rrz rrz = this.a;
        fbp.a(context);
        rrx rrx = new rrx(context, rrz.a, rrz.b, viewGroup);
        fqz.a(rrx);
        return rrx.getView();
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.CARD);
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        rry rry = (rry) fqz.a(view, rry.class);
        hco text = hcm.text();
        rry.a(text.title());
        rry.b(text.subtitle());
        rry.c(text.accessory());
        hcp main = hcm.images().main();
        String str = null;
        String uri = main != null ? main.uri() : null;
        if (main != null) {
            str = main.placeholder();
        }
        rry.a(uri, str);
        hdl.a(gwm.c).a("click").a(hcm).a(view).a();
    }

    public final int b() {
        return R.id.home_promo_view;
    }
}
