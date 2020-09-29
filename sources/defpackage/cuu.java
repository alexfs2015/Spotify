package defpackage;

import android.webkit.WebView;

@cey
/* renamed from: cuu reason: default package */
final class cuu {
    private static Boolean a;

    private cuu() {
    }

    static void a(WebView webView, String str) {
        if (!bzo.e() || !a(webView)) {
            String str2 = "javascript:";
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        webView.evaluateJavascript(str, null);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.webkit.WebView r3) {
        /*
            java.lang.Class<cuu> r0 = defpackage.cuu.class
            monitor-enter(r0)
            java.lang.Boolean r1 = a     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = "(function(){})()"
            r2 = 0
            r3.evaluateJavascript(r1, r2)     // Catch:{ IllegalStateException -> 0x0012 }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x0012 }
            a = r3     // Catch:{ IllegalStateException -> 0x0012 }
            goto L_0x0016
        L_0x0012:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x001e }
            a = r3     // Catch:{ all -> 0x001e }
        L_0x0016:
            java.lang.Boolean r3 = a     // Catch:{ all -> 0x001e }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return r3
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuu.a(android.webkit.WebView):boolean");
    }
}
