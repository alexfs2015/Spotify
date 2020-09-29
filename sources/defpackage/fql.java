package defpackage;

import com.spotify.android.flags.Overridable;
import java.io.Serializable;
import java.lang.Enum;

/* renamed from: fql reason: default package */
public final class fql<E extends Enum<E>> extends fqm<E> {
    private final gce<E> g;
    private final E h;

    public fql(Class<E> cls, E e, String str, fqt fqt, Overridable overridable) {
        super(cls, str, fqt, overridable, e.name());
        fbp.a(e);
        fbp.a(jvi.b(e.getDeclaringClass(), cls), (Object) "Type and Value must be of the same class");
        this.h = e;
        this.g = gce.b(cls);
    }

    public final /* synthetic */ boolean a(Serializable serializable) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Serializable b(String str) {
        return (Enum) this.g.b(str).a(this.h);
    }
}
