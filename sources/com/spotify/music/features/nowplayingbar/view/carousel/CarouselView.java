package com.spotify.music.features.nowplayingbar.view.carousel;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;

public class CarouselView extends RecyclerView {
    public nyj M;
    public b N;
    public a O;

    public interface a {
        void onSwipeBackward();
    }

    public interface b {
        void onSwipeForward();
    }

    public CarouselView(Context context) {
        this(context, null);
    }

    public CarouselView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = true;
        a((i) new LinearLayoutManager(0, false));
        this.M = new nyj();
        this.M.a(this);
        this.M.e = (defpackage.nyj.a) fay.a(new defpackage.nyj.a() {
            public final void a() {
                if (CarouselView.this.N != null) {
                    CarouselView.this.N.onSwipeForward();
                }
            }

            public final void b() {
                if (CarouselView.this.O != null) {
                    CarouselView.this.O.onSwipeBackward();
                }
            }
        });
    }

    public final void d(int i) {
        super.d(i);
        this.M.b = i;
    }

    public final void f(int i) {
        super.f(i);
        this.M.b = i;
    }
}
