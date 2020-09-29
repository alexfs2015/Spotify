package defpackage;

import android.os.Bundle;
import com.google.common.base.Optional;

/* renamed from: qes reason: default package */
public abstract class qes {

    /* renamed from: qes$a */
    public static final class a extends qes {
        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoadTimeoutTimer{}";
        }

        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }
    }

    /* renamed from: qes$b */
    public static final class b extends qes {
        final String a;

        b(String str) {
            this.a = (String) gcr.a(str);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return ((b) obj).a.equals(this.a);
        }

        public final int hashCode() {
            return this.a.hashCode() + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("LookupMetadata{uri=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: qes$c */
    public static final class c extends qes {
        final String a;
        final Optional<Bundle> b;

        c(String str, Optional<Bundle> optional) {
            this.a = (String) gcr.a(str);
            this.b = (Optional) gcr.a(optional);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.a.equals(this.a) && cVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Navigate{uri=");
            sb.append(this.a);
            sb.append(", extras=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: qes$d */
    public static final class d extends qes {
        final String a;
        final Throwable b;

        d(String str, Throwable th) {
            this.a = (String) gcr.a(str);
            this.b = (Throwable) gcr.a(th);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.a.equals(this.a) && dVar.b.equals(this.b);
        }

        public final int hashCode() {
            return ((this.a.hashCode() + 0) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ShowError{uri=");
            sb.append(this.a);
            sb.append(", error=");
            sb.append(this.b);
            sb.append('}');
            return sb.toString();
        }
    }

    qes() {
    }

    public static qes a(String str, Optional<Bundle> optional) {
        return new c(str, optional);
    }
}
