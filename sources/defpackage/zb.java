package defpackage;

import java.util.List;

/* renamed from: zb reason: default package */
public final class zb extends yw<aco> {
    public zb(List<acl<aco>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(acl acl, float f) {
        if (acl.b == null || acl.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        aco aco = (aco) acl.b;
        aco aco2 = (aco) acl.c;
        if (this.d != null) {
            aco aco3 = (aco) this.d.a(acl.e, acl.f.floatValue(), aco, aco2, f, b(), this.c);
            if (aco3 != null) {
                return aco3;
            }
        }
        float f2 = aco.a;
        float f3 = f2 + ((aco2.a - f2) * f);
        float f4 = aco.b;
        return new aco(f3, f4 + (f * (aco2.b - f4)));
    }
}
