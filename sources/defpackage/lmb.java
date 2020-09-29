package defpackage;

import android.os.Parcelable;

/* renamed from: lmb reason: default package */
public abstract class lmb implements Parcelable {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public static lmb a(String str, String str2, String str3, String str4) {
        return new lma(str, str2, str3, str4);
    }
}
