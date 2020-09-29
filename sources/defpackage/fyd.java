package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.android.glue.patterns.prettylist.StickyListView;

/* renamed from: fyd reason: default package */
public final class fyd extends FrameLayout implements fxw {
    private final StickyListView a;
    private fyh b;

    public fyd(Context context) {
        super(context);
        setLayoutParams(new LayoutParams(-1, -1));
        this.a = new StickyListView(context);
        this.a.setLayoutParams(new LayoutParams(-1, -1));
        addView(this.a);
    }

    public final StickyListView a() {
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
}
