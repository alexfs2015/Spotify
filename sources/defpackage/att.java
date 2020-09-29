package defpackage;

/* renamed from: att reason: default package */
public final class att {
    public static final att a = new att(0, 0);
    public final long b;
    public final long c;

    public att(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            att att = (att) obj;
            return this.b == att.b && this.c == att.c;
        }
    }

    public final int hashCode() {
        return (((int) this.b) * 31) + ((int) this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
