package defpackage;

import android.os.Parcelable;

/* renamed from: iao reason: default package */
public abstract class iao implements Parcelable {
    public abstract String a();

    public abstract String b();

    public static iao a(String str, String str2) {
        return new iai(str, str2);
    }
}
