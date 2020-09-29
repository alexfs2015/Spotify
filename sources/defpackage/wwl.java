package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: wwl reason: default package */
public final class wwl<T> implements b<T, T> {
    final int a;

    public final /* synthetic */ Object call(Object obj) {
        final wuj wuj = (wuj) obj;
        AnonymousClass1 r0 = new wuj<T>() {
            boolean a;
            private int c;

            public final void onCompleted() {
                if (!this.a) {
                    this.a = true;
                    wuj.onCompleted();
                }
            }

            public final void onError(Throwable th) {
                if (!this.a) {
                    this.a = true;
                    try {
                        wuj.onError(th);
                    } finally {
                        unsubscribe();
                    }
                } else {
                    wzs.a(th);
                }
            }

            public final void onNext(T t) {
                if (!isUnsubscribed()) {
                    int i = this.c;
                    this.c = i + 1;
                    if (i < wwl.this.a) {
                        boolean z = this.c == wwl.this.a;
                        wuj.onNext(t);
                        if (z && !this.a) {
                            this.a = true;
                            try {
                                wuj.onCompleted();
                            } finally {
                                unsubscribe();
                            }
                        }
                    }
                }
            }

            public final void setProducer(final wuf wuf) {
                wuj.setProducer(new wuf() {
                    private AtomicLong a = new AtomicLong(0);

                    public final void a(long j) {
                        long j2;
                        long min;
                        if (j > 0 && !AnonymousClass1.this.a) {
                            do {
                                j2 = this.a.get();
                                min = Math.min(j, ((long) wwl.this.a) - j2);
                                if (min == 0) {
                                    return;
                                }
                            } while (!this.a.compareAndSet(j2, j2 + min));
                            wuf.a(min);
                        }
                    }
                });
            }
        };
        if (this.a == 0) {
            wuj.onCompleted();
            r0.unsubscribe();
        }
        wuj.add(r0);
        return r0;
    }

    public wwl(int i) {
        if (i >= 0) {
            this.a = i;
            return;
        }
        StringBuilder sb = new StringBuilder("limit >= 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
