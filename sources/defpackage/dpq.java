package defpackage;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

@cfp
/* renamed from: dpq reason: default package */
public final class dpq {
    public long a;
    public Bundle b;
    public int c;
    public List<String> d;
    public boolean e;
    public int f;
    public boolean g;
    public String h;
    public dsl i;
    public Location j;
    public String k;
    public Bundle l;
    public Bundle m;
    public List<String> n;
    public String o;
    public String p;
    private boolean q;

    public dpq() {
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

    public dpq(dpp dpp) {
        this.a = dpp.b;
        this.b = dpp.c;
        this.c = dpp.d;
        this.d = dpp.e;
        this.e = dpp.f;
        this.f = dpp.g;
        this.g = dpp.h;
        this.h = dpp.i;
        this.i = dpp.j;
        this.j = dpp.k;
        this.k = dpp.l;
        this.l = dpp.m;
        this.m = dpp.n;
        this.n = dpp.o;
        this.o = dpp.p;
        this.p = dpp.q;
    }
}
