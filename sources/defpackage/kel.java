package defpackage;

import com.google.common.base.Optional;

/* renamed from: kel reason: default package */
public final class kel<T> {
    public final Optional<T> a;
    private final long b;
    private final long c;

    public kel(Optional<T> optional, long j) {
        this(optional, j, -1);
    }

    private kel(Optional<T> optional, long j, long j2) {
        this.a = optional;
        this.b = j;
        this.c = j2;
    }

    private boolean b() {
        return this.c != -1;
    }

    public final Optional<Long> a() {
        return b() ? Optional.b(Long.valueOf(this.c - this.b)) : Optional.e();
    }

    public final kel<T> a(long j) {
        kel kel = new kel(this.a, this.b, j);
        return kel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kel)) {
            return false;
        }
        kel kel = (kel) obj;
        return this.b == kel.b && this.c == kel.c && this.a.equals(kel.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObservedFormat{mFormat=");
        sb.append(this.a);
        sb.append(", mStart=");
        sb.append(this.b);
        sb.append(", mEnd=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
