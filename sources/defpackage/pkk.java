package defpackage;

import android.os.Parcelable;

/* renamed from: pkk reason: default package */
public abstract class pkk implements Parcelable, pkm {
    public abstract int a();

    public abstract String b();

    public abstract String c();

    public static pkk a(int i, String str, String str2) {
        return new pkh(i, str, str2);
    }
}
