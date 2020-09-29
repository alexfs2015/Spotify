package defpackage;

import android.os.Bundle;

/* renamed from: me reason: default package */
public final class me {
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
        int i4;
        int i5;
        int i6;
        String str = "android.media.browse.extra.PAGE";
        int i7 = bundle == null ? -1 : bundle.getInt(str, -1);
        if (bundle2 == null) {
            i = -1;
        } else {
            i = bundle2.getInt(str, -1);
        }
        String str2 = "android.media.browse.extra.PAGE_SIZE";
        if (bundle == null) {
            i2 = -1;
        } else {
            i2 = bundle.getInt(str2, -1);
        }
        if (bundle2 == null) {
            i3 = -1;
        } else {
            i3 = bundle2.getInt(str2, -1);
        }
        int i8 = Integer.MAX_VALUE;
        if (i7 == -1 || i2 == -1) {
            i4 = Integer.MAX_VALUE;
            i5 = 0;
        } else {
            i5 = i7 * i2;
            i4 = (i2 + i5) - 1;
        }
        if (i == -1 || i3 == -1) {
            i6 = 0;
        } else {
            i6 = i * i3;
            i8 = (i3 + i6) - 1;
        }
        return i4 >= i6 && i8 >= i5;
    }
}
