package defpackage;

import defpackage.bst.d;
import java.util.Arrays;

/* renamed from: bwa reason: default package */
public final class bwa<O extends d> {
    public final bst<O> a;
    private final boolean b = false;
    private final int c;
    private final O d;

    private bwa(bst<O> bst, O o) {
        this.a = bst;
        this.d = o;
        this.c = Arrays.hashCode(new Object[]{this.a, this.d});
    }

    public static <O extends d> bwa<O> a(bst<O> bst, O o) {
        return new bwa<>(bst, o);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bwa)) {
            return false;
        }
        bwa bwa = (bwa) obj;
        return !this.b && !bwa.b && bxm.a(this.a, bwa.a) && bxm.a(this.d, bwa.d);
    }

    public final int hashCode() {
        return this.c;
    }
}
