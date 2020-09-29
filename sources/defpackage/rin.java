package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: rin reason: default package */
public final class rin implements rev<View> {
    public final void a(View view, gzt gzt, gum gum, b bVar) {
    }

    public final int b() {
        return R.id.shimmering_state;
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        View view = fus.a(viewGroup.getContext(), viewGroup).getView();
        View inflate = ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(R.layout.home_skeleton_placeholder, viewGroup, false);
        ip.a(view, (Drawable) null);
        return inflate;
    }

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
        haq.a(view, gzt, aVar, iArr);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }
}
