package defpackage;

import android.location.Location;
import android.os.Bundle;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@cey
/* renamed from: drh reason: default package */
public final class drh {
    final Date a;
    final String b;
    final int c;
    final Set<String> d;
    final Location e;
    final boolean f;
    final Bundle g;
    public final Map<Class<? extends Object>, Object> h;
    final String i;
    final String j;
    final blh k;
    final int l;
    final Set<String> m;
    final Bundle n;
    final Set<String> o;
    final boolean p;

    public drh(dri dri) {
        this(dri, null);
    }

    private drh(dri dri, blh blh) {
        this.a = dri.g;
        this.b = null;
        this.c = dri.h;
        this.d = Collections.unmodifiableSet(dri.a);
        this.e = dri.i;
        this.f = false;
        this.g = dri.b;
        this.h = Collections.unmodifiableMap(dri.c);
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = dri.j;
        this.m = Collections.unmodifiableSet(dri.d);
        this.n = dri.e;
        this.o = Collections.unmodifiableSet(dri.f);
        this.p = dri.k;
    }
}
