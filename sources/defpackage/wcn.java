package defpackage;

import java.nio.channels.spi.SelectorProvider;
import java.util.concurrent.Executor;

/* renamed from: wcn reason: default package */
public final class wcn extends wbz {
    public wcn() {
        this(0);
    }

    private wcn(int i) {
        this(0, null);
    }

    private wcn(int i, Executor executor) {
        this(i, null, SelectorProvider.provider());
    }

    private wcn(int i, Executor executor, SelectorProvider selectorProvider) {
        this(i, executor, selectorProvider, wbt.a);
    }

    private wcn(int i, Executor executor, SelectorProvider selectorProvider, wce wce) {
        super(i, executor, selectorProvider, wce, wir.a());
    }

    /* renamed from: a */
    public final wbu b(Executor executor, Object... objArr) {
        wcm wcm = new wcm(this, executor, (SelectorProvider) objArr[0], objArr[1].a(), (wiq) objArr[2]);
        return wcm;
    }
}
