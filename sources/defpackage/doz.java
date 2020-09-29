package defpackage;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

@cey
/* renamed from: doz reason: default package */
public final class doz {
    public long a;
    public Bundle b;
    public int c;
    public List<String> d;
    public boolean e;
    public int f;
    public boolean g;
    public String h;
    public dru i;
    public Location j;
    public String k;
    public Bundle l;
    public Bundle m;
    public List<String> n;
    public String o;
    public String p;
    private boolean q;

    public doz() {
        this.a = -1;
        this.b = new Bundle();
        this.c = -1;
        this.d = new ArrayList();
        this.e = false;
        this.f = -1;
        this.g = false;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = new Bundle();
        this.m = new Bundle();
        this.n = new ArrayList();
        this.o = null;
        this.p = null;
        this.q = false;
    }

    public doz(doy doy) {
        this.a = doy.b;
        this.b = doy.c;
        this.c = doy.d;
        this.d = doy.e;
        this.e = doy.f;
        this.f = doy.g;
        this.g = doy.h;
        this.h = doy.i;
        this.i = doy.j;
        this.j = doy.k;
        this.k = doy.l;
        this.l = doy.m;
        this.m = doy.n;
        this.n = doy.o;
        this.o = doy.p;
        this.p = doy.q;
    }
}
