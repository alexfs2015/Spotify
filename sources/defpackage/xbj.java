package defpackage;

import java.util.List;

/* renamed from: xbj reason: default package */
public final class xbj implements a {
    public final xbc a;
    final xbf b;
    final xaz c;
    public final xaj d;
    final wzp e;
    final wzz f;
    private final List<xae> g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private int l;

    public xbj(List<xae> list, xbc xbc, xbf xbf, xaz xaz, int i2, xaj xaj, wzp wzp, wzz wzz, int i3, int i4, int i5) {
        this.g = list;
        this.c = xaz;
        this.a = xbc;
        this.b = xbf;
        this.h = i2;
        this.d = xaj;
        this.e = wzp;
        this.f = wzz;
        this.i = i3;
        this.j = i4;
        this.k = i5;
    }

    public final xaj a() {
        return this.d;
    }

    public final xal a(xaj xaj) {
        return a(xaj, this.a, this.b, this.c);
    }

    public final xal a(xaj xaj, xbc xbc, xbf xbf, xaz xaz) {
        if (this.h < this.g.size()) {
            this.l++;
            String str = "network interceptor ";
            if (this.b == null) {
                xaj xaj2 = xaj;
            } else if (!this.c.a(xaj.a)) {
                StringBuilder sb = new StringBuilder(str);
                sb.append(this.g.get(this.h - 1));
                sb.append(" must retain the same host and port");
                throw new IllegalStateException(sb.toString());
            }
            String str2 = " must call proceed() exactly once";
            if (this.b == null || this.l <= 1) {
                String str3 = str2;
                xbj xbj = new xbj(this.g, xbc, xbf, xaz, this.h + 1, xaj, this.e, this.f, this.i, this.j, this.k);
                xae xae = (xae) this.g.get(this.h);
                xal a2 = xae.a(xbj);
                if (xbf == null || this.h + 1 >= this.g.size() || xbj.l == 1) {
                    String str4 = "interceptor ";
                    if (a2 == null) {
                        StringBuilder sb2 = new StringBuilder(str4);
                        sb2.append(xae);
                        sb2.append(" returned null");
                        throw new NullPointerException(sb2.toString());
                    } else if (a2.g != null) {
                        return a2;
                    } else {
                        StringBuilder sb3 = new StringBuilder(str4);
                        sb3.append(xae);
                        sb3.append(" returned a response with no body");
                        throw new IllegalStateException(sb3.toString());
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder(str);
                    sb4.append(xae);
                    sb4.append(str3);
                    throw new IllegalStateException(sb4.toString());
                }
            } else {
                StringBuilder sb5 = new StringBuilder(str);
                sb5.append(this.g.get(this.h - 1));
                sb5.append(str2);
                throw new IllegalStateException(sb5.toString());
            }
        } else {
            throw new AssertionError();
        }
    }

    public final int b() {
        return this.i;
    }

    public final int c() {
        return this.j;
    }

    public final int d() {
        return this.k;
    }
}
