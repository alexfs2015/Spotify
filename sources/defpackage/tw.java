package defpackage;

/* renamed from: tw reason: default package */
public final class tw {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public tw(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            tw twVar = (tw) obj;
            return this.a == twVar.a && this.b == twVar.b && this.c == twVar.c && this.d == twVar.d;
        }
    }

    public final int hashCode() {
        int i = this.a ? 1 : 0;
        if (this.b) {
            i += 16;
        }
        if (this.c) {
            i += 256;
        }
        return this.d ? i + 4096 : i;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }
}
