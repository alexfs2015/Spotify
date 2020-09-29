package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: rrr reason: default package */
public final class rrr implements rnx<View> {
    public final View a(ViewGroup viewGroup, gwm gwm) {
        View view = fvm.a(viewGroup.getContext(), viewGroup).getView();
        LayoutParams b = gas.b(viewGroup.getContext(), (ViewGroup) view);
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.home_inline_empty_state_padding_48);
        view.setPadding(view.getPaddingLeft(), dimensionPixelSize, view.getPaddingRight(), dimensionPixelSize);
        view.setLayoutParams(b);
        ip.a(view, (Drawable) null);
        return view;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
        hdj.a(view, hcm, aVar, iArr);
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
        fvk fvk = (fvk) fqv.a(view, fvk.class);
        fvk.a((CharSequence) hcm.text().title());
        fvk.b((CharSequence) hcm.text().subtitle());
    }

    public final int b() {
        return R.id.home_inline_empty_state;
    }
}
