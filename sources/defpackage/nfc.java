package defpackage;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;

/* renamed from: nfc reason: default package */
public final class nfc {
    public static void a(GlueHeaderLayout glueHeaderLayout, RecyclerView recyclerView, RecyclerView recyclerView2, Parcelable parcelable) {
        if (parcelable instanceof nez) {
            nez nez = (nez) parcelable;
            ((i) fay.a(recyclerView.d())).a(nez.a);
            ((i) fay.a(recyclerView2.d())).a(nez.b);
            if (nez.c != null) {
                glueHeaderLayout.onRestoreInstanceState(nez.c);
            }
            if (nez.d) {
                glueHeaderLayout.post(new $$Lambda$nfc$UqWbB05PwO9LmUQUxlz640YZTSk(glueHeaderLayout));
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(GlueHeaderLayout glueHeaderLayout) {
        if (!glueHeaderLayout.d) {
            glueHeaderLayout.b(false);
        }
    }
}
