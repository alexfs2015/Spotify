package defpackage;

import defpackage.eme;
import defpackage.emf;

/* renamed from: emf reason: default package */
public abstract class emf<MessageType extends eme<MessageType, BuilderType>, BuilderType extends emf<MessageType, BuilderType>> implements eop {
    /* renamed from: a */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);

    public final /* synthetic */ eop a(eoo eoo) {
        if (k().getClass().isInstance(eoo)) {
            return a((MessageType) (eme) eoo);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
