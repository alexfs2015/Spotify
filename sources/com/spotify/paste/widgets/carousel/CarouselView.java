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
    public boolean M;
    private final Set<a> N = new LinkedHashSet();
    private uwd O;
    private final b P = new b(0);
    private boolean Q;

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
        p();
    }

    public CarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p();
    }

    public final void a(i iVar) {
        if (iVar instanceof uwd) {
            this.O = (uwd) iVar;
            super.a(iVar);
            return;
        }
        throw new UnsupportedOperationException("You must provide a SnappingLayoutManager to CarouselRecyclerView.");
    }

    public final int o() {
        uwd uwd = this.O;
        if (uwd != null) {
            return uwd.h();
        }
        throw new IllegalStateException("Cannot get the current position without a LayoutManager.");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.M && super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.M) {
            return true;
        }
        uwd uwd = (uwd) d();
        if (motionEvent.getAction() == 0) {
            this.Q = false;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.y == 0) {
            i(uwd.g());
        }
        return onTouchEvent;
    }

    public final void a(a aVar) {
        this.N.add(aVar);
    }

    public final void i(int i) {
        f(i);
        j(i);
    }

    public final void e_(boolean z) {
        this.M = z;
    }

    public final void e(int i, int i2) {
        int i3;
        if ((i == 0 || i2 != 0) && i == 0 && i2 != 0) {
            this.P.b += i2;
        } else {
            this.P.b += i;
        }
        float abs = Math.abs(((float) this.P.b) / ((float) this.P.a));
        if (this.P.b > 0) {
            i3 = this.P.d + 1;
        } else if (this.P.b < 0) {
            i3 = this.P.d - 1;
        } else {
            i3 = this.P.d;
        }
        for (a a2 : this.N) {
            a2.a(this.P.d, i3, abs);
        }
    }

    private void j(int i) {
        for (a a2 : this.N) {
            a2.a(i);
        }
    }

    private void p() {
        this.q = true;
        b(1);
    }

    public final boolean a(int i, int i2) {
        uwd uwd = (uwd) d();
        int a2 = uwd.a(i);
        boolean b2 = uwd.b(a2);
        f(a2);
        if (this.P.b != 0) {
            j(a2);
        }
        return b2;
    }

    public final void h(int i) {
        uwd uwd = (uwd) d();
        if (this.P.c == 0 && i != this.P.c) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                this.P.a = uwd.i(childAt);
            } else {
                this.P.a = getMeasuredWidth();
            }
            this.P.d = uwd.h();
            this.P.b = 0;
        }
        this.P.c = i;
        if (i == 0) {
            int h = uwd.h();
            for (a b2 : this.N) {
                b2.b(h);
            }
        }
    }
}
