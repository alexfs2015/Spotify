package defpackage;

/* renamed from: btn reason: default package */
public final class btn<L> {
    volatile L a;

    /* renamed from: btn$a */
    public static final class a<L> {
        private final L a;
        private final String b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
        }
    }
}
