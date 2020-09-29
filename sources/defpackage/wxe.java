package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: wxe reason: default package */
public final class wxe extends wug {

    /* renamed from: wxe$a */
    final class a extends defpackage.wug.a implements wuk {
        private xaf a = new xaf();

        a() {
        }

        public final wuk a(wum wum, long j, TimeUnit timeUnit) {
            return a(new wxj(wum, this, wxe.this.a() + timeUnit.toMillis(j)));
        }

        public final wuk a(wum wum) {
            wum.call();
            return xaj.b();
        }

        public final void unsubscribe() {
            this.a.unsubscribe();
        }

        public final boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }
    }

    static {
        new wxe();
    }

    private wxe() {
    }

    public final defpackage.wug.a c() {
        return new a();
    }
}
