package defpackage;

import android.os.Parcelable;
import java.util.List;

/* renamed from: kgh reason: default package */
public abstract class kgh implements Parcelable {

    /* renamed from: kgh$a */
    public interface a {
        a a(String str);

        a a(List<kgl> list);

        kgh a();
    }

    public abstract String a();

    public abstract List<kgl> b();

    public static kgh a(String str, List<kgl> list) {
        return new a().a(str).a(list).a();
    }
}
