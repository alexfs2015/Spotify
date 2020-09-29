package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* renamed from: zv reason: default package */
public final class zv implements aad<PointF, PointF> {
    private final List<acl<PointF>> a;

    public zv() {
        this.a = Collections.singletonList(new acl(new PointF(0.0f, 0.0f)));
    }

    public zv(List<acl<PointF>> list) {
        this.a = list;
    }

    public final yr<PointF, PointF> a() {
        return ((acl) this.a.get(0)).c() ? new za(this.a) : new yz(this.a);
    }
}
