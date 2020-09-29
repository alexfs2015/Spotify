package defpackage;

import android.os.Parcelable;

/* renamed from: vbz reason: default package */
public abstract class vbz implements Parcelable {
    public static final vbz d = new a().a(false).b(false).a(0).b(0).a();

    /* renamed from: vbz$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(boolean z);

        public abstract vbz a();

        public abstract a b(int i);

        public abstract a b(boolean z);
    }

    public final vbz a(boolean z) {
        return e().a(z).a();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract int c();

    public abstract int d();

    public abstract a e();
}
