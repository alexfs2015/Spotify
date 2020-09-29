package defpackage;

import android.content.Context;
import android.text.TextUtils;

@cfp
/* renamed from: biq reason: default package */
public final class biq extends dqq {
    private dqj a;
    private dwr b;
    private dxg c;
    private dwu d;
    private dv<String, dwy> e = new dv<>();
    private dv<String, dxb> f = new dv<>();
    private dxe g;
    private dpt h;
    private bfv i;
    private dvg j;
    private drj k;
    private final Context l;
    private final edg m;
    private final String n;
    private final cpp o;
    private final bkz p;

    public biq(Context context, String str, edg edg, cpp cpp, bkz bkz) {
        this.l = context;
        this.n = str;
        this.m = edg;
        this.o = cpp;
        this.p = bkz;
    }

    public final dqm a() {
        bin bin = new bin(this.l, this.n, this.m, this.o, this.a, this.b, this.c, this.d, this.f, this.e, this.j, this.k, this.p, this.g, this.h, this.i);
        return bin;
    }

    public final void a(bfv bfv) {
        this.i = bfv;
    }

    public final void a(dqj dqj) {
        this.a = dqj;
    }

    public final void a(drj drj) {
        this.k = drj;
    }

    public final void a(dvg dvg) {
        this.j = dvg;
    }

    public final void a(dwr dwr) {
        this.b = dwr;
    }

    public final void a(dwu dwu) {
        this.d = dwu;
    }

    public final void a(dxe dxe, dpt dpt) {
        this.g = dxe;
        this.h = dpt;
    }

    public final void a(dxg dxg) {
        this.c = dxg;
    }

    public final void a(String str, dxb dxb, dwy dwy) {
        if (!TextUtils.isEmpty(str)) {
            this.f.put(str, dxb);
            this.e.put(str, dwy);
            return;
        }
        throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
    }
}
