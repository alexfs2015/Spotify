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
        void a(bda bda);

        void a(Cache cache, bda bda);

        void a(Cache cache, bda bda, bda bda2);
    }

    long a();

    long a(String str);

    bda a(String str, long j);

    File a(String str, long j, long j2);

    void a(bda bda);

    void a(File file);

    void a(String str, bdg bdg);

    bda b(String str, long j);

    bde b(String str);

    void b(bda bda);

    void c(String str, long j);
}
