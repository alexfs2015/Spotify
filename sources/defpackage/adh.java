package defpackage;

/* renamed from: adh reason: default package */
public final class adh extends adb implements ack {
    private final afq[] c = {null, null, null};
    private final afb d = new adn(String.format("%s$%d", new Object[]{this.b, Integer.valueOf(70)}));
    private afe[] e;
    private final afw[] f = {null, null, null};

    public adh(acc acc, acd acd) {
        super(acc, acd);
        int i = 0;
        this.e = (afe[]) afv.a(this.d, afe.class, ((aco) acd).d());
        while (true) {
            afe[] afeArr = this.e;
            if (i < afeArr.length) {
                afe afe = afeArr[i];
                StringBuilder sb = new StringBuilder("Initial value ");
                sb.append(i);
                afe.a(sb.toString());
                this.e[i].a(new byte[1]);
                i++;
            } else {
                this.d.a(afeArr);
                return;
            }
        }
    }

    public final afq a(int i) {
        if (i < 0 && i > 2) {
            return null;
        }
        afq[] afqArr = this.c;
        if (afqArr[i] == null) {
            afqArr[i] = new adi(String.format("%s$%d", new Object[]{this.b, Integer.valueOf(70)}), i, this.d);
        }
        return this.c[i];
    }
}
