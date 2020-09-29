package defpackage;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ixd reason: default package */
public abstract class ixd implements Parcelable {
    private jst a;

    /* renamed from: ixd$a */
    public static abstract class a {
        public abstract a a(String str);

        public abstract a a(List<iwr> list);

        public abstract ixd a();

        public abstract a b(String str);
    }

    /* renamed from: ixd$b */
    static final class b extends upw<iwr> {
        protected b() {
            super(iwr.CREATOR);
        }
    }

    public abstract String a();

    public abstract String b();

    public abstract List<iwr> c();

    public int describeContents() {
        return 0;
    }

    public final jst e() {
        if (this.a == null) {
            this.a = jst.a(a());
        }
        return this.a;
    }

    public final ixe f() {
        return new ixe(this);
    }

    public static ixd a(String str, String str2, List<iwr> list) {
        a b2 = new a().a((String) fay.a(str)).b(str2);
        if (list == null) {
            list = new ArrayList<>();
        }
        return b2.a(list).a();
    }
}
