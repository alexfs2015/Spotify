package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.patterns.prettylist.StickyRecyclerView.DynamicBottomPaddingLinearLayoutManager;

/* renamed from: fyj reason: default package */
public final class fyj {
    static fxw a(fym fym, Fragment fragment, View view, View view2, fyb fyb) {
        int i = fym.a;
        fxw fxw = i != 0 ? i != 1 ? i != 2 ? fyb.a(fragment, view) : fyb.a(fragment) : fyb.b(fragment, view) : fyb.a(fragment, view);
        fxw.a(view2);
        fxw.a(fym.n);
        fxw.b(fym.i);
        if (fxw.b() != null) {
            fxw.b().b((View) null);
        }
        return fxw;
    }

    static fxy b(fym fym, Fragment fragment, View view, View view2, fyb fyb) {
        fxy fxy;
        int i = fym.a;
        if (i == 0) {
            fxy = fyb.c(fragment, view);
        } else if (i == 1) {
            fxy = fyb.d(fragment, view);
            fxy.a().b(true);
        } else if (i != 2) {
            fxy = fyb.c(fragment, view);
        } else {
            fxy = fyb.b(fragment);
            fxy.a().b(true);
        }
        fxy.a(view2);
        fxy.a(fym.n);
        fxy.b(fym.i);
        if (fym.j != null) {
            fxy.a().b(fym.j);
            fxy.a().a(true);
        }
        if (fxy.b() != null) {
            fxy.b().b((View) null);
        }
        fxy.e().a((i) new DynamicBottomPaddingLinearLayoutManager(fragment.p(), 1, false));
        return fxy;
    }
}
