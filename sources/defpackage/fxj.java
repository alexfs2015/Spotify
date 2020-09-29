package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.android.glue.patterns.prettylist.PrettyHeaderView;
import com.spotify.android.glue.patterns.prettylist.StickyListView;

/* renamed from: fxj reason: default package */
public final class fxj extends FrameLayout implements fxc {
    private final StickyListView a;
    private fxn b;

    public final void a(View view) {
    }

    public final void a(boolean z) {
    }

    public final PrettyHeaderView b() {
        return null;
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

    public fxj(Context context) {
        super(context);
        setLayoutParams(new LayoutParams(-1, -1));
        this.a = new StickyListView(context);
        this.a.setLayoutParams(new LayoutParams(-1, -1));
        addView(this.a);
    }

    public final StickyListView a() {
        return this.a;
    }

    public final void a(fxn fxn) {
        this.b = fxn;
    }

    public final void a(String str) {
        fxn fxn = this.b;
        if (fxn != null) {
            fxn.a(str);
        }
    }

    public final void a(int i) {
        this.a.a(i);
    }

    public final void b(View view) {
        this.a.a(view);
        this.a.b(view);
    }
}
