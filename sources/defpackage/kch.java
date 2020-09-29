package defpackage;

import com.google.common.base.Optional;

/* renamed from: kch reason: default package */
public final class kch<T> {
    public final Optional<T> a;
    private final long b;
    private final long c;

    public kch(Optional<T> optional, long j) {
        this(optional, j, -1);
    }

    private kch(Optional<T> optional, long j, long j2) {
        this.a = optional;
        this.b = j;
        this.c = j2;
    }

    public final kch<T> a(long j) {
        kch kch = new kch(this.a, this.b, j);
        return kch;
    }

    private boolean b() {
        return this.c != -1;
    }

    public final Optional<Long> a() {
        if (b()) {
            return Optional.b(Long.valueOf(this.c - this.b));
        }
        return Optional.e();
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kch)) {
            return false;
        }
        kch kch = (kch) obj;
        return this.b == kch.b && this.c == kch.c && this.a.equals(kch.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }
}
