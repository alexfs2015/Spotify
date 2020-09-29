package defpackage;

import com.spotify.music.feature.facebooksso.createaccount.model.Failure;

/* renamed from: lpl reason: default package */
public abstract class lpl {

    /* renamed from: lpl$a */
    public static final class a extends lpl {
        public final Failure a;

        a(Failure failure) {
            this.a = (Failure) gec.a(failure);
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof a) && ((a) obj).a == this.a;
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed{failure=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: lpl$b */
    public static final class b extends lpl {
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
            return "InProgress{}";
        }
    }

    /* renamed from: lpl$c */
    public static final class c extends lpl {
        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Successful{}";
        }
    }

    lpl() {
    }

    public static lpl a(Failure failure) {
        return new a(failure);
    }

    public abstract void a(ged<b> ged, ged<c> ged2, ged<a> ged3);
}
