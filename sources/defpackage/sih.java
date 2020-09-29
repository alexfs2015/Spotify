package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.util.Assertion;
import java.util.regex.Pattern;

/* renamed from: sih reason: default package */
public abstract class sih implements Parcelable {

    /* renamed from: sih$a */
    public interface a {

        /* renamed from: sih$a$a reason: collision with other inner class name */
        public static class C0077a implements a {
            private final sih a;

            public C0077a(sih sih) {
                this.a = (sih) fay.a(sih);
            }

            public final sih ae_() {
                return this.a;
            }
        }

        sih ae_();
    }

    /* renamed from: sih$b */
    public static class b {
        private final String a;
        private Pattern b;

        public b(String str) {
            this.a = str;
        }

        public final sih a(String str) {
            if (!b(str)) {
                StringBuilder sb = new StringBuilder("View URI ");
                sb.append(str);
                sb.append(" did not match pattern ");
                sb.append(this.a);
                Assertion.a(sb.toString());
            }
            return sih.a(str);
        }

        public final boolean b(String str) {
            if (this.b == null) {
                this.b = Pattern.compile(this.a);
            }
            return this.b.matcher(str).matches();
        }

        public final String toString() {
            return this.a;
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract String a();

    public static sih a(String str) {
        return new sig(str);
    }

    public final boolean b(String str) {
        return a().equals(str);
    }

    public String toString() {
        return a();
    }
}
