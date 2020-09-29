package defpackage;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.m;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: itd reason: default package */
public abstract class itd extends m implements OnScrollListener {
    private int a;
    private boolean b;

    private static boolean a(int i, int i2, int i3) {
        return i + i2 >= i3 - 1;
    }

    private void b(int i, int i2, int i3) {
        int i4 = this.a;
        if (i3 != i4) {
            Logger.a("PaginatingScrollListener: item count: %d -> %d", Integer.valueOf(i4), Integer.valueOf(i3));
            this.a = i3;
            this.b = false;
        }
        if (!b()) {
            this.b = false;
        } else if (this.b) {
            Logger.a("PaginatingScrollListener: threshold reached, waiting", new Object[0]);
        } else if (i2 == 0) {
            Logger.a("PaginatingScrollListener: empty list", new Object[0]);
        } else if (a(i, a(), i3)) {
            Logger.a("PaginatingScrollListener: the end is nigh!", new Object[0]);
            a(i, i3);
            this.b = true;
        }
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public void a(int i, int i2) {
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        i d = recyclerView.d();
        if (d instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) d;
            int j = linearLayoutManager.j();
            int r = linearLayoutManager.r();
            b(j + (r <= 0 ? 0 : r - 1), r, linearLayoutManager.t());
            return;
        }
        StringBuilder sb = new StringBuilder("LayoutManager is not compatible: ");
        sb.append(d);
        Assertion.b(sb.toString());
    }

    /* access modifiers changed from: protected */
    public abstract boolean b();

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        b((i + i2) - 1, i2, i3);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
