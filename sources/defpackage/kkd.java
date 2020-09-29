package defpackage;

import android.os.Parcelable;

/* renamed from: kkd reason: default package */
public abstract class kkd implements Parcelable {

    /* renamed from: kkd$a */
    public static abstract class a {
        public abstract a a(String str);

        public abstract kkd a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(String str);
    }

    public static kkd a(String str, String str2, String str3, String str4) {
        return new a().a(str).b(str2).c(str3).d(str4).a();
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();
}
