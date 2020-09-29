package defpackage;

import android.os.Parcelable;

/* renamed from: vmi reason: default package */
public abstract class vmi implements Parcelable {
    public static final vmi d = new a().a(false).a((vmj) new defpackage.vmj.a()).b(false).a();

    /* renamed from: vmi$a */
    public interface a {
        a a(vmj vmj);

        a a(boolean z);

        vmi a();

        a b(boolean z);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String a(defpackage.vmj.a aVar) {
        return "";
    }

    public abstract vmj a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract a d();

    public final String f() {
        return (String) a().a((gct<defpackage.vmj.a, R_>) $$Lambda$vmi$iQtpo4CkRoi5grUgA91l3wKkmYs.INSTANCE, (gct<b, R_>) $$Lambda$jqMR6_iQoMhyAwlWgnSMTRL8yg4.INSTANCE);
    }

    public final vmi a(vmj vmj) {
        return d().a(vmj).a();
    }

    public final vmi a(boolean z) {
        return d().a(z).a();
    }
}
