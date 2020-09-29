package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: wvr reason: default package */
public final class wvr implements a<Long> {
    private long a;
    private TimeUnit b;
    private wug c;

    public final /* synthetic */ void call(Object obj) {
        final wuj wuj = (wuj) obj;
        a c2 = this.c.c();
        wuj.add(c2);
        c2.a(new wum() {
            public final void call() {
                try {
                    wuj.onNext(Long.valueOf(0));
                    wuj.onCompleted();
                } catch (Throwable th) {
                    wul.a(th, (wue<?>) wuj);
                }
            }
        }, this.a, this.b);
    }

    public wvr(long j, TimeUnit timeUnit, wug wug) {
        this.a = j;
        this.b = timeUnit;
        this.c = wug;
    }
}
