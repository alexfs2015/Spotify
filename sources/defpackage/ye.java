package defpackage;

import java.util.List;

/* renamed from: ye reason: default package */
public final class ye extends yi<Integer> {
    public ye(List<abx<Integer>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(abx abx, float f) {
        if (abx.b == null || abx.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) abx.b).intValue();
        int intValue2 = ((Integer) abx.c).intValue();
        if (this.d != null) {
            Integer num = (Integer) this.d.a(abx.e, abx.f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, b(), this.c);
            if (num != null) {
                return num;
            }
        }
        return Integer.valueOf(abs.a(f, intValue, intValue2));
    }
}
