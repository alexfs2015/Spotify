package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.PinkiePie;

public final class UnifiedNativeAdView extends FrameLayout {
    private final FrameLayout a;
    private final dvv b = a();

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = a(context);
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = a(context);
    }

    private final FrameLayout a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        PinkiePie.DianePie();
        return frameLayout;
    }

    private final dvv a() {
        bxo.a(this.a, (Object) "createDelegate must be called after overlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return dqe.b().a(this.a.getContext(), (FrameLayout) this, this.a);
    }

    public final void a(bfw bfw) {
        try {
            this.b.a((cbi) bfw.k());
        } catch (RemoteException e) {
            cpn.a("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.a);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        dvv dvv = this.b;
        if (dvv != null) {
            try {
                dvv.a(cbj.a(view), i);
            } catch (RemoteException e) {
                cpn.a("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        FrameLayout frameLayout = this.a;
    }

    public final void removeView(View view) {
        if (this.a != view) {
            super.removeView(view);
        }
    }
}
