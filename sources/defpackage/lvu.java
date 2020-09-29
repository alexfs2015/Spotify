package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import java.util.EnumSet;

/* renamed from: lvu reason: default package */
public final class lvu implements gvl<Button> {
    private final lvw a;

    public final /* bridge */ /* synthetic */ void a(View view, gzt gzt, a aVar, int[] iArr) {
    }

    public final /* synthetic */ void a(View view, gzt gzt, gum gum, b bVar) {
        Button button = (Button) view;
        ((lvy) fqf.a(button, lvy.class)).a(gzt.text().title());
        has.a(gum.c).a("click").a(gzt).a(button).a();
    }

    public lvu(lvw lvw) {
        this.a = (lvw) fay.a(lvw);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* synthetic */ View a(ViewGroup viewGroup, gum gum) {
        lvy lvy;
        Context context = viewGroup.getContext();
        lvw lvw = this.a;
        fay.a(context);
        fay.a(viewGroup);
        if (lvw.a) {
            lvy = new lvz(context);
        } else {
            lvy = new lvt(context, viewGroup);
        }
        fqf.a(lvy);
        return lvy.a();
    }
}
