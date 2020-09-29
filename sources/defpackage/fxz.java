package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.android.glue.patterns.prettylist.StickyRecyclerView;
import com.spotify.music.R;

/* renamed from: fxz reason: default package */
public final class fxz extends fyc<StickyRecyclerView> implements fxy {
    public fxz(Context context, View view, int i) {
        super(context, view, i);
    }

    private static void a(RecyclerView recyclerView, int i, boolean z) {
        i d = recyclerView.d();
        if (z) {
            recyclerView.f(0);
        } else if (d instanceof LinearLayoutManager) {
            ((LinearLayoutManager) d).a(0, -i);
        } else {
            recyclerView.d(0);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ View a(Context context) {
        StickyRecyclerView stickyRecyclerView = new StickyRecyclerView(context);
        stickyRecyclerView.setId(R.id.legacy_header_sticky_recycler);
        return stickyRecyclerView;
    }

    public final StickyRecyclerView a() {
        return (StickyRecyclerView) this.a;
    }

    public final PrettyHeaderView b() {
        return this.b;
    }

    public final void b(boolean z) {
        a(((StickyRecyclerView) this.a).a, ((StickyRecyclerView) this.a).c, z);
    }

    public final void c(boolean z) {
        a(((StickyRecyclerView) this.a).a, this.b.e(), z);
    }

    public final RecyclerView e() {
        return ((StickyRecyclerView) this.a).a;
    }
}
