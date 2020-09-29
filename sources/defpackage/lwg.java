package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import java.util.EnumSet;

/* renamed from: lwg reason: default package */
public final class lwg implements gvl<View> {
    private final lwi a;

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
    }

    public lwg(lwi lwi) {
        this.a = (lwi) fay.a(lwi);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        Context context = viewGroup.getContext();
        fay.a(context);
        lwf lwf = new lwf(context);
        fqf.a(lwf);
        return lwf.getView();
    }

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        lwk lwk = (lwk) fqf.a(view, lwk.class);
        lwk.a(gzt.text().title());
        has.a(gum.c).a("click").a(gzt).a(lwk.a()).a();
    }
}
