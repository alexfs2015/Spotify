package defpackage;

import android.view.View.OnClickListener;

/* renamed from: uzy reason: default package */
public abstract class uzy {
    private static int a = 2131100386;
    private static int b = 2131100141;

    /* renamed from: uzy$a */
    public static abstract class a {
        /* access modifiers changed from: 0000 */
        public abstract a a(int i);

        public abstract a a(OnClickListener onClickListener);

        public abstract a a(String str);

        public abstract uzy a();

        public abstract a b(int i);

        public abstract a c(int i);
    }

    public static a a(String str, int i) {
        a aVar = new a();
        if (str != null) {
            aVar.a = str;
            return aVar.a(i).b(a).c(b);
        }
        throw new NullPointerException("Null infoText");
    }

    public abstract String a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract String e();

    public abstract OnClickListener f();
}
