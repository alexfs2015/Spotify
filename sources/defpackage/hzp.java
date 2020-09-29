package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: hzp reason: default package */
public final class hzp implements lbq {
    public final iiy a;
    public final jko b = new jko() {
        public final void a() {
            hzp.this.a.a("focus", Boolean.toString(true));
        }

        public final void b() {
            hzp.this.a.a("focus", Boolean.toString(false));
        }
    };
    public final jko c = new jko() {
        public final void a() {
            hzp.this.a.a("screen_lock", Boolean.toString(true));
        }

        public final void b() {
            hzp.this.a.a("screen_lock", Boolean.toString(false));
        }
    };
    public final jko d = new jko() {
        public final void a() {
            hzp.this.a.a("moving", Boolean.toString(true));
        }

        public final void b() {
            hzp.this.a.a("moving", Boolean.toString(false));
        }
    };
    private String e;

    public hzp(iiy iiy) {
        this.a = iiy;
    }

    public final void onCurrentFragmentChanged(Fragment fragment, String str) {
        boolean z = !str.equals(this.e);
        this.e = str;
        if (z) {
            this.a.a("view_uri", str);
        }
    }
}
