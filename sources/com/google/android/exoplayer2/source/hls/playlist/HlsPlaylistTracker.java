package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import java.io.IOException;

public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {
        public final String url;

        public PlaylistResetException(String str) {
            this.url = str;
        }
    }

    public static final class PlaylistStuckException extends IOException {
        public final String url;

        public PlaylistStuckException(String str) {
            this.url = str;
        }
    }

    public interface a {
        HlsPlaylistTracker createTracker(azi azi, bcp bcp, azy azy);
    }

    public interface b {
        boolean a(defpackage.azu.a aVar, long j);

        void g();
    }

    public interface c {
        void a(azv azv);
    }

    azv a(defpackage.azu.a aVar);

    void a();

    void a(Uri uri, defpackage.ayh.a aVar, c cVar);

    void a(b bVar);

    azu b();

    void b(b bVar);

    boolean b(defpackage.azu.a aVar);

    long c();

    void c(defpackage.azu.a aVar);

    void d();

    void d(defpackage.azu.a aVar);

    boolean e();
}
