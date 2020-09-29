package defpackage;

import android.os.Parcelable;

/* renamed from: lqb reason: default package */
public abstract class lqb implements Parcelable {
    public static lqb a(String str, String str2, String str3, String str4) {
        return new lqa(str, str2, str3, str4);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();
}
