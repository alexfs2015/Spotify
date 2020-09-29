package defpackage;

import android.os.Bundle;

/* renamed from: etv reason: default package */
final class etv implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ long c;
    private final /* synthetic */ Bundle d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ boolean f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ String h;
    private final /* synthetic */ ett i;

    etv(ett ett, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.i = ett;
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = bundle;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str3;
    }

    public final void run() {
        this.i.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
