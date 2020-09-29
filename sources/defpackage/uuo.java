package defpackage;

import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;

/* renamed from: uuo reason: default package */
public final class uuo {
    public PointerProperties[] a;
    public PointerCoords[] b;
    public int[] c;
    public int d;

    public final boolean a(int i) {
        return ((1 << i) & this.d) != 0;
    }

    public void b(int i) {
        PointerProperties[] pointerPropertiesArr = this.a;
        int i2 = 0;
        if (pointerPropertiesArr == null || pointerPropertiesArr.length < i) {
            this.a = new PointerProperties[i];
            int i3 = 0;
            while (true) {
                PointerProperties[] pointerPropertiesArr2 = this.a;
                if (i3 >= pointerPropertiesArr2.length) {
                    break;
                }
                if (pointerPropertiesArr2[i3] == null) {
                    pointerPropertiesArr2[i3] = new PointerProperties();
                }
                i3++;
            }
        }
        PointerCoords[] pointerCoordsArr = this.b;
        if (pointerCoordsArr == null || pointerCoordsArr.length < i) {
            this.b = new PointerCoords[i];
            while (true) {
                PointerCoords[] pointerCoordsArr2 = this.b;
                if (i2 >= pointerCoordsArr2.length) {
                    break;
                }
                if (pointerCoordsArr2[i2] == null) {
                    pointerCoordsArr2[i2] = new PointerCoords();
                }
                i2++;
            }
        }
        int[] iArr = this.c;
        if (iArr == null || iArr.length < i) {
            this.c = new int[i];
        }
    }
}
