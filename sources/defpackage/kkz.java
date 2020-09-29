package defpackage;

import android.os.Parcelable;

/* renamed from: kkz reason: default package */
public abstract class kkz implements Parcelable {

    /* renamed from: kkz$a */
    public interface a {
        a a(String str);

        kkz a();

        a b(String str);
    }

    public static kkz a(String str, String str2) {
        return new a().a(str).b(str2).a();
    }

    public abstract String a();

    public abstract String b();
}
