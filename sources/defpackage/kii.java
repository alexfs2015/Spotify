package defpackage;

import android.os.Parcelable;
import java.util.List;

/* renamed from: kii reason: default package */
public abstract class kii implements Parcelable {

    /* renamed from: kii$a */
    public interface a {
        a a(String str);

        a a(List<kih> list);

        kii a();

        a b(String str);

        a c(String str);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract List<kih> d();

    public static a e() {
        return new a();
    }
}
