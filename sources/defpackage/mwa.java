package defpackage;

/* renamed from: mwa reason: default package */
public abstract class mwa {

    /* renamed from: mwa$a */
    public static final class a extends mwa {
        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "FetchingData{}";
        }
    }

    /* renamed from: mwa$b */
    public static final class b extends mwa {
        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Idle{}";
        }
    }

    /* renamed from: mwa$c */
    public static final class c extends mwa {
        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Refreshing{}";
        }
    }

    mwa() {
    }
}
