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
        HlsPlaylistTracker createTracker(ayr ayr, bby bby, azh azh);
    }

    public interface b {
        boolean a(defpackage.azd.a aVar, long j);

        void g();
    }

    public interface c {
        void a(aze aze);
    }

    aze a(defpackage.azd.a aVar);

    void a();

    void a(Uri uri, defpackage.axq.a aVar, c cVar);

    void a(b bVar);

    azd b();

    void b(b bVar);

    boolean b(defpackage.azd.a aVar);

    long c();

    void c(defpackage.azd.a aVar);

    void d();

    void d(defpackage.azd.a aVar);

    boolean e();
}
