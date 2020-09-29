package defpackage;

/* renamed from: nga reason: default package */
public abstract class nga {

    /* renamed from: nga$a */
    public static final class a extends nga {
        a() {
        }

        public final void a(ged<b> ged, ged<a> ged2) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Abandon{}";
        }
    }

    /* renamed from: nga$b */
    public static final class b extends nga {
        b() {
        }

        public final void a(ged<b> ged, ged<a> ged2) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Gain{}";
        }
    }

    nga() {
    }

    public abstract void a(ged<b> ged, ged<a> ged2);
}
