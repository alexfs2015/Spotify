package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.android.glue.patterns.prettylist.compat.GluePrettyListCompatStates;
import defpackage.fyv;

/* renamed from: fyl reason: default package */
final class fyl<T extends fyv> extends fyk<T> {
    private final fyk<T> a;

    fyl(GluePrettyListCompatStates gluePrettyListCompatStates, fym fym, Context context, Fragment fragment, fyh fyh, fyb fyb) {
        this.a = gluePrettyListCompatStates.a(fym, context, fragment, fyh, fyb);
    }

    public final T a() {
        return this.a.a();
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

    public final void a(fzn fzn, Context context) {
        this.a.a(fzn, context);
    }

    public final void a(boolean z) {
        this.a.a(z);
    }

    public final View b() {
        return this.a.b();
    }

    public final void b(int i) {
        this.a.b(i);
    }

    public final void b(View view) {
        this.a.b(view);
    }

    public final void b(boolean z) {
        this.a.b(z);
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

    public final wfz g() {
        return new vha() {
            public final void a(int i) {
                fyl.this.b(i);
            }
        };
    }

    public final void h() {
        this.a.h();
    }
}
