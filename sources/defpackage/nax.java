package defpackage;

/* renamed from: nax reason: default package */
public abstract class nax {

    /* renamed from: nax$a */
    public static final class a extends nax {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Hearted{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2) {
            gcs.accept(this);
        }
    }

    /* renamed from: nax$b */
    public static final class b extends nax {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Unhearted{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<a> gcs, gcs<b> gcs2) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<a> gcs, gcs<b> gcs2);

    nax() {
    }
}
