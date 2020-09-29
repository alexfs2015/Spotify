package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

class BaseAdView extends ViewGroup {
    protected final dsa a;

    public BaseAdView(Context context, int i) {
        super(context);
        this.a = new dsa(this, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.a = new dsa((ViewGroup) this, attributeSet, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.a = new dsa((ViewGroup) this, attributeSet, i2);
    }

    public void a(bff bff) {
        dsa dsa = this.a;
        dsa.e = bff;
        dsa.c.a(bff);
        if (bff == null) {
            this.a.a((dpj) null);
            this.a.a((bfn) null);
            return;
        }
        if (bff instanceof dpj) {
            this.a.a((dpj) bff);
        }
        if (bff instanceof bfn) {
            this.a.a((bfn) bff);
        }
    }

    public void a(bfh bfh) {
        Object a2;
        String str = "#007 Could not call remote method.";
        dsa dsa = this.a;
        dry dry = bfh.a;
        try {
            if (dsa.h == null) {
                if ((dsa.f == null || dsa.i == null) && dsa.h == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = dsa.j.getContext();
                dpt a3 = dsa.a(context, dsa.f, dsa.k);
                if ("search_v2".equals(a3.a)) {
                    a2 = dpw.a(context, false, (a<T>) new dpy<T>(dqe.b(), context, a3, dsa.i));
                } else {
                    dpx dpx = new dpx(dqe.b(), context, a3, dsa.i, dsa.a);
                    a2 = dpw.a(context, false, (a<T>) dpx);
                }
                dsa.h = (dqu) a2;
                dsa.h.a((dqj) new dpl(dsa.c));
                if (dsa.d != null) {
                    dsa.h.a((dqg) new dpk(dsa.d));
                }
                if (dsa.g != null) {
                    dsa.h.a((drd) new dpv(dsa.g));
                }
                dsa.h.b(false);
                try {
                    cbi k = dsa.h.k();
                    if (k != null) {
                        dsa.j.addView((View) cbj.a(k));
                    }
                } catch (RemoteException e) {
                    cpn.b(str, e);
                }
            }
            if (dsa.h.b(dps.a(dsa.j.getContext(), dry))) {
                dsa.a.a = dry.h;
            }
        } catch (RemoteException e2) {
            cpn.b(str, e2);
        }
    }

    public void a(bfi bfi) {
        dsa dsa = this.a;
        bfi[] bfiArr = {bfi};
        if (dsa.f == null) {
            dsa.a(bfiArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public void a(String str) {
        dsa dsa = this.a;
        if (dsa.i == null) {
            dsa.i = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public void b() {
        dsa dsa = this.a;
        try {
            if (dsa.h != null) {
                dsa.h.p();
            }
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public void c() {
        dsa dsa = this.a;
        try {
            if (dsa.h != null) {
                dsa.h.o();
            }
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
    }

    public bfi d() {
        return this.a.a();
    }

    public void e() {
        dsa dsa = this.a;
        try {
            if (dsa.h != null) {
                dsa.h.j();
            }
        } catch (RemoteException e) {
            cpn.b("#007 Could not call remote method.", e);
        }
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
            bfi bfi = null;
            try {
                bfi = d();
            } catch (NullPointerException e) {
                cpn.a("Unable to retrieve ad size.", e);
            }
            if (bfi != null) {
                Context context = getContext();
                int b = bfi.b(context);
                i3 = bfi.a(context);
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
}
