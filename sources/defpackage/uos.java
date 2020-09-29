package defpackage;

import android.view.View.OnClickListener;

/* renamed from: uos reason: default package */
public abstract class uos {
    private static int a = 2131100379;
    private static int b = 2131100134;

    /* renamed from: uos$a */
    public static abstract class a {
        /* access modifiers changed from: 0000 */
        public abstract a a(int i);

        public abstract a a(OnClickListener onClickListener);

        public abstract a a(String str);

        public abstract uos a();

        public abstract a b(int i);

        public abstract a c(int i);
    }

    public abstract String a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract String e();

    public abstract OnClickListener f();

    public static a a(String str, int i) {
        a aVar = new a();
        if (str != null) {
            aVar.a = str;
            return aVar.a(i).b(a).c(b);
        }
        throw new NullPointerException("Null infoText");
    }
}
