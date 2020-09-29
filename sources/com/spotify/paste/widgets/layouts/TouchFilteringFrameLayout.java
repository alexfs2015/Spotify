package com.spotify.paste.widgets.layouts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;
import android.widget.FrameLayout;

public class TouchFilteringFrameLayout extends FrameLayout {
    private final vgf a;

    public TouchFilteringFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TouchFilteringFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new vgf();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PointerProperties[] pointerPropertiesArr;
        int[] iArr;
        int i;
        MotionEvent motionEvent2 = motionEvent;
        int pointerId = motionEvent2.getPointerId(motionEvent.getActionIndex());
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 5) {
            boolean a2 = this.a.a(pointerId);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.a.d = 0;
        }
        vgf vgf = this.a;
        if ((vgf.d ^ -1) != 0) {
            int pointerCount = motionEvent.getPointerCount();
            vgf.b(pointerCount);
            PointerProperties[] pointerPropertiesArr2 = vgf.a;
            int[] iArr2 = vgf.c;
            int actionIndex = motionEvent.getActionIndex();
            int i2 = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < pointerCount; i4++) {
                motionEvent2.getPointerProperties(i4, pointerPropertiesArr2[i3]);
                if (!vgf.a(pointerPropertiesArr2[i3].id)) {
                    if (i4 == actionIndex) {
                        i2 = i3;
                    }
                    iArr2[i3] = i4;
                    i3++;
                }
            }
            MotionEvent motionEvent3 = null;
            if (i3 != 0) {
                PointerCoords[] pointerCoordsArr = vgf.b;
                int action = motionEvent.getAction();
                int actionMasked2 = motionEvent.getActionMasked();
                int i5 = (actionMasked2 == 5 || actionMasked2 == 6) ? i2 < 0 ? 2 : i3 == 1 ? actionMasked2 == 5 ? 0 : 1 : (i2 << 8) | actionMasked2 : action;
                int historySize = motionEvent.getHistorySize();
                MotionEvent motionEvent4 = null;
                int i6 = 0;
                while (i6 <= historySize) {
                    long eventTime = i6 == historySize ? motionEvent.getEventTime() : motionEvent2.getHistoricalEventTime(i6);
                    for (int i7 = 0; i7 < i3; i7++) {
                        if (i6 == historySize) {
                            motionEvent2.getPointerCoords(i7, pointerCoordsArr[i7]);
                        } else {
                            motionEvent2.getHistoricalPointerCoords(iArr2[i7], i6, pointerCoordsArr[i7]);
                        }
                    }
                    if (i6 == 0) {
                        i = i3;
                        iArr = iArr2;
                        pointerPropertiesArr = pointerPropertiesArr2;
                        motionEvent4 = MotionEvent.obtain(motionEvent.getDownTime(), eventTime, i5, i3, pointerPropertiesArr2, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
                    } else {
                        i = i3;
                        iArr = iArr2;
                        pointerPropertiesArr = pointerPropertiesArr2;
                        motionEvent4.addBatch(eventTime, pointerCoordsArr, 0);
                    }
                    i6++;
                    i3 = i;
                    iArr2 = iArr;
                    pointerPropertiesArr2 = pointerPropertiesArr;
                }
                motionEvent3 = motionEvent4;
            }
            if (motionEvent3 != null) {
                return super.dispatchTouchEvent(motionEvent3);
            }
            return true;
        }
        throw new IllegalArgumentException("must keep at least one pointer id");
    }
}
