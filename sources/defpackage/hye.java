package defpackage;

import androidx.fragment.app.Fragment;

/* renamed from: hye reason: default package */
public final class hye implements hyo {
    private final hxy a;

    public hye(jqm jqm) {
        this.a = jqm.g;
    }

    public final void a(hxz hxz) {
        hxy hxy = this.a;
        if (hxy != null && !hxy.aH_()) {
            this.a.a((Fragment) hyp.a(hxz));
            this.a.a(true);
        }
    }

    public final void a() {
        hxy hxy = this.a;
        if (hxy != null && hxy.aH_()) {
            this.a.a(false);
        }
    }
}
