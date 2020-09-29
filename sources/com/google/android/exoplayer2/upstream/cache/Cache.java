package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;

public interface Cache {

    public static class CacheException extends IOException {
        public CacheException(String str) {
            super(str);
        }

        public CacheException(Throwable th) {
            super(th);
        }
    }

    public interface a {
        void a(bcj bcj);

        void a(Cache cache, bcj bcj);

        void a(Cache cache, bcj bcj, bcj bcj2);
    }

    long a();

    long a(String str);

    bcj a(String str, long j);

    File a(String str, long j, long j2);

    void a(bcj bcj);

    void a(File file);

    void a(String str, bcp bcp);

    bcj b(String str, long j);

    bcn b(String str);

    void b(bcj bcj);

    void c(String str, long j);
}
