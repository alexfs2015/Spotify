package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.patterns.prettylist.StickyRecyclerView.DynamicBottomPaddingLinearLayoutManager;

/* renamed from: fxp reason: default package */
public final class fxp {
    static fxc a(fxs fxs, Fragment fragment, View view, View view2, fxh fxh) {
        fxc fxc;
        int i = fxs.a;
        if (i == 0) {
            fxc = fxh.a(fragment, view);
        } else if (i == 1) {
            fxc = fxh.b(fragment, view);
        } else if (i != 2) {
            fxc = fxh.a(fragment, view);
        } else {
            fxc = fxh.a(fragment);
        }
        fxc.a(view2);
        fxc.a(fxs.n);
        fxc.b(fxs.i);
        if (fxc.b() != null) {
            fxc.b().b((View) null);
        }
        return fxc;
    }

    static fxe b(fxs fxs, Fragment fragment, View view, View view2, fxh fxh) {
        fxe fxe;
        int i = fxs.a;
        if (i == 0) {
            fxe = fxh.c(fragment, view);
        } else if (i == 1) {
            fxe = fxh.d(fragment, view);
            fxe.a().b(true);
        } else if (i != 2) {
            fxe = fxh.c(fragment, view);
        } else {
            fxe = fxh.b(fragment);
            fxe.a().b(true);
        }
        fxe.a(view2);
        fxe.a(fxs.n);
        fxe.b(fxs.i);
        if (fxs.j != null) {
            fxe.a().b(fxs.j);
            fxe.a().a(true);
        }
        if (fxe.b() != null) {
            fxe.b().b((View) null);
        }
        fxe.e().a((i) new DynamicBottomPaddingLinearLayoutManager(fragment.p(), 1, false));
        return fxe;
    }
}
