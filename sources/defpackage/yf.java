package defpackage;

import java.util.List;

/* renamed from: yf reason: default package */
public final class yf extends yi<Float> {
    public yf(List<abx<Float>> list) {
        super(list);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a(abx abx, float f) {
        if (abx.b == null || abx.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.d != null) {
            Float f2 = (Float) this.d.a(abx.e, abx.f.floatValue(), abx.b, abx.c, f, b(), this.c);
            if (f2 != null) {
                return f2;
            }
        }
        float floatValue = ((Float) abx.b).floatValue();
        return Float.valueOf(floatValue + (f * (((Float) abx.c).floatValue() - floatValue)));
    }
}
