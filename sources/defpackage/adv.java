package defpackage;

/* renamed from: adv reason: default package */
public final class adv extends adp implements acy {
    private final age[] c = {null, null, null};
    private final afp d = new aeb(String.format("%s$%d", new Object[]{this.b, Integer.valueOf(70)}));
    private afs[] e;
    private final agk[] f = {null, null, null};

    public adv(acq acq, acr acr) {
        super(acq, acr);
        int i = 0;
        this.e = (afs[]) agj.a(this.d, afs.class, ((adc) acr).d());
        while (true) {
            afs[] afsArr = this.e;
            if (i < afsArr.length) {
                afs afs = afsArr[i];
                StringBuilder sb = new StringBuilder("Initial value ");
                sb.append(i);
                afs.a(sb.toString());
                this.e[i].a(new byte[1]);
                i++;
            } else {
                this.d.a(afsArr);
                return;
            }
        }
    }

    public final age a(int i) {
        if (i < 0 && i > 2) {
            return null;
        }
        age[] ageArr = this.c;
        if (ageArr[i] == null) {
            ageArr[i] = new adw(String.format("%s$%d", new Object[]{this.b, Integer.valueOf(70)}), i, this.d);
        }
        return this.c[i];
    }
}
