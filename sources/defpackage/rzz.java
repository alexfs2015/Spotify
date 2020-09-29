package defpackage;

/* renamed from: rzz reason: default package */
public abstract class rzz {

    /* renamed from: rzz$a */
    public static final class a extends rzz {
        final String a;
        final String b;

        a(String str, String str2) {
            this.a = (String) gec.a(str);
            this.b = (String) gec.a(str2);
        }

        public final void a(ged<a> ged, ged<c> ged2, ged<b> ged3) {
            ged.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a.equals(this.a) && aVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MissingPermissions{requestPermissionsUrl=");
            sb.append(this.a);
            sb.append(", authSuccessUrl=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: rzz$b */
    public static final class b extends rzz {
        b() {
        }

        public final void a(ged<a> ged, ged<c> ged2, ged<b> ged3) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof b;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Nothing{}";
        }
    }

    /* renamed from: rzz$c */
    public static final class c extends rzz {
        c() {
        }

        public final void a(ged<a> ged, ged<c> ged2, ged<b> ged3) {
            ged2.accept(this);
        }

        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ShowToast{}";
        }
    }

    rzz() {
    }

    public abstract void a(ged<a> ged, ged<c> ged2, ged<b> ged3);
}
