package defpackage;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.CacheControl;
import com.squareup.okhttp.CacheControl.Builder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.Downloader.ResponseException;
import com.squareup.picasso.Downloader.a;
import com.squareup.picasso.NetworkPolicy;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: wgn reason: default package */
public final class wgn implements Downloader {
    private final OkHttpClient a;

    public wgn(Context context) {
        this(whb.b(context));
    }

    private wgn(OkHttpClient okHttpClient) {
        this.a = okHttpClient;
    }

    private wgn(File file) {
        this(file, whb.a(file));
    }

    private wgn(File file, long j) {
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setConnectTimeout(15000, TimeUnit.MILLISECONDS);
        okHttpClient.setReadTimeout(20000, TimeUnit.MILLISECONDS);
        okHttpClient.setWriteTimeout(20000, TimeUnit.MILLISECONDS);
        this(okHttpClient);
        try {
            this.a.setCache(new Cache(file, j));
        } catch (IOException unused) {
        }
    }

    public final a a(Uri uri, int i) {
        CacheControl cacheControl;
        if (i == 0) {
            cacheControl = null;
        } else if (NetworkPolicy.c(i)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            Builder builder = new Builder();
            if (!NetworkPolicy.a(i)) {
                builder.noCache();
            }
            if (!NetworkPolicy.b(i)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(uri.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        Response execute = this.a.newCall(url.build()).execute();
        int code = execute.code();
        if (code < 300) {
            boolean z = execute.cacheResponse() != null;
            ResponseBody body = execute.body();
            return new a(body.byteStream(), z, body.contentLength());
        }
        execute.body().close();
        StringBuilder sb = new StringBuilder();
        sb.append(code);
        sb.append(" ");
        sb.append(execute.message());
        throw new ResponseException(sb.toString(), i, code);
    }
}
