package defpackage;

import java.util.List;

/* renamed from: yu reason: default package */
public final class yu extends yw<aah> {
    private final aah e;

    public yu(List<acl<aah>> list) {
        super(list);
        int i = 0;
        aah aah = (aah) ((acl) list.get(0)).b;
        if (aah != null) {
            i = aah.b.length;
        }
        this.e = new aah(new float[i], new int[i]);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a(acl acl, float f) {
        aah aah = this.e;
        aah aah2 = (aah) acl.b;
        aah aah3 = (aah) acl.c;
        if (aah2.b.length == aah3.b.length) {
            for (int i = 0; i < aah2.b.length; i++) {
                float[] fArr = aah.a;
                float f2 = aah2.a[i];
                fArr[i] = f2 + ((aah3.a[i] - f2) * f);
                aah.b[i] = acg.a(f, aah2.b[i], aah3.b[i]);
            }
            return this.e;
        }
        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
        sb.append(aah2.b.length);
        sb.append(" vs ");
        sb.append(aah3.b.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
