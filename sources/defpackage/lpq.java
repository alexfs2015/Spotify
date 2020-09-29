package defpackage;

import org.json.JSONObject;

/* renamed from: lpq reason: default package */
public abstract class lpq {

    /* renamed from: lpq$a */
    public static final class a extends lpq {
        public final String a;

        a(String str) {
            this.a = str;
        }

        public final void a(ged<b> ged, ged<c> ged2, ged<a> ged3) {
            ged3.accept(this);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return gec.a(((a) obj).a, this.a);
        }

        public final int hashCode() {
            String str = this.a;
            return (str != null ? str.hashCode() : 0) + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed{error=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: lpq$b */
    public static final class b extends lpq {
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
            return "InProgress{}";
        }
    }

    /* renamed from: lpq$c */
    public static final class c extends lpq {
        public final JSONObject a;

        c(JSONObject jSONObject) {
            this.a = (JSONObject) gec.a(jSONObject);
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
            sb.append("Successful{data=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    lpq() {
    }

    public abstract void a(ged<b> ged, ged<c> ged2, ged<a> ged3);
}
