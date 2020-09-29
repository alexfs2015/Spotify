package defpackage;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: goo reason: default package */
public final class goo implements gon {
    private static int a = 2130903046;
    private final Context b;

    public goo(Context context) {
        this.b = context;
    }

    public final boolean a(String str) {
        return Arrays.binarySearch(this.b.getResources().getStringArray(a), str.toLowerCase(Locale.ENGLISH)) >= 0;
    }
}
