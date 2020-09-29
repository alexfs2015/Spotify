package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class ContentDataSource extends bbk {
    private final ContentResolver a;
    private Uri b;
    private AssetFileDescriptor c;
    private FileInputStream d;
    private long e;
    private boolean f;

    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.a = context.getContentResolver();
    }

    public final long a(bbp bbp) {
        long j;
        try {
            this.b = bbp.a;
            b(bbp);
            this.c = this.a.openAssetFileDescriptor(this.b, "r");
            if (this.c != null) {
                this.d = new FileInputStream(this.c.getFileDescriptor());
                long startOffset = this.c.getStartOffset();
                long skip = this.d.skip(bbp.e + startOffset) - startOffset;
                if (skip == bbp.e) {
                    if (bbp.f != -1) {
                        this.e = bbp.f;
                    } else {
                        long length = this.c.getLength();
                        if (length == -1) {
                            FileChannel channel = this.d.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                j = -1;
                            } else {
                                j = size - channel.position();
                            }
                            this.e = j;
                        } else {
                            this.e = length - skip;
                        }
                    }
                    this.f = true;
                    c(bbp);
                    return this.e;
                }
                throw new EOFException();
            }
            StringBuilder sb = new StringBuilder("Could not open file descriptor for: ");
            sb.append(this.b);
            throw new FileNotFoundException(sb.toString());
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2);
        }
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
                throw new ContentDataSourceException(e2);
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
            throw new ContentDataSourceException(new EOFException());
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
                throw new ContentDataSourceException(e2);
            } catch (Throwable th) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    d();
                }
                throw th;
            }
        } catch (IOException e3) {
            throw new ContentDataSourceException(e3);
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
                throw new ContentDataSourceException(e4);
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
