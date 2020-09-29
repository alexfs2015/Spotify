package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.spotify.cosmos.android.ResolverCallbackReceiver;
import com.spotify.cosmos.router.Response;

public abstract class ParsingCallbackReceiver<T> extends ResolverCallbackReceiver {

    public enum ErrorCause {
        RESOLVING,
        PARSING,
        UNKNOWN
    }

    public static class ParserException extends Exception {
        private static final long serialVersionUID = -6133574440765179179L;

        public ParserException(String str) {
            super(str);
        }

        public ParserException(Throwable th) {
            super(th);
        }

        public ParserException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void onError(Throwable th, ErrorCause errorCause);

    /* access modifiers changed from: protected */
    public abstract void onResolved(Response response, T t);

    /* access modifiers changed from: protected */
    public abstract T parseResponse(Response response);

    /* access modifiers changed from: protected */
    public void verifyResponse(Response response) {
    }

    public ParsingCallbackReceiver(Handler handler) {
        super(handler);
    }

    public final void onResolved(Response response) {
        try {
            verifyResponse(response);
            postResult(response, parseResponse(response));
        } catch (ParserException e) {
            postError(e, ErrorCause.PARSING);
        }
    }

    public void sendOnResolved(Response response) {
        onResolved(response);
    }

    public final void onError(Throwable th) {
        postError(th, ErrorCause.RESOLVING);
    }

    private void postResult(final Response response, final T t) {
        if (this.mHandler != null) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    ParsingCallbackReceiver.this.onResolved(response, t);
                }
            });
        } else {
            onResolved(response, t);
        }
    }

    private void postError(final Throwable th, final ErrorCause errorCause) {
        if (this.mHandler != null) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    ParsingCallbackReceiver.this.onError(th, errorCause);
                }
            });
        } else {
            onError(th, errorCause);
        }
    }
}
