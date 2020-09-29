package defpackage;

/* renamed from: gpd reason: default package */
public abstract class gpd {

    /* renamed from: gpd$a */
    public static final class a extends gpd {
        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Failure{}";
        }
    }

    /* renamed from: gpd$b */
    public static final class b extends gpd {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Success{}";
        }
    }

    gpd() {
    }
}
