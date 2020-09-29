package defpackage;

import android.os.Parcelable;

/* renamed from: ibc reason: default package */
public abstract class ibc implements Parcelable {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public static ibc a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        ibb ibb = new ibb(str, str2, str3, str4, str5, str6, str7, str8, str9);
        return ibb;
    }
}
