package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: rip reason: default package */
public final class rip implements rev<View> {
    public final int b() {
        return R.id.home_inline_empty_state;
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        View view = fus.a(viewGroup.getContext(), viewGroup).getView();
        LayoutParams b = fzy.b(viewGroup.getContext(), (ViewGroup) view);
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.home_inline_empty_state_padding_48);
        view.setPadding(view.getPaddingLeft(), dimensionPixelSize, view.getPaddingRight(), dimensionPixelSize);
        view.setLayoutParams(b);
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
