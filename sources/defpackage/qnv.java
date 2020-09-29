package defpackage;

import android.os.Bundle;
import com.google.common.base.Optional;

/* renamed from: qnv reason: default package */
public abstract class qnv {

    /* renamed from: qnv$a */
    public static final class a extends qnv {
        a() {
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "LoadTimeoutTimer{}";
        }
    }

    /* renamed from: qnv$b */
    public static final class b extends qnv {
        final String a;

        b(String str) {
            this.a = (String) gec.a(str);
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

    /* renamed from: qnv$c */
    public static final class c extends qnv {
        final String a;
        final Optional<Bundle> b;

        c(String str, Optional<Bundle> optional) {
            this.a = (String) gec.a(str);
            this.b = (Optional) gec.a(optional);
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

    /* renamed from: qnv$d */
    public static final class d extends qnv {
        final String a;
        final Throwable b;

        d(String str, Throwable th) {
            this.a = (String) gec.a(str);
            this.b = (Throwable) gec.a(th);
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

    qnv() {
    }

    public static qnv a(String str, Optional<Bundle> optional) {
        return new c(str, optional);
    }
}
