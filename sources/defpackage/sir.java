package defpackage;

import android.app.Application;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sir reason: default package */
public final class sir implements siq {
    private final Map<a, sit> a = new HashMap(2);
    private final Application b;
    private final rwl c;

    /* renamed from: sir$a */
    static class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            this.a = (String) fbp.a(str);
            fbp.a(!fbo.a(str));
            this.b = (String) fbp.a(str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    public sir(Application application, rwl rwl) {
        this.b = (Application) fbp.a(application);
        this.c = rwl;
    }

    public final sit a(String str) {
        return a(str, "default");
    }

    public final sit a(String str, String str2) {
        sit sit = (sit) this.a.get(new a(str, str2));
        if (sit != null) {
            return sit;
        }
        siu siu = new siu(this.b, str, str2, this.c);
        this.a.put(new a(str, str2), siu);
        return siu;
    }
}
