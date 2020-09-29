package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import org.json.JSONObject;

@cey
/* renamed from: bih reason: default package */
public final class bih {
    static bgl<csr> a(edb edb, edf edf, bhr bhr) {
        return new bim(edb, bhr, edf);
    }

    static dva a(Object obj) {
        if (obj instanceof IBinder) {
            return dvb.a((IBinder) obj);
        }
        return null;
    }

    public static boolean b(ckz ckz) {
        return (ckz == null || !ckz.n || ckz.o == null || ckz.o.o == null) ? false : true;
    }

    public static View a(ckz ckz) {
        if (ckz == null) {
            clu.a("AdState is null");
            return null;
        } else if (b(ckz) && ckz.b != null) {
            return ckz.b.o();
        } else {
            try {
                car a = ckz.p != null ? ckz.p.a() : null;
                if (a != null) {
                    return (View) cas.a(a);
                }
                cow.a(5);
                return null;
            } catch (RemoteException unused) {
                cow.a(5);
                return null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.csr r26, defpackage.ecg r27, java.util.concurrent.CountDownLatch r28) {
        /*
            r0 = r26
            r1 = r27
            r7 = r28
            r8 = 5
            r9 = 0
            android.view.View r2 = r26.o()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r3 = 4
            r2.setVisibility(r3)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            eby r2 = r1.b     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.util.List<java.lang.String> r2 = r2.r     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            if (r2 == 0) goto L_0x011b
            boolean r3 = r2.isEmpty()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            if (r3 == 0) goto L_0x001e
            goto L_0x011b
        L_0x001e:
            java.lang.String r3 = "/nativeExpressAssetsLoaded"
            bik r4 = new bik     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r0.a(r3, r4)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r3 = "/nativeExpressAssetsLoadingFailed"
            bil r4 = new bil     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r0.a(r3, r4)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            ecs r3 = r1.c     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            edb r3 = r3.h()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            ecs r4 = r1.c     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            edf r4 = r4.i()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r5 = "2"
            boolean r5 = r2.contains(r5)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r6 = 0
            if (r5 == 0) goto L_0x00a1
            if (r3 == 0) goto L_0x00a1
            dtr r2 = new dtr     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r11 = r3.a()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.util.List r12 = r3.b()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r13 = r3.c()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            dva r14 = r3.d()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r15 = r3.e()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            double r16 = r3.f()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r18 = r3.g()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r19 = r3.h()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r20 = 0
            android.os.Bundle r21 = r3.l()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r22 = 0
            car r4 = r3.p()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            if (r4 == 0) goto L_0x0084
            car r4 = r3.p()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.Object r4 = defpackage.cas.a(r4)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r6 = r4
            android.view.View r6 = (android.view.View) r6     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
        L_0x0084:
            r23 = r6
            car r24 = r3.q()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r25 = 0
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            eby r3 = r1.b     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r3 = r3.q     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            cty r4 = r26.x()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            bii r5 = new bii     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r5.<init>(r2, r3, r0)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
        L_0x009d:
            r4.a(r5)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            goto L_0x00f8
        L_0x00a1:
            java.lang.String r3 = "1"
            boolean r2 = r2.contains(r3)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            if (r2 == 0) goto L_0x0117
            if (r4 == 0) goto L_0x0117
            dtt r2 = new dtt     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r11 = r4.a()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.util.List r12 = r4.b()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r13 = r4.c()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            dva r14 = r4.d()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r15 = r4.e()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r16 = r4.f()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r17 = 0
            android.os.Bundle r18 = r4.j()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r19 = 0
            car r3 = r4.n()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            if (r3 == 0) goto L_0x00de
            car r3 = r4.n()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.Object r3 = defpackage.cas.a(r3)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r6 = r3
            android.view.View r6 = (android.view.View) r6     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
        L_0x00de:
            r20 = r6
            car r21 = r4.o()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r22 = 0
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            eby r3 = r1.b     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r3 = r3.q     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            cty r4 = r26.x()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            bij r5 = new bij     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r5.<init>(r2, r3, r0)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            goto L_0x009d
        L_0x00f8:
            eby r2 = r1.b     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r3 = r2.o     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            eby r1 = r1.b     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r2 = r1.p     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            if (r2 == 0) goto L_0x010d
            java.lang.String r4 = "text/html"
            java.lang.String r5 = "UTF-8"
            r6 = 0
            r1 = r26
            r1.loadDataWithBaseURL(r2, r3, r4, r5, r6)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            goto L_0x0114
        L_0x010d:
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "UTF-8"
            r0.loadData(r3, r1, r2)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
        L_0x0114:
            r0 = 1
            r9 = 1
            goto L_0x0127
        L_0x0117:
            defpackage.cow.a(r8)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            goto L_0x0127
        L_0x011b:
            defpackage.cow.a(r8)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            goto L_0x0127
        L_0x011f:
            r0 = move-exception
            r28.countDown()
            throw r0
        L_0x0124:
            defpackage.cow.a(r8)
        L_0x0127:
            if (r9 != 0) goto L_0x012c
            r28.countDown()
        L_0x012c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bih.a(csr, ecg, java.util.concurrent.CountDownLatch):boolean");
    }

    static JSONObject a(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        if (bundle != null && !TextUtils.isEmpty(str)) {
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                if (bundle.containsKey(str2)) {
                    if ("image".equals(jSONObject2.getString(str2))) {
                        Object obj = bundle.get(str2);
                        if (obj instanceof Bitmap) {
                            jSONObject.put(str2, a((Bitmap) obj));
                        } else {
                            cow.a(5);
                        }
                    } else if (bundle.get(str2) instanceof Bitmap) {
                        cow.a(5);
                    } else {
                        jSONObject.put(str2, String.valueOf(bundle.get(str2)));
                    }
                }
            }
        }
        return jSONObject;
    }

    static String a(dva dva) {
        if (dva == null) {
            cow.a(5);
            return "";
        }
        try {
            Uri b = dva.b();
            if (b != null) {
                return b.toString();
            }
        } catch (RemoteException unused) {
            cow.a(5);
        }
        return b(dva);
    }

    private static String b(dva dva) {
        String str = "";
        try {
            car a = dva.a();
            if (a == null) {
                cow.a(5);
                return str;
            }
            Drawable drawable = (Drawable) cas.a(a);
            if (drawable instanceof BitmapDrawable) {
                return a(((BitmapDrawable) drawable).getBitmap());
            }
            cow.a(5);
            return str;
        } catch (RemoteException unused) {
            cow.a(5);
            return str;
        }
    }

    private static String a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            cow.a(5);
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        String str = "data:image/png;base64,";
        String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    static /* synthetic */ void a(csr csr) {
        OnClickListener K = csr.K();
        if (K != null) {
            K.onClick(csr.o());
        }
    }
}
