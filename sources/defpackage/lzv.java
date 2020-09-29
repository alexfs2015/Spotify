package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import java.util.EnumSet;

/* renamed from: lzv reason: default package */
public final class lzv implements gxl<Button> {
    private final lzx a;

    public lzv(lzx lzx) {
        this.a = (lzx) fbp.a(lzx);
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gwm gwm) {
        Context context = viewGroup.getContext();
        lzx lzx = this.a;
        fbp.a(context);
        fbp.a(viewGroup);
        lzz maa = lzx.a ? new maa(context) : new lzu(context, viewGroup);
        fqz.a(maa);
        return maa.a();
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* bridge */ /* synthetic */ void a(View view, hcm hcm, a aVar, int[] iArr) {
    }

    public final /* synthetic */ void a(View view, hcm hcm, gwm gwm, b bVar) {
        Button button = (Button) view;
        ((lzz) fqz.a(button, lzz.class)).a(hcm.text().title());
        hdl.a(gwm.c).a("click").a(hcm).a(button).a();
    }
}
