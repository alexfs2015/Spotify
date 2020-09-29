package defpackage;

import java.util.Arrays;

/* renamed from: atd reason: default package */
public interface atd {

    /* renamed from: atd$a */
    public static final class a {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                return this.a == aVar.a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.b, aVar.b);
            }
        }

        public final int hashCode() {
            return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
        }
    }

    int a(asu asu, int i, boolean z);

    void a(long j, int i, int i2, int i3, a aVar);

    void a(aqe aqe);

    void a(bdj bdj, int i);
}
