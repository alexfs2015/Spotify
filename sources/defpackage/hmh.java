package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: hmh reason: default package */
public final class hmh {
    public static fqk a(String str, Overridable overridable) {
        return new fqk(str, new jrk(str), overridable);
    }

    @Deprecated
    public static fqk a(String str, Overridable overridable, int i) {
        return new fqk(str, new jrz(str), overridable, 1) {
            public final boolean a(int i) {
                return i == 1;
            }
        };
    }

    public static <E extends Enum<E>> fql<E> a(String str, Class<E> cls, E e, Overridable overridable) {
        fql fql = new fql(cls, e, str, new jrk(str), overridable);
        return fql;
    }

    public static fqu a(String str, Overridable overridable, String str2) {
        return new fqu(str, new jrk(str), overridable, str2);
    }

    @Deprecated
    public static <E extends Enum<E>> fql<E> b(String str, Class<E> cls, E e, Overridable overridable) {
        fql fql = new fql(cls, e, str, new jrz(str), overridable);
        return fql;
    }

    public static fqu b(String str, Overridable overridable) {
        return new fqu(str, new jrk(str), overridable);
    }

    @Deprecated
    public static fqk c(String str, Overridable overridable) {
        return new fqk(str, new jrz(str), overridable);
    }

    @Deprecated
    public static fqu d(String str, Overridable overridable) {
        return new fqu(str, new jrz(str), overridable);
    }

    @Deprecated
    public static fqp e(String str, Overridable overridable) {
        return new fqp(str, new jrz(str), overridable);
    }

    public static fql<RolloutFlag> f(String str, Overridable overridable) {
        return a(str, RolloutFlag.class, RolloutFlag.CONTROL, overridable);
    }
}
