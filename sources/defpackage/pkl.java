package defpackage;

import android.os.Parcelable;

/* renamed from: pkl reason: default package */
public abstract class pkl implements Parcelable, pkm {
    public abstract int a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract boolean e();

    public static pkl a(int i, String str, String str2, String str3, boolean z) {
        pki pki = new pki(i, str, str2, str3, z);
        return pki;
    }
}
