package defpackage;

import defpackage.eln;
import defpackage.elo;

/* renamed from: elo reason: default package */
public abstract class elo<MessageType extends eln<MessageType, BuilderType>, BuilderType extends elo<MessageType, BuilderType>> implements eny {
    /* renamed from: a */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);

    public final /* synthetic */ eny a(enx enx) {
        if (k().getClass().isInstance(enx)) {
            return a((MessageType) (eln) enx);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
