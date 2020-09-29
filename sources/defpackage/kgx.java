package defpackage;

import android.os.Parcelable;

/* renamed from: kgx reason: default package */
public abstract class kgx implements Parcelable {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public static kgx a(String str, String str2, String str3, String str4) {
        return new kgy(str, str2, str3, str4);
    }
}
