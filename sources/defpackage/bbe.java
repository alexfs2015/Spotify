package defpackage;

import java.util.Arrays;

/* renamed from: bbe reason: default package */
public final class bbe {
    public final int a;
    public final bbd[] b;
    private int c;

    public bbe(bbd... bbdArr) {
        this.b = bbdArr;
        this.a = bbdArr.length;
    }

    public final bbd[] a() {
        return (bbd[]) this.b.clone();
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b) + 527;
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((bbe) obj).b);
    }
}
