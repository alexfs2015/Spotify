package defpackage;

import defpackage.wot;
import io.netty.channel.ChannelException;

/* renamed from: wqi reason: default package */
public final class wqi<T extends wot> implements wow<T> {
    private final Class<? extends T> a;

    public wqi(Class<? extends T> cls) {
        if (cls != null) {
            this.a = cls;
            return;
        }
        throw new NullPointerException("clazz");
    }

    public final T a() {
        try {
            return (wot) this.a.newInstance();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Unable to create Channel from class ");
            sb.append(this.a);
            throw new ChannelException(sb.toString(), th);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wxt.a(this.a));
        sb.append(".class");
        return sb.toString();
    }
}
