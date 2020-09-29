package defpackage;

import com.comscore.android.id.IdHelperAndroid;
import com.spotify.core.http.HttpConnection;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: wsf reason: default package */
public final class wsf {
    public static final wvc a = new wvc("charset");
    public static final wvc b = new wvc("chunked");
    public static final wvc c = new wvc("websocket");

    static {
        new wvc("application/json");
        new wvc("application/x-www-form-urlencoded");
        new wvc("application/octet-stream");
        new wvc("attachment");
        new wvc("base64");
        new wvc("binary");
        new wvc("boundary");
        new wvc("bytes");
        new wvc("close");
        new wvc("compress");
        new wvc("100-continue");
        new wvc("deflate");
        new wvc("x-deflate");
        new wvc("file");
        new wvc("filename");
        new wvc("form-data");
        new wvc("gzip");
        new wvc("gzip,deflate");
        new wvc("x-gzip");
        new wvc("identity");
        new wvc("keep-alive");
        new wvc("max-age");
        new wvc("max-stale");
        new wvc("min-fresh");
        new wvc("multipart/form-data");
        new wvc("multipart/mixed");
        new wvc("must-revalidate");
        new wvc("name");
        new wvc("no-cache");
        new wvc("no-store");
        new wvc("no-transform");
        new wvc(IdHelperAndroid.NO_ID_AVAILABLE);
        new wvc(Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        new wvc("only-if-cached");
        new wvc("private");
        new wvc("proxy-revalidate");
        new wvc("public");
        new wvc("quoted-printable");
        new wvc("s-maxage");
        new wvc(HttpConnection.kDefaultContentType);
        new wvc("trailers");
        new wvc("upgrade");
    }
}
