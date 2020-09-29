package defpackage;

import android.location.Location;
import java.util.Date;
import java.util.Set;

@cfp
/* renamed from: eed reason: default package */
public final class eed implements bld {
    private final Date a;
    private final int b;
    private final Set<String> c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final boolean g;

    public eed(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2) {
        this.a = date;
        this.b = i;
        this.c = set;
        this.e = location;
        this.d = z;
        this.f = i2;
        this.g = z2;
    }

    public final Date a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final Set<String> c() {
        return this.c;
    }

    public final Location d() {
        return this.e;
    }

    public final int e() {
        return this.f;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.g;
    }
}
