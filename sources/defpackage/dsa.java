package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzjq;
import java.util.concurrent.atomic.AtomicBoolean;

@cfp
/* renamed from: dsa reason: default package */
public final class dsa {
    public final edf a;
    public final bfl b;
    public final dqf c;
    public dpj d;
    public bff e;
    public bfi[] f;
    public bfn g;
    public dqu h;
    public String i;
    public ViewGroup j;
    public int k;
    private final dps l;
    private final AtomicBoolean m;

    public dsa(ViewGroup viewGroup, int i2) {
        this(viewGroup, null, false, dps.a, i2, 0);
    }

    public dsa(ViewGroup viewGroup, AttributeSet attributeSet, int i2) {
        this(viewGroup, attributeSet, false, dps.a, i2, 0);
    }

    public dsa(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, dps.a, 0, 0);
    }

    private dsa(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, dps dps, int i2) {
        this.a = new edf();
        this.b = new bfl();
        this.c = new dsb(this);
        this.j = viewGroup;
        this.l = dps;
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
                    dqe.a();
                    bfi bfi = this.f[0];
                    int i3 = this.k;
                    dpt dpt = new dpt(context, bfi);
                    dpt.j = a(i3);
                    cpc.a(viewGroup, dpt, "Ads by Google", -16777216, -1);
                }
            } catch (IllegalArgumentException e2) {
                dqe.a().a(viewGroup, new dpt(context, bfi.a), e2.getMessage(), e2.getMessage());
            }
        }
    }

    private dsa(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, dps dps, int i2, byte b2) {
        this(viewGroup, attributeSet, z, dps, i2);
    }

    public static dpt a(Context context, bfi[] bfiArr, int i2) {
        dpt dpt = new dpt(context, bfiArr);
        dpt.j = a(i2);
        return dpt;
    }

    private static boolean a(int i2) {
        return i2 == 1;
    }

    public final bfi a() {
        try {
            if (this.h != null) {
                dpt l2 = this.h.l();
                if (l2 != null) {
                    return l2.c();
                }
            }
        } catch (RemoteException e2) {
            cpn.b("#007 Could not call remote method.", e2);
        }
        bfi[] bfiArr = this.f;
        if (bfiArr != null) {
            return bfiArr[0];
        }
        return null;
    }

    public final void a(bfn bfn) {
        try {
            this.g = bfn;
            if (this.h != null) {
                this.h.a((drd) bfn != null ? new dpv(bfn) : null);
            }
        } catch (RemoteException e2) {
            cpn.b("#007 Could not call remote method.", e2);
        }
    }

    public final void a(dpj dpj) {
        try {
            this.d = dpj;
            if (this.h != null) {
                this.h.a((dqg) dpj != null ? new dpk(dpj) : null);
            }
        } catch (RemoteException e2) {
            cpn.b("#007 Could not call remote method.", e2);
        }
    }

    public final void a(bfi... bfiArr) {
        this.f = bfiArr;
        try {
            if (this.h != null) {
                this.h.a(a(this.j.getContext(), this.f, this.k));
            }
        } catch (RemoteException e2) {
            cpn.b("#007 Could not call remote method.", e2);
        }
        this.j.requestLayout();
    }

    public final drq b() {
        dqu dqu = this.h;
        if (dqu == null) {
            return null;
        }
        try {
            return dqu.t();
        } catch (RemoteException e2) {
            cpn.b("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
