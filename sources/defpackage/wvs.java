package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: wvs reason: default package */
public final class wvs implements a<Long> {
    private long a;
    private long b;
    private TimeUnit c;
    private wug d;

    public final /* synthetic */ void call(Object obj) {
        final wuj wuj = (wuj) obj;
        final a c2 = this.d.c();
        wuj.add(c2);
        c2.a(new wum() {
            private long a;

            public final void call() {
                try {
                    wuj wuj = wuj;
                    long j = this.a;
                    this.a = 1 + j;
                    wuj.onNext(Long.valueOf(j));
                } catch (Throwable th) {
                    wul.a(th, (wue<?>) wuj);
                    throw th;
                }
            }
        }, this.a, this.b, this.c);
    }

    public wvs(long j, long j2, TimeUnit timeUnit, wug wug) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
        this.d = wug;
    }
}
