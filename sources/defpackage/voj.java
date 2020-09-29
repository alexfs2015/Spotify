package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: voj reason: default package */
public final class voj {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* renamed from: voj$a */
    public final class a {
        public final List<vom> a;

        /* renamed from: voj$a$a reason: collision with other inner class name */
        public final class C0083a {
            public final String a;

            /* synthetic */ C0083a(a aVar, String str, byte b2) {
                this(str);
            }

            private C0083a(String str) {
                this.a = str;
            }

            public final voo a(String str) {
                defpackage.voo.a a2 = voo.a();
                a2.a = voj.this.a;
                a2.b = voj.this.b;
                a2.c = voj.this.c;
                a2.g = voj.this.d;
                a2.d = voj.this.e;
                defpackage.voo.a a3 = a2.a(a.this.a);
                a3.e = this.a;
                a3.f = "shuffle_play";
                return a3.a("context_to_be_played", str).a();
            }

            public final voo a() {
                defpackage.voo.a a2 = voo.a();
                a2.a = voj.this.a;
                a2.b = voj.this.b;
                a2.c = voj.this.c;
                a2.g = voj.this.d;
                a2.d = voj.this.e;
                defpackage.voo.a a3 = a2.a(a.this.a);
                a3.e = this.a;
                a3.f = "ui_reveal";
                return a3.a();
            }
        }

        /* synthetic */ a(voj voj, List list, byte b2) {
            this(list);
        }

        private a(List<vom> list) {
            this.a = Collections.unmodifiableList(list);
        }

        public final C0083a a() {
            return new C0083a(this, "hit", 0);
        }

        public final C0083a b() {
            return new C0083a(this, "unknown", 0);
        }
    }

    private voj(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public static voj a(String str, String str2, String str3, String str4, String str5) {
        voj voj = new voj(str, str2, str3, str4, str5);
        return voj;
    }

    public final a a(List<vom> list) {
        return new a(this, list, 0);
    }
}
