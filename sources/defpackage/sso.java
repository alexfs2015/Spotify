package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.util.Assertion;
import java.util.regex.Pattern;

/* renamed from: sso reason: default package */
public abstract class sso implements Parcelable {

    /* renamed from: sso$a */
    public interface a {

        /* renamed from: sso$a$a reason: collision with other inner class name */
        public static class C0078a implements a {
            private final sso a;

            public C0078a(sso sso) {
                this.a = (sso) fbp.a(sso);
            }

            public final sso ae_() {
                return this.a;
            }
        }

        sso ae_();
    }

    /* renamed from: sso$b */
    public static class b {
        private final String a;
        private Pattern b;

        public b(String str) {
            this.a = str;
        }

        public final sso a(String str) {
            if (!b(str)) {
                StringBuilder sb = new StringBuilder("View URI ");
                sb.append(str);
                sb.append(" did not match pattern ");
                sb.append(this.a);
                Assertion.a(sb.toString());
            }
            return sso.a(str);
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

    public static sso a(String str) {
        return new ssn(str);
    }

    /* access modifiers changed from: 0000 */
    public abstract String a();

    public final boolean b(String str) {
        return a().equals(str);
    }

    public String toString() {
        return a();
    }
}
