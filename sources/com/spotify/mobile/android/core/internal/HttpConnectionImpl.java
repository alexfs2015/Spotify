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
    private wzp mCall;
    private final xah mHttpClient;
    /* access modifiers changed from: private */
    public boolean mIsAborted;
    private xaj mRequest;

    public HttpConnectionImpl(xah xah) {
        this.mHttpClient = xah;
    }

    private String getMediaType(Map<String, String> map) {
        String str = "tpsnTeeny-Co";
        String str2 = (String) map.get("Content-Type");
        if (str2 != null) {
            return str2;
        }
        String str3 = "ttimpxn/al";
        return HttpConnection.kDefaultContentType;
    }

    private xah mutateHttpClient(HttpOptions httpOptions) {
        xah xah = this.mHttpClient;
        String str = "mttooie";
        String str2 = "timeout";
        if (!(((long) xah.B) == httpOptions.getTimeout() || ((long) xah.C) == httpOptions.getTimeout())) {
            a b = xah.b();
            b.z = xaq.a(str2, httpOptions.getTimeout(), TimeUnit.MILLISECONDS);
            b.A = xaq.a(str2, httpOptions.getTimeout(), TimeUnit.MILLISECONDS);
            xah = b.a();
        }
        if (((long) xah.A) != httpOptions.getConnectTimeout()) {
            a b2 = xah.b();
            b2.y = xaq.a(str2, httpOptions.getConnectTimeout(), TimeUnit.MILLISECONDS);
            xah = b2.a();
        }
        if (xah.x != httpOptions.isFollowRedirects()) {
            a b3 = xah.b();
            b3.v = httpOptions.isFollowRedirects();
            xah = b3.a();
        }
        return xah;
    }

    public void abort() {
        wzp wzp = this.mCall;
        if (wzp != null) {
            wzp.c();
        }
        this.mIsAborted = true;
    }

    public boolean isRequestStarted() {
        return this.mRequest != null;
    }

    public void send(final HttpConnection httpConnection, HttpRequest httpRequest, HttpOptions httpOptions) {
        try {
            a a = new a().a(httpRequest.getUrl());
            Map byteArrayToMap = NativeHelpers.byteArrayToMap(httpRequest.getHeaders());
            for (Entry entry : byteArrayToMap.entrySet()) {
                a.a((String) entry.getKey(), (String) entry.getValue());
            }
            xak xak = null;
            if (xbi.b(httpRequest.getMethod())) {
                if (httpRequest.getBody() == null) {
                    Object[] objArr = {httpRequest.getMethod(), httpRequest.getUrl()};
                    String str = " eotubeasmevbhdyuss%s r  t a%q";
                    Logger.d("%s %s must have a request body", objArr);
                    httpConnection.onError(HttpConnection.kErrorHttpFail);
                    return;
                }
                xak = xak.a(xaf.b(getMediaType(byteArrayToMap)), httpRequest.getBody());
            }
            a.a(httpRequest.getMethod(), xak);
            this.mRequest = a.a();
            Logger.c("Starting request: %s", this.mRequest);
            this.mCall = xai.a(mutateHttpClient(httpOptions), this.mRequest, false);
            this.mCall.a(new wzq() {
                private void reportException(IOException iOException) {
                    String str = " nsiie tu ettE gtslcaetonorxpgan";
                    Logger.e(iOException, "Exception on getting result data", new Object[0]);
                    if (iOException instanceof SocketTimeoutException) {
                        httpConnection.onError(HttpConnection.kErrorHttpTimeout);
                    } else if (HttpConnectionImpl.this.mIsAborted) {
                        httpConnection.onError(HttpConnection.kErrorHttpAborted);
                    } else {
                        httpConnection.onError(HttpConnection.kErrorHttpFail);
                    }
                }

                public void onFailure(wzp wzp, IOException iOException) {
                    reportException(iOException);
                }

                /* JADX WARNING: Removed duplicated region for block: B:35:0x008f  */
                /* JADX WARNING: Removed duplicated region for block: B:43:0x009c  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onResponse(defpackage.wzp r7, defpackage.xal r8) {
                    /*
                        r6 = this;
                        r5 = 1
                        r7 = 0
                        r5 = 6
                        int r0 = r8.c     // Catch:{ IOException -> 0x0088 }
                        xaj r1 = r8.a     // Catch:{ IOException -> 0x0088 }
                        xad r1 = r1.a     // Catch:{ IOException -> 0x0088 }
                        java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0088 }
                        r5 = 5
                        xac r2 = r8.f     // Catch:{ IOException -> 0x0088 }
                        r5 = 7
                        com.spotify.core.http.HttpConnection r3 = r10     // Catch:{ IOException -> 0x0088 }
                        r5 = 6
                        com.spotify.core.http.HttpResponse r4 = new com.spotify.core.http.HttpResponse     // Catch:{ IOException -> 0x0088 }
                        java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0088 }
                        r4.<init>(r0, r1, r2)     // Catch:{ IOException -> 0x0088 }
                        r5 = 0
                        r3.onHeaders(r4)     // Catch:{ IOException -> 0x0088 }
                        r5 = 1
                        xam r0 = r8.g     // Catch:{ IOException -> 0x0088 }
                        if (r0 == 0) goto L_0x005b
                        r5 = 0
                        java.io.InputStream r1 = r0.d()     // Catch:{ IOException -> 0x0088 }
                        r5 = 6
                        java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0088 }
                        r2.<init>(r1)     // Catch:{ IOException -> 0x0088 }
                        r5 = 5
                        r7 = 1024(0x400, float:1.435E-42)
                        byte[] r7 = new byte[r7]     // Catch:{ IOException -> 0x0055, all -> 0x004e }
                    L_0x0036:
                        r5 = 5
                        int r1 = r2.read(r7)     // Catch:{ IOException -> 0x0055, all -> 0x004e }
                        r5 = 4
                        r3 = -1
                        r5 = 4
                        if (r1 == r3) goto L_0x0047
                        r5 = 4
                        com.spotify.core.http.HttpConnection r3 = r10     // Catch:{ IOException -> 0x0055, all -> 0x004e }
                        r3.onBytesAvailable(r7, r1)     // Catch:{ IOException -> 0x0055, all -> 0x004e }
                        goto L_0x0036
                    L_0x0047:
                        r5 = 6
                        r0.close()     // Catch:{ IOException -> 0x0055, all -> 0x004e }
                        r7 = r2
                        r5 = 2
                        goto L_0x005b
                    L_0x004e:
                        r7 = move-exception
                        r8 = r7
                        r8 = r7
                        r7 = r2
                        r7 = r2
                        r5 = 3
                        goto L_0x009a
                    L_0x0055:
                        r7 = move-exception
                        r8 = r7
                        r7 = r2
                        r7 = r2
                        r5 = 0
                        goto L_0x0089
                    L_0x005b:
                        java.lang.String r0 = "np mn s}=ee:Reo)s( .s o.{.or%pes n"
                        java.lang.String r0 = "onResponse( ... ): { response=%s }"
                        r5 = 5
                        r1 = 1
                        r5 = 2
                        java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x0088 }
                        r5 = 6
                        r2 = 0
                        java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x0088 }
                        r5 = 0
                        r1[r2] = r8     // Catch:{ IOException -> 0x0088 }
                        r5 = 0
                        com.spotify.base.java.logging.Logger.c(r0, r1)     // Catch:{ IOException -> 0x0088 }
                        r5 = 4
                        com.spotify.core.http.HttpConnection r8 = r10     // Catch:{ IOException -> 0x0088 }
                        r5 = 0
                        r8.onComplete()     // Catch:{ IOException -> 0x0088 }
                        r5 = 4
                        if (r7 == 0) goto L_0x0083
                        r7.close()     // Catch:{ IOException -> 0x007f }
                        goto L_0x0083
                    L_0x007f:
                        r7 = move-exception
                        r6.reportException(r7)
                    L_0x0083:
                        r5 = 6
                        return
                    L_0x0085:
                        r8 = move-exception
                        r5 = 1
                        goto L_0x009a
                    L_0x0088:
                        r8 = move-exception
                    L_0x0089:
                        r6.reportException(r8)     // Catch:{ all -> 0x0085 }
                        r5 = 6
                        if (r7 == 0) goto L_0x0099
                        r5 = 6
                        r7.close()     // Catch:{ IOException -> 0x0095 }
                        r5 = 5
                        goto L_0x0099
                    L_0x0095:
                        r7 = move-exception
                        r6.reportException(r7)
                    L_0x0099:
                        return
                    L_0x009a:
                        if (r7 == 0) goto L_0x00a6
                        r5 = 3
                        r7.close()     // Catch:{ IOException -> 0x00a1 }
                        goto L_0x00a6
                    L_0x00a1:
                        r7 = move-exception
                        r5 = 3
                        r6.reportException(r7)
                    L_0x00a6:
                        goto L_0x00a8
                    L_0x00a7:
                        throw r8
                    L_0x00a8:
                        goto L_0x00a7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.core.internal.HttpConnectionImpl.AnonymousClass1.onResponse(wzp, xal):void");
                }
            });
        } catch (IllegalArgumentException e) {
            Object[] objArr2 = {httpRequest.getMethod(), httpRequest.getUrl()};
            String str2 = "er   ebo csyq )ir.%Essettnrwoa%rru r (tenhtg";
            Logger.d(e, "Error when trying to create request %s (%s).", objArr2);
            httpConnection.onError(HttpConnection.kErrorHttpInvalidUrl);
        }
    }
}
