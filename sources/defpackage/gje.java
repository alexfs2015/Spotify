package defpackage;

import com.spotify.instrumentation.ItemType;

@Deprecated
/* renamed from: gje reason: default package */
public abstract class gje {

    /* renamed from: gje$a */
    public static final class a {

        /* renamed from: gje$a$a reason: collision with other inner class name */
        static final class C0033a implements b, c, d {
            private ItemType a;

            public final d a() {
                return this;
            }

            private C0033a() {
            }

            /* synthetic */ C0033a(byte b) {
                this();
            }

            public final b a(ItemType itemType) {
                this.a = (ItemType) fay.a(itemType);
                return this;
            }

            public final gje a(String str) {
                StringBuilder sb = new StringBuilder();
                fay.a(str);
                sb.append(str);
                sb.append('-');
                sb.append(this.a);
                return new gjc(sb.toString());
            }
        }

        /* renamed from: gje$a$b */
        public interface b {
            gje a(String str);
        }

        /* renamed from: gje$a$c */
        public interface c {
            d a();
        }

        /* renamed from: gje$a$d */
        public interface d {
            b a(ItemType itemType);
        }
    }

    public abstract String a();

    public static c b() {
        return new C0033a(0);
    }
}
