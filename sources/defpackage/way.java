package defpackage;

import android.os.Parcelable;

/* renamed from: way reason: default package */
public abstract class way implements Parcelable {

    /* renamed from: way$a */
    public interface a {
        a a(String str);

        a a(way way);

        a a(boolean z);

        way a();
    }

    public static a e() {
        return new a().a(false).a((way) null);
    }

    public abstract String a();

    public abstract boolean b();

    public abstract way c();

    public abstract a d();
}
