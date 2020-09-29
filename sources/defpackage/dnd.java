package defpackage;

/* renamed from: dnd reason: default package */
public final class dnd {
    final long a;
    final String b;
    final int c;

    dnd(long j, String str, int i) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof dnd)) {
            dnd dnd = (dnd) obj;
            if (dnd.a == this.a && dnd.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
