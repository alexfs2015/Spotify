package defpackage;

import java.util.List;

/* renamed from: yv reason: default package */
public final class yv extends yw<Integer> {
    public yv(List<acl<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a(acl acl, float f) {
        if (acl.b == null || acl.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.d != null) {
            Integer num = (Integer) this.d.a(acl.e, acl.f.floatValue(), acl.b, acl.c, f, b(), this.c);
            if (num != null) {
                return num;
            }
        }
        int intValue = ((Integer) acl.b).intValue();
        return Integer.valueOf((int) (((float) intValue) + (f * ((float) (((Integer) acl.c).intValue() - intValue)))));
    }
}
