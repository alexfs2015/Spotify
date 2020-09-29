package defpackage;

import android.os.Parcelable;

/* renamed from: uqu reason: default package */
public abstract class uqu implements Parcelable {
    public static final uqu d = new a().a(false).b(false).a(0).b(0).a();

    /* renamed from: uqu$a */
    public static abstract class a {
        public abstract a a(int i);

        public abstract a a(boolean z);

        public abstract uqu a();

        public abstract a b(int i);

        public abstract a b(boolean z);
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract int c();

    public abstract int d();

    public abstract a e();

    public final uqu a(boolean z) {
        return e().a(z).a();
    }
}
