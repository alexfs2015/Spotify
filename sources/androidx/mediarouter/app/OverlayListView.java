package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public final class OverlayListView extends ListView {
    public final List<a> a = new ArrayList();

    public static class a {
        BitmapDrawable a;
        float b = 1.0f;
        Rect c;
        public Interpolator d;
        public long e;
        Rect f;
        public int g;
        public float h = 1.0f;
        public float i = 1.0f;
        public long j;
        public boolean k;
        boolean l;
        public C0003a m;

        /* renamed from: androidx.mediarouter.app.OverlayListView$a$a reason: collision with other inner class name */
        public interface C0003a {
            void a();
        }

        public a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.a = bitmapDrawable;
            this.f = rect;
            this.c = new Rect(rect);
            BitmapDrawable bitmapDrawable2 = this.a;
            if (bitmapDrawable2 != null && this.c != null) {
                bitmapDrawable2.setAlpha((int) (this.b * 255.0f));
                this.a.setBounds(this.c);
            }
        }
    }

    public OverlayListView(Context context) {
        super(context);
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a() {
        for (a aVar : this.a) {
            aVar.k = true;
            aVar.l = true;
            if (aVar.m != null) {
                aVar.m.a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        if (r1.l == false) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            super.onDraw(r10)
            java.util.List<androidx.mediarouter.app.OverlayListView$a> r0 = r9.a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00b0
            java.util.List<androidx.mediarouter.app.OverlayListView$a> r0 = r9.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0011:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00b0
            java.lang.Object r1 = r0.next()
            androidx.mediarouter.app.OverlayListView$a r1 = (androidx.mediarouter.app.OverlayListView.a) r1
            android.graphics.drawable.BitmapDrawable r2 = r1.a
            if (r2 == 0) goto L_0x0024
            r2.draw(r10)
        L_0x0024:
            long r2 = r9.getDrawingTime()
            boolean r4 = r1.l
            r5 = 1
            if (r4 != 0) goto L_0x00a8
            long r6 = r1.j
            long r2 = r2 - r6
            float r2 = (float) r2
            long r3 = r1.e
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r3, r2)
            r4 = 0
            float r2 = java.lang.Math.max(r4, r2)
            boolean r6 = r1.k
            if (r6 != 0) goto L_0x0045
            r2 = 0
        L_0x0045:
            android.view.animation.Interpolator r4 = r1.d
            if (r4 != 0) goto L_0x004b
            r4 = r2
            goto L_0x0051
        L_0x004b:
            android.view.animation.Interpolator r4 = r1.d
            float r4 = r4.getInterpolation(r2)
        L_0x0051:
            int r6 = r1.g
            float r6 = (float) r6
            float r6 = r6 * r4
            int r6 = (int) r6
            android.graphics.Rect r7 = r1.c
            android.graphics.Rect r8 = r1.f
            int r8 = r8.top
            int r8 = r8 + r6
            r7.top = r8
            android.graphics.Rect r7 = r1.c
            android.graphics.Rect r8 = r1.f
            int r8 = r8.bottom
            int r8 = r8 + r6
            r7.bottom = r8
            float r6 = r1.h
            float r7 = r1.i
            float r8 = r1.h
            float r7 = r7 - r8
            float r7 = r7 * r4
            float r6 = r6 + r7
            r1.b = r6
            android.graphics.drawable.BitmapDrawable r4 = r1.a
            if (r4 == 0) goto L_0x0090
            android.graphics.Rect r4 = r1.c
            if (r4 == 0) goto L_0x0090
            android.graphics.drawable.BitmapDrawable r4 = r1.a
            float r6 = r1.b
            r7 = 1132396544(0x437f0000, float:255.0)
            float r6 = r6 * r7
            int r6 = (int) r6
            r4.setAlpha(r6)
            android.graphics.drawable.BitmapDrawable r4 = r1.a
            android.graphics.Rect r6 = r1.c
            r4.setBounds(r6)
        L_0x0090:
            boolean r4 = r1.k
            if (r4 == 0) goto L_0x00a3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x00a3
            r1.l = r5
            androidx.mediarouter.app.OverlayListView$a$a r2 = r1.m
            if (r2 == 0) goto L_0x00a3
            androidx.mediarouter.app.OverlayListView$a$a r2 = r1.m
            r2.a()
        L_0x00a3:
            boolean r1 = r1.l
            if (r1 != 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r5 = 0
        L_0x00a9:
            if (r5 != 0) goto L_0x0011
            r0.remove()
            goto L_0x0011
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.OverlayListView.onDraw(android.graphics.Canvas):void");
    }
}
