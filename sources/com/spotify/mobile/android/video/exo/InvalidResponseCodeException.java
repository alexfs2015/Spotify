package com.spotify.mobile.android.video.exo;

import com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;
import java.util.List;
import java.util.Map;

public class InvalidResponseCodeException extends HttpDataSourceException {
    private static final long serialVersionUID = 9235823475L;
    public final Map<String, List<String>> mHeaderFields;
    public final String mResponseBody;
    public final int mResponseCode;

    public InvalidResponseCodeException(int i, Map<String, List<String>> map, bcg bcg, String str) {
        StringBuilder sb = new StringBuilder("Response code: ");
        sb.append(i);
        super(sb.toString(), bcg, 1);
        this.mResponseCode = i;
        this.mHeaderFields = map;
        this.mResponseBody = str;
    }
}
