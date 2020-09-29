package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import java.util.EnumSet;

/* renamed from: mah reason: default package */
public final class mah implements gxl<View> {
    private final maj a;

    public mah(maj maj) {
        this.a = (maj) fbp.a(maj);
    }

    public final View a(ViewGroup viewGroup, gwm gwm) {
        Context context = viewGroup.getContext();
        fbp.a(context);
        mag mag = new mag(context);
        fqz.a(mag);
        return mag.getView();
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        mal mal = (mal) fqz.a(view, mal.class);
        mal.a(hcm.text().title());
        hdl.a(gwm.c).a("click").a(hcm).a(mal.a()).a();
    }
}
