package defpackage;

/* renamed from: atc reason: default package */
public final class atc {
    public static final atc a = new atc(0, 0);
    public final long b;
    public final long c;

    public atc(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            atc atc = (atc) obj;
            return this.b == atc.b && this.c == atc.c;
        }
    }

    public final int hashCode() {
        return (((int) this.b) * 31) + ((int) this.c);
    }
}
