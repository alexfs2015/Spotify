package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

public interface Downloader {

    public static class ResponseException extends IOException {
        public final boolean localCacheOnly;
        public final int responseCode;

        public ResponseException(String str, int i, int i2) {
            super(str);
            this.localCacheOnly = NetworkPolicy.c(i);
            this.responseCode = i2;
        }
    }

    public static class a {
        public final InputStream a;
        final boolean b;
        final long c;
        private Bitmap d;

        public a(InputStream inputStream, boolean z, long j) {
            if (inputStream != null) {
                this.a = inputStream;
                this.d = null;
                this.b = z;
                this.c = j;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }
    }

    a a(Uri uri, int i);
}
