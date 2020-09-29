package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.android.glue.patterns.prettylist.StickyRecyclerView;
import com.spotify.music.R;

/* renamed from: fye reason: default package */
public final class fye extends FrameLayout implements fxy {
    private final StickyRecyclerView a;
    private fyh b;

    public fye(Context context) {
        super(context);
        setLayoutParams(new LayoutParams(-1, -1));
        this.a = new StickyRecyclerView(context);
        this.a.setId(R.id.legacy_header_sticky_recycler);
        this.a.setLayoutParams(new LayoutParams(-1, -1));
        addView(this.a);
    }

    public final StickyRecyclerView a() {
        return this.a;
    }

    public final void a(int i) {
        this.a.a(i);
    }

    public final void a(View view) {
    }

    public final void a(fyh fyh) {
        this.b = fyh;
    }

    public final void a(String str) {
        fyh fyh = this.b;
        if (fyh != null) {
            fyh.a(str);
        }
    }

    public final void a(boolean z) {
    }

    public final PrettyHeaderView b() {
        return null;
    }

    public final void b(View view) {
        this.a.a(view);
        this.a.b(view);
        this.a.b = (View) view.getTag(R.id.legacy_filter_tag);
    }

    public final void b(boolean z) {
    }

    public final ImageView c() {
        return null;
    }

    public final void c(boolean z) {
    }

    public final View d() {
        return this;
    }

    public final RecyclerView e() {
        return this.a.a;
    }
}
