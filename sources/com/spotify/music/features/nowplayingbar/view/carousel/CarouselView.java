package com.spotify.music.features.nowplayingbar.view.carousel;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;

public class CarouselView extends RecyclerView {
    public oev L;
    public b M;
    public a N;

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
        this.L = new oev();
        this.L.a(this);
        this.L.e = (defpackage.oev.a) fbp.a(new defpackage.oev.a() {
            public final void a() {
                if (CarouselView.this.M != null) {
                    CarouselView.this.M.onSwipeForward();
                }
            }

            public final void b() {
                if (CarouselView.this.N != null) {
                    CarouselView.this.N.onSwipeBackward();
                }
            }
        });
    }

    public final void d(int i) {
        super.d(i);
        this.L.b = i;
    }

    public final void f(int i) {
        super.f(i);
        this.L.b = i;
    }
}