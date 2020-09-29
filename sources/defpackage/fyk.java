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
import defpackage.fyv;

@Deprecated
/* renamed from: fyk reason: default package */
public abstract class fyk<T extends fyv> {

    /* renamed from: fyk$a */
    public static class a<T extends fyv> {
        public final fym a;
        private final Context b;

        public a(Context context, fym fym) {
            this.b = context;
            this.a = fym;
        }

        public final a<T> a(View view) {
            this.a.g = view;
            return this;
        }

        public final a<T> a(vhn vhn) {
            this.a.m = vhn;
            return this;
        }

        public final a<T> a(boolean z) {
            this.a.n = z;
            return this;
        }

        public final fyk<T> a(Fragment fragment) {
            boolean z = this.a.o;
            fyh a2 = ftc.a(this.b);
            fyb fyb = (fyb) fbm.a(null, new fyi());
            if (z) {
                fyl fyl = new fyl(GluePrettyListCompatStates.PRETTY_RECYCLER_VIEW, this.a, this.b, fragment, a2, fyb);
                return fyl;
            }
            fyl fyl2 = new fyl(GluePrettyListCompatStates.PRETTY_LIST_VIEW, this.a, this.b, fragment, a2, fyb);
            return fyl2;
        }

        public final a<T> b(View view) {
            this.a.h = view;
            return this;
        }

        public final a<T> b(boolean z) {
            this.a.o = true;
            return this;
        }

        public final a<T> c(View view) {
            this.a.i = view;
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
    }

    /* renamed from: fyk$b */
    public static class b {
        public final Context a;
        public final fym b;

        public b(Context context, fym fym) {
            this.a = context;
            this.b = fym;
        }

        public final a<fyq> a(Button button, int i) {
            a(button, i, 0);
            return new a<>(this.a, this.b);
        }

        public final a<fyu> a(Button button, int i, boolean z, int i2) {
            a(button, i, 2);
            fym fym = this.b;
            fym.p = z;
            fym.f = i2;
            return new a<>(this.a, fym);
        }

        public void a(Button button, int i, int i2) {
            fym fym = this.b;
            fym.c = i2;
            fym.d = button;
            fym.e = i;
        }

        public final a<fys> b(Button button, int i) {
            a(button, i, 1);
            return new a<>(this.a, this.b);
        }
    }

    /* renamed from: fyk$c */
    public static class c {
        public final Context a;
        public final fym b = new fym();

        c(Context context, int i) {
            this.a = context;
            this.b.a = i;
        }

        public final b a() {
            fym fym = this.b;
            fym.b = 0;
            return new b(this.a, fym);
        }

        public final b b() {
            fym fym = this.b;
            fym.b = 1;
            return new b(this.a, fym);
        }
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

    public abstract T a();

    public abstract void a(int i);

    public abstract void a(View view);

    public abstract void a(e eVar);

    public abstract void a(fzn fzn, Context context);

    public abstract void a(boolean z);

    public abstract View b();

    public abstract void b(int i);

    public abstract void b(View view);

    public abstract void b(boolean z);

    public abstract ImageView c();

    public abstract ImageView d();

    public abstract StickyListView e();

    public RecyclerView f() {
        throw new UnsupportedOperationException("not supported");
    }

    public wfz g() {
        return null;
    }

    public abstract void h();
}
