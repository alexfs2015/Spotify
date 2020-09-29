package defpackage;

@cfp
/* renamed from: cix reason: default package */
public final class cix extends cjd {
    private final String a;
    private final int b;

    public cix(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof cix)) {
            cix cix = (cix) obj;
            if (bxm.a(this.a, cix.a) && bxm.a(Integer.valueOf(this.b), Integer.valueOf(cix.b))) {
                return true;
            }
        }
        return false;
    }
}
