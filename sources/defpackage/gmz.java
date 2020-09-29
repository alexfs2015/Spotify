package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: gmz reason: default package */
public final class gmz implements gmy {
    private static int a = 2130903046;
    private final Context b;

    public gmz(Context context) {
        this.b = context;
    }

    public final boolean a(String str) {
        return Arrays.binarySearch(this.b.getResources().getStringArray(a), str.toLowerCase(Locale.ENGLISH)) >= 0;
    }
}
