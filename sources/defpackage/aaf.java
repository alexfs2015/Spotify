package defpackage;

import android.graphics.PointF;

/* renamed from: aaf reason: default package */
public final class aaf implements aag {
    public final String a;
    public final aad<PointF, PointF> b;
    public final zw c;
    public final boolean d;

    public aaf(String str, aad<PointF, PointF> aad, zw zwVar, boolean z) {
        this.a = str;
        this.b = aad;
        this.c = zwVar;
        this.d = z;
    }

    public final ya a(xq xqVar, aaq aaq) {
        return new yd(xqVar, aaq, this);
    }
}
