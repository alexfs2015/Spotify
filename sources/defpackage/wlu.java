package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wlu reason: default package */
public final class wlu extends wme {
    private static final wlz a = wlz.a("application/x-www-form-urlencoded");
    private final List<String> b;
    private final List<String> c;

    /* renamed from: wlu$a */
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
                this.a.add(wlx.a(str3, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.c));
                String str4 = str2;
                this.b.add(wlx.a(str4, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.c));
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
                this.a.add(wlx.a(str3, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.c));
                String str4 = str2;
                this.b.add(wlx.a(str4, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }
    }

    public wlu(List<String> list, List<String> list2) {
        this.b = wmk.a(list);
        this.c = wmk.a(list2);
    }

    public final wlz a() {
        return a;
    }

    public final long b() {
        return a(null, true);
    }

    public final void a(wol wol) {
        a(wol, false);
    }

    private long a(wol wol, boolean z) {
        wok wok;
        if (z) {
            wok = new wok();
        } else {
            wok = wol.b();
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                wok.j(38);
            }
            wok.b((String) this.b.get(i));
            wok.j(61);
            wok.b((String) this.c.get(i));
        }
        if (!z) {
            return 0;
        }
        long j = wok.b;
        wok.r();
        return j;
    }
}
