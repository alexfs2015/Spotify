package com.moat.analytics.mobile;

public class ExoMoatPlugin implements ac<ExoVideoTracker> {
    /* access modifiers changed from: private */
    public final String a;

    public ExoMoatPlugin(String str) {
        this.a = str;
    }

    /* renamed from: a */
    public ExoVideoTracker b() {
        return new j();
    }

    /* renamed from: a */
    public ExoVideoTracker b(a aVar, ap apVar) {
        return (ExoVideoTracker) ay.a(apVar, new i(this, aVar, apVar), new l());
    }
}
