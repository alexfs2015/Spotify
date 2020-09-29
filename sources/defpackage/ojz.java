package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.a;
import io.reactivex.Completable;

/* renamed from: ojz reason: default package */
public final class ojz implements ojy {
    private static final int a = ojy.class.hashCode();
    private final Context b;
    private uwh c;

    public final void a(Bundle bundle) {
    }

    public final void a(a aVar) {
    }

    public final void az_() {
    }

    public final void b(Bundle bundle) {
    }

    public final void c() {
    }

    public final void d() {
    }

    public ojz(Context context) {
        this.b = context;
    }

    public final Completable a() {
        return Completable.a();
    }

    public final void a(uwh uwh) {
        this.c = uwh;
        FrameLayout frameLayout = new FrameLayout(this.b);
        View view = new View(this.b);
        view.setLayoutParams(new LayoutParams(-1, uts.b(24.0f, this.b.getResources())));
        frameLayout.addView(view);
        this.c.a((a<H>) new jlu<H>(frameLayout, false), a);
        this.c.a(a);
    }

    public final void a(boolean z) {
        if (z) {
            this.c.a(true, a);
            return;
        }
        this.c.a(false, a);
    }
}
