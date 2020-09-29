package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Downloader.a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.IOException;
import java.io.InputStream;

public final class NetworkRequestHandler extends wgs {
    private final Downloader a;
    private final wgv b;

    public static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    public NetworkRequestHandler(Downloader downloader, wgv wgv) {
        this.a = downloader;
        this.b = wgv;
    }

    public final int a() {
        return 2;
    }

    public final a a(wgq wgq, int i) {
        a a2 = this.a.a(wgq.d, wgq.c);
        if (a2 == null) {
            return null;
        }
        LoadedFrom loadedFrom = a2.b ? LoadedFrom.DISK : LoadedFrom.NETWORK;
        InputStream inputStream = a2.a;
        if (inputStream == null) {
            return null;
        }
        if (loadedFrom == LoadedFrom.DISK && a2.c == 0) {
            whb.a(inputStream);
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom == LoadedFrom.NETWORK && a2.c > 0) {
            wgv wgv = this.b;
            wgv.b.sendMessage(wgv.b.obtainMessage(4, Long.valueOf(a2.c)));
        }
        return new a(inputStream, loadedFrom);
    }

    public final boolean a(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    public final boolean a(wgq wgq) {
        String scheme = wgq.d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    public final boolean b() {
        return true;
    }
}
