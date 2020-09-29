package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: bep reason: default package */
public class bep {
    private final dpb a;
    private final Context b;
    private final dpv c;

    /* renamed from: bep$a */
    public static class a {
        private final Context a;
        private final dpy b;

        private a(Context context, dpy dpy) {
            this.a = context;
            this.b = dpy;
        }

        public final bep a() {
            try {
                return new bep(this.a, this.b.a());
            } catch (RemoteException e) {
                cow.a("Failed to build AdLoader.", e);
                return null;
            }
        }

        public a(Context context, String str) {
            this((Context) bwx.a(context, (Object) "context cannot be null"), (dpy) dpf.a(context, false, (a<T>) new dpj<T>(dpn.b(), context, str, new eco())));
        }

        public final a a(defpackage.bfc.a aVar) {
            try {
                this.b.a((dwd) new dxb(aVar));
            } catch (RemoteException unused) {
                cow.a(5);
            }
            return this;
        }

        public final a a(defpackage.bfb.a aVar) {
            try {
                this.b.a((dwa) new dxa(aVar));
            } catch (RemoteException unused) {
                cow.a(5);
            }
            return this;
        }

        public final a a(defpackage.bff.a aVar) {
            try {
                this.b.a((dwp) new dxf(aVar));
            } catch (RemoteException unused) {
                cow.a(5);
            }
            return this;
        }

        public final a a(String str, b bVar, defpackage.bfd.a aVar) {
            try {
                this.b.a(str, new dxe(bVar), aVar == null ? null : new dxc(aVar));
            } catch (RemoteException unused) {
                cow.a(5);
            }
            return this;
        }

        public final a a(beo beo) {
            try {
                this.b.a((dps) new dou(beo));
            } catch (RemoteException unused) {
                cow.a(5);
            }
            return this;
        }

        public final a a(bez bez) {
            try {
                this.b.a(new dup(bez));
            } catch (RemoteException unused) {
                cow.a(5);
            }
            return this;
        }
    }

    bep(Context context, dpv dpv) {
        this(context, dpv, dpb.a);
    }

    private bep(Context context, dpv dpv, dpb dpb) {
        this.b = context;
        this.c = dpv;
        this.a = dpb;
    }

    public final void a(drh drh) {
        try {
            this.c.a(dpb.a(this.b, drh));
        } catch (RemoteException e) {
            cow.a("Failed to load ad.", e);
        }
    }
}
