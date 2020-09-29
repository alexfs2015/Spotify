package defpackage;

import java.util.List;

/* renamed from: yt reason: default package */
public final class yt extends yw<Float> {
    public yt(List<acl<Float>> list) {
        super(list);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a(acl acl, float f) {
        if (acl.b == null || acl.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.d != null) {
            Float f2 = (Float) this.d.a(acl.e, acl.f.floatValue(), acl.b, acl.c, f, b(), this.c);
            if (f2 != null) {
                return f2;
            }
        }
        float floatValue = ((Float) acl.b).floatValue();
        return Float.valueOf(floatValue + (f * (((Float) acl.c).floatValue() - floatValue)));
    }
}
