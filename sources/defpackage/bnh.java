package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: bnh reason: default package */
public final class bnh {
    public static final bsc<c> a = new bsc<>("Cast.API", c, eht.a);
    public static final b b = new a();
    private static final defpackage.bsc.a<ehb, c> c = new brn();

    /* renamed from: bnh$a */
    public interface a extends bsl {
        bng a();

        String b();

        String c();

        boolean d();
    }

    @Deprecated
    /* renamed from: bnh$b */
    public interface b {

        /* renamed from: bnh$b$a */
        public static final class a implements b {
            public final bsi<Status> a(bsh bsh, String str, String str2) {
                return bsh.b(new bro(bsh, str, str2));
            }

            public final bsi<a> a(bsh bsh, String str, bnj bnj) {
                return bsh.b(new brp(bsh, str, bnj));
            }

            public final bsi<Status> a(bsh bsh, String str) {
                return bsh.b(new brr(bsh, str));
            }

            public final void a(bsh bsh, double d) {
                try {
                    ehb ehb = (ehb) bsh.a((defpackage.bsc.c<C>) eht.a);
                    if (Double.isInfinite(d) || Double.isNaN(d)) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Volume cannot be ");
                        sb.append(d);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    ehn ehn = (ehn) ehb.q();
                    if (ehb.t()) {
                        ehn.a(d, ehb.k, ehb.j);
                    }
                } catch (RemoteException unused) {
                    throw new IOException("service error");
                }
            }

            public final double a(bsh bsh) {
                return ((ehb) bsh.a((defpackage.bsc.c<C>) eht.a)).s();
            }

            public final void a(bsh bsh, String str, e eVar) {
                try {
                    ((ehb) bsh.a((defpackage.bsc.c<C>) eht.a)).a(str, eVar);
                } catch (RemoteException unused) {
                    throw new IOException("service error");
                }
            }

            public final void b(bsh bsh, String str) {
                try {
                    ((ehb) bsh.a((defpackage.bsc.c<C>) eht.a)).a(str);
                } catch (RemoteException unused) {
                    throw new IOException("service error");
                }
            }

            public final bsi<a> b(bsh bsh, String str, String str2) {
                return bsh.b(new brq(bsh, str, str2));
            }
        }

        double a(bsh bsh);

        bsi<Status> a(bsh bsh, String str);

        bsi<a> a(bsh bsh, String str, bnj bnj);

        bsi<Status> a(bsh bsh, String str, String str2);

        void a(bsh bsh, double d);

        void a(bsh bsh, String str, e eVar);

        bsi<a> b(bsh bsh, String str, String str2);

        void b(bsh bsh, String str);
    }

    /* renamed from: bnh$c */
    public static final class c implements defpackage.bsc.d.c {
        final CastDevice a;
        final d b;
        final Bundle c;
        final int d;

        /* renamed from: bnh$c$a */
        public static final class a {
            CastDevice a;
            d b;
            public Bundle c;
            private int d = 0;

            public a(CastDevice castDevice, d dVar) {
                bwx.a(castDevice, (Object) "CastDevice parameter cannot be null");
                bwx.a(dVar, (Object) "CastListener parameter cannot be null");
                this.a = castDevice;
                this.b = dVar;
            }

            public final c a() {
                return new c(this, 0);
            }
        }

        private c(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.d = 0;
            this.c = aVar.c;
        }

        /* synthetic */ c(a aVar, byte b2) {
            this(aVar);
        }
    }

    /* renamed from: bnh$d */
    public static class d {
        public void a() {
        }

        public void a(int i) {
        }

        public void a(bng bng) {
        }

        public void b() {
        }

        public void b(int i) {
        }

        public void c(int i) {
        }
    }

    /* renamed from: bnh$e */
    public interface e {
        void a(CastDevice castDevice, String str);
    }

    /* renamed from: bnh$f */
    static abstract class f extends egv<a> {
        public f(bsh bsh) {
            super(bsh);
        }

        public void a(ehb ehb) {
        }

        public final /* synthetic */ bsl a(Status status) {
            return new brs(status);
        }
    }
}
