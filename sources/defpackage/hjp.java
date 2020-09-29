package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: hjp reason: default package */
public final class hjp {
    public static fpq a(String str, Overridable overridable) {
        return new fpq(str, new joy(str), overridable);
    }

    public static fqa b(String str, Overridable overridable) {
        return new fqa(str, new joy(str), overridable);
    }

    public static fqa a(String str, Overridable overridable, String str2) {
        return new fqa(str, new joy(str), overridable, str2);
    }

    public static <E extends Enum<E>> fpr<E> a(String str, Class<E> cls, E e, Overridable overridable) {
        fpr fpr = new fpr(cls, e, str, new joy(str), overridable);
        return fpr;
    }

    @Deprecated
    public static fpq c(String str, Overridable overridable) {
        return new fpq(str, new jpn(str), overridable);
    }

    @Deprecated
    public static fpq a(String str, Overridable overridable, int i) {
        return new fpq(str, new jpn(str), overridable, 1) {
            public final boolean a(int i) {
                return i == 1;
            }
        };
    }

    @Deprecated
    public static fqa d(String str, Overridable overridable) {
        return new fqa(str, new jpn(str), overridable);
    }

    @Deprecated
    public static <E extends Enum<E>> fpr<E> b(String str, Class<E> cls, E e, Overridable overridable) {
        fpr fpr = new fpr(cls, e, str, new jpn(str), overridable);
        return fpr;
    }

    @Deprecated
    public static fpv e(String str, Overridable overridable) {
        return new fpv(str, new jpn(str), overridable);
    }

    public static fpr<RolloutFlag> f(String str, Overridable overridable) {
        return a(str, RolloutFlag.class, RolloutFlag.CONTROL, overridable);
    }
}
