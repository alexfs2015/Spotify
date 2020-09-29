package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.cache.Cache.CacheException;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class CacheDataSink implements bbm {
    private final Cache a;
    private final long b;
    private final int c;
    private final boolean d;
    private bbp e;
    private File f;
    private OutputStream g;
    private FileOutputStream h;
    private long i;
    private long j;
    private bdn k;

    public static class CacheDataSinkException extends CacheException {
        public CacheDataSinkException(IOException iOException) {
            super((Throwable) iOException);
        }
    }

    public CacheDataSink(Cache cache, long j2, int i2) {
        this(cache, j2, i2, true);
    }

    private CacheDataSink(Cache cache, long j2, int i2, boolean z) {
        this.a = (Cache) bcu.a(cache);
        this.b = j2;
        this.c = i2;
        this.d = true;
    }

    public final void a(bbp bbp) {
        if (bbp.f != -1 || bbp.a(2)) {
            this.e = bbp;
            this.j = 0;
            try {
                b();
            } catch (IOException e2) {
                throw new CacheDataSinkException(e2);
            }
        } else {
            this.e = null;
        }
    }

    public final void a(byte[] bArr, int i2, int i3) {
        if (this.e != null) {
            int i4 = 0;
            while (i4 < i3) {
                try {
                    if (this.i == this.b) {
                        c();
                        b();
                    }
                    int min = (int) Math.min((long) (i3 - i4), this.b - this.i);
                    this.g.write(bArr, i2 + i4, min);
                    i4 += min;
                    long j2 = (long) min;
                    this.i += j2;
                    this.j += j2;
                } catch (IOException e2) {
                    throw new CacheDataSinkException(e2);
                }
            }
        }
    }

    public final void a() {
        if (this.e != null) {
            try {
                c();
            } catch (IOException e2) {
                throw new CacheDataSinkException(e2);
            }
        }
    }

    private void b() {
        long j2;
        if (this.e.f == -1) {
            j2 = this.b;
        } else {
            j2 = Math.min(this.e.f - this.j, this.b);
        }
        long j3 = j2;
        this.f = this.a.a(this.e.g, this.j + this.e.d, j3);
        this.h = new FileOutputStream(this.f);
        int i2 = this.c;
        if (i2 > 0) {
            bdn bdn = this.k;
            if (bdn == null) {
                this.k = new bdn(this.h, i2);
            } else {
                bdn.a(this.h);
            }
            this.g = this.k;
        } else {
            this.g = this.h;
        }
        this.i = 0;
    }

    private void c() {
        OutputStream outputStream = this.g;
        if (outputStream != null) {
            try {
                outputStream.flush();
                if (this.d) {
                    this.h.getFD().sync();
                }
                bdw.a((Closeable) this.g);
                this.g = null;
                File file = this.f;
                this.f = null;
                this.a.a(file);
            } catch (Throwable th) {
                bdw.a((Closeable) this.g);
                this.g = null;
                File file2 = this.f;
                this.f = null;
                file2.delete();
                throw th;
            }
        }
    }
}
