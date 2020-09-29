package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: xkq reason: default package */
public final class xkq<T> implements b<T, T> {
    final int a;

    public xkq(int i) {
        if (i >= 0) {
            this.a = i;
            return;
        }
        StringBuilder sb = new StringBuilder("limit >= 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final /* synthetic */ Object call(Object obj) {
        final xio xio = (xio) obj;
        AnonymousClass1 r0 = new xio<T>() {
            boolean a;
            private int c;

            public final void onCompleted() {
                if (!this.a) {
                    this.a = true;
                    xio.onCompleted();
                }
            }

            public final void onError(Throwable th) {
                if (!this.a) {
                    this.a = true;
                    try {
                        xio.onError(th);
                    } finally {
                        unsubscribe();
                    }
                } else {
                    xnx.a(th);
                }
            }

            public final void onNext(T t) {
                if (!isUnsubscribed()) {
                    int i = this.c;
                    this.c = i + 1;
                    if (i < xkq.this.a) {
                        boolean z = this.c == xkq.this.a;
                        xio.onNext(t);
                        if (z && !this.a) {
                            this.a = true;
                            try {
                                xio.onCompleted();
                            } finally {
                                unsubscribe();
                            }
                        }
                    }
                }
            }

            public final void setProducer(final xik xik) {
                xio.setProducer(new xik() {
                    private AtomicLong a = new AtomicLong(0);

                    public final void a(long j) {
                        long j2;
                        long min;
                        if (j > 0 && !AnonymousClass1.this.a) {
                            do {
                                j2 = this.a.get();
                                min = Math.min(j, ((long) xkq.this.a) - j2);
                                if (min == 0) {
                                    return;
                                }
                            } while (!this.a.compareAndSet(j2, j2 + min));
                            xik.a(min);
                        }
                    }
                });
            }
        };
        if (this.a == 0) {
            xio.onCompleted();
            r0.unsubscribe();
        }
        xio.add(r0);
        return r0;
    }
}
