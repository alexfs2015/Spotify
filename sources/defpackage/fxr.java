package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.android.glue.patterns.prettylist.compat.GluePrettyListCompatStates;
import defpackage.fyb;

/* renamed from: fxr reason: default package */
final class fxr<T extends fyb> extends fxq<T> {
    private final fxq<T> a;

    fxr(GluePrettyListCompatStates gluePrettyListCompatStates, fxs fxs, Context context, Fragment fragment, fxn fxn, fxh fxh) {
        this.a = gluePrettyListCompatStates.a(fxs, context, fragment, fxn, fxh);
    }

    public final T a() {
        return this.a.a();
    }

    public final View b() {
        return this.a.b();
    }

    public final ImageView c() {
        return this.a.c();
    }

    public final ImageView d() {
        return this.a.d();
    }

    public final StickyListView e() {
        return this.a.e();
    }

    public final RecyclerView f() {
        return this.a.f();
    }

    public final void a(boolean z) {
        this.a.a(z);
    }

    public final void b(boolean z) {
        this.a.b(z);
    }

    public final void a(int i) {
        this.a.a(i);
    }

    public final void a(View view) {
        this.a.a(view);
    }

    public final void a(e eVar) {
        this.a.a(eVar);
    }

    public final void b(View view) {
        this.a.b(view);
    }

    public final void b(int i) {
        this.a.b(i);
    }

    public final void a(fyt fyt, Context context) {
        this.a.a(fyt, context);
    }

    public final void h() {
        this.a.h();
    }

    public final vrt g() {
        return new uvj() {
            public final void a(int i) {
                fxr.this.b(i);
            }
        };
    }
}
