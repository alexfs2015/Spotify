package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

/* renamed from: hdl reason: default package */
public final class hdl {

    /* renamed from: hdl$a */
    static final class a implements OnClickListener, OnLongClickListener, b, c, d, e {
        private final gwz a;
        private String b;
        private hcm c;
        private View d;
        private boolean e;

        public a(gwz gwz) {
            this.a = (gwz) fbp.a(gwz);
        }

        private void c() {
            if (this.e) {
                throw new AssertionError("Listener is already in use");
            }
        }

        private void d() {
            if (this.b == null) {
                throw new AssertionError("Event name not set");
            } else if (this.c == null) {
                throw new AssertionError("Model not set");
            } else if (this.d == null) {
                throw new AssertionError("View not set");
            }
        }

        public final c a(View view) {
            c();
            this.d = (View) fbp.a(view);
            return this;
        }

        public final d a(String str) {
            c();
            this.b = (String) fbp.a(str);
            return this;
        }

        public final e a(hcm hcm) {
            c();
            this.c = (hcm) fbp.a(hcm);
            return this;
        }

        public final void a() {
            c();
            d();
            this.e = true;
            this.d.setFocusable(true);
            this.d.setClickable(true);
            this.d.setOnClickListener(this);
        }

        public final void b() {
            c();
            d();
            this.e = true;
            this.d.setLongClickable(true);
            this.d.setOnLongClickListener(this);
        }

        public final void onClick(View view) {
            this.a.a(gwy.a(this.b, this.c));
        }

        public final boolean onLongClick(View view) {
            this.a.a(gwy.a(this.b, this.c));
            return true;
        }
    }

    /* renamed from: hdl$b */
    public interface b {
        d a(String str);
    }

    /* renamed from: hdl$c */
    public interface c {
        void a();

        void b();
    }

    /* renamed from: hdl$d */
    public interface d {
        e a(hcm hcm);
    }

    /* renamed from: hdl$e */
    public interface e {
        c a(View view);
    }

    public static b a(gwz gwz) {
        return new a(gwz);
    }

    public static void a(View view) {
        view.setFocusable(false);
        view.setOnClickListener(null);
        view.setClickable(false);
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
    }
}
