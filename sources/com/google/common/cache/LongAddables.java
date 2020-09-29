package com.google.common.cache;

import java.util.concurrent.atomic.AtomicLong;

public final class LongAddables {
    private static final fbd<fbk> a;

    static final class PureJavaLongAddable extends AtomicLong implements fbk {
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
        fbd<fbk> fbd;
        try {
            new LongAdder();
            fbd = new fbd<fbk>() {
                public final /* synthetic */ Object get() {
                    return new LongAdder();
                }
            };
        } catch (Throwable unused) {
            fbd = new fbd<fbk>() {
                public final /* synthetic */ Object get() {
                    return new PureJavaLongAddable(0);
                }
            };
        }
        a = fbd;
    }

    public static fbk a() {
        return (fbk) a.get();
    }
}
