package defpackage;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;

/* renamed from: nkr reason: default package */
public final class nkr {
    /* access modifiers changed from: private */
    public static /* synthetic */ void a(GlueHeaderLayout glueHeaderLayout) {
        if (!glueHeaderLayout.d) {
            glueHeaderLayout.b(false);
        }
    }

    public static void a(GlueHeaderLayout glueHeaderLayout, RecyclerView recyclerView, RecyclerView recyclerView2, Parcelable parcelable) {
        if (parcelable instanceof nko) {
            nko nko = (nko) parcelable;
            ((i) fbp.a(recyclerView.d())).a(nko.a);
            ((i) fbp.a(recyclerView2.d())).a(nko.b);
            if (nko.c != null) {
                glueHeaderLayout.onRestoreInstanceState(nko.c);
            }
            if (nko.d) {
                glueHeaderLayout.post(new $$Lambda$nkr$rM7sdctt3txsOZTYwgLU6IHOaaM(glueHeaderLayout));
            }
        }
    }
}
