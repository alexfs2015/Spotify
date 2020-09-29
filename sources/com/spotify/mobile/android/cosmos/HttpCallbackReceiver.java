package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ParserException;

public abstract class HttpCallbackReceiver<T> extends ParsingCallbackReceiver<T> {

    public static class HttpException extends ParserException {
        private static final long serialVersionUID = -5546858425237162266L;
        private final int mStatusCode;

        public HttpException(String str, int i) {
            super(str);
            this.mStatusCode = i;
        }

        public int getStatusCode() {
            return this.mStatusCode;
        }
    }

    public HttpCallbackReceiver(Handler handler) {
        super(handler);
    }

    public static void defaultVerifyResponse(Response response) {
        int status = response.getStatus();
        if (status >= 200) {
            if (status <= 299) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder("HTTP status code ");
        sb.append(status);
        String str = "i:su  r";
        sb.append(", uri: ");
        sb.append(response.getUri());
        if (response.getBody().length > 0) {
            try {
                String str2 = new String(response.getBody(), fbi.c);
                String str3 = "oy:m,d b";
                sb.append(", body: ");
                sb.append(str2);
            } catch (RuntimeException e) {
                HttpException httpException = new HttpException(sb.toString(), status);
                httpException.initCause(e);
                throw httpException;
            }
        }
        throw new HttpException(sb.toString(), status);
    }

    /* access modifiers changed from: protected */
    public void verifyResponse(Response response) {
        defaultVerifyResponse(response);
    }
}
