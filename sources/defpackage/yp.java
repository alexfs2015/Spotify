package defpackage;

import android.graphics.PointF;
import java.util.Collections;

/* renamed from: yp reason: default package */
public final class yp extends yd<PointF, PointF> {
    private final PointF e = new PointF();
    private final yd<Float, Float> f;
    private final yd<Float, Float> g;

    public yp(yd<Float, Float> ydVar, yd<Float, Float> ydVar2) {
        super(Collections.emptyList());
        this.f = ydVar;
        this.g = ydVar2;
        a(this.c);
    }

    public final void a(float f2) {
        this.f.a(f2);
        this.g.a(f2);
        this.e.set(((Float) this.f.d()).floatValue(), ((Float) this.g.d()).floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            ((a) this.a.get(i)).a();
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* bridge */ /* synthetic */ Object a(abx abx, float f2) {
        return this.e;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        return this.e;
    }
}
