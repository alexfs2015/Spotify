package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: bny reason: default package */
public final class bny {
    public static final bst<c> a = new bst<>("Cast.API", c, eik.a);
    public static final b b = new a();
    private static final defpackage.bst.a<ehs, c> c = new bse();

    /* renamed from: bny$a */
    public interface a extends btc {
        bnx a();

        String b();

        String c();

        boolean d();
    }

    @Deprecated
    /* renamed from: bny$b */
    public interface b {

        /* renamed from: bny$b$a */
        public static final class a implements b {
            public final double a(bsy bsy) {
                return ((ehs) bsy.a((defpackage.bst.c<C>) eik.a)).s();
            }

            public final bsz<Status> a(bsy bsy, String str) {
                return bsy.b(new bsi(bsy, str));
            }

            public final bsz<a> a(bsy bsy, String str, boa boa) {
                return bsy.b(new bsg(bsy, str, boa));
            }

            public final bsz<Status> a(bsy bsy, String str, String str2) {
                return bsy.b(new bsf(bsy, str, str2));
            }

            public final void a(bsy bsy, double d) {
                try {
                    ehs ehs = (ehs) bsy.a((defpackage.bst.c<C>) eik.a);
                    if (Double.isInfinite(d) || Double.isNaN(d)) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Volume cannot be ");
                        sb.append(d);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    eie eie = (eie) ehs.q();
                    if (ehs.t()) {
                        eie.a(d, ehs.k, ehs.j);
                    }
                } catch (RemoteException unused) {
                    throw new IOException("service error");
                }
            }

            public final void a(bsy bsy, String str, e eVar) {
                try {
                    ((ehs) bsy.a((defpackage.bst.c<C>) eik.a)).a(str, eVar);
                } catch (RemoteException unused) {
                    throw new IOException("service error");
                }
            }

            public final bsz<a> b(bsy bsy, String str, String str2) {
                return bsy.b(new bsh(bsy, str, str2));
            }

            public final void b(bsy bsy, String str) {
                try {
                    ((ehs) bsy.a((defpackage.bst.c<C>) eik.a)).a(str);
                } catch (RemoteException unused) {
                    throw new IOException("service error");
                }
            }
        }

        double a(bsy bsy);

        bsz<Status> a(bsy bsy, String str);

        bsz<a> a(bsy bsy, String str, boa boa);

        bsz<Status> a(bsy bsy, String str, String str2);

        void a(bsy bsy, double d);

        void a(bsy bsy, String str, e eVar);

        bsz<a> b(bsy bsy, String str, String str2);

        void b(bsy bsy, String str);
    }

    /* renamed from: bny$c */
    public static final class c implements defpackage.bst.d.c {
        final CastDevice a;
        final d b;
        final Bundle c;
        final int d;

        /* renamed from: bny$c$a */
        public static final class a {
            CastDevice a;
            d b;
            public Bundle c;
            private int d = 0;

            public a(CastDevice castDevice, d dVar) {
                bxo.a(castDevice, (Object) "CastDevice parameter cannot be null");
                bxo.a(dVar, (Object) "CastListener parameter cannot be null");
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

    /* renamed from: bny$d */
    public static class d {
        public void a() {
        }

        public void a(int i) {
        }

        public void a(bnx bnx) {
        }

        public void b() {
        }

        public void b(int i) {
        }

        public void c(int i) {
        }
    }

    /* renamed from: bny$e */
    public interface e {
        void a(CastDevice castDevice, String str);
    }

    /* renamed from: bny$f */
    static abstract class f extends ehm<a> {
        public f(bsy bsy) {
            super(bsy);
        }

        public final /* synthetic */ btc a(Status status) {
            return new bsj(status);
        }

        public void a(ehs ehs) {
        }
    }
}
