package defpackage;

import android.os.Parcelable;
import java.util.Calendar;

/* renamed from: vxp reason: default package */
public abstract class vxp implements Parcelable {
    public static final vxp f;

    /* renamed from: vxp$a */
    public interface a {
        a a(int i);

        a a(vxq vxq);

        a a(boolean z);

        vxp a();

        a b(int i);

        a c(int i);
    }

    static {
        new jtp();
        Calendar instance = Calendar.getInstance();
        f = new a().a((vxq) new b()).a(instance.get(5)).b(instance.get(2)).c(instance.get(1) - 10).a(false).a();
    }

    public abstract int a();

    public final vxp a(int i, int i2, int i3, vxq vxq) {
        return f().c(i).b(i2).a(i3).a(vxq).a();
    }

    public final vxp a(vxq vxq) {
        return f().a(vxq).a();
    }

    public abstract int b();

    public abstract int c();

    public abstract vxq d();

    public abstract boolean e();

    public abstract a f();
}
