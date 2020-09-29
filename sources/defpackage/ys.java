package defpackage;

import java.util.List;

/* renamed from: ys reason: default package */
public final class ys extends yw<Integer> {
    public ys(List<acl<Integer>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(acl acl, float f) {
        if (acl.b == null || acl.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) acl.b).intValue();
        int intValue2 = ((Integer) acl.c).intValue();
        if (this.d != null) {
            Integer num = (Integer) this.d.a(acl.e, acl.f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, b(), this.c);
            if (num != null) {
                return num;
            }
        }
        return Integer.valueOf(acg.a(f, intValue, intValue2));
    }
}
