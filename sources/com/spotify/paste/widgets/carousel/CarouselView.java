package com.spotify.paste.widgets.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import java.util.LinkedHashSet;
import java.util.Set;

public class CarouselView extends RecyclerView {
    public boolean L;
    private final Set<a> M = new LinkedHashSet();
    private vht N;
    private final b O = new b(0);
    private boolean P;

    public interface a {
        void a(int i);

        void a(int i, int i2, float f);

        void b(int i);
    }

    static class b {
        int a;
        int b;
        int c;
        int d;

        private b() {
            this.c = 0;
        }

        /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static class c implements a {
        public void a(int i) {
        }

        public void a(int i, int i2, float f) {
        }

        public void b(int i) {
        }
    }

    public CarouselView(Context context) {
        super(context);
        o();
    }

    public CarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o();
    }

    private void j(int i) {
        for (a a2 : this.M) {
            a2.a(i);
        }
    }

    private void o() {
        this.q = true;
        b(1);
    }

    public final void a(i iVar) {
        if (iVar instanceof vht) {
            this.N = (vht) iVar;
            super.a(iVar);
            return;
        }
        throw new UnsupportedOperationException("You must provide a SnappingLayoutManager to CarouselRecyclerView.");
    }

    public final void a(a aVar) {
        this.M.add(aVar);
    }

    public final boolean a(int i, int i2) {
        vht vht = (vht) d();
        int a2 = vht.a(i);
        boolean b2 = vht.b(a2);
        f(a2);
        if (this.O.b != 0) {
            j(a2);
        }
        return b2;
    }

    public final void e(int i, int i2) {
        if ((i == 0 || i2 != 0) && i == 0 && i2 != 0) {
            this.O.b += i2;
        } else {
            this.O.b += i;
        }
        float abs = Math.abs(((float) this.O.b) / ((float) this.O.a));
        int i3 = this.O.b > 0 ? this.O.d + 1 : this.O.b < 0 ? this.O.d - 1 : this.O.d;
        for (a a2 : this.M) {
            a2.a(this.O.d, i3, abs);
        }
    }

    public final void e_(boolean z) {
        this.L = z;
    }

    public final void h(int i) {
        vht vht = (vht) d();
        if (this.O.c == 0 && i != this.O.c) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                this.O.a = vht.i(childAt);
            } else {
                this.O.a = getMeasuredWidth();
            }
            this.O.d = vht.h();
            this.O.b = 0;
        }
        this.O.c = i;
        if (i == 0) {
            int h = vht.h();
            for (a b2 : this.M) {
                b2.b(h);
            }
        }
    }

    public final void i(int i) {
        f(i);
        j(i);
    }

    public final int n() {
        vht vht = this.N;
        if (vht != null) {
            return vht.h();
        }
        throw new IllegalStateException("Cannot get the current position without a LayoutManager.");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.L && super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.L) {
            return true;
        }
        vht vht = (vht) d();
        if (motionEvent.getAction() == 0) {
            this.P = false;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.y == 0) {
            i(vht.g());
        }
        return onTouchEvent;
    }
}
