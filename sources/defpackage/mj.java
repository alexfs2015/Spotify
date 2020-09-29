package defpackage;

import android.os.Bundle;

/* renamed from: mj reason: default package */
public final class mj {
    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        String str = "android.media.browse.extra.PAGE_SIZE";
        String str2 = "android.media.browse.extra.PAGE";
        return bundle == null ? bundle2.getInt(str2, -1) == -1 && bundle2.getInt(str, -1) == -1 : bundle2 == null ? bundle.getInt(str2, -1) == -1 && bundle.getInt(str, -1) == -1 : bundle.getInt(str2, -1) == bundle2.getInt(str2, -1) && bundle.getInt(str, -1) == bundle2.getInt(str, -1);
    }

    public static boolean b(Bundle bundle, Bundle bundle2) {
        int i;
        int i2;
        int i3;
        String str = "android.media.browse.extra.PAGE";
        int i4 = bundle == null ? -1 : bundle.getInt(str, -1);
        int i5 = bundle2 == null ? -1 : bundle2.getInt(str, -1);
        String str2 = "android.media.browse.extra.PAGE_SIZE";
        int i6 = bundle == null ? -1 : bundle.getInt(str2, -1);
        int i7 = bundle2 == null ? -1 : bundle2.getInt(str2, -1);
        int i8 = Integer.MAX_VALUE;
        if (i4 == -1 || i6 == -1) {
            i = Integer.MAX_VALUE;
            i2 = 0;
        } else {
            i2 = i4 * i6;
            i = (i6 + i2) - 1;
        }
        if (i5 == -1 || i7 == -1) {
            i3 = 0;
        } else {
            i3 = i5 * i7;
            i8 = (i7 + i3) - 1;
        }
        return i >= i3 && i8 >= i2;
    }
}
