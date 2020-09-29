package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

class BaseAdView extends ViewGroup {
    protected final drj a;

    public BaseAdView(Context context, int i) {
        super(context);
        this.a = new drj(this, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.a = new drj((ViewGroup) this, attributeSet, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.a = new drj((ViewGroup) this, attributeSet, i2);
    }

    public ber d() {
        return this.a.a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            ber ber = null;
            try {
                ber = d();
            } catch (NullPointerException e) {
                cow.a("Unable to retrieve ad size.", e);
            }
            if (ber != null) {
                Context context = getContext();
                int b = ber.b(context);
                i3 = ber.a(context);
                i4 = b;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void e() {
        drj drj = this.a;
        try {
            if (drj.h != null) {
                drj.h.j();
            }
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public void a(beq beq) {
        Object a2;
        String str = "#007 Could not call remote method.";
        drj drj = this.a;
        drh drh = beq.a;
        try {
            if (drj.h == null) {
                if ((drj.f == null || drj.i == null) && drj.h == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = drj.j.getContext();
                dpc a3 = drj.a(context, drj.f, drj.k);
                if ("search_v2".equals(a3.a)) {
                    a2 = dpf.a(context, false, (a<T>) new dph<T>(dpn.b(), context, a3, drj.i));
                } else {
                    dpg dpg = new dpg(dpn.b(), context, a3, drj.i, drj.a);
                    a2 = dpf.a(context, false, (a<T>) dpg);
                }
                drj.h = (dqd) a2;
                drj.h.a((dps) new dou(drj.c));
                if (drj.d != null) {
                    drj.h.a((dpp) new dot(drj.d));
                }
                if (drj.g != null) {
                    drj.h.a((dqm) new dpe(drj.g));
                }
                drj.h.b(false);
                try {
                    car k = drj.h.k();
                    if (k != null) {
                        drj.j.addView((View) cas.a(k));
                    }
                } catch (RemoteException e) {
                    cow.b(str, e);
                }
            }
            if (drj.h.b(dpb.a(drj.j.getContext(), drh))) {
                drj.a.a = drh.h;
            }
        } catch (RemoteException e2) {
            cow.b(str, e2);
        }
    }

    public void c() {
        drj drj = this.a;
        try {
            if (drj.h != null) {
                drj.h.o();
            }
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public void b() {
        drj drj = this.a;
        try {
            if (drj.h != null) {
                drj.h.p();
            }
        } catch (RemoteException e) {
            cow.b("#007 Could not call remote method.", e);
        }
    }

    public void a(beo beo) {
        drj drj = this.a;
        drj.e = beo;
        drj.c.a(beo);
        if (beo == null) {
            this.a.a((dos) null);
            this.a.a((bew) null);
            return;
        }
        if (beo instanceof dos) {
            this.a.a((dos) beo);
        }
        if (beo instanceof bew) {
            this.a.a((bew) beo);
        }
    }

    public void a(ber ber) {
        drj drj = this.a;
        ber[] berArr = {ber};
        if (drj.f == null) {
            drj.a(berArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public void a(String str) {
        drj drj = this.a;
        if (drj.i == null) {
            drj.i = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }
}
