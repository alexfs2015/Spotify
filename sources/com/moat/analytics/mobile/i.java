package com.moat.analytics.mobile;

import com.moat.analytics.mobile.base.functional.a;

class i implements ba<ExoVideoTracker> {
    final /* synthetic */ a a;
    final /* synthetic */ ap b;
    final /* synthetic */ ExoMoatPlugin c;

    i(ExoMoatPlugin exoMoatPlugin, a aVar, ap apVar) {
        this.c = exoMoatPlugin;
        this.a = aVar;
        this.b = apVar;
    }

    public a<ExoVideoTracker> a() {
        return a.a(new k(this.c.a, this.a, this.b));
    }
}
