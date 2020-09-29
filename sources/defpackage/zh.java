package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* renamed from: zh reason: default package */
public final class zh implements zp<PointF, PointF> {
    private final List<abx<PointF>> a;

    public zh() {
        this.a = Collections.singletonList(new abx(new PointF(0.0f, 0.0f)));
    }

    public zh(List<abx<PointF>> list) {
        this.a = list;
    }

    public final yd<PointF, PointF> a() {
        if (((abx) this.a.get(0)).c()) {
            return new ym(this.a);
        }
        return new yl(this.a);
    }
}
