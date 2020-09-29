package defpackage;

import android.os.Parcelable;

/* renamed from: hxz reason: default package */
public abstract class hxz implements Parcelable {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public static hxz a(String str, String str2, String str3, String str4, String str5) {
        hxw hxw = new hxw(str, str2, str3, str4, str5);
        return hxw;
    }
}
