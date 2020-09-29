package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: vgy reason: default package */
public final class vgy implements wgz {
    private final int a;
    private final int b;

    public vgy(int i, int i2) {
        boolean z = true;
        boolean z2 = i > 0;
        StringBuilder sb = new StringBuilder("targetWidth ");
        sb.append(i);
        String str = " must be greater than 0";
        sb.append(str);
        fbp.a(z2, (Object) sb.toString());
        if (i2 <= 0) {
            z = false;
        }
        StringBuilder sb2 = new StringBuilder("targetHeight ");
        sb2.append(i2);
        sb2.append(str);
        fbp.a(z, (Object) sb2.toString());
        this.a = i;
        this.b = i2;
    }

    public final Bitmap a(Bitmap bitmap) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        int i3 = this.a;
        if (i3 != 0) {
            f2 = (float) i3;
            f = (float) width;
        } else {
            f2 = (float) this.b;
            f = (float) height;
        }
        float f5 = f2 / f;
        int i4 = this.b;
        if (i4 != 0) {
            f4 = (float) i4;
            f3 = (float) height;
        } else {
            f4 = (float) this.a;
            f3 = (float) width;
        }
        float f6 = f4 / f3;
        int i5 = 0;
        if (f5 > f6) {
            int ceil = (int) Math.ceil((double) (((float) height) * (f6 / f5)));
            f6 = ((float) this.b) / ((float) ceil);
            i2 = width;
            i = ceil;
        } else if (f5 < f6) {
            int ceil2 = (int) Math.ceil((double) (((float) width) * (f5 / f6)));
            int i6 = (width - ceil2) / 2;
            i = height;
            i2 = ceil2;
            f5 = ((float) this.a) / ((float) ceil2);
            i5 = i6;
        } else {
            i2 = width;
            i = height;
            f5 = f6;
        }
        matrix.preScale(f5, f6);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i5, 0, i2, i, matrix, true);
        if (createBitmap == bitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return createBitmap;
    }

    public final String a() {
        return String.format("center_crop_top_w_%s_h_%s", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }
}
