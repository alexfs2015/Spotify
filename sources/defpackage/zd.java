package defpackage;

import android.graphics.PointF;
import java.util.Collections;

/* renamed from: zd reason: default package */
public final class zd extends yr<PointF, PointF> {
    private final PointF e = new PointF();
    private final yr<Float, Float> f;
    private final yr<Float, Float> g;

    public zd(yr<Float, Float> yrVar, yr<Float, Float> yrVar2) {
        super(Collections.emptyList());
        this.f = yrVar;
        this.g = yrVar2;
        a(this.c);
    }

    /* access modifiers changed from: 0000 */
    public final /* bridge */ /* synthetic */ Object a(acl acl, float f2) {
        return this.e;
    }

    public final void a(float f2) {
        this.f.a(f2);
        this.g.a(f2);
        this.e.set(((Float) this.f.d()).floatValue(), ((Float) this.g.d()).floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            ((a) this.a.get(i)).a();
        }
    }

    public final /* bridge */ /* synthetic */ Object d() {
        return this.e;
    }
}
