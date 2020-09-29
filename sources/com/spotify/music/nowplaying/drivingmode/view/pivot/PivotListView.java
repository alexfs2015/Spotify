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

public class PivotListView extends PivotListRecyclerView implements tfj {
    a P;
    private tfe Q;
    private final b R;
    private Runnable S;
    private boolean T;
    private final Handler U;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(tfk tfk, boolean z, boolean z2) {
        if (!z) {
            performHapticFeedback(1);
        }
    }

    public PivotListView(Context context) {
        this(context, null);
    }

    public PivotListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PivotListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.R = new b() {
            public final void onCenterChildChanged(tfk tfk, boolean z, boolean z2) {
                PivotListView.this.a(tfk, z, z2);
            }
        };
        this.T = true;
        this.U = new Handler();
        this.Q = new tfe(LayoutInflater.from(getContext()));
        a((a) this.Q);
        tfh tfh = new tfh();
        a((b) tfh);
        this.O = tfh;
        this.M = (c) fay.a(new c() {
            public final void onChildSelected(View view) {
                PivotListView.this.k(view);
            }
        });
        this.q = true;
        setHapticFeedbackEnabled(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        this.U.removeCallbacks(this.S);
        this.S = new Runnable(view) {
            private final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                PivotListView.this.l(this.f$1);
            }
        };
        this.U.postDelayed(this.S, 500);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        if (this.P != null) {
            this.P.a((tfg) this.Q.a.get(e(view)), this.T);
            this.T = true;
            playSoundEffect(0);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void f(int i) {
        this.T = false;
        super.f(i);
    }

    public void setHapticFeedbackEnabled(boolean z) {
        super.setHapticFeedbackEnabled(z);
        if (z) {
            a(this.R);
            return;
        }
        this.N.remove(fay.a(this.R));
    }

    public final void a(List<tfg> list, int i) {
        if (this.Q.a.equals(list)) {
            j(i);
            return;
        }
        i(i);
        this.Q.a(list);
    }

    public final void a(a aVar) {
        this.P = aVar;
    }

    public final void f_(boolean z) {
        c(z);
    }
}
