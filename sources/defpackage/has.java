package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;

/* renamed from: has reason: default package */
public final class has {

    /* renamed from: has$a */
    static final class a implements OnClickListener, OnLongClickListener, b, c, d, e {
        private final guz a;
        private String b;
        private gzt c;
        private View d;
        private boolean e;

        public a(guz guz) {
            this.a = (guz) fay.a(guz);
        }

        public final d a(String str) {
            c();
            this.b = (String) fay.a(str);
            return this;
        }

        public final e a(gzt gzt) {
            c();
            this.c = (gzt) fay.a(gzt);
            return this;
        }

        public final c a(View view) {
            c();
            this.d = (View) fay.a(view);
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
            this.a.a(guy.a(this.b, this.c));
        }

        public final boolean onLongClick(View view) {
            this.a.a(guy.a(this.b, this.c));
            return true;
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
    }

    /* renamed from: has$b */
    public interface b {
        d a(String str);
    }

    /* renamed from: has$c */
    public interface c {
        void a();

        void b();
    }

    /* renamed from: has$d */
    public interface d {
        e a(gzt gzt);
    }

    /* renamed from: has$e */
    public interface e {
        c a(View view);
    }

    public static void a(View view) {
        view.setFocusable(false);
        view.setOnClickListener(null);
        view.setClickable(false);
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
    }

    public static b a(guz guz) {
        return new a(guz);
    }
}
