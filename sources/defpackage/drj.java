package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzjq;
import java.util.concurrent.atomic.AtomicBoolean;

@cey
/* renamed from: drj reason: default package */
public final class drj {
    public final eco a;
    public final beu b;
    public final dpo c;
    public dos d;
    public beo e;
    public ber[] f;
    public bew g;
    public dqd h;
    public String i;
    public ViewGroup j;
    public int k;
    private final dpb l;
    private final AtomicBoolean m;

    public drj(ViewGroup viewGroup, int i2) {
        this(viewGroup, null, false, dpb.a, i2, 0);
    }

    public drj(ViewGroup viewGroup, AttributeSet attributeSet, int i2) {
        this(viewGroup, attributeSet, false, dpb.a, i2, 0);
    }

    public drj(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, dpb.a, 0, 0);
    }

    private drj(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, dpb dpb, int i2, byte b2) {
        this(viewGroup, attributeSet, z, dpb, i2);
    }

    public static dpc a(Context context, ber[] berArr, int i2) {
        dpc dpc = new dpc(context, berArr);
        dpc.j = a(i2);
        return dpc;
    }

    private static boolean a(int i2) {
        return i2 == 1;
    }

    public final ber a() {
        try {
            if (this.h != null) {
                dpc l2 = this.h.l();
                if (l2 != null) {
                    return l2.c();
                }
            }
        } catch (RemoteException e2) {
            cow.b("#007 Could not call remote method.", e2);
        }
        ber[] berArr = this.f;
        if (berArr != null) {
            return berArr[0];
        }
        return null;
    }

    public final void a(bew bew) {
        try {
            this.g = bew;
            if (this.h != null) {
                this.h.a((dqm) bew != null ? new dpe(bew) : null);
            }
        } catch (RemoteException e2) {
            cow.b("#007 Could not call remote method.", e2);
        }
    }

    public final void a(dos dos) {
        try {
            this.d = dos;
            if (this.h != null) {
                this.h.a((dpp) dos != null ? new dot(dos) : null);
            }
        } catch (RemoteException e2) {
            cow.b("#007 Could not call remote method.", e2);
        }
    }

    public final void a(ber... berArr) {
        this.f = berArr;
        try {
            if (this.h != null) {
                this.h.a(a(this.j.getContext(), this.f, this.k));
            }
        } catch (RemoteException e2) {
            cow.b("#007 Could not call remote method.", e2);
        }
        this.j.requestLayout();
    }

    public final dqz b() {
        dqd dqd = this.h;
        if (dqd == null) {
            return null;
        }
        try {
            return dqd.t();
        } catch (RemoteException e2) {
            cow.b("#007 Could not call remote method.", e2);
            return null;
        }
    }

    private drj(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, dpb dpb, int i2) {
        this.a = new eco();
        this.b = new beu();
        this.c = new drk(this);
        this.j = viewGroup;
        this.l = dpb;
        this.h = null;
        this.m = new AtomicBoolean(false);
        this.k = i2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzjq zzjq = new zzjq(context, attributeSet);
                if (!z) {
                    if (zzjq.a.length != 1) {
                        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
                    }
                }
                this.f = zzjq.a;
                this.i = zzjq.b;
                if (viewGroup.isInEditMode()) {
                    dpn.a();
                    ber ber = this.f[0];
                    int i3 = this.k;
                    dpc dpc = new dpc(context, ber);
                    dpc.j = a(i3);
                    col.a(viewGroup, dpc, "Ads by Google", -16777216, -1);
                }
            } catch (IllegalArgumentException e2) {
                dpn.a().a(viewGroup, new dpc(context, ber.a), e2.getMessage(), e2.getMessage());
            }
        }
    }
}
