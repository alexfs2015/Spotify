package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: rvw reason: default package */
public final class rvw implements rvv {
    private static final List<String> a = Collections.emptyList();
    private final rvt b;
    private final jrp c;
    private rvs d;
    private final List<String> e = new ArrayList(2);
    private boolean f;

    public rvw(rvt rvt, jrp jrp) {
        this.b = rvt;
        this.c = (jrp) fay.a(jrp);
    }

    public final void a() {
        if (this.d == null) {
            this.d = rvs.a(this.c.a(), "car_detected", "connect_to_navigation_apps", this.e, "no_app_connected");
            a(this.d);
        }
    }

    public final void a(String str) {
        if (this.d == null && (!"waze".equals(str) || this.f)) {
            this.d = rvs.a(this.c.a(), "from_partner_app", "navigation", a, str);
            a(this.d);
        }
    }

    public final void b() {
        if (this.d == null) {
            this.d = rvs.a(this.c.a(), "from_navigation", "navigation", a, "waze");
            a(this.d);
        }
    }

    private void a(rvs rvs) {
        this.b.a(rvs.a(), rvs.b(), rvs.c(), rvs.d(), rvs.e());
    }

    public final void c() {
        rvs rvs = this.d;
        if (rvs != null) {
            this.b.a(rvs.a(), "sent_to_google_maps", n(), "connect_to_navigation_apps", rvs.d(), "no_app_connected");
            m();
        }
    }

    public final void d() {
        rvs rvs = this.d;
        if (rvs != null) {
            this.b.a(rvs.a(), "sent_to_google_maps", n(), "navigation", rvs.d(), "google_maps");
            m();
        }
    }

    public final void e() {
        rvs rvs = this.d;
        if (rvs != null) {
            this.b.a(rvs.a(), "sent_to_waze", n(), "connect_to_navigation_apps", rvs.d(), "no_app_connected");
            m();
        }
    }

    public final void f() {
        rvs rvs = this.d;
        if (rvs != null) {
            this.b.a(rvs.a(), "sent_to_waze", n(), "navigation", rvs.d(), "waze");
            m();
        }
    }

    public final void g() {
        rvs rvs = this.d;
        if (rvs != null) {
            this.b.a(rvs.a(), "sent_to_settings", n(), "connect_to_navigation_apps", rvs.d(), "no_app_connected");
            m();
        }
    }

    public final void h() {
        rvs rvs = this.d;
        if (rvs != null) {
            this.b.a(rvs.a(), "timeout", n(), "connect_to_navigation_apps", rvs.d(), "no_app_connected");
            m();
        }
    }

    public final void i() {
        rvs rvs = this.d;
        if (rvs != null) {
            this.b.a(rvs.a(), "manual_close", n(), "connect_to_navigation_apps", rvs.d(), "no_app_connected");
            m();
        }
    }

    public final void b(String str) {
        rvs rvs = this.d;
        if (rvs != null) {
            this.b.a(rvs.a(), "manual_close", n(), "navigation", a, str);
            m();
        }
    }

    public final void j() {
        rvs rvs = this.d;
        if (rvs != null) {
            this.b.a(rvs.a(), "npv_open", n(), rvs.c(), rvs.d(), rvs.e());
            m();
        }
    }

    private void m() {
        this.f = false;
        this.d = null;
    }

    private long n() {
        rvs rvs = this.d;
        if (rvs == null || rvs.f() == 0) {
            return 0;
        }
        if (rvs.g() != 0) {
            rvs = rvs.i().a(rvs.g()).a();
        }
        return ((this.c.a() - rvs.f()) / 1000) + rvs.h();
    }

    public final void a(boolean z, boolean z2) {
        this.e.clear();
        if (z) {
            this.e.add("waze");
        }
        if (z2) {
            this.e.add("google_maps");
        }
    }

    public final void l() {
        rvs rvs = this.d;
        if (rvs != null) {
            this.d = rvs.i().b(this.c.a()).a();
        }
    }

    public final void k() {
        rvs rvs = this.d;
        if (rvs != null) {
            this.d = rvs.i().c(n()).a();
        }
    }

    public final void a(boolean z) {
        this.f = true;
    }
}
