package com.google.common.cache;

import java.util.concurrent.atomic.AtomicLong;

public final class LongAddables {
    private static final fbu<fcb> a;

    static final class PureJavaLongAddable extends AtomicLong implements fcb {
        private PureJavaLongAddable() {
        }

        /* synthetic */ PureJavaLongAddable(byte b) {
            this();
        }

        public final void a() {
            getAndIncrement();
        }

        public final void a(long j) {
            getAndAdd(j);
        }
    }

    static {
        fbu<fcb> fbu;
        try {
            new LongAdder();
            fbu = new fbu<fcb>() {
                public final /* synthetic */ Object get() {
                    return new LongAdder();
                }
            };
        } catch (Throwable unused) {
            fbu = new fbu<fcb>() {
                public final /* synthetic */ Object get() {
                    return new PureJavaLongAddable(0);
                }
            };
        }
        a = fbu;
    }

    public static fcb a() {
        return (fcb) a.get();
    }
}
