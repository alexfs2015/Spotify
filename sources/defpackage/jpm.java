package defpackage;

import android.app.Activity;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;

/* renamed from: jpm reason: default package */
public final class jpm implements jpl {
    private final jon a;
    private final Activity b;
    private final jvf c;
    private final kaj d;
    private final kal e;
    private final RxResolver f;
    private final gcb g;

    public jpm(jon jon, Activity activity, jvf jvf, kaj kaj, kal kal, RxResolver rxResolver, gcb gcb) {
        this.a = jon;
        this.b = activity;
        this.c = jvf;
        this.d = kaj;
        this.e = kal;
        this.f = rxResolver;
        this.g = gcb;
    }

    public final jow a(uqm uqm, sso sso, boolean z, boolean z2, boolean z3, jqg jqg) {
        jox jox = new jox(this.a, this.b, uqm, sso, z, z2, z3, jqg);
        return jox;
    }

    public final jpa a(uqm uqm, sso sso, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, jqg jqg) {
        jpb jpb = new jpb(this.a, uqm, sso, z, z2, z3, z4, z5, jqg);
        return jpb;
    }

    public final jpg a(uqm uqm, sso sso, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, jqg jqg, jpj jpj, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Optional<String> optional, Optional<String> optional2) {
        jph jph = new jph(this.a, this.b, uqm, sso, this.c, this.d, this.e, z, z2, z3, z4, z5, z6, z7, jqg, jpj, z8, z9, z10, z11, z12, z13, optional, optional2, this.g);
        return jph;
    }

    public final jpu a(uqm uqm, sso sso, boolean z, boolean z2, jqg jqg) {
        jpv jpv = new jpv(this.a, this.b, uqm, sso, z, z2, jqg, this.c);
        return jpv;
    }

    public final jpy a(uqm uqm, sso sso, boolean z, jqg jqg) {
        jpz jpz = new jpz(this.a, this.b, uqm, sso, z, jqg);
        return jpz;
    }

    public final jqe a(uqm uqm, sso sso, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Optional<String> optional, boolean z6, jqg jqg, Optional<String> optional2, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, Optional<jqm> optional3, Optional<jqm> optional4, boolean z13, boolean z14) {
        jqf jqf = new jqf(this.a, this.b, uqm, sso, z, z2, z3, z4, z5, optional, z6, jqg, optional2, z7, z8, z9, z10, z11, z12, optional3, optional4, z13, z14, this.f);
        return jqf;
    }
}
