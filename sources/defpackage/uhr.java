package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import com.comscore.streaming.ContentType;
import com.spotify.mobile.android.tagreader.SPTTagReader;

/* renamed from: uhr reason: default package */
public final class uhr {
    public static String[] a(byte[] bArr, int i, int i2, int i3) {
        return SPTTagReader.decodeWaveformTag(bArr, 0, i2, i3, i2);
    }

    public static int a(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= 1024 && i4 <= 1024) {
            return 1;
        }
        int round = Math.round(((float) i3) / 1024.0f);
        int round2 = Math.round(((float) i4) / 1024.0f);
        if (round >= round2) {
            round = round2;
        }
        while (((float) (i4 * i3)) / ((float) (round * round)) > 2097152.0f) {
            round++;
        }
        return round;
    }

    public static byte[] a(int i, int i2, Bitmap bitmap) {
        int i3 = i;
        int i4 = i2;
        int i5 = i3 * i4;
        int[] iArr = new int[i5];
        bitmap.getPixels(iArr, 0, i, 0, 0, i, i2);
        byte[] bArr = new byte[(i5 * 3)];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i4) {
            int i9 = i7;
            int i10 = 0;
            while (i10 < i3) {
                int red = Color.red(iArr[i8]);
                int green = Color.green(iArr[i8]);
                int blue = Color.blue(iArr[i8]);
                int i11 = (((((red * 66) + (green * 129)) + (blue * 25)) + 128) >> 8) + 16;
                int i12 = (((((red * -38) - (green * 74)) + (blue * ContentType.LONG_FORM_ON_DEMAND)) + 128) >> 8) + 128;
                int i13 = (((((red * ContentType.LONG_FORM_ON_DEMAND) - (green * 94)) - (blue * 18)) + 128) >> 8) + 128;
                int i14 = i9 + 1;
                if (i11 < 0) {
                    i11 = 0;
                } else if (i11 > 255) {
                    i11 = 255;
                }
                bArr[i9] = (byte) i11;
                if (i6 % 2 == 0 && i8 % 2 == 0) {
                    int i15 = i5 + 1;
                    if (i13 < 0) {
                        i13 = 0;
                    } else if (i13 > 255) {
                        i13 = 255;
                    }
                    bArr[i5] = (byte) i13;
                    i5 = i15 + 1;
                    if (i12 < 0) {
                        i12 = 0;
                    } else if (i12 > 255) {
                        i12 = 255;
                    }
                    bArr[i15] = (byte) i12;
                }
                i8++;
                i10++;
                i9 = i14;
            }
            i6++;
            i7 = i9;
        }
        bitmap.recycle();
        return bArr;
    }
}
