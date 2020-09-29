package defpackage;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.behavior.HeaderBehavior;

/* renamed from: nkp reason: default package */
public final class nkp {
    public static void a(GlueHeaderLayout glueHeaderLayout, RecyclerView recyclerView) {
        fbp.a(glueHeaderLayout);
        fbp.a(recyclerView);
        fwq fwq = (fwq) fbp.a(glueHeaderLayout.e(false));
        HeaderBehavior headerBehavior = (HeaderBehavior) ((d) fwq.b().getLayoutParams()).a;
        if (headerBehavior != null) {
            headerBehavior.b((CoordinatorLayout) glueHeaderLayout, fwq, true);
        }
        recyclerView.f(0);
    }
}
