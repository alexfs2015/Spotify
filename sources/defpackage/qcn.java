package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import com.spotify.music.shimmer.ShimmerLayout;
import java.util.EnumSet;

/* renamed from: qcn reason: default package */
public final class qcn implements rev<View> {
    private ShimmerLayout a;

    public final void a(View view, gzt gzt, gum gum, b bVar) {
    }

    public final int b() {
        return R.id.shimmering_state;
    }

    public final View a(ViewGroup viewGroup, gum gum) {
        View view = fus.a(viewGroup.getContext(), viewGroup).getView();
        View inflate = ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(R.layout.shimmer_layout, viewGroup, false);
        this.a = (ShimmerLayout) inflate.findViewById(R.id.shimmer_text);
        ip.a(view, (Drawable) null);
        return inflate;
    }

    public final void a(View view, gzt gzt, a<View> aVar, int... iArr) {
        haq.a(view, gzt, aVar, iArr);
        ShimmerLayout shimmerLayout = this.a;
        if (shimmerLayout != null) {
            shimmerLayout.a();
        }
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }
}
