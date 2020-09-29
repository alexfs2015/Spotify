package defpackage;

import android.app.Application;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rzd reason: default package */
public final class rzd implements rzc {
    private final Map<a, rzf> a = new HashMap(2);
    private final Application b;
    private final rnf c;

    /* renamed from: rzd$a */
    static class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            this.a = (String) fay.a(str);
            fay.a(!fax.a(str));
            this.b = (String) fay.a(str2);
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

    public rzd(Application application, rnf rnf) {
        this.b = (Application) fay.a(application);
        this.c = rnf;
    }

    public final rzf a(String str) {
        return a(str, "default");
    }

    public final rzf a(String str, String str2) {
        rzf rzf = (rzf) this.a.get(new a(str, str2));
        if (rzf != null) {
            return rzf;
        }
        rzg rzg = new rzg(this.b, str, str2, this.c);
        this.a.put(new a(str, str2), rzg);
        return rzg;
    }
}
