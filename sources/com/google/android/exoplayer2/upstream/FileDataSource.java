package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileDataSource extends bcb {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;

    public static class FileDataSourceException extends IOException {
        public FileDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public FileDataSource() {
        super(false);
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.c;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.a.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.c -= (long) read;
                a(read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }

    public final long a(bcg bcg) {
        try {
            this.b = bcg.a;
            b(bcg);
            this.a = new RandomAccessFile(bcg.a.getPath(), "r");
            this.a.seek(bcg.e);
            this.c = bcg.f == -1 ? this.a.length() - bcg.e : bcg.f;
            if (this.c >= 0) {
                this.d = true;
                c(bcg);
                return this.c;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }

    public final Uri a() {
        return this.b;
    }

    public final void c() {
        this.b = null;
        try {
            if (this.a != null) {
                this.a.close();
            }
            this.a = null;
            if (this.d) {
                this.d = false;
                d();
            }
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        } catch (Throwable th) {
            this.a = null;
            if (this.d) {
                this.d = false;
                d();
            }
            throw th;
        }
    }
}
