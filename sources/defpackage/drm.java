package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

@cey
/* renamed from: drm reason: default package */
public final class drm {
    public boolean a;
    private final eco b;
    private final Context c;
    private final dpb d;
    private beo e;
    private dos f;
    private dqd g;
    private String h;
    private blg i;
    private ble j;
    private boolean k;

    public drm(Context context) {
        this(context, dpb.a);
    }

    private drm(Context context, dpb dpb) {
        this.b = new eco();
        this.c = context;
        this.d = dpb;
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
            cow.b("#008 Must be called on the main UI thread.", e2);
        }
        return new Bundle();
    }

    public final void a(beo beo) {
        try {
            this.e = beo;
            if (this.g != null) {
                this.g.a((dps) beo != null ? new dou(beo) : null);
            }
        } catch (RemoteException e2) {
            cow.b("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(ble ble) {
        try {
            this.j = ble;
            if (this.g != null) {
                this.g.a((ciw) ble != null ? new cjb(ble) : null);
            }
        } catch (RemoteException e2) {
            cow.b("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(blg blg) {
        try {
            this.i = blg;
            if (this.g != null) {
                this.g.a((dqi) blg != null ? new dox(blg) : null);
            }
        } catch (RemoteException e2) {
            cow.b("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(dos dos) {
        try {
            this.f = dos;
            if (this.g != null) {
                this.g.a((dpp) dos != null ? new dot(dos) : null);
            }
        } catch (RemoteException e2) {
            cow.b("#008 Must be called on the main UI thread.", e2);
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
            cow.b("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void b() {
        try {
            b("show");
            this.g.I();
        } catch (RemoteException e2) {
            cow.b("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(drh drh) {
        try {
            if (this.g == null) {
                String str = "loadAd";
                if (this.h == null) {
                    b(str);
                }
                dpc b2 = this.a ? dpc.b() : new dpc();
                dpf b3 = dpn.b();
                Context context = this.c;
                dpi dpi = new dpi(b3, context, b2, this.h, this.b);
                this.g = (dqd) dpf.a(context, false, (a<T>) dpi);
                if (this.e != null) {
                    this.g.a((dps) new dou(this.e));
                }
                if (this.f != null) {
                    this.g.a((dpp) new dot(this.f));
                }
                if (this.i != null) {
                    this.g.a((dqi) new dox(this.i));
                }
                if (this.j != null) {
                    this.g.a((ciw) new cjb(this.j));
                }
                this.g.c(this.k);
            }
            if (this.g.b(dpb.a(this.c, drh))) {
                this.b.a = drh.h;
            }
        } catch (RemoteException e2) {
            cow.b("#008 Must be called on the main UI thread.", e2);
        }
    }
}
