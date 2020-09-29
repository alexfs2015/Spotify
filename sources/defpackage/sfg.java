package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: sfg reason: default package */
public final class sfg implements sff {
    private static final List<String> a = Collections.emptyList();
    private final sfd b;
    private final jtz c;
    private sfc d;
    private final List<String> e = new ArrayList(2);
    private boolean f;

    public sfg(sfd sfd, jtz jtz) {
        this.b = sfd;
        this.c = (jtz) fbp.a(jtz);
    }

    private void a(sfc sfc) {
        this.b.a(sfc.a(), sfc.b(), sfc.c(), sfc.d(), sfc.e());
    }

    private void m() {
        this.f = false;
        this.d = null;
    }

    private long n() {
        sfc sfc = this.d;
        if (sfc == null || sfc.f() == 0) {
            return 0;
        }
        if (sfc.g() != 0) {
            sfc = sfc.i().a(sfc.g()).a();
        }
        return ((this.c.a() - sfc.f()) / 1000) + sfc.h();
    }

    public final void a() {
        if (this.d == null) {
            this.d = sfc.a(this.c.a(), "car_detected", "connect_to_navigation_apps", this.e, "no_app_connected");
            a(this.d);
        }
    }

    public final void a(String str) {
        if (this.d == null && (!"waze".equals(str) || this.f)) {
            this.d = sfc.a(this.c.a(), "from_partner_app", "navigation", a, str);
            a(this.d);
        }
    }

    public final void a(boolean z) {
        this.f = true;
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

    public final void b() {
        if (this.d == null) {
            this.d = sfc.a(this.c.a(), "from_navigation", "navigation", a, "waze");
            a(this.d);
        }
    }

    public final void b(String str) {
        sfc sfc = this.d;
        if (sfc != null) {
            this.b.a(sfc.a(), "manual_close", n(), "navigation", a, str);
            m();
        }
    }

    public final void c() {
        sfc sfc = this.d;
        if (sfc != null) {
            this.b.a(sfc.a(), "sent_to_google_maps", n(), "connect_to_navigation_apps", sfc.d(), "no_app_connected");
            m();
        }
    }

    public final void d() {
        sfc sfc = this.d;
        if (sfc != null) {
            this.b.a(sfc.a(), "sent_to_google_maps", n(), "navigation", sfc.d(), "google_maps");
            m();
        }
    }

    public final void e() {
        sfc sfc = this.d;
        if (sfc != null) {
            this.b.a(sfc.a(), "sent_to_waze", n(), "connect_to_navigation_apps", sfc.d(), "no_app_connected");
            m();
        }
    }

    public final void f() {
        sfc sfc = this.d;
        if (sfc != null) {
            this.b.a(sfc.a(), "sent_to_waze", n(), "navigation", sfc.d(), "waze");
            m();
        }
    }

    public final void g() {
        sfc sfc = this.d;
        if (sfc != null) {
            this.b.a(sfc.a(), "sent_to_settings", n(), "connect_to_navigation_apps", sfc.d(), "no_app_connected");
            m();
        }
    }

    public final void h() {
        sfc sfc = this.d;
        if (sfc != null) {
            this.b.a(sfc.a(), "timeout", n(), "connect_to_navigation_apps", sfc.d(), "no_app_connected");
            m();
        }
    }

    public final void i() {
        sfc sfc = this.d;
        if (sfc != null) {
            this.b.a(sfc.a(), "manual_close", n(), "connect_to_navigation_apps", sfc.d(), "no_app_connected");
            m();
        }
    }

    public final void j() {
        sfc sfc = this.d;
        if (sfc != null) {
            this.b.a(sfc.a(), "npv_open", n(), sfc.c(), sfc.d(), sfc.e());
            m();
        }
    }

    public final void k() {
        sfc sfc = this.d;
        if (sfc != null) {
            this.d = sfc.i().c(n()).a();
        }
    }

    public final void l() {
        sfc sfc = this.d;
        if (sfc != null) {
            this.d = sfc.i().b(this.c.a()).a();
        }
    }
}
