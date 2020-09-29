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

@cfp
/* renamed from: biy reason: default package */
public final class biy {
    public static View a(clq clq) {
        if (clq == null) {
            cml.a("AdState is null");
            return null;
        } else if (b(clq) && clq.b != null) {
            return clq.b.o();
        } else {
            try {
                cbi a = clq.p != null ? clq.p.a() : null;
                if (a != null) {
                    return (View) cbj.a(a);
                }
                cpn.a(5);
                return null;
            } catch (RemoteException unused) {
                cpn.a(5);
                return null;
            }
        }
    }

    static bhc<cti> a(eds eds, edw edw, bii bii) {
        return new bjd(eds, bii, edw);
    }

    static dvr a(Object obj) {
        if (obj instanceof IBinder) {
            return dvs.a((IBinder) obj);
        }
        return null;
    }

    private static String a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            cpn.a(5);
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        String str = "data:image/png;base64,";
        String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    static String a(dvr dvr) {
        if (dvr == null) {
            cpn.a(5);
            return "";
        }
        try {
            Uri b = dvr.b();
            if (b != null) {
                return b.toString();
            }
        } catch (RemoteException unused) {
            cpn.a(5);
        }
        return b(dvr);
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
                            cpn.a(5);
                        }
                    } else if (bundle.get(str2) instanceof Bitmap) {
                        cpn.a(5);
                    } else {
                        jSONObject.put(str2, String.valueOf(bundle.get(str2)));
                    }
                }
            }
        }
        return jSONObject;
    }

    static /* synthetic */ void a(cti cti) {
        OnClickListener K = cti.K();
        if (K != null) {
            K.onClick(cti.o());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.cti r26, defpackage.ecx r27, java.util.concurrent.CountDownLatch r28) {
        /*
            r0 = r26
            r1 = r27
            r7 = r28
            r8 = 5
            r9 = 0
            android.view.View r2 = r26.o()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r3 = 4
            r2.setVisibility(r3)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            ecp r2 = r1.b     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.util.List<java.lang.String> r2 = r2.r     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            if (r2 == 0) goto L_0x011b
            boolean r3 = r2.isEmpty()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            if (r3 == 0) goto L_0x001e
            goto L_0x011b
        L_0x001e:
            java.lang.String r3 = "/nativeExpressAssetsLoaded"
            bjb r4 = new bjb     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r0.a(r3, r4)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r3 = "/nativeExpressAssetsLoadingFailed"
            bjc r4 = new bjc     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r0.a(r3, r4)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            edj r3 = r1.c     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            eds r3 = r3.h()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            edj r4 = r1.c     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            edw r4 = r4.i()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r5 = "2"
            boolean r5 = r2.contains(r5)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r6 = 0
            if (r5 == 0) goto L_0x00a1
            if (r3 == 0) goto L_0x00a1
            dui r2 = new dui     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r11 = r3.a()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.util.List r12 = r3.b()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r13 = r3.c()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            dvr r14 = r3.d()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r15 = r3.e()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            double r16 = r3.f()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r18 = r3.g()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r19 = r3.h()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r20 = 0
            android.os.Bundle r21 = r3.l()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r22 = 0
            cbi r4 = r3.p()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            if (r4 == 0) goto L_0x0084
            cbi r4 = r3.p()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.Object r4 = defpackage.cbj.a(r4)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r6 = r4
            android.view.View r6 = (android.view.View) r6     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
        L_0x0084:
            r23 = r6
            cbi r24 = r3.q()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r25 = 0
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            ecp r3 = r1.b     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r3 = r3.q     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            cup r4 = r26.x()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            biz r5 = new biz     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r5.<init>(r2, r3, r0)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
        L_0x009d:
            r4.a(r5)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            goto L_0x00f8
        L_0x00a1:
            java.lang.String r3 = "1"
            boolean r2 = r2.contains(r3)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            if (r2 == 0) goto L_0x0117
            if (r4 == 0) goto L_0x0117
            duk r2 = new duk     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r11 = r4.a()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.util.List r12 = r4.b()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r13 = r4.c()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            dvr r14 = r4.d()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r15 = r4.e()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r16 = r4.f()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r17 = 0
            android.os.Bundle r18 = r4.j()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r19 = 0
            cbi r3 = r4.n()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            if (r3 == 0) goto L_0x00de
            cbi r3 = r4.n()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.Object r3 = defpackage.cbj.a(r3)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r6 = r3
            android.view.View r6 = (android.view.View) r6     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
        L_0x00de:
            r20 = r6
            cbi r21 = r4.o()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r22 = 0
            r10 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            ecp r3 = r1.b     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r3 = r3.q     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            cup r4 = r26.x()     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            bja r5 = new bja     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            r5.<init>(r2, r3, r0)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            goto L_0x009d
        L_0x00f8:
            ecp r2 = r1.b     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            java.lang.String r3 = r2.o     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            ecp r1 = r1.b     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
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
            defpackage.cpn.a(r8)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            goto L_0x0127
        L_0x011b:
            defpackage.cpn.a(r8)     // Catch:{ RemoteException -> 0x0124, RuntimeException -> 0x011f }
            goto L_0x0127
        L_0x011f:
            r0 = move-exception
            r28.countDown()
            throw r0
        L_0x0124:
            defpackage.cpn.a(r8)
        L_0x0127:
            if (r9 != 0) goto L_0x012c
            r28.countDown()
        L_0x012c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.biy.a(cti, ecx, java.util.concurrent.CountDownLatch):boolean");
    }

    private static String b(dvr dvr) {
        String str = "";
        try {
            cbi a = dvr.a();
            if (a == null) {
                cpn.a(5);
                return str;
            }
            Drawable drawable = (Drawable) cbj.a(a);
            if (drawable instanceof BitmapDrawable) {
                return a(((BitmapDrawable) drawable).getBitmap());
            }
            cpn.a(5);
            return str;
        } catch (RemoteException unused) {
            cpn.a(5);
            return str;
        }
    }

    public static boolean b(clq clq) {
        return (clq == null || !clq.n || clq.o == null || clq.o.o == null) ? false : true;
    }
}
