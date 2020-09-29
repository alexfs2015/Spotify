package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import java.util.EnumSet;

/* renamed from: lvg reason: default package */
public final class lvg implements gvl<View> {
    private final lvi a;

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
    }

    public lvg(lvi lvi) {
        this.a = (lvi) fay.a(lvi);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.HEADER);
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        lvk lvk;
        Context context = viewGroup.getContext();
        lvi lvi = this.a;
        fay.a(context);
        fay.a(viewGroup);
        if (lvi.a && lvi.b) {
            lvk = new lve(context, viewGroup, lvi.c);
        } else if (lvi.a) {
            lvk = new lvl(context);
        } else {
            lvk = new lvf(context, viewGroup, lvi.c, lvi.b);
        }
        fqf.a(lvk);
        return lvk.getView();
    }

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        lvk lvk = (lvk) fqf.a(view, lvk.class);
        lvk.a((CharSequence) gzt.text().title());
        lvk.a(gzt.custom().string("color"));
    }

    public static a a(String str) {
        fay.a(str);
        return hae.builder().a("find:header", HubsComponentCategory.HEADER.mId).a(haf.builder().a(str));
    }
}
