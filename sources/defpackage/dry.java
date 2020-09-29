package defpackage;

import android.location.Location;
import android.os.Bundle;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@cfp
/* renamed from: dry reason: default package */
public final class dry {
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
    final bly k;
    final int l;
    final Set<String> m;
    final Bundle n;
    final Set<String> o;
    final boolean p;

    public dry(drz drz) {
        this(drz, null);
    }

    private dry(drz drz, bly bly) {
        this.a = drz.g;
        this.b = null;
        this.c = drz.h;
        this.d = Collections.unmodifiableSet(drz.a);
        this.e = drz.i;
        this.f = false;
        this.g = drz.b;
        this.h = Collections.unmodifiableMap(drz.c);
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = drz.j;
        this.m = Collections.unmodifiableSet(drz.d);
        this.n = drz.e;
        this.o = Collections.unmodifiableSet(drz.f);
        this.p = drz.k;
    }
}
