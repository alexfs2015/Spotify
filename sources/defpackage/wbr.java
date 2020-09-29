package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: wbr reason: default package */
public final class wbr {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* renamed from: wbr$a */
    public final class a {
        public final List<wbu> a;

        /* renamed from: wbr$a$a reason: collision with other inner class name */
        public final class C0086a {
            public final String a;

            private C0086a(String str) {
                this.a = str;
            }

            /* synthetic */ C0086a(a aVar, String str, byte b2) {
                this(str);
            }

            public final wbw a() {
                defpackage.wbw.a a2 = wbw.a();
                a2.a = wbr.this.a;
                a2.b = wbr.this.b;
                a2.c = wbr.this.c;
                a2.g = wbr.this.d;
                a2.d = wbr.this.e;
                defpackage.wbw.a a3 = a2.a(a.this.a);
                a3.e = this.a;
                a3.f = "ui_reveal";
                return a3.a();
            }

            public final wbw a(String str) {
                defpackage.wbw.a a2 = wbw.a();
                a2.a = wbr.this.a;
                a2.b = wbr.this.b;
                a2.c = wbr.this.c;
                a2.g = wbr.this.d;
                a2.d = wbr.this.e;
                defpackage.wbw.a a3 = a2.a(a.this.a);
                a3.e = this.a;
                a3.f = "shuffle_play";
                return a3.a("context_to_be_played", str).a();
            }
        }

        private a(List<wbu> list) {
            this.a = Collections.unmodifiableList(list);
        }

        /* synthetic */ a(wbr wbr, List list, byte b2) {
            this(list);
        }

        public final C0086a a() {
            return new C0086a(this, "hit", 0);
        }

        public final C0086a b() {
            return new C0086a(this, "unknown", 0);
        }
    }

    private wbr(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public static wbr a(String str, String str2, String str3, String str4, String str5) {
        wbr wbr = new wbr(str, str2, str3, str4, str5);
        return wbr;
    }

    public final a a(List<wbu> list) {
        return new a(this, list, 0);
    }
}
