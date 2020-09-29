package defpackage;

import java.util.List;

/* renamed from: wnd reason: default package */
public final class wnd implements a {
    public final wmw a;
    final wmz b;
    final wmt c;
    public final wmd d;
    final wlj e;
    final wlt f;
    private final List<wly> g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private int l;

    public wnd(List<wly> list, wmw wmw, wmz wmz, wmt wmt, int i2, wmd wmd, wlj wlj, wlt wlt, int i3, int i4, int i5) {
        this.g = list;
        this.c = wmt;
        this.a = wmw;
        this.b = wmz;
        this.h = i2;
        this.d = wmd;
        this.e = wlj;
        this.f = wlt;
        this.i = i3;
        this.j = i4;
        this.k = i5;
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

    public final wmd a() {
        return this.d;
    }

    public final wmf a(wmd wmd) {
        return a(wmd, this.a, this.b, this.c);
    }

    public final wmf a(wmd wmd, wmw wmw, wmz wmz, wmt wmt) {
        if (this.h < this.g.size()) {
            this.l++;
            String str = "network interceptor ";
            if (this.b == null) {
                wmd wmd2 = wmd;
            } else if (!this.c.a(wmd.a)) {
                StringBuilder sb = new StringBuilder(str);
                sb.append(this.g.get(this.h - 1));
                sb.append(" must retain the same host and port");
                throw new IllegalStateException(sb.toString());
            }
            String str2 = " must call proceed() exactly once";
            if (this.b == null || this.l <= 1) {
                String str3 = str2;
                wnd wnd = new wnd(this.g, wmw, wmz, wmt, this.h + 1, wmd, this.e, this.f, this.i, this.j, this.k);
                wly wly = (wly) this.g.get(this.h);
                wmf a2 = wly.a(wnd);
                if (wmz == null || this.h + 1 >= this.g.size() || wnd.l == 1) {
                    String str4 = "interceptor ";
                    if (a2 == null) {
                        StringBuilder sb2 = new StringBuilder(str4);
                        sb2.append(wly);
                        sb2.append(" returned null");
                        throw new NullPointerException(sb2.toString());
                    } else if (a2.g != null) {
                        return a2;
                    } else {
                        StringBuilder sb3 = new StringBuilder(str4);
                        sb3.append(wly);
                        sb3.append(" returned a response with no body");
                        throw new IllegalStateException(sb3.toString());
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder(str);
                    sb4.append(wly);
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
}
