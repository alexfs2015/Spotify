package defpackage;

import android.os.Parcelable;

/* renamed from: ptd reason: default package */
public abstract class ptd implements Parcelable, pte {
    public static ptd a(int i, String str, String str2, String str3, boolean z) {
        pta pta = new pta(i, str, str2, str3, z);
        return pta;
    }

    public abstract int a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract boolean e();
}
