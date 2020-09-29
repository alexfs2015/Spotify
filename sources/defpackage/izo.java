package defpackage;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: izo reason: default package */
public abstract class izo implements Parcelable {
    private jva a;

    /* renamed from: izo$a */
    public static abstract class a {
        public abstract a a(String str);

        public abstract a a(List<izc> list);

        public abstract izo a();

        public abstract a b(String str);
    }

    /* renamed from: izo$b */
    static final class b extends vbb<izc> {
        protected b() {
            super(izc.CREATOR);
        }
    }

    public static izo a(String str, String str2, List<izc> list) {
        a b2 = new a().a((String) fbp.a(str)).b(str2);
        if (list == null) {
            list = new ArrayList<>();
        }
        return b2.a(list).a();
    }

    public abstract String a();

    public abstract String b();

    public abstract List<izc> c();

    public int describeContents() {
        return 0;
    }

    public final jva e() {
        if (this.a == null) {
            this.a = jva.a(a());
        }
        return this.a;
    }

    public final izp f() {
        return new izp(this);
    }
}
