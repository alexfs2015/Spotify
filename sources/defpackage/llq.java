package defpackage;

import org.json.JSONObject;

/* renamed from: llq reason: default package */
public abstract class llq {

    /* renamed from: llq$a */
    public static final class a extends llq {
        public final String a;

        a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return gcr.a(((a) obj).a, this.a);
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

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs3.accept(this);
        }
    }

    /* renamed from: llq$b */
    public static final class b extends llq {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "InProgress{}";
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

    /* renamed from: llq$c */
    public static final class c extends llq {
        public final JSONObject a;

        c(JSONObject jSONObject) {
            this.a = (JSONObject) gcr.a(jSONObject);
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

        public final void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3) {
            gcs2.accept(this);
        }
    }

    public abstract void a(gcs<b> gcs, gcs<c> gcs2, gcs<a> gcs3);

    llq() {
    }
}
