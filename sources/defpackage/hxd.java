package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: hxd reason: default package */
public final class hxd implements kyh {
    public final igl a;
    public final jhy b = new jhy() {
        public final void a() {
            hxd.this.a.a("focus", Boolean.toString(true));
        }

        public final void b() {
            hxd.this.a.a("focus", Boolean.toString(false));
        }
    };
    public final jhy c = new jhy() {
        public final void a() {
            hxd.this.a.a("screen_lock", Boolean.toString(true));
        }

        public final void b() {
            hxd.this.a.a("screen_lock", Boolean.toString(false));
        }
    };
    public final jhy d = new jhy() {
        public final void a() {
            hxd.this.a.a("moving", Boolean.toString(true));
        }

        public final void b() {
            hxd.this.a.a("moving", Boolean.toString(false));
        }
    };
    private String e;

    public hxd(igl igl) {
        this.a = igl;
    }

    public final void onCurrentFragmentChanged(Fragment fragment, String str) {
        boolean z = !str.equals(this.e);
        this.e = str;
        if (z) {
            this.a.a("view_uri", str);
        }
    }
}
