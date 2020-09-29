package defpackage;

import java.nio.channels.spi.SelectorProvider;
import java.util.concurrent.Executor;

/* renamed from: wqt reason: default package */
public final class wqt extends wqf {
    public wqt() {
        this(0);
    }

    private wqt(int i) {
        this(0, null);
    }

    private wqt(int i, Executor executor) {
        this(i, null, SelectorProvider.provider());
    }

    private wqt(int i, Executor executor, SelectorProvider selectorProvider) {
        this(i, executor, selectorProvider, wpz.a);
    }

    private wqt(int i, Executor executor, SelectorProvider selectorProvider, wqk wqk) {
        super(i, executor, selectorProvider, wqk, wwx.a());
    }

    /* renamed from: a */
    public final wqa b(Executor executor, Object... objArr) {
        wqs wqs = new wqs(this, executor, (SelectorProvider) objArr[0], objArr[1].a(), (www) objArr[2]);
        return wqs;
    }
}
