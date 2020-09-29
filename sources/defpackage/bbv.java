package defpackage;

import java.util.Arrays;

/* renamed from: bbv reason: default package */
public final class bbv {
    public final int a;
    public final bbu[] b;
    private int c;

    public bbv(bbu... bbuArr) {
        this.b = bbuArr;
        this.a = bbuArr.length;
    }

    public final bbu[] a() {
        return (bbu[]) this.b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((bbv) obj).b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b) + 527;
        }
        return this.c;
    }
}
