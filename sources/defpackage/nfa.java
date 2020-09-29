package defpackage;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.behavior.HeaderBehavior;

/* renamed from: nfa reason: default package */
public final class nfa {
    public static void a(GlueHeaderLayout glueHeaderLayout, RecyclerView recyclerView) {
        fay.a(glueHeaderLayout);
        fay.a(recyclerView);
        fvw fvw = (fvw) fay.a(glueHeaderLayout.e(false));
        HeaderBehavior headerBehavior = (HeaderBehavior) ((d) fvw.b().getLayoutParams()).a;
        if (headerBehavior != null) {
            headerBehavior.b((CoordinatorLayout) glueHeaderLayout, fvw, true);
        }
        recyclerView.f(0);
    }
}
