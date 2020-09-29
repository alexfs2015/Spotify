package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager.e;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.android.glue.patterns.prettylist.compat.GluePrettyListCompatStates;
import defpackage.fyb;

@Deprecated
/* renamed from: fxq reason: default package */
public abstract class fxq<T extends fyb> {

    /* renamed from: fxq$a */
    public static class a<T extends fyb> {
        public final fxs a;
        private final Context b;

        public a(Context context, fxs fxs) {
            this.b = context;
            this.a = fxs;
        }

        public final a<T> a(uvx uvx) {
            this.a.m = uvx;
            return this;
        }

        public final a<T> a(View view) {
            this.a.g = view;
            return this;
        }

        public final a<T> b(View view) {
            this.a.h = view;
            return this;
        }

        public final a<T> c(View view) {
            this.a.i = view;
            return this;
        }

        public final a<T> a(boolean z) {
            this.a.n = z;
            return this;
        }

        public final a<T> b(boolean z) {
            this.a.o = true;
            return this;
        }

        public final a<T> c(boolean z) {
            this.a.q = true;
            return this;
        }

        public final a<T> d(boolean z) {
            this.a.l = true;
            return this;
        }

        public final fxq<T> a(Fragment fragment) {
            boolean z = this.a.o;
            fxn a2 = fsi.a(this.b);
            fxh fxh = (fxh) fav.a(null, new fxo());
            if (z) {
                fxr fxr = new fxr(GluePrettyListCompatStates.PRETTY_RECYCLER_VIEW, this.a, this.b, fragment, a2, fxh);
                return fxr;
            }
            fxr fxr2 = new fxr(GluePrettyListCompatStates.PRETTY_LIST_VIEW, this.a, this.b, fragment, a2, fxh);
            return fxr2;
        }
    }

    /* renamed from: fxq$b */
    public static class b {
        public final Context a;
        public final fxs b;

        public b(Context context, fxs fxs) {
            this.a = context;
            this.b = fxs;
        }

        public final a<fxw> a(Button button, int i) {
            a(button, i, 0);
            return new a<>(this.a, this.b);
        }

        public final a<fxy> b(Button button, int i) {
            a(button, i, 1);
            return new a<>(this.a, this.b);
        }

        public final a<fya> a(Button button, int i, boolean z, int i2) {
            a(button, i, 2);
            fxs fxs = this.b;
            fxs.p = z;
            fxs.f = i2;
            return new a<>(this.a, fxs);
        }

        public void a(Button button, int i, int i2) {
            fxs fxs = this.b;
            fxs.c = i2;
            fxs.d = button;
            fxs.e = i;
        }
    }

    /* renamed from: fxq$c */
    public static class c {
        public final Context a;
        public final fxs b = new fxs();

        c(Context context, int i) {
            this.a = context;
            this.b.a = i;
        }

        public final b a() {
            fxs fxs = this.b;
            fxs.b = 0;
            return new b(this.a, fxs);
        }

        public final b b() {
            fxs fxs = this.b;
            fxs.b = 1;
            return new b(this.a, fxs);
        }
    }

    public abstract T a();

    public abstract void a(int i);

    public abstract void a(View view);

    public abstract void a(e eVar);

    public abstract void a(fyt fyt, Context context);

    public abstract void a(boolean z);

    public abstract View b();

    public abstract void b(int i);

    public abstract void b(View view);

    public abstract void b(boolean z);

    public abstract ImageView c();

    public abstract ImageView d();

    public abstract StickyListView e();

    public vrt g() {
        return null;
    }

    public abstract void h();

    public RecyclerView f() {
        throw new UnsupportedOperationException("not supported");
    }

    public static c a(Context context) {
        return new c(context, 0);
    }

    public static c b(Context context) {
        return new c(context, 1);
    }

    public static c c(Context context) {
        return new c(context, 2);
    }
}
