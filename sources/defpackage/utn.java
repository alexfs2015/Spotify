package defpackage;

import android.os.Build.VERSION;

/* renamed from: utn reason: default package */
public final class utn implements wig<Boolean> {
    private static final utn a = new utn();

    public static utn a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(VERSION.SDK_INT >= 23);
    }
}
