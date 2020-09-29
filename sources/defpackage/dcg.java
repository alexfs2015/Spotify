package defpackage;

import defpackage.dcf;
import defpackage.dcg;

/* renamed from: dcg reason: default package */
public abstract class dcg<MessageType extends dcf<MessageType, BuilderType>, BuilderType extends dcg<MessageType, BuilderType>> implements der {
    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);

    public final /* synthetic */ der a(deq deq) {
        if (m().getClass().isInstance(deq)) {
            return a((MessageType) (dcf) deq);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: c */
    public abstract BuilderType clone();
}
