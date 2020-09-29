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
    c M;
    final Set<b> N;
    a O;
    /* access modifiers changed from: private */
    public View P;
    private final PublishProcessor<View> Q;
    private final b R;
    private final Runnable S;
    private GestureDetector T;
    private Handler U;
    private Disposable V;
    private boolean W;

    public interface a {
        void a(boolean z);
    }

    public interface b {
        void onCenterChildChanged(tfk tfk, boolean z, boolean z2);
    }

    public interface c {
        void onChildSelected(View view);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.Q.b_(this.P);
    }

    public final void c(boolean z) {
        this.W = z;
        a aVar = this.O;
        if (aVar != null) {
            aVar.a(this.W);
        }
    }

    public PivotListRecyclerView(Context context) {
        this(context, null);
    }

    public PivotListRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PivotListRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.N = new LinkedHashSet(20);
        this.Q = PublishProcessor.k();
        this.R = new b() {
            public final void a() {
                PivotListRecyclerView.a(PivotListRecyclerView.this);
            }

            public final void a(View view) {
                PivotListRecyclerView pivotListRecyclerView = PivotListRecyclerView.this;
                pivotListRecyclerView.a((tfk) pivotListRecyclerView.b(view));
            }
        };
        this.S = new Runnable() {
            public final void run() {
                PivotListRecyclerView.this.o();
            }
        };
        a((i) new PivotListLayoutManager(this.R));
        tfl tfl = new tfl();
        this.V = this.Q.a((wrf<? extends T>) Flowable.a((FlowableOnSubscribe<T>) tfl, BackpressureStrategy.LATEST)).a(Functions.a()).a((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                PivotListRecyclerView.this.k((View) obj);
            }
        }, (Consumer<? super Throwable>) $$Lambda$PivotListRecyclerView$qGu9O0ynjhe4_ErbVkB3FVgmktU.INSTANCE);
        tfl.a((RecyclerView) this);
        this.T = new GestureDetector(getContext(), new SimpleOnGestureListener() {
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                int a2 = PivotListRecyclerView.a(PivotListRecyclerView.this, motionEvent);
                if (!(a2 == -1 || a2 == PivotListRecyclerView.e(PivotListRecyclerView.this.P))) {
                    PivotListRecyclerView.this.f(a2);
                }
                return false;
            }
        });
        this.U = new Handler();
        a((f) null);
    }

    /* access modifiers changed from: private */
    public void k(View view) {
        c cVar = this.M;
        if (cVar != null) {
            cVar.onChildSelected(view);
        }
    }

    public final boolean a(int i, int i2) {
        return super.a(i, (int) (((float) i2) * 0.01f));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V.bf_();
        this.U.removeCallbacks(this.S);
    }

    /* access modifiers changed from: private */
    public void a(tfk tfk) {
        View view = this.P;
        a(tfk, view == null || g(view) == g(tfk.o), true ^ this.W);
        k(tfk.o);
        this.P = tfk.o;
    }

    private void a(tfk tfk, boolean z, boolean z2) {
        for (b onCenterChildChanged : this.N) {
            onCenterChildChanged.onCenterChildChanged(tfk, z, z2);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.T.onTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.T.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public final void a(b bVar) {
        this.N.add(fay.a(bVar));
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

    static /* synthetic */ void a(PivotListRecyclerView pivotListRecyclerView) {
        if (pivotListRecyclerView.d() != null) {
            View view = ((PivotListLayoutManager) pivotListRecyclerView.d()).a;
            if (view != null && view != pivotListRecyclerView.P) {
                pivotListRecyclerView.a((tfk) pivotListRecyclerView.b(view));
                if (pivotListRecyclerView.d() != null) {
                    pivotListRecyclerView.k(((PivotListLayoutManager) pivotListRecyclerView.d()).a);
                }
            }
        }
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
}
