package com.spotify.music.nowplaying.drivingmode.view.pivot;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.f;
import androidx.recyclerview.widget.RecyclerView.i;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.processors.PublishProcessor;
import java.util.LinkedHashSet;
import java.util.Set;

public class PivotListRecyclerView extends RecyclerView {
    c L;
    final Set<b> M;
    a N;
    /* access modifiers changed from: private */
    public View O;
    private final PublishProcessor<View> P;
    private final b Q;
    private final Runnable R;
    private GestureDetector S;
    private Handler T;
    private Disposable U;
    private boolean V;

    public interface a {
        void a(boolean z);
    }

    public interface b {
        void onCenterChildChanged(tpu tpu, boolean z, boolean z2);
    }

    public interface c {
        void onChildSelected(View view);
    }

    public PivotListRecyclerView(Context context) {
        this(context, null);
    }

    public PivotListRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PivotListRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.M = new LinkedHashSet(20);
        this.P = PublishProcessor.k();
        this.Q = new b() {
            public final void a() {
                PivotListRecyclerView.a(PivotListRecyclerView.this);
            }

            public final void a(View view) {
                PivotListRecyclerView pivotListRecyclerView = PivotListRecyclerView.this;
                pivotListRecyclerView.a((tpu) pivotListRecyclerView.b(view));
            }
        };
        this.R = new Runnable() {
            public final void run() {
                PivotListRecyclerView.this.n();
            }
        };
        a((i) new PivotListLayoutManager(this.Q));
        tpv tpv = new tpv();
        this.U = this.P.a((xfk<? extends T>) Flowable.a((FlowableOnSubscribe<T>) tpv, BackpressureStrategy.LATEST)).a(Functions.a()).a((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                PivotListRecyclerView.this.k((View) obj);
            }
        }, (Consumer<? super Throwable>) $$Lambda$PivotListRecyclerView$qGu9O0ynjhe4_ErbVkB3FVgmktU.INSTANCE);
        tpv.a((RecyclerView) this);
        this.S = new GestureDetector(getContext(), new SimpleOnGestureListener() {
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                int a2 = PivotListRecyclerView.a(PivotListRecyclerView.this, motionEvent);
                if (!(a2 == -1 || a2 == PivotListRecyclerView.e(PivotListRecyclerView.this.O))) {
                    PivotListRecyclerView.this.f(a2);
                }
                return false;
            }
        });
        this.T = new Handler();
        a((f) null);
    }

    static /* synthetic */ int a(PivotListRecyclerView pivotListRecyclerView, MotionEvent motionEvent) {
        for (int i = 0; i < pivotListRecyclerView.getChildCount(); i++) {
            View childAt = pivotListRecyclerView.getChildAt(i);
            if (motionEvent.getY() >= ((float) childAt.getTop()) && motionEvent.getY() < ((float) childAt.getBottom())) {
                return e(childAt);
            }
        }
        return -1;
    }

    static /* synthetic */ void a(PivotListRecyclerView pivotListRecyclerView) {
        if (pivotListRecyclerView.d() != null) {
            View view = ((PivotListLayoutManager) pivotListRecyclerView.d()).a;
            if (view != null && view != pivotListRecyclerView.O) {
                pivotListRecyclerView.a((tpu) pivotListRecyclerView.b(view));
                if (pivotListRecyclerView.d() != null) {
                    pivotListRecyclerView.k(((PivotListLayoutManager) pivotListRecyclerView.d()).a);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(tpu tpu) {
        View view = this.O;
        a(tpu, view == null || g(view) == g(tpu.o), true ^ this.V);
        k(tpu.o);
        this.O = tpu.o;
    }

    private void a(tpu tpu, boolean z, boolean z2) {
        for (b onCenterChildChanged : this.M) {
            onCenterChildChanged.onCenterChildChanged(tpu, z, z2);
        }
    }

    /* access modifiers changed from: private */
    public void k(View view) {
        c cVar = this.L;
        if (cVar != null) {
            cVar.onChildSelected(view);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.P.b_(this.O);
    }

    public final void a(b bVar) {
        this.M.add(fbp.a(bVar));
    }

    public final boolean a(int i, int i2) {
        return super.a(i, (int) (((float) i2) * 0.01f));
    }

    public final void c(boolean z) {
        this.V = z;
        a aVar = this.N;
        if (aVar != null) {
            aVar.a(this.V);
        }
    }

    public final void i(int i) {
        if (d() != null) {
            ((PivotListLayoutManager) d()).b = i;
        }
    }

    public final void j(int i) {
        if (this.y == 0) {
            f(i);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U.bd_();
        this.T.removeCallbacks(this.R);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.S.onTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.S.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
