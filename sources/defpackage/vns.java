package defpackage;

import android.os.Parcelable;

/* renamed from: vns reason: default package */
public abstract class vns implements Parcelable {

    /* renamed from: vns$a */
    public interface a {
        a a(String str);

        a a(vns vns);

        a a(boolean z);

        vns a();
    }

    public abstract String a();

    public abstract boolean b();

    public abstract vns c();

    public abstract a d();

    public static a e() {
        return new a().a(false).a((vns) null);
    }
}
