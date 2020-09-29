package defpackage;

import android.os.Parcelable;
import java.util.List;

/* renamed from: kky reason: default package */
public abstract class kky implements Parcelable {

    /* renamed from: kky$a */
    public interface a {
        a a(String str);

        a a(List<kkz> list);

        kky a();

        a b(String str);
    }

    public static a d() {
        return new a();
    }

    public abstract String a();

    public abstract List<kkz> b();

    public abstract String c();
}
