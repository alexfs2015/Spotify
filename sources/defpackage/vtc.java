package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import defpackage.vtd;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: vtc reason: default package */
public final class vtc<E extends vtd> extends ProtoAdapter<E> {
    private final Class<E> k;
    private Method l;

    public final /* synthetic */ int a(Object obj) {
        return vtb.a(((vtd) obj).getValue());
    }

    public final /* synthetic */ void a(vtb vtb, Object obj) {
        vtb.c(((vtd) obj).getValue());
    }

    public vtc(Class<E> cls) {
        super(FieldEncoding.VARINT, cls);
        this.k = cls;
    }

    private Method b() {
        Method method = this.l;
        if (method != null) {
            return method;
        }
        try {
            Method method2 = this.k.getMethod("fromValue", new Class[]{Integer.TYPE});
            this.l = method2;
            return method2;
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public E a(vta vta) {
        int c = vta.c();
        try {
            E e = (vtd) b().invoke(null, new Object[]{Integer.valueOf(c)});
            if (e != null) {
                return e;
            }
            throw new EnumConstantNotFoundException(c, this.k);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vtc) && ((vtc) obj).k == this.k;
    }

    public final int hashCode() {
        return this.k.hashCode();
    }
}
