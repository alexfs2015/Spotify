package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.ui.layout_traits.TraitsLayoutManager;
import com.spotify.music.R;
import java.util.Collections;
import java.util.Set;

/* renamed from: gvt reason: default package */
public final class gvt {
    private static c<Trait> a(final guk guk) {
        return new c<Trait>() {
            public final Set<Trait> a(int i) {
                gui binder = guk.getBinder(i);
                if (binder instanceof gvl) {
                    return ((gvl) binder).a();
                }
                return Collections.emptySet();
            }
        };
    }

    public static jps a(Context context, gum gum) {
        return GlueLayoutTraits.a(context, a(gum.d));
    }

    public static GridLayoutManager b(Context context, gum gum) {
        c a = a(gum.d);
        return new TraitsLayoutManager(context, GlueLayoutTraits.a(context, a), context.getResources().getInteger(R.integer.hugs_grid_columns));
    }
}
