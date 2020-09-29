package defpackage;

import defpackage.bsc.d;
import java.util.Arrays;

/* renamed from: bvj reason: default package */
public final class bvj<O extends d> {
    public final bsc<O> a;
    private final boolean b = false;
    private final int c;
    private final O d;

    private bvj(bsc<O> bsc, O o) {
        this.a = bsc;
        this.d = o;
        this.c = Arrays.hashCode(new Object[]{this.a, this.d});
    }

    public static <O extends d> bvj<O> a(bsc<O> bsc, O o) {
        return new bvj<>(bsc, o);
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bvj)) {
            return false;
        }
        bvj bvj = (bvj) obj;
        return !this.b && !bvj.b && bwv.a(this.a, bvj.a) && bwv.a(this.d, bvj.d);
    }
}
