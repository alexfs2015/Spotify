package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Downloader.a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.IOException;
import java.io.InputStream;

public final class NetworkRequestHandler extends vsm {
    private final Downloader a;
    private final vsp b;

    public static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    public final int a() {
        return 2;
    }

    public final boolean b() {
        return true;
    }

    public NetworkRequestHandler(Downloader downloader, vsp vsp) {
        this.a = downloader;
        this.b = vsp;
    }

    public final boolean a(vsk vsk) {
        String scheme = vsk.d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    public final a a(vsk vsk, int i) {
        a a2 = this.a.a(vsk.d, vsk.c);
        if (a2 == null) {
            return null;
        }
        LoadedFrom loadedFrom = a2.b ? LoadedFrom.DISK : LoadedFrom.NETWORK;
        InputStream inputStream = a2.a;
        if (inputStream == null) {
            return null;
        }
        if (loadedFrom == LoadedFrom.DISK && a2.c == 0) {
            vsv.a(inputStream);
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom == LoadedFrom.NETWORK && a2.c > 0) {
            vsp vsp = this.b;
            vsp.b.sendMessage(vsp.b.obtainMessage(4, Long.valueOf(a2.c)));
        }
        return new a(inputStream, loadedFrom);
    }

    public final boolean a(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
