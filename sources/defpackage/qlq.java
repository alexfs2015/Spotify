package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.music.R;
import com.spotify.music.shimmer.ShimmerLayout;
import java.util.EnumSet;

/* renamed from: qlq reason: default package */
public final class qlq implements rnx<View> {
    private ShimmerLayout a;

    public final View a(ViewGroup viewGroup, gwm gwm) {
        View view = fvm.a(viewGroup.getContext(), viewGroup).getView();
        View inflate = ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(R.layout.shimmer_layout, viewGroup, false);
        this.a = (ShimmerLayout) inflate.findViewById(R.id.shimmer_text);
        ip.a(view, (Drawable) null);
        return inflate;
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final void a(View view, hcm hcm, a<View> aVar, int... iArr) {
        hdj.a(view, hcm, aVar, iArr);
        ShimmerLayout shimmerLayout = this.a;
        if (shimmerLayout != null) {
            shimmerLayout.a();
        }
    }

    public final void a(View view, hcm hcm, gwm gwm, b bVar) {
    }

    public final int b() {
        return R.id.shimmering_state;
    }
}
