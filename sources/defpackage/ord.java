package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.a;
import io.reactivex.Completable;

/* renamed from: ord reason: default package */
public final class ord implements orc {
    private static final int a = orc.class.hashCode();
    private final Context b;
    private vhx c;

    public ord(Context context) {
        this.b = context;
    }

    public final Completable a() {
        return Completable.a();
    }

    public final void a(Bundle bundle) {
    }

    public final void a(a aVar) {
    }

    public final void a(vhx vhx) {
        this.c = vhx;
        FrameLayout frameLayout = new FrameLayout(this.b);
        View view = new View(this.b);
        view.setLayoutParams(new LayoutParams(-1, vfj.b(24.0f, this.b.getResources())));
        frameLayout.addView(view);
        this.c.a((a<H>) new jog<H>(frameLayout, false), a);
        this.c.a(a);
    }

    public final void a(boolean z) {
        if (z) {
            this.c.a(true, a);
            return;
        }
        this.c.a(false, a);
    }

    public final void ay_() {
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
    }

    public final void d() {
    }
}
