package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.ui.layout_traits.TraitsLayoutManager;
import com.spotify.music.R;
import java.util.Collections;
import java.util.Set;

/* renamed from: gxu reason: default package */
public final class gxu {
    private static c<Trait> a(final gwk gwk) {
        return new c<Trait>() {
            public final Set<Trait> a(int i) {
                gwi binder = gwk.getBinder(i);
                return binder instanceof gxl ? ((gxl) binder).a() : Collections.emptySet();
            }
        };
    }

    public static jse a(Context context, gwm gwm) {
        return GlueLayoutTraits.a(context, a(gwm.d));
    }

    public static GridLayoutManager b(Context context, gwm gwm) {
        c a = a(gwm.d);
        return new TraitsLayoutManager(context, GlueLayoutTraits.a(context, a), context.getResources().getInteger(R.integer.hugs_grid_columns));
    }
}
