package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.cache.Cache.CacheException;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class CacheDataSink implements bcd {
    private final Cache a;
    private final long b;
    private final int c;
    private final boolean d;
    private bcg e;
    private File f;
    private OutputStream g;
    private FileOutputStream h;
    private long i;
    private long j;
    private bee k;

    public static class CacheDataSinkException extends CacheException {
        public CacheDataSinkException(IOException iOException) {
            super((Throwable) iOException);
        }
    }

    public CacheDataSink(Cache cache, long j2, int i2) {
        this(cache, j2, i2, true);
    }

    private CacheDataSink(Cache cache, long j2, int i2, boolean z) {
        this.a = (Cache) bdl.a(cache);
        this.b = j2;
        this.c = i2;
        this.d = true;
    }

    private void b() {
        this.f = this.a.a(this.e.g, this.j + this.e.d, this.e.f == -1 ? this.b : Math.min(this.e.f - this.j, this.b));
        this.h = new FileOutputStream(this.f);
        int i2 = this.c;
        if (i2 > 0) {
            bee bee = this.k;
            if (bee == null) {
                this.k = new bee(this.h, i2);
            } else {
                bee.a(this.h);
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
                ben.a((Closeable) this.g);
                this.g = null;
                File file = this.f;
                this.f = null;
                this.a.a(file);
            } catch (Throwable th) {
                ben.a((Closeable) this.g);
                this.g = null;
                File file2 = this.f;
                this.f = null;
                file2.delete();
                throw th;
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

    public final void a(bcg bcg) {
        if (bcg.f != -1 || bcg.a(2)) {
            this.e = bcg;
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
}
