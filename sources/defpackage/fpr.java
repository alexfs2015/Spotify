package defpackage;

import com.spotify.android.flags.Overridable;
import java.io.Serializable;
import java.lang.Enum;

/* renamed from: fpr reason: default package */
public final class fpr<E extends Enum<E>> extends fps<E> {
    private final gbg<E> g;
    private final E h;

    public fpr(Class<E> cls, E e, String str, fpz fpz, Overridable overridable) {
        super(cls, str, fpz, overridable, e.name());
        fay.a(e);
        fay.a(jtc.b(e.getDeclaringClass(), cls), (Object) "Type and Value must be of the same class");
        this.h = e;
        this.g = gbg.b(cls);
    }

    public final /* synthetic */ boolean a(Serializable serializable) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Serializable b(String str) {
        return (Enum) this.g.b(str).a(this.h);
    }
}
