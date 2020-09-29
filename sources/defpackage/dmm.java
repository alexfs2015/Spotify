package defpackage;

/* renamed from: dmm reason: default package */
public final class dmm {
    final long a;
    final String b;
    final int c;

    dmm(long j, String str, int i) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof dmm)) {
            dmm dmm = (dmm) obj;
            if (dmm.a == this.a && dmm.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
