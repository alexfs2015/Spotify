package defpackage;

/* renamed from: wxj reason: default package */
final class wxj implements wum {
    private final wum a;
    private final a b;
    private final long c;

    public wxj(wum wum, a aVar, long j) {
        this.a = wum;
        this.b = aVar;
        this.c = j;
    }

    public final void call() {
        if (!this.b.isUnsubscribed()) {
            long a2 = this.c - this.b.a();
            if (a2 > 0) {
                try {
                    Thread.sleep(a2);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    wul.a((Throwable) e);
                }
            }
            if (!this.b.isUnsubscribed()) {
                this.a.call();
            }
        }
    }
}
