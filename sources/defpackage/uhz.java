package defpackage;

import android.os.Build.VERSION;

/* renamed from: uhz reason: default package */
public final class uhz implements vua<Boolean> {
    private static final uhz a = new uhz();

    public static uhz a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(VERSION.SDK_INT >= 23);
    }
}
