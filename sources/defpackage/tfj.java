package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: tfj reason: default package */
public abstract class tfj {

    /* renamed from: tfj$a */
    public static final class a extends tfj {
        a() {
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Error{}";
        }
    }

    /* renamed from: tfj$b */
    public static final class b extends tfj {
        b() {
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Loading{}";
        }
    }

    /* renamed from: tfj$c */
    public static final class c extends tfj {
        public final ImmutableList<tfb> a;

        c(ImmutableList<tfb> immutableList) {
            this.a = (ImmutableList) gec.a(immutableList);
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return ((c) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PivotsLoaded{pivots=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    tfj() {
    }

    public static tfj a(ImmutableList<tfb> immutableList) {
        return new c(immutableList);
    }

    public abstract void a(ged<b> ged, ged<c> ged2, ged<a> ged3);
}
