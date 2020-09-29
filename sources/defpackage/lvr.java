package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: lvr reason: default package */
public final class lvr implements gvl<View> {
    public final View a(ViewGroup viewGroup, gum gum) {
        View view = fus.a(viewGroup.getContext(), viewGroup).getView();
        view.setLayoutParams(fzy.b(viewGroup.getContext(), (ViewGroup) view));
        view.setPadding(view.getPaddingLeft(), viewGroup.getResources().getDimensionPixelSize(R.dimen.browse_inline_empty_state_padding), view.getPaddingRight(), view.getPaddingBottom());
        ip.a(view, (Drawable) null);
        return view;
    }

    public final void a(View view, gzt gzt, gum gum, b bVar) {
        fuq fuq = (fuq) fqb.a(view, fuq.class);
        fuq.a((CharSequence) gzt.text().title());
        fuq.b((CharSequence) gzt.text().subtitle());
    }

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
        haq.a(view, gzt, aVar, iArr);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }
}
