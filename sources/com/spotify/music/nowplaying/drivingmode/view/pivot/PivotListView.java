package com.spotify.music.nowplaying.drivingmode.view.pivot;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.a;
import com.spotify.music.nowplaying.drivingmode.view.pivot.PivotListRecyclerView.b;
import com.spotify.music.nowplaying.drivingmode.view.pivot.PivotListRecyclerView.c;
import java.util.List;

public class PivotListView extends PivotListRecyclerView implements tpt {
    a O;
    private tpo P;
    private final b Q;
    private Runnable R;
    private boolean S;
    private final Handler T;

    public PivotListView(Context context) {
        this(context, null);
    }

    public PivotListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PivotListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Q = new b() {
            public final void onCenterChildChanged(tpu tpu, boolean z, boolean z2) {
                PivotListView.this.a(tpu, z, z2);
            }
        };
        this.S = true;
        this.T = new Handler();
        this.P = new tpo(LayoutInflater.from(getContext()));
        a((a) this.P);
        tpr tpr = new tpr();
        a((b) tpr);
        this.N = tpr;
        this.L = (c) fbp.a(new c() {
            public final void onChildSelected(View view) {
                PivotListView.this.k(view);
            }
        });
        this.q = true;
        setHapticFeedbackEnabled(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tpq tpq) {
        a aVar = this.O;
        if (aVar != null) {
            aVar.a(tpq, this.S);
            this.S = true;
            playSoundEffect(0);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tpu tpu, boolean z, boolean z2) {
        if (!z) {
            performHapticFeedback(1);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        this.T.removeCallbacks(this.R);
        this.R = new Runnable((tpq) this.P.a.get(e(view))) {
            private final /* synthetic */ tpq f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                PivotListView.this.a(this.f$1);
            }
        };
        this.T.postDelayed(this.R, 500);
    }

    public final void a(List<tpq> list, int i) {
        if (this.P.a.equals(list)) {
            j(i);
            return;
        }
        i(i);
        this.P.a(list);
    }

    public final void a(a aVar) {
        this.O = aVar;
    }

    public final void f(int i) {
        this.S = false;
        super.f(i);
    }

    public final void f_(boolean z) {
        c(z);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setHapticFeedbackEnabled(boolean z) {
        super.setHapticFeedbackEnabled(z);
        if (z) {
            a(this.Q);
            return;
        }
        this.M.remove(fbp.a(this.Q));
    }
}
