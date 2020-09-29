package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

@cfp
/* renamed from: dsd reason: default package */
public final class dsd {
    public boolean a;
    private final edf b;
    private final Context c;
    private final dps d;
    private bff e;
    private dpj f;
    private dqu g;
    private String h;
    private blx i;
    private blv j;
    private boolean k;

    public dsd(Context context) {
        this(context, dps.a);
    }

    private dsd(Context context, dps dps) {
        this.b = new edf();
        this.c = context;
        this.d = dps;
    }

    private final void b(String str) {
        if (this.g == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
            sb.append("The ad unit ID must be set on InterstitialAd before ");
            sb.append(str);
            sb.append(" is called.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final Bundle a() {
        try {
            if (this.g != null) {
                return this.g.q();
            }
        } catch (RemoteException e2) {
            cpn.b("#008 Must be called on the main UI thread.", e2);
        }
        return new Bundle();
    }

    public final void a(bff bff) {
        try {
            this.e = bff;
            if (this.g != null) {
                this.g.a((dqj) bff != null ? new dpl(bff) : null);
            }
        } catch (RemoteException e2) {
            cpn.b("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(blv blv) {
        try {
            this.j = blv;
            if (this.g != null) {
                this.g.a((cjn) blv != null ? new cjs(blv) : null);
            }
        } catch (RemoteException e2) {
            cpn.b("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(blx blx) {
        try {
            this.i = blx;
            if (this.g != null) {
                this.g.a((dqz) blx != null ? new dpo(blx) : null);
            }
        } catch (RemoteException e2) {
            cpn.b("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(dpj dpj) {
        try {
            this.f = dpj;
            if (this.g != null) {
                this.g.a((dqg) dpj != null ? new dpk(dpj) : null);
            }
        } catch (RemoteException e2) {
            cpn.b("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(dry dry) {
        try {
            if (this.g == null) {
                String str = "loadAd";
                if (this.h == null) {
                    b(str);
                }
                dpt b2 = this.a ? dpt.b() : new dpt();
                dpw b3 = dqe.b();
                Context context = this.c;
                dpz dpz = new dpz(b3, context, b2, this.h, this.b);
                this.g = (dqu) dpw.a(context, false, (a<T>) dpz);
                if (this.e != null) {
                    this.g.a((dqj) new dpl(this.e));
                }
                if (this.f != null) {
                    this.g.a((dqg) new dpk(this.f));
                }
                if (this.i != null) {
                    this.g.a((dqz) new dpo(this.i));
                }
                if (this.j != null) {
                    this.g.a((cjn) new cjs(this.j));
                }
                this.g.c(this.k);
            }
            if (this.g.b(dps.a(this.c, dry))) {
                this.b.a = dry.h;
            }
        } catch (RemoteException e2) {
            cpn.b("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(String str) {
        if (this.h == null) {
            this.h = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    public final void a(boolean z) {
        try {
            this.k = z;
            if (this.g != null) {
                this.g.c(z);
            }
        } catch (RemoteException e2) {
            cpn.b("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void b() {
        try {
            b("show");
            this.g.I();
        } catch (RemoteException e2) {
            cpn.b("#008 Must be called on the main UI thread.", e2);
        }
    }
}
