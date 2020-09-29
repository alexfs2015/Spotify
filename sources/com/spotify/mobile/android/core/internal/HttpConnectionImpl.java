package com.spotify.mobile.android.core.internal;

import com.spotify.base.java.logging.Logger;
import com.spotify.core.http.HttpConnection;
import com.spotify.core.http.HttpConnectionDelegate;
import com.spotify.core.http.HttpOptions;
import com.spotify.core.http.HttpRequest;
import com.spotify.core.jni.NativeHelpers;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

public class HttpConnectionImpl implements HttpConnectionDelegate {
    private static final int BUFFER_SIZE = 1024;
    private wlj mCall;
    private final wmb mHttpClient;
    /* access modifiers changed from: private */
    public boolean mIsAborted;
    private wmd mRequest;

    public HttpConnectionImpl(wmb wmb) {
        this.mHttpClient = wmb;
    }

    private String getMediaType(Map<String, String> map) {
        String str = (String) map.get("Content-Type");
        return str != null ? str : HttpConnection.kDefaultContentType;
    }

    public void send(final HttpConnection httpConnection, HttpRequest httpRequest, HttpOptions httpOptions) {
        try {
            a a = new a().a(httpRequest.getUrl());
            Map byteArrayToMap = NativeHelpers.byteArrayToMap(httpRequest.getHeaders());
            for (Entry entry : byteArrayToMap.entrySet()) {
                a.a((String) entry.getKey(), (String) entry.getValue());
            }
            wme wme = null;
            if (wnc.b(httpRequest.getMethod())) {
                if (httpRequest.getBody() == null) {
                    Logger.d("%s %s must have a request body", httpRequest.getMethod(), httpRequest.getUrl());
                    httpConnection.onError(HttpConnection.kErrorHttpFail);
                    return;
                }
                wme = wme.a(wlz.b(getMediaType(byteArrayToMap)), httpRequest.getBody());
            }
            a.a(httpRequest.getMethod(), wme);
            this.mRequest = a.a();
            Logger.c("Starting request: %s", this.mRequest);
            this.mCall = wmc.a(mutateHttpClient(httpOptions), this.mRequest, false);
            this.mCall.a(new wlk() {
                public void onFailure(wlj wlj, IOException iOException) {
                    reportException(iOException);
                }

                private void reportException(IOException iOException) {
                    Logger.e(iOException, "Exception on getting result data", new Object[0]);
                    if (iOException instanceof SocketTimeoutException) {
                        httpConnection.onError(HttpConnection.kErrorHttpTimeout);
                    } else if (HttpConnectionImpl.this.mIsAborted) {
                        httpConnection.onError(HttpConnection.kErrorHttpAborted);
                    } else {
                        httpConnection.onError(HttpConnection.kErrorHttpFail);
                    }
                }

                /* JADX WARNING: Removed duplicated region for block: B:31:0x006d A[SYNTHETIC, Splitter:B:31:0x006d] */
                /* JADX WARNING: Removed duplicated region for block: B:37:0x0078 A[SYNTHETIC, Splitter:B:37:0x0078] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onResponse(defpackage.wlj r6, defpackage.wmf r7) {
                    /*
                        r5 = this;
                        r6 = 0
                        int r0 = r7.c     // Catch:{ IOException -> 0x0067 }
                        wmd r1 = r7.a     // Catch:{ IOException -> 0x0067 }
                        wlx r1 = r1.a     // Catch:{ IOException -> 0x0067 }
                        java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0067 }
                        wlw r2 = r7.f     // Catch:{ IOException -> 0x0067 }
                        com.spotify.core.http.HttpConnection r3 = r9     // Catch:{ IOException -> 0x0067 }
                        com.spotify.core.http.HttpResponse r4 = new com.spotify.core.http.HttpResponse     // Catch:{ IOException -> 0x0067 }
                        java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0067 }
                        r4.<init>(r0, r1, r2)     // Catch:{ IOException -> 0x0067 }
                        r3.onHeaders(r4)     // Catch:{ IOException -> 0x0067 }
                        wmg r0 = r7.g     // Catch:{ IOException -> 0x0067 }
                        if (r0 == 0) goto L_0x0046
                        java.io.InputStream r1 = r0.d()     // Catch:{ IOException -> 0x0067 }
                        java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0067 }
                        r2.<init>(r1)     // Catch:{ IOException -> 0x0067 }
                        r6 = 1024(0x400, float:1.435E-42)
                        byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x0042, all -> 0x003e }
                    L_0x002c:
                        int r1 = r2.read(r6)     // Catch:{ IOException -> 0x0042, all -> 0x003e }
                        r3 = -1
                        if (r1 == r3) goto L_0x0039
                        com.spotify.core.http.HttpConnection r3 = r9     // Catch:{ IOException -> 0x0042, all -> 0x003e }
                        r3.onBytesAvailable(r6, r1)     // Catch:{ IOException -> 0x0042, all -> 0x003e }
                        goto L_0x002c
                    L_0x0039:
                        r0.close()     // Catch:{ IOException -> 0x0042, all -> 0x003e }
                        r6 = r2
                        goto L_0x0046
                    L_0x003e:
                        r6 = move-exception
                        r7 = r6
                        r6 = r2
                        goto L_0x0076
                    L_0x0042:
                        r6 = move-exception
                        r7 = r6
                        r6 = r2
                        goto L_0x0068
                    L_0x0046:
                        java.lang.String r0 = "onResponse( ... ): { response=%s }"
                        r1 = 1
                        java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x0067 }
                        r2 = 0
                        java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0067 }
                        r1[r2] = r7     // Catch:{ IOException -> 0x0067 }
                        com.spotify.base.java.logging.Logger.c(r0, r1)     // Catch:{ IOException -> 0x0067 }
                        com.spotify.core.http.HttpConnection r7 = r9     // Catch:{ IOException -> 0x0067 }
                        r7.onComplete()     // Catch:{ IOException -> 0x0067 }
                        if (r6 == 0) goto L_0x0064
                        r6.close()     // Catch:{ IOException -> 0x0060 }
                        goto L_0x0064
                    L_0x0060:
                        r6 = move-exception
                        r5.reportException(r6)
                    L_0x0064:
                        return
                    L_0x0065:
                        r7 = move-exception
                        goto L_0x0076
                    L_0x0067:
                        r7 = move-exception
                    L_0x0068:
                        r5.reportException(r7)     // Catch:{ all -> 0x0065 }
                        if (r6 == 0) goto L_0x0075
                        r6.close()     // Catch:{ IOException -> 0x0071 }
                        goto L_0x0075
                    L_0x0071:
                        r6 = move-exception
                        r5.reportException(r6)
                    L_0x0075:
                        return
                    L_0x0076:
                        if (r6 == 0) goto L_0x0080
                        r6.close()     // Catch:{ IOException -> 0x007c }
                        goto L_0x0080
                    L_0x007c:
                        r6 = move-exception
                        r5.reportException(r6)
                    L_0x0080:
                        goto L_0x0082
                    L_0x0081:
                        throw r7
                    L_0x0082:
                        goto L_0x0081
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.core.internal.HttpConnectionImpl.AnonymousClass1.onResponse(wlj, wmf):void");
                }
            });
        } catch (IllegalArgumentException e) {
            Logger.d(e, "Error when trying to create request %s (%s).", httpRequest.getMethod(), httpRequest.getUrl());
            httpConnection.onError(HttpConnection.kErrorHttpInvalidUrl);
        }
    }

    public void abort() {
        wlj wlj = this.mCall;
        if (wlj != null) {
            wlj.c();
        }
        this.mIsAborted = true;
    }

    public boolean isRequestStarted() {
        return this.mRequest != null;
    }

    private wmb mutateHttpClient(HttpOptions httpOptions) {
        wmb wmb = this.mHttpClient;
        String str = "timeout";
        if (!(((long) wmb.B) == httpOptions.getTimeout() || ((long) wmb.C) == httpOptions.getTimeout())) {
            a b = wmb.b();
            b.z = wmk.a(str, httpOptions.getTimeout(), TimeUnit.MILLISECONDS);
            b.A = wmk.a(str, httpOptions.getTimeout(), TimeUnit.MILLISECONDS);
            wmb = b.a();
        }
        if (((long) wmb.A) != httpOptions.getConnectTimeout()) {
            a b2 = wmb.b();
            b2.y = wmk.a(str, httpOptions.getConnectTimeout(), TimeUnit.MILLISECONDS);
            wmb = b2.a();
        }
        if (wmb.x == httpOptions.isFollowRedirects()) {
            return wmb;
        }
        a b3 = wmb.b();
        b3.v = httpOptions.isFollowRedirects();
        return b3.a();
    }
}
