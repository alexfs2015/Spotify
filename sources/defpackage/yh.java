package defpackage;

import java.util.List;

/* renamed from: yh reason: default package */
public final class yh extends yi<Integer> {
    public yh(List<abx<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a(abx abx, float f) {
        if (abx.b == null || abx.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.d != null) {
            Integer num = (Integer) this.d.a(abx.e, abx.f.floatValue(), abx.b, abx.c, f, b(), this.c);
            if (num != null) {
                return num;
            }
        }
        int intValue = ((Integer) abx.b).intValue();
        return Integer.valueOf((int) (((float) intValue) + (f * ((float) (((Integer) abx.c).intValue() - intValue)))));
    }
}
