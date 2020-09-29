package defpackage;

import defpackage.dbo;
import defpackage.dbp;

/* renamed from: dbp reason: default package */
public abstract class dbp<MessageType extends dbo<MessageType, BuilderType>, BuilderType extends dbp<MessageType, BuilderType>> implements dea {
    /* access modifiers changed from: protected */
    public abstract BuilderType a(MessageType messagetype);

    public final /* synthetic */ dea a(ddz ddz) {
        if (m().getClass().isInstance(ddz)) {
            return a((MessageType) (dbo) ddz);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: c */
    public abstract BuilderType clone();
}
