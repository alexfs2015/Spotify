package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class RawResourceDataSource extends bcb {
    private final Resources a;
    private Uri b;
    private AssetFileDescriptor c;
    private InputStream d;
    private long e;
    private boolean f;

    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(IOException iOException) {
            super(iOException);
        }

        public RawResourceDataSourceException(String str) {
            super(str);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.a = context.getResources();
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(e2);
            }
        }
        int read = this.d.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.e;
            if (j2 != -1) {
                this.e = j2 - ((long) read);
            }
            a(read);
            return read;
        } else if (this.e == -1) {
            return -1;
        } else {
            throw new RawResourceDataSourceException((IOException) new EOFException());
        }
    }

    public final long a(bcg bcg) {
        try {
            this.b = bcg.a;
            if (TextUtils.equals("rawresource", this.b.getScheme())) {
                int parseInt = Integer.parseInt(this.b.getLastPathSegment());
                b(bcg);
                this.c = this.a.openRawResourceFd(parseInt);
                this.d = new FileInputStream(this.c.getFileDescriptor());
                this.d.skip(this.c.getStartOffset());
                if (this.d.skip(bcg.e) >= bcg.e) {
                    long j = -1;
                    if (bcg.f != -1) {
                        this.e = bcg.f;
                    } else {
                        long length = this.c.getLength();
                        if (length != -1) {
                            j = length - bcg.e;
                        }
                        this.e = j;
                    }
                    this.f = true;
                    c(bcg);
                    return this.e;
                }
                throw new EOFException();
            }
            throw new RawResourceDataSourceException("URI must use scheme rawresource");
        } catch (NumberFormatException unused) {
            throw new RawResourceDataSourceException("Resource identifier must be an integer.");
        } catch (IOException e2) {
            throw new RawResourceDataSourceException(e2);
        }
    }

    public final Uri a() {
        return this.b;
    }

    public final void c() {
        this.b = null;
        try {
            if (this.d != null) {
                this.d.close();
            }
            this.d = null;
            try {
                if (this.c != null) {
                    this.c.close();
                }
                this.c = null;
                if (this.f) {
                    this.f = false;
                    d();
                }
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(e2);
            } catch (Throwable th) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    d();
                }
                throw th;
            }
        } catch (IOException e3) {
            throw new RawResourceDataSourceException(e3);
        } catch (Throwable th2) {
            this.d = null;
            try {
                if (this.c != null) {
                    this.c.close();
                }
                this.c = null;
                if (this.f) {
                    this.f = false;
                    d();
                }
                throw th2;
            } catch (IOException e4) {
                throw new RawResourceDataSourceException(e4);
            } catch (Throwable th3) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    d();
                }
                throw th3;
            }
        }
    }
}
