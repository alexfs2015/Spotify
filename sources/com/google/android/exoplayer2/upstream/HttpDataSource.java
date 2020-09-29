package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HttpDataSource extends bce {

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ boolean a(String str) {
            String d = ben.d(str);
            return !TextUtils.isEmpty(d) && (!d.contains("text") || d.contains("text/vtt")) && !d.contains("html") && !d.contains("xml");
        }
    }

    public static class HttpDataSourceException extends IOException {
        public final bcg dataSpec;
        public final int type;

        public HttpDataSourceException(IOException iOException, bcg bcg, int i) {
            super(iOException);
            this.dataSpec = bcg;
            this.type = i;
        }

        public HttpDataSourceException(String str, bcg bcg, int i) {
            super(str);
            this.dataSpec = bcg;
            this.type = 1;
        }

        public HttpDataSourceException(String str, IOException iOException, bcg bcg, int i) {
            super(str, iOException);
            this.dataSpec = bcg;
            this.type = 1;
        }
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String str, bcg bcg) {
            StringBuilder sb = new StringBuilder("Invalid content type: ");
            sb.append(str);
            super(sb.toString(), bcg, 1);
            this.contentType = str;
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final int responseCode;

        public InvalidResponseCodeException(int i, Map<String, List<String>> map, bcg bcg) {
            StringBuilder sb = new StringBuilder("Response code: ");
            sb.append(i);
            super(sb.toString(), bcg, 1);
            this.responseCode = i;
            this.headerFields = map;
        }
    }

    public static abstract class a implements b {
        private final c a = new c();

        /* access modifiers changed from: protected */
        public abstract HttpDataSource a(c cVar);

        /* renamed from: b */
        public final HttpDataSource a() {
            return a(this.a);
        }
    }

    public interface b extends defpackage.bce.a {

        /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$b$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
        }

        /* synthetic */ bce a();

        HttpDataSource b();
    }

    public static final class c {
        private final Map<String, String> a = new HashMap();
        private Map<String, String> b;

        public final synchronized Map<String, String> a() {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.a));
            }
            return this.b;
        }
    }

    static {
        $$Lambda$HttpDataSource$Wa0nTCajGk4lpmSF4phvm3laF8 r0 = $$Lambda$HttpDataSource$Wa0nTCajGk4lpmSF4phvm3laF8.INSTANCE;
    }
}
