package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xaa reason: default package */
public final class xaa extends xak {
    private static final xaf a = xaf.a("application/x-www-form-urlencoded");
    private final List<String> b;
    private final List<String> c;

    /* renamed from: xaa$a */
    public static final class a {
        public final List<String> a;
        public final List<String> b;
        private final Charset c;

        public a() {
            this(null);
        }

        private a(Charset charset) {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = null;
        }

        public final a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                String str3 = str;
                this.a.add(xad.a(str3, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.c));
                String str4 = str2;
                this.b.add(xad.a(str4, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public final a b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                String str3 = str;
                this.a.add(xad.a(str3, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.c));
                String str4 = str2;
                this.b.add(xad.a(str4, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }
    }

    public xaa(List<String> list, List<String> list2) {
        this.b = xaq.a(list);
        this.c = xaq.a(list2);
    }

    private long a(xcr xcr, boolean z) {
        xcq xcq = z ? new xcq() : xcr.b();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                xcq.j(38);
            }
            xcq.b((String) this.b.get(i));
            xcq.j(61);
            xcq.b((String) this.c.get(i));
        }
        if (!z) {
            return 0;
        }
        long j = xcq.b;
        xcq.r();
        return j;
    }

    public final xaf a() {
        return a;
    }

    public final void a(xcr xcr) {
        a(xcr, false);
    }

    public final long b() {
        return a(null, true);
    }
}
