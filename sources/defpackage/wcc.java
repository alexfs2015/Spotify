package defpackage;

import defpackage.wan;
import io.netty.channel.ChannelException;

/* renamed from: wcc reason: default package */
public final class wcc<T extends wan> implements waq<T> {
    private final Class<? extends T> a;

    public wcc(Class<? extends T> cls) {
        if (cls != null) {
            this.a = cls;
            return;
        }
        throw new NullPointerException("clazz");
    }

    public final T a() {
        try {
            return (wan) this.a.newInstance();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Unable to create Channel from class ");
            sb.append(this.a);
            throw new ChannelException(sb.toString(), th);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wjn.a(this.a));
        sb.append(".class");
        return sb.toString();
    }
}
