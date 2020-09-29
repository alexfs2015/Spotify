package defpackage;

/* renamed from: ngf reason: default package */
public abstract class ngf {

    /* renamed from: ngf$a */
    public static final class a extends ngf {
        a() {
        }

        public final void a(ged<a> ged, ged<b> ged2) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Hearted{}";
        }
    }

    /* renamed from: ngf$b */
    public static final class b extends ngf {
        b() {
        }

        public final void a(ged<a> ged, ged<b> ged2) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Unhearted{}";
        }
    }

    ngf() {
    }

    public abstract void a(ged<a> ged, ged<b> ged2);
}
