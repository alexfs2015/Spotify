package com.spotify.music.features.quicksilver.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class QuicksilverFrameLayoutTouchIntercepted extends FrameLayout {
    public psk[] a;

    public QuicksilverFrameLayoutTouchIntercepted(Context context) {
        super(context);
    }

    public QuicksilverFrameLayoutTouchIntercepted(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public QuicksilverFrameLayoutTouchIntercepted(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            psk[] r0 = r9.a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003f
            int r3 = r0.length
            r4 = 0
        L_0x0008:
            if (r4 >= r3) goto L_0x003f
            r5 = r0[r4]
            float r6 = r10.getY()
            float r7 = r5.b
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x003c
            float r6 = r10.getX()
            float r7 = r5.a
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x003c
            float r6 = r10.getY()
            float r7 = r5.b
            float r8 = r5.c
            float r7 = r7 + r8
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x003c
            float r6 = r10.getX()
            float r7 = r5.a
            float r5 = r5.d
            float r7 = r7 + r5
            int r5 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x003c
            r10 = 1
            goto L_0x0040
        L_0x003c:
            int r4 = r4 + 1
            goto L_0x0008
        L_0x003f:
            r10 = 0
        L_0x0040:
            if (r10 != 0) goto L_0x0043
            return r1
        L_0x0043:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.quicksilver.utils.QuicksilverFrameLayoutTouchIntercepted.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }
}
