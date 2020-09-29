package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* renamed from: yy reason: default package */
public final class yy extends acl<PointF> {
    Path a;

    public yy(xo xoVar, acl<PointF> acl) {
        super(xoVar, acl.b, acl.c, acl.d, acl.e, acl.f);
        boolean z = (this.c == null || this.b == null || !((PointF) this.b).equals(((PointF) this.c).x, ((PointF) this.c).y)) ? false : true;
        if (this.c != null && !z) {
            this.a = ack.a((PointF) this.b, (PointF) this.c, acl.g, acl.h);
        }
    }
}
