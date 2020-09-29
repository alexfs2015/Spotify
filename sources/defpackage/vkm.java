package defpackage;

/* renamed from: vkm reason: default package */
public abstract class vkm {

    /* renamed from: vkm$a */
    public static final class a extends vkm {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "BadAge{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs3.accept(this);
        }
    }

    /* renamed from: vkm$b */
    public static final class b extends vkm {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "TooYoung{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs2.accept(this);
        }
    }

    /* renamed from: vkm$c */
    public static final class c extends vkm {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Unknown{}";
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3) {
            gcs.accept(this);
        }
    }

    public abstract void a(gcs<c> gcs, gcs<b> gcs2, gcs<a> gcs3);

    vkm() {
    }
}
