package defpackage;

/* renamed from: pqd reason: default package */
public abstract class pqd {

    /* renamed from: pqd$a */
    public static final class a extends pqd {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs3.accept(this);
        }
    }

    /* renamed from: pqd$b */
    public static final class b extends pqd {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PreviewButton{}";
        }

        b() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs.accept(this);
        }
    }

    /* renamed from: pqd$c */
    public static final class c extends pqd {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "PreviewSubmission{}";
        }

        c() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3);

    pqd() {
    }
}
