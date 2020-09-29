package defpackage;

import com.spotify.instrumentation.ItemType;

@Deprecated
/* renamed from: gkp reason: default package */
public abstract class gkp {

    /* renamed from: gkp$a */
    public static final class a {

        /* renamed from: gkp$a$a reason: collision with other inner class name */
        static final class C0034a implements b, c, d {
            private ItemType a;

            private C0034a() {
            }

            /* synthetic */ C0034a(byte b) {
                this();
            }

            public final b a(ItemType itemType) {
                this.a = (ItemType) fbp.a(itemType);
                return this;
            }

            public final d a() {
                return this;
            }

            public final gkp a(String str) {
                StringBuilder sb = new StringBuilder();
                fbp.a(str);
                sb.append(str);
                sb.append('-');
                sb.append(this.a);
                return new gkn(sb.toString());
            }
        }

        /* renamed from: gkp$a$b */
        public interface b {
            gkp a(String str);
        }

        /* renamed from: gkp$a$c */
        public interface c {
            d a();
        }

        /* renamed from: gkp$a$d */
        public interface d {
            b a(ItemType itemType);
        }
    }

    public static c b() {
        return new C0034a(0);
    }

    public abstract String a();
}
