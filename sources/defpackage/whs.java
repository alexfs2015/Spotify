package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: whs reason: default package */
public final class whs implements whx {
    public static final whs a = new whs();

    /* renamed from: whs$a */
    static final class a implements defpackage.whx.a {
        private final AtomicInteger a = new AtomicInteger();
        private final whw[] b;

        a(whw[] whwArr) {
            this.b = whwArr;
        }

        public final whw a() {
            return this.b[Math.abs(this.a.getAndIncrement() % this.b.length)];
        }
    }

    /* renamed from: whs$b */
    static final class b implements defpackage.whx.a {
        private final AtomicInteger a = new AtomicInteger();
        private final whw[] b;

        b(whw[] whwArr) {
            this.b = whwArr;
        }

        public final whw a() {
            return this.b[this.a.getAndIncrement() & (this.b.length - 1)];
        }
    }

    private whs() {
    }

    public final defpackage.whx.a a(whw[] whwArr) {
        int length = whwArr.length;
        if (((-length) & length) == length) {
            return new b(whwArr);
        }
        return new a(whwArr);
    }
}
