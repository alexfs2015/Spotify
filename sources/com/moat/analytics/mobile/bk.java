package com.moat.analytics.mobile;

import android.content.Context;
import android.util.Pair;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.moat.analytics.mobile.base.functional.a;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

class bk implements bi {
    private static final AtomicReference<a<bo<WebViewClient>>> a = new AtomicReference<>();

    bk(Context context) {
        if (a.get() == null) {
            WebView webView = new WebView(context);
            WebViewClient webViewClient = new WebViewClient();
            webView.setWebViewClient(webViewClient);
            a.compareAndSet(null, a.b(a(webView, webViewClient)));
        }
    }

    private bo<WebViewClient> a(WebView webView, WebViewClient webViewClient) {
        HashSet hashSet = new HashSet();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new bm(this, new Field[0], webView));
        int i = 0;
        while (!linkedList.isEmpty() && i < 250) {
            i++;
            bm bmVar = (bm) linkedList.poll();
            if (!hashSet.contains(bmVar)) {
                hashSet.add(bmVar);
                Map a2 = a(bmVar.b);
                boolean z = false;
                for (Field field : a2.keySet()) {
                    if (i >= 250) {
                        continue;
                        break;
                    }
                    if (z) {
                        i++;
                    }
                    Object obj = a2.get(field);
                    bm bmVar2 = new bm(this, bmVar.a, field, obj);
                    if (obj == webViewClient && WebViewClient.class.isAssignableFrom(field.getType())) {
                        return new bo<>(this, WebViewClient.class, bmVar2.a);
                    }
                    if (obj != null && !(obj instanceof bn) && bmVar2.a.length < 5) {
                        linkedList.add(bmVar2);
                    }
                    z = true;
                }
                continue;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r3 = new com.moat.analytics.mobile.bn(r2, r4, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r4.setAccessible(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        throw r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.Object r3, java.lang.reflect.Field r4) {
        /*
            r2 = this;
            boolean r0 = r4.isAccessible()
            r1 = 1
            r4.setAccessible(r1)     // Catch:{ IllegalAccessException -> 0x0012 }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x0012 }
        L_0x000c:
            r4.setAccessible(r0)
            goto L_0x0019
        L_0x0010:
            r3 = move-exception
            goto L_0x001a
        L_0x0012:
            com.moat.analytics.mobile.bn r3 = new com.moat.analytics.mobile.bn     // Catch:{ all -> 0x0010 }
            r1 = 0
            r3.<init>(r2, r4)     // Catch:{ all -> 0x0010 }
            goto L_0x000c
        L_0x0019:
            return r3
        L_0x001a:
            r4.setAccessible(r0)
            goto L_0x001f
        L_0x001e:
            throw r3
        L_0x001f:
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moat.analytics.mobile.bk.a(java.lang.Object, java.lang.reflect.Field):java.lang.Object");
    }

    private Map<Field, Object> a(Object obj) {
        Field[] declaredFields;
        HashSet hashSet = new HashSet();
        for (Field field : obj.getClass().getDeclaredFields()) {
            Class type = field.getType();
            if (!type.isPrimitive()) {
                Package packageR = type.getPackage();
                String name = packageR != null ? packageR.getName() : "";
                if (name == null || !name.equals("java.lang")) {
                    hashSet.add(field);
                }
            }
        }
        return a(obj, (Set<Field>) hashSet);
    }

    private Map<Field, Object> a(Object obj, Set<Field> set) {
        HashMap hashMap = new HashMap();
        for (Field field : set) {
            hashMap.put(field, a(obj, field));
        }
        return hashMap;
    }

    public Pair<bj, a<WebViewClient>> a(WebView webView) {
        a aVar = (a) a.get();
        if (!aVar.c()) {
            return new Pair<>(bj.FAIL, a.a());
        }
        Object a2 = ((bo) aVar.b()).a(webView);
        return (a2 == null || (a2 instanceof WebViewClient)) ? new Pair<>(bj.OKAY, a.a((WebViewClient) a2)) : new Pair<>(bj.FAIL, a.a());
    }
}
