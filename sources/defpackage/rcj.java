package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SortOption;

/* renamed from: rcj reason: default package */
public final class rcj {
    public final rbr a;
    public rcl b;
    public rbq c;
    private SortOption d;
    private boolean e;

    public rcj(rbr rbr) {
        this.a = rbr;
    }

    public final void a() {
        this.a.b();
        b();
    }

    public final void b() {
        this.b.a(this.c, this.d);
    }

    public final void a(SortOption sortOption, int i) {
        a(sortOption);
        this.a.a(sortOption.mKey, i);
        this.b.a(sortOption);
    }

    public final void c() {
        this.a.a();
    }

    public final void a(SortOption sortOption) {
        Assertion.a("The active sort option should be part of the Filter and Sort Configuration", this.c.a().contains(sortOption));
        if (!sortOption.equals(this.d)) {
            this.d = sortOption;
        }
    }

    public final void d() {
        this.a.d();
    }

    public final void a(String str) {
        if (this.e && str.isEmpty()) {
            this.e = !this.e;
            this.b.a(false);
        } else if (!this.e && !str.isEmpty()) {
            this.a.c();
            this.e = !this.e;
            this.b.a(true);
        }
        this.b.a(str);
    }

    public final void e() {
        this.a.e();
        this.b.a();
    }

    public final void f() {
        this.b.b();
        this.a.f();
    }
}
