package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import java.util.EnumSet;

/* renamed from: lzf reason: default package */
public final class lzf implements gxl<View> {
    private final lzh a;

    public lzf(lzh lzh) {
        this.a = (lzh) fbp.a(lzh);
    }

    public static a a(String str) {
        fbp.a(str);
        return hcx.builder().a("find:header", HubsComponentCategory.HEADER.mId).a(hcy.builder().a(str));
    }

    public final View a(ViewGroup viewGroup, gwm gwm) {
        Context context = viewGroup.getContext();
        lzh lzh = this.a;
        fbp.a(context);
        fbp.a(viewGroup);
        lzj lzj = (!lzh.a || !lzh.b) ? lzh.a ? new lzk(context) : new lze(context, viewGroup, lzh.c, lzh.b) : new lzd(context, viewGroup, lzh.c);
        fqz.a(lzj);
        return lzj.getView();
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.HEADER);
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        lzj lzj = (lzj) fqz.a(view, lzj.class);
        lzj.a((CharSequence) hcm.text().title());
        lzj.a(hcm.custom().string("color"));
    }
}
