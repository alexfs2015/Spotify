package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wvy reason: default package */
public final class wvy implements wwd {
    public static final wvy a = new wvy();

    /* renamed from: wvy$a */
    static final class a implements defpackage.wwd.a {
        private final AtomicInteger a = new AtomicInteger();
        private final wwc[] b;

        a(wwc[] wwcArr) {
            this.b = wwcArr;
        }

        public final wwc a() {
            return this.b[Math.abs(this.a.getAndIncrement() % this.b.length)];
        }
    }

    /* renamed from: wvy$b */
    static final class b implements defpackage.wwd.a {
        private final AtomicInteger a = new AtomicInteger();
        private final wwc[] b;

        b(wwc[] wwcArr) {
            this.b = wwcArr;
        }

        public final wwc a() {
            return this.b[this.a.getAndIncrement() & (this.b.length - 1)];
        }
    }

    private wvy() {
    }

    public final defpackage.wwd.a a(wwc[] wwcArr) {
        int length = wwcArr.length;
        return ((-length) & length) == length ? new b(wwcArr) : new a(wwcArr);
    }
}
