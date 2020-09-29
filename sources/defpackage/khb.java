package defpackage;

import android.os.Parcelable;
import java.util.List;

/* renamed from: khb reason: default package */
public abstract class khb implements Parcelable {
    public abstract List<kgx> a();

    public abstract String b();

    public abstract String c();

    public abstract khc d();

    public static khb a(List<kgx> list, String str, String str2, khc khc) {
        return new kgz(list, str2, str, khc);
    }
}
