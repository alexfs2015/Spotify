package defpackage;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: agx reason: default package */
final class agx implements ahl {
    private final vuz a;
    private final vxb b;
    private final Context c;
    private final ahi d;
    private final ScheduledExecutorService e;
    private final AtomicReference<ScheduledFuture<?>> f = new AtomicReference<>();
    private ahm g;
    private final aha h;
    private vwv i;
    private vvo j = new vvo();
    private agy k = new ahd();
    private boolean l = true;
    private boolean m = true;
    private volatile int n = -1;
    private boolean o = false;
    private boolean p = false;

    public agx(vuz vuz, Context context, ScheduledExecutorService scheduledExecutorService, ahi ahi, vxb vxb, ahm ahm, aha aha) {
        this.a = vuz;
        this.c = context;
        this.e = scheduledExecutorService;
        this.d = ahi;
        this.b = vxb;
        this.g = ahm;
        this.h = aha;
    }

    public final void a(vxk vxk, String str) {
        ahj ahj = new ahj(this.a, str, vxk.a, this.b, this.j.a(this.c));
        this.i = new agt(ahj, new ahg(new vwp(new ahf(new vwn(1000, 8), 0.1d), new vwm(5))));
        this.d.a = vxk;
        this.o = vxk.e;
        this.p = vxk.f;
        vvc a2 = vuu.a();
        StringBuilder sb = new StringBuilder("Firebase analytics forwarding ");
        String str2 = "enabled";
        String str3 = "disabled";
        sb.append(this.o ? str2 : str3);
        String str4 = "Answers";
        a2.a(str4, sb.toString());
        vvc a3 = vuu.a();
        StringBuilder sb2 = new StringBuilder("Firebase analytics including purchase events ");
        sb2.append(this.p ? str2 : str3);
        a3.a(str4, sb2.toString());
        this.l = vxk.g;
        vvc a4 = vuu.a();
        StringBuilder sb3 = new StringBuilder("Custom event tracking ");
        sb3.append(this.l ? str2 : str3);
        a4.a(str4, sb3.toString());
        this.m = vxk.h;
        vvc a5 = vuu.a();
        StringBuilder sb4 = new StringBuilder("Predefined event tracking ");
        if (!this.m) {
            str2 = str3;
        }
        sb4.append(str2);
        a5.a(str4, sb4.toString());
        if (vxk.j > 1) {
            vuu.a().a(str4, "Event sampling enabled");
            this.k = new ahh(vxk.j);
        }
        this.n = vxk.b;
        a(0, (long) this.n);
    }

    /* JADX INFO: used method not loaded: ahc.a(java.lang.String):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0490, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0491, code lost:
        switch(r0) {
            case 0: goto L_0x04b5;
            case 1: goto L_0x04b2;
            case 2: goto L_0x04af;
            case 3: goto L_0x04ac;
            case 4: goto L_0x04be;
            case 5: goto L_0x04a9;
            case 6: goto L_0x04a6;
            case 7: goto L_0x04a3;
            case 8: goto L_0x04a1;
            case 9: goto L_0x049f;
            case 10: goto L_0x049c;
            case 11: goto L_0x0499;
            default: goto L_0x0494;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0494, code lost:
        r8 = defpackage.ahc.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0499, code lost:
        r8 = "level_end";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x049c, code lost:
        r8 = "level_start";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x049f, code lost:
        r8 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04a1, code lost:
        r8 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04a3, code lost:
        r8 = "sign_up";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04a6, code lost:
        r8 = "rate_content";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04a9, code lost:
        r8 = "share";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04ac, code lost:
        r8 = "select_content";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x04af, code lost:
        r8 = "begin_checkout";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x04b2, code lost:
        r8 = "add_to_cart";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04b5, code lost:
        r8 = "ecommerce_purchase";
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0401 A[Catch:{ Exception -> 0x04ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0410 A[Catch:{ Exception -> 0x04ff }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.crashlytics.android.answers.SessionEvent.a r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            ahm r3 = r1.g
            com.crashlytics.android.answers.SessionEvent r13 = new com.crashlytics.android.answers.SessionEvent
            long r4 = r0.b
            com.crashlytics.android.answers.SessionEvent$Type r6 = r0.a
            java.util.Map<java.lang.String, java.lang.String> r7 = r0.c
            java.util.Map<java.lang.String, java.lang.Object> r9 = r0.d
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r1.l
            java.lang.String r2 = "Answers"
            if (r0 != 0) goto L_0x003e
            com.crashlytics.android.answers.SessionEvent$Type r0 = com.crashlytics.android.answers.SessionEvent.Type.CUSTOM
            com.crashlytics.android.answers.SessionEvent$Type r3 = r13.c
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x003e
            vvc r0 = defpackage.vuu.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Custom events tracking disabled - skipping event: "
            r3.<init>(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            r0.a(r2, r3)
            return
        L_0x003e:
            boolean r0 = r1.m
            if (r0 != 0) goto L_0x0062
            com.crashlytics.android.answers.SessionEvent$Type r0 = com.crashlytics.android.answers.SessionEvent.Type.PREDEFINED
            com.crashlytics.android.answers.SessionEvent$Type r3 = r13.c
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0062
            vvc r0 = defpackage.vuu.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Predefined events tracking disabled - skipping event: "
            r3.<init>(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            r0.a(r2, r3)
            return
        L_0x0062:
            agy r0 = r1.k
            boolean r0 = r0.a(r13)
            if (r0 == 0) goto L_0x0080
            vvc r0 = defpackage.vuu.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Skipping filtered event: "
            r3.<init>(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            r0.a(r2, r3)
            return
        L_0x0080:
            ahi r0 = r1.d     // Catch:{ IOException -> 0x0086 }
            r0.a(r13)     // Catch:{ IOException -> 0x0086 }
            goto L_0x009c
        L_0x0086:
            r0 = move-exception
            vvc r3 = defpackage.vuu.a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to write event: "
            r4.<init>(r5)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            r3.c(r2, r4, r0)
        L_0x009c:
            int r0 = r1.n
            r3 = -1
            if (r0 == r3) goto L_0x00a3
            r0 = 1
            goto L_0x00a4
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            if (r0 == 0) goto L_0x00af
            int r0 = r1.n
            long r6 = (long) r0
            int r0 = r1.n
            long r8 = (long) r0
            r1.a(r6, r8)
        L_0x00af:
            com.crashlytics.android.answers.SessionEvent$Type r0 = com.crashlytics.android.answers.SessionEvent.Type.CUSTOM
            com.crashlytics.android.answers.SessionEvent$Type r6 = r13.c
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00c6
            com.crashlytics.android.answers.SessionEvent$Type r0 = com.crashlytics.android.answers.SessionEvent.Type.PREDEFINED
            com.crashlytics.android.answers.SessionEvent$Type r6 = r13.c
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            r0 = 0
            goto L_0x00c7
        L_0x00c6:
            r0 = 1
        L_0x00c7:
            java.lang.String r6 = r13.g
            java.lang.String r7 = "purchase"
            boolean r6 = r7.equals(r6)
            boolean r8 = r1.o
            if (r8 == 0) goto L_0x0519
            if (r0 != 0) goto L_0x00d7
            goto L_0x0519
        L_0x00d7:
            if (r6 == 0) goto L_0x00de
            boolean r0 = r1.p
            if (r0 != 0) goto L_0x00de
            return
        L_0x00de:
            aha r0 = r1.h     // Catch:{ Exception -> 0x0503 }
            agz r6 = r0.c     // Catch:{ Exception -> 0x0503 }
            if (r6 != 0) goto L_0x00ec
            android.content.Context r6 = r0.a     // Catch:{ Exception -> 0x0503 }
            agz r6 = defpackage.agu.a(r6)     // Catch:{ Exception -> 0x0503 }
            r0.c = r6     // Catch:{ Exception -> 0x0503 }
        L_0x00ec:
            agz r6 = r0.c     // Catch:{ Exception -> 0x0503 }
            if (r6 != 0) goto L_0x00fb
            vvc r0 = defpackage.vuu.a()     // Catch:{ Exception -> 0x0503 }
            java.lang.String r3 = "Firebase analytics logging was enabled, but not available..."
            r0.a(r2, r3)     // Catch:{ Exception -> 0x0503 }
            goto L_0x0519
        L_0x00fb:
            ahc r0 = r0.b     // Catch:{ Exception -> 0x0503 }
            com.crashlytics.android.answers.SessionEvent$Type r8 = com.crashlytics.android.answers.SessionEvent.Type.CUSTOM     // Catch:{ Exception -> 0x0503 }
            com.crashlytics.android.answers.SessionEvent$Type r9 = r13.c     // Catch:{ Exception -> 0x0503 }
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x0503 }
            if (r8 == 0) goto L_0x010d
            java.lang.String r8 = r13.e     // Catch:{ Exception -> 0x0503 }
            if (r8 == 0) goto L_0x010d
            r8 = 1
            goto L_0x010e
        L_0x010d:
            r8 = 0
        L_0x010e:
            com.crashlytics.android.answers.SessionEvent$Type r9 = com.crashlytics.android.answers.SessionEvent.Type.PREDEFINED     // Catch:{ Exception -> 0x0503 }
            com.crashlytics.android.answers.SessionEvent$Type r10 = r13.c     // Catch:{ Exception -> 0x0503 }
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x0503 }
            if (r9 == 0) goto L_0x011e
            java.lang.String r9 = r13.g     // Catch:{ Exception -> 0x0503 }
            if (r9 == 0) goto L_0x011e
            r9 = 1
            goto L_0x011f
        L_0x011e:
            r9 = 0
        L_0x011f:
            java.lang.String r10 = "levelEnd"
            if (r8 != 0) goto L_0x012a
            if (r9 != 0) goto L_0x012a
            r0 = 0
            r16 = r6
            goto L_0x04ce
        L_0x012a:
            java.lang.String r8 = "search"
            java.lang.String r11 = "invite"
            java.lang.String r12 = "success"
            java.lang.String r14 = "login"
            java.lang.String r15 = "rating"
            if (r9 == 0) goto L_0x03a5
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ Exception -> 0x0503 }
            r3.<init>()     // Catch:{ Exception -> 0x0503 }
            java.lang.String r4 = r13.g     // Catch:{ Exception -> 0x0503 }
            boolean r4 = r7.equals(r4)     // Catch:{ Exception -> 0x0503 }
            java.lang.String r5 = "item_name"
            java.lang.String r1 = "item_id"
            r16 = r6
            java.lang.String r6 = "currency"
            if (r4 == 0) goto L_0x0194
            java.util.Map<java.lang.String, java.lang.Object> r4 = r13.h     // Catch:{ Exception -> 0x0503 }
            r17 = r2
            java.lang.String r2 = "itemId"
            java.lang.Object r2 = r4.get(r2)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = "itemName"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r5, r1)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = "item_category"
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "itemType"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = "value"
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "itemPrice"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.Double r2 = defpackage.ahc.b(r2)     // Catch:{ Exception -> 0x04ff }
            r0.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r6, r1)     // Catch:{ Exception -> 0x04ff }
            goto L_0x039f
        L_0x0194:
            r17 = r2
            java.lang.String r2 = "addToCart"
            java.lang.String r4 = r13.g     // Catch:{ Exception -> 0x04ff }
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x04ff }
            if (r2 == 0) goto L_0x01ff
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "itemId"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = "itemName"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r5, r1)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = "item_category"
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "itemType"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = "price"
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "itemPrice"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.Double r2 = defpackage.ahc.b(r2)     // Catch:{ Exception -> 0x04ff }
            r0.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = "value"
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "itemPrice"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.Double r2 = defpackage.ahc.b(r2)     // Catch:{ Exception -> 0x04ff }
            r0.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r6, r1)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = "quantity"
            r4 = 1
            r3.putLong(r1, r4)     // Catch:{ Exception -> 0x04ff }
            goto L_0x039f
        L_0x01ff:
            java.lang.String r2 = "startCheckout"
            java.lang.String r4 = r13.g     // Catch:{ Exception -> 0x04ff }
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x04ff }
            if (r2 == 0) goto L_0x023f
            java.lang.String r1 = "quantity"
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "itemCount"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x04ff }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x04ff }
            long r4 = (long) r2     // Catch:{ Exception -> 0x04ff }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = "value"
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "totalPrice"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.Double r2 = defpackage.ahc.b(r2)     // Catch:{ Exception -> 0x04ff }
            r0.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r6, r1)     // Catch:{ Exception -> 0x04ff }
            goto L_0x039f
        L_0x023f:
            java.lang.String r2 = "contentView"
            java.lang.String r4 = r13.g     // Catch:{ Exception -> 0x04ff }
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x04ff }
            if (r2 == 0) goto L_0x0274
            java.lang.String r2 = "content_type"
            java.util.Map<java.lang.String, java.lang.Object> r4 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r6 = "contentType"
            java.lang.Object r4 = r4.get(r6)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r2, r4)     // Catch:{ Exception -> 0x04ff }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "contentId"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = "contentName"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r5, r1)     // Catch:{ Exception -> 0x04ff }
            goto L_0x039f
        L_0x0274:
            java.lang.String r2 = r13.g     // Catch:{ Exception -> 0x04ff }
            boolean r2 = r8.equals(r2)     // Catch:{ Exception -> 0x04ff }
            if (r2 == 0) goto L_0x028d
            java.lang.String r1 = "search_term"
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "query"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            goto L_0x039f
        L_0x028d:
            java.lang.String r2 = "share"
            java.lang.String r4 = r13.g     // Catch:{ Exception -> 0x04ff }
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "method"
            if (r2 == 0) goto L_0x02cf
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r4, r2)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = "content_type"
            java.util.Map<java.lang.String, java.lang.Object> r4 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r6 = "contentType"
            java.lang.Object r4 = r4.get(r6)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r2, r4)     // Catch:{ Exception -> 0x04ff }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "contentId"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = "contentName"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r5, r1)     // Catch:{ Exception -> 0x04ff }
            goto L_0x039f
        L_0x02cf:
            java.lang.String r2 = r13.g     // Catch:{ Exception -> 0x04ff }
            boolean r2 = r15.equals(r2)     // Catch:{ Exception -> 0x04ff }
            if (r2 == 0) goto L_0x030f
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.Object r2 = r2.get(r15)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r15, r2)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = "content_type"
            java.util.Map<java.lang.String, java.lang.Object> r4 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r6 = "contentType"
            java.lang.Object r4 = r4.get(r6)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r2, r4)     // Catch:{ Exception -> 0x04ff }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "contentId"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = "contentName"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r5, r1)     // Catch:{ Exception -> 0x04ff }
            goto L_0x039f
        L_0x030f:
            java.lang.String r1 = "signUp"
            java.lang.String r2 = r13.g     // Catch:{ Exception -> 0x04ff }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x04ff }
            if (r1 == 0) goto L_0x0326
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r4, r1)     // Catch:{ Exception -> 0x04ff }
            goto L_0x039f
        L_0x0326:
            java.lang.String r1 = r13.g     // Catch:{ Exception -> 0x04ff }
            boolean r1 = r14.equals(r1)     // Catch:{ Exception -> 0x04ff }
            if (r1 == 0) goto L_0x033a
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r4, r1)     // Catch:{ Exception -> 0x04ff }
            goto L_0x039f
        L_0x033a:
            java.lang.String r1 = r13.g     // Catch:{ Exception -> 0x04ff }
            boolean r1 = r11.equals(r1)     // Catch:{ Exception -> 0x04ff }
            if (r1 == 0) goto L_0x034e
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r4, r1)     // Catch:{ Exception -> 0x04ff }
            goto L_0x039f
        L_0x034e:
            java.lang.String r1 = "levelStart"
            java.lang.String r2 = r13.g     // Catch:{ Exception -> 0x04ff }
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x04ff }
            if (r1 == 0) goto L_0x0368
            java.lang.String r1 = "level_name"
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "levelName"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            goto L_0x039f
        L_0x0368:
            java.lang.String r1 = r13.g     // Catch:{ Exception -> 0x04ff }
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x04ff }
            if (r1 == 0) goto L_0x039f
            java.lang.String r1 = "score"
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "score"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.Double r2 = defpackage.ahc.a(r2)     // Catch:{ Exception -> 0x04ff }
            r0.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = "level_name"
            java.util.Map<java.lang.String, java.lang.Object> r2 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.String r4 = "levelName"
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r1, r2)     // Catch:{ Exception -> 0x04ff }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.Object r1 = r1.get(r12)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x04ff }
            java.lang.Integer r1 = defpackage.ahc.b(r1)     // Catch:{ Exception -> 0x04ff }
            defpackage.ahc.a(r3, r12, r1)     // Catch:{ Exception -> 0x04ff }
        L_0x039f:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.f     // Catch:{ Exception -> 0x04ff }
            r0.a(r3, r1)     // Catch:{ Exception -> 0x04ff }
            goto L_0x03b7
        L_0x03a5:
            r17 = r2
            r16 = r6
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ Exception -> 0x04ff }
            r3.<init>()     // Catch:{ Exception -> 0x04ff }
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.f     // Catch:{ Exception -> 0x04ff }
            if (r1 == 0) goto L_0x03b7
            java.util.Map<java.lang.String, java.lang.Object> r1 = r13.f     // Catch:{ Exception -> 0x04ff }
            r0.a(r3, r1)     // Catch:{ Exception -> 0x04ff }
        L_0x03b7:
            if (r9 == 0) goto L_0x04b8
            java.util.Map<java.lang.String, java.lang.Object> r0 = r13.h     // Catch:{ Exception -> 0x04ff }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x03cb
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ Exception -> 0x04ff }
            if (r0 != 0) goto L_0x03cb
            r0 = 1
            goto L_0x03cc
        L_0x03cb:
            r0 = 0
        L_0x03cc:
            java.lang.String r1 = r13.g     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x0414
            int r0 = r1.hashCode()     // Catch:{ Exception -> 0x04ff }
            r2 = -902468296(0xffffffffca356d38, float:-2972494.0)
            if (r0 == r2) goto L_0x03f4
            r2 = 103149417(0x625ef69, float:3.1208942E-35)
            if (r0 == r2) goto L_0x03ec
            r2 = 1743324417(0x67e90501, float:2.2008074E24)
            if (r0 == r2) goto L_0x03e4
            goto L_0x03fe
        L_0x03e4:
            boolean r0 = r1.equals(r7)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x03fe
            r0 = 0
            goto L_0x03ff
        L_0x03ec:
            boolean r0 = r1.equals(r14)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x03fe
            r0 = 2
            goto L_0x03ff
        L_0x03f4:
            java.lang.String r0 = "signUp"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x03fe
            r0 = 1
            goto L_0x03ff
        L_0x03fe:
            r0 = -1
        L_0x03ff:
            if (r0 == 0) goto L_0x0410
            r2 = 1
            if (r0 == r2) goto L_0x040c
            r4 = 2
            if (r0 == r4) goto L_0x0408
            goto L_0x0415
        L_0x0408:
            java.lang.String r8 = "failed_login"
            goto L_0x04be
        L_0x040c:
            java.lang.String r8 = "failed_sign_up"
            goto L_0x04be
        L_0x0410:
            java.lang.String r8 = "failed_ecommerce_purchase"
            goto L_0x04be
        L_0x0414:
            r2 = 1
        L_0x0415:
            int r0 = r1.hashCode()     // Catch:{ Exception -> 0x04ff }
            switch(r0) {
                case -2131650889: goto L_0x0487;
                case -1183699191: goto L_0x047e;
                case -938102371: goto L_0x0476;
                case -906336856: goto L_0x046e;
                case -902468296: goto L_0x0464;
                case -389087554: goto L_0x045a;
                case 23457852: goto L_0x0450;
                case 103149417: goto L_0x0447;
                case 109400031: goto L_0x043d;
                case 196004670: goto L_0x0432;
                case 1664021448: goto L_0x0427;
                case 1743324417: goto L_0x041e;
                default: goto L_0x041c;
            }     // Catch:{ Exception -> 0x04ff }
        L_0x041c:
            goto L_0x0490
        L_0x041e:
            boolean r0 = r1.equals(r7)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x0490
            r0 = 0
            goto L_0x0491
        L_0x0427:
            java.lang.String r0 = "startCheckout"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x0490
            r0 = 2
            goto L_0x0491
        L_0x0432:
            java.lang.String r0 = "levelStart"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x0490
            r0 = 10
            goto L_0x0491
        L_0x043d:
            java.lang.String r0 = "share"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x0490
            r0 = 5
            goto L_0x0491
        L_0x0447:
            boolean r0 = r1.equals(r14)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x0490
            r0 = 8
            goto L_0x0491
        L_0x0450:
            java.lang.String r0 = "addToCart"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x0490
            r0 = 1
            goto L_0x0491
        L_0x045a:
            java.lang.String r0 = "contentView"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x0490
            r0 = 3
            goto L_0x0491
        L_0x0464:
            java.lang.String r0 = "signUp"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x0490
            r0 = 7
            goto L_0x0491
        L_0x046e:
            boolean r0 = r1.equals(r8)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x0490
            r0 = 4
            goto L_0x0491
        L_0x0476:
            boolean r0 = r1.equals(r15)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x0490
            r0 = 6
            goto L_0x0491
        L_0x047e:
            boolean r0 = r1.equals(r11)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x0490
            r0 = 9
            goto L_0x0491
        L_0x0487:
            boolean r0 = r1.equals(r10)     // Catch:{ Exception -> 0x04ff }
            if (r0 == 0) goto L_0x0490
            r0 = 11
            goto L_0x0491
        L_0x0490:
            r0 = -1
        L_0x0491:
            switch(r0) {
                case 0: goto L_0x04b5;
                case 1: goto L_0x04b2;
                case 2: goto L_0x04af;
                case 3: goto L_0x04ac;
                case 4: goto L_0x04be;
                case 5: goto L_0x04a9;
                case 6: goto L_0x04a6;
                case 7: goto L_0x04a3;
                case 8: goto L_0x04a1;
                case 9: goto L_0x049f;
                case 10: goto L_0x049c;
                case 11: goto L_0x0499;
                default: goto L_0x0494;
            }     // Catch:{ Exception -> 0x04ff }
        L_0x0494:
            java.lang.String r8 = defpackage.ahc.a(r1)     // Catch:{ Exception -> 0x04ff }
            goto L_0x04be
        L_0x0499:
            java.lang.String r8 = "level_end"
            goto L_0x04be
        L_0x049c:
            java.lang.String r8 = "level_start"
            goto L_0x04be
        L_0x049f:
            r8 = r11
            goto L_0x04be
        L_0x04a1:
            r8 = r14
            goto L_0x04be
        L_0x04a3:
            java.lang.String r8 = "sign_up"
            goto L_0x04be
        L_0x04a6:
            java.lang.String r8 = "rate_content"
            goto L_0x04be
        L_0x04a9:
            java.lang.String r8 = "share"
            goto L_0x04be
        L_0x04ac:
            java.lang.String r8 = "select_content"
            goto L_0x04be
        L_0x04af:
            java.lang.String r8 = "begin_checkout"
            goto L_0x04be
        L_0x04b2:
            java.lang.String r8 = "add_to_cart"
            goto L_0x04be
        L_0x04b5:
            java.lang.String r8 = "ecommerce_purchase"
            goto L_0x04be
        L_0x04b8:
            java.lang.String r0 = r13.e     // Catch:{ Exception -> 0x04ff }
            java.lang.String r8 = defpackage.ahc.a(r0)     // Catch:{ Exception -> 0x04ff }
        L_0x04be:
            vvc r0 = defpackage.vuu.a()     // Catch:{ Exception -> 0x04ff }
            java.lang.String r1 = "Logging event into firebase..."
            r2 = r17
            r0.a(r2, r1)     // Catch:{ Exception -> 0x0503 }
            ahb r0 = new ahb     // Catch:{ Exception -> 0x0503 }
            r0.<init>(r8, r3)     // Catch:{ Exception -> 0x0503 }
        L_0x04ce:
            if (r0 != 0) goto L_0x04e6
            vvc r0 = defpackage.vuu.a()     // Catch:{ Exception -> 0x0503 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0503 }
            java.lang.String r3 = "Fabric event was not mappable to Firebase event: "
            r1.<init>(r3)     // Catch:{ Exception -> 0x0503 }
            r1.append(r13)     // Catch:{ Exception -> 0x0503 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0503 }
            r0.a(r2, r1)     // Catch:{ Exception -> 0x0503 }
            goto L_0x0519
        L_0x04e6:
            java.lang.String r1 = r0.a     // Catch:{ Exception -> 0x0503 }
            android.os.Bundle r3 = r0.b     // Catch:{ Exception -> 0x0503 }
            r4 = r16
            r4.a(r1, r3)     // Catch:{ Exception -> 0x0503 }
            java.lang.String r1 = r13.g     // Catch:{ Exception -> 0x0503 }
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x0503 }
            if (r1 == 0) goto L_0x04fe
            java.lang.String r1 = "post_score"
            android.os.Bundle r0 = r0.b     // Catch:{ Exception -> 0x0503 }
            r4.a(r1, r0)     // Catch:{ Exception -> 0x0503 }
        L_0x04fe:
            return
        L_0x04ff:
            r0 = move-exception
            r2 = r17
            goto L_0x0504
        L_0x0503:
            r0 = move-exception
        L_0x0504:
            vvc r1 = defpackage.vuu.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to map event to Firebase: "
            r3.<init>(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            r1.c(r2, r3, r0)
        L_0x0519:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agx.a(com.crashlytics.android.answers.SessionEvent$a):void");
    }

    public final void a() {
        if (this.i == null) {
            CommonUtils.a(this.c, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        CommonUtils.a(this.c, "Sending all files");
        List e2 = this.d.e();
        int i2 = 0;
        while (e2.size() > 0) {
            try {
                CommonUtils.a(this.c, String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(e2.size())}));
                boolean a2 = this.i.a(e2);
                if (a2) {
                    i2 += e2.size();
                    this.d.a(e2);
                }
                if (!a2) {
                    break;
                }
                e2 = this.d.e();
            } catch (Exception e3) {
                Context context = this.c;
                StringBuilder sb = new StringBuilder("Failed to send batch of analytics files to server: ");
                sb.append(e3.getMessage());
                CommonUtils.b(context, sb.toString());
            }
        }
        if (i2 == 0) {
            this.d.g();
        }
    }

    public final void d() {
        if (this.f.get() != null) {
            CommonUtils.a(this.c, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture) this.f.get()).cancel(false);
            this.f.set(null);
        }
    }

    public final void b() {
        this.d.f();
    }

    public final boolean c() {
        try {
            return this.d.d();
        } catch (IOException unused) {
            CommonUtils.b(this.c, "Failed to roll file over.");
            return false;
        }
    }

    private void a(long j2, long j3) {
        if (this.f.get() == null) {
            vwy vwy = new vwy(this.c, this);
            Context context = this.c;
            StringBuilder sb = new StringBuilder("Scheduling time based file roll over every ");
            sb.append(j3);
            sb.append(" seconds");
            CommonUtils.a(context, sb.toString());
            try {
                this.f.set(this.e.scheduleAtFixedRate(vwy, j2, j3, TimeUnit.SECONDS));
            } catch (RejectedExecutionException unused) {
                CommonUtils.b(this.c, "Failed to schedule time based file roll over");
            }
        }
    }
}
