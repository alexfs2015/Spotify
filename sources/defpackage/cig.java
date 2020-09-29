package defpackage;

@cey
/* renamed from: cig reason: default package */
public final class cig extends cim {
    private final String a;
    private final int b;

    public cig(String str, int i) {
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
        if (obj != null && (obj instanceof cig)) {
            cig cig = (cig) obj;
            if (bwv.a(this.a, cig.a) && bwv.a(Integer.valueOf(this.b), Integer.valueOf(cig.b))) {
                return true;
            }
        }
        return false;
    }
}
