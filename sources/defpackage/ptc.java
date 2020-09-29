package defpackage;

import android.os.Parcelable;

/* renamed from: ptc reason: default package */
public abstract class ptc implements Parcelable, pte {
    public static ptc a(int i, String str, String str2) {
        return new psz(i, str, str2);
    }

    public abstract int a();

    public abstract String b();

    public abstract String c();
}
