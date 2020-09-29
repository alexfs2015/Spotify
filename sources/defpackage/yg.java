package defpackage;

import java.util.List;

/* renamed from: yg reason: default package */
public final class yg extends yi<zt> {
    private final zt e;

    public yg(List<abx<zt>> list) {
        super(list);
        int i = 0;
        zt ztVar = (zt) ((abx) list.get(0)).b;
        if (ztVar != null) {
            i = ztVar.b.length;
        }
        this.e = new zt(new float[i], new int[i]);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object a(abx abx, float f) {
        zt ztVar = this.e;
        zt ztVar2 = (zt) abx.b;
        zt ztVar3 = (zt) abx.c;
        if (ztVar2.b.length == ztVar3.b.length) {
            for (int i = 0; i < ztVar2.b.length; i++) {
                float[] fArr = ztVar.a;
                float f2 = ztVar2.a[i];
                fArr[i] = f2 + ((ztVar3.a[i] - f2) * f);
                ztVar.b[i] = abs.a(f, ztVar2.b[i], ztVar3.b[i]);
            }
            return this.e;
        }
        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
        sb.append(ztVar2.b.length);
        sb.append(" vs ");
        sb.append(ztVar3.b.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
