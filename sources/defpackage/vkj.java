package defpackage;

import android.os.Parcelable;
import java.util.Calendar;

/* renamed from: vkj reason: default package */
public abstract class vkj implements Parcelable {
    public static final vkj f;

    /* renamed from: vkj$a */
    public interface a {
        a a(int i);

        a a(vkk vkk);

        a a(boolean z);

        vkj a();

        a b(int i);

        a c(int i);
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract vkk d();

    public abstract boolean e();

    public abstract a f();

    public final vkj a(vkk vkk) {
        return f().a(vkk).a();
    }

    public final vkj a(int i, int i2, int i3, vkk vkk) {
        return f().c(i).b(i2).a(i3).a(vkk).a();
    }

    static {
        new jrf();
        Calendar instance = Calendar.getInstance();
        f = new a().a((vkk) new b()).a(instance.get(5)).b(instance.get(2)).c(instance.get(1) - 10).a(false).a();
    }
}
