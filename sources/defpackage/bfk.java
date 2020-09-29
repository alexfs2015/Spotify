package defpackage;

import java.util.Collections;
import java.util.Map;

@cey
/* renamed from: bfk reason: default package */
public final class bfk implements bgl<csr> {
    private static final Map<String, Integer> d;
    private final bkj a;
    private final cbv b;
    private final ccf c;

    public bfk(bkj bkj, cbv cbv, ccf ccf) {
        this.a = bkj;
        this.b = cbv;
        this.c = ccf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:232:0x04bb A[Catch:{ RuntimeException -> 0x04d8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zza(java.lang.Object r17, java.util.Map r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = r17
            csr r2 = (defpackage.csr) r2
            java.lang.String r3 = "a"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, java.lang.Integer> r4 = d
            java.lang.Object r3 = r4.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 7
            r5 = 5
            if (r3 == r5) goto L_0x0033
            if (r3 == r4) goto L_0x0033
            bkj r6 = r1.a
            if (r6 == 0) goto L_0x0033
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x0033
            bkj r0 = r1.a
            r2 = 0
            r0.a(r2)
            return
        L_0x0033:
            r6 = 3
            r7 = -1
            r8 = 4
            r9 = 1
            if (r3 == r9) goto L_0x020e
            r10 = 2131953490(0x7f130752, float:1.9543452E38)
            r11 = 2131953489(0x7f130751, float:1.954345E38)
            if (r3 == r6) goto L_0x012f
            if (r3 == r8) goto L_0x00b2
            if (r3 == r5) goto L_0x006c
            r0 = 6
            if (r3 == r0) goto L_0x0066
            if (r3 == r4) goto L_0x004e
            defpackage.cow.a(r8)
            goto L_0x0065
        L_0x004e:
            dsf<java.lang.Boolean> r0 = defpackage.dsp.M
            dsn r2 = defpackage.dpn.f()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0065
            ccf r0 = r1.c
            r0.L()
        L_0x0065:
            return
        L_0x0066:
            cbv r0 = r1.b
            r0.a(r9)
            return
        L_0x006c:
            cbx r3 = new cbx
            r3.<init>(r2, r0)
            csr r0 = r3.a
            if (r0 != 0) goto L_0x0079
            defpackage.cow.a(r5)
            return
        L_0x0079:
            java.lang.String r0 = r3.c
            java.lang.String r2 = "portrait"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x008c
            cmj r0 = defpackage.bjl.g()
            int r7 = r0.b()
            goto L_0x00ac
        L_0x008c:
            java.lang.String r0 = r3.c
            java.lang.String r2 = "landscape"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x009f
            cmj r0 = defpackage.bjl.g()
            int r7 = r0.a()
            goto L_0x00ac
        L_0x009f:
            boolean r0 = r3.b
            if (r0 == 0) goto L_0x00a4
            goto L_0x00ac
        L_0x00a4:
            cmj r0 = defpackage.bjl.g()
            int r7 = r0.c()
        L_0x00ac:
            csr r0 = r3.a
            r0.b(r7)
            return
        L_0x00b2:
            ees r3 = new ees
            r3.<init>(r2, r0)
            android.content.Context r0 = r3.a
            if (r0 != 0) goto L_0x00c1
            java.lang.String r0 = "Activity context is not available."
            r3.a(r0)
            return
        L_0x00c1:
            defpackage.bjl.e()
            android.content.Context r0 = r3.a
            dsa r0 = defpackage.cmd.e(r0)
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x00d6
            java.lang.String r0 = "This feature is not available on the device."
            r3.a(r0)
            return
        L_0x00d6:
            defpackage.bjl.e()
            android.content.Context r0 = r3.a
            android.app.AlertDialog$Builder r0 = defpackage.cmd.d(r0)
            cle r2 = defpackage.bjl.i()
            android.content.res.Resources r2 = r2.d()
            if (r2 == 0) goto L_0x00f1
            r4 = 2131953491(0x7f130753, float:1.9543454E38)
            java.lang.String r4 = r2.getString(r4)
            goto L_0x00f3
        L_0x00f1:
            java.lang.String r4 = "Create calendar event"
        L_0x00f3:
            r0.setTitle(r4)
            if (r2 == 0) goto L_0x0100
            r4 = 2131953492(0x7f130754, float:1.9543457E38)
            java.lang.String r4 = r2.getString(r4)
            goto L_0x0102
        L_0x0100:
            java.lang.String r4 = "Allow Ad to create a calendar event?"
        L_0x0102:
            r0.setMessage(r4)
            if (r2 == 0) goto L_0x010c
            java.lang.String r4 = r2.getString(r11)
            goto L_0x010e
        L_0x010c:
            java.lang.String r4 = "Accept"
        L_0x010e:
            eet r5 = new eet
            r5.<init>(r3)
            r0.setPositiveButton(r4, r5)
            if (r2 == 0) goto L_0x011d
            java.lang.String r2 = r2.getString(r10)
            goto L_0x011f
        L_0x011d:
            java.lang.String r2 = "Decline"
        L_0x011f:
            cbu r4 = new cbu
            r4.<init>(r3)
            r0.setNegativeButton(r2, r4)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            return
        L_0x012f:
            cby r3 = new cby
            r3.<init>(r2, r0)
            android.content.Context r0 = r3.b
            if (r0 != 0) goto L_0x013e
            java.lang.String r0 = "Activity context is not available"
            r3.a(r0)
            return
        L_0x013e:
            defpackage.bjl.e()
            android.content.Context r0 = r3.b
            dsa r0 = defpackage.cmd.e(r0)
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0153
            java.lang.String r0 = "Feature is not supported by the device."
            r3.a(r0)
            return
        L_0x0153:
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.a
            java.lang.String r2 = "iurl"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x0169
            java.lang.String r0 = "Image url cannot be empty."
            r3.a(r0)
            return
        L_0x0169:
            boolean r2 = android.webkit.URLUtil.isValidUrl(r0)
            if (r2 != 0) goto L_0x0189
            java.lang.String r2 = "Invalid image url: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r4 = r0.length()
            if (r4 == 0) goto L_0x0180
            java.lang.String r0 = r2.concat(r0)
            goto L_0x0185
        L_0x0180:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L_0x0185:
            r3.a(r0)
            return
        L_0x0189:
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r2 = r2.getLastPathSegment()
            defpackage.bjl.e()
            boolean r4 = defpackage.cmd.c(r2)
            if (r4 != 0) goto L_0x01b5
            java.lang.String r0 = "Image type not recognized: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            if (r4 == 0) goto L_0x01ab
            java.lang.String r0 = r0.concat(r2)
            goto L_0x01b1
        L_0x01ab:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            r0 = r2
        L_0x01b1:
            r3.a(r0)
            return
        L_0x01b5:
            cle r4 = defpackage.bjl.i()
            android.content.res.Resources r4 = r4.d()
            defpackage.bjl.e()
            android.content.Context r5 = r3.b
            android.app.AlertDialog$Builder r5 = defpackage.cmd.d(r5)
            if (r4 == 0) goto L_0x01d0
            r6 = 2131953487(0x7f13074f, float:1.9543446E38)
            java.lang.String r6 = r4.getString(r6)
            goto L_0x01d2
        L_0x01d0:
            java.lang.String r6 = "Save image"
        L_0x01d2:
            r5.setTitle(r6)
            if (r4 == 0) goto L_0x01df
            r6 = 2131953488(0x7f130750, float:1.9543448E38)
            java.lang.String r6 = r4.getString(r6)
            goto L_0x01e1
        L_0x01df:
            java.lang.String r6 = "Allow Ad to store image in Picture gallery?"
        L_0x01e1:
            r5.setMessage(r6)
            if (r4 == 0) goto L_0x01eb
            java.lang.String r6 = r4.getString(r11)
            goto L_0x01ed
        L_0x01eb:
            java.lang.String r6 = "Accept"
        L_0x01ed:
            cbz r7 = new cbz
            r7.<init>(r3, r0, r2)
            r5.setPositiveButton(r6, r7)
            if (r4 == 0) goto L_0x01fc
            java.lang.String r0 = r4.getString(r10)
            goto L_0x01fe
        L_0x01fc:
            java.lang.String r0 = "Decline"
        L_0x01fe:
            cca r2 = new cca
            r2.<init>(r3)
            r5.setNegativeButton(r0, r2)
            android.app.AlertDialog r0 = r5.create()
            r0.show()
            return
        L_0x020e:
            cbv r2 = r1.b
            java.lang.Object r3 = r2.g
            monitor-enter(r3)
            android.app.Activity r4 = r2.i     // Catch:{ all -> 0x052e }
            if (r4 != 0) goto L_0x021e
            java.lang.String r0 = "Not an activity context. Cannot resize."
            r2.a(r0)     // Catch:{ all -> 0x052e }
            monitor-exit(r3)     // Catch:{ all -> 0x052e }
            return
        L_0x021e:
            csr r4 = r2.h     // Catch:{ all -> 0x052e }
            cue r4 = r4.v()     // Catch:{ all -> 0x052e }
            if (r4 != 0) goto L_0x022d
            java.lang.String r0 = "Webview is not yet available, size is not set."
            r2.a(r0)     // Catch:{ all -> 0x052e }
            monitor-exit(r3)     // Catch:{ all -> 0x052e }
            return
        L_0x022d:
            csr r4 = r2.h     // Catch:{ all -> 0x052e }
            cue r4 = r4.v()     // Catch:{ all -> 0x052e }
            boolean r4 = r4.c()     // Catch:{ all -> 0x052e }
            if (r4 == 0) goto L_0x0240
            java.lang.String r0 = "Is interstitial. Cannot resize an interstitial."
            r2.a(r0)     // Catch:{ all -> 0x052e }
            monitor-exit(r3)     // Catch:{ all -> 0x052e }
            return
        L_0x0240:
            csr r4 = r2.h     // Catch:{ all -> 0x052e }
            boolean r4 = r4.B()     // Catch:{ all -> 0x052e }
            if (r4 == 0) goto L_0x024f
            java.lang.String r0 = "Cannot resize an expanded banner."
            r2.a(r0)     // Catch:{ all -> 0x052e }
            monitor-exit(r3)     // Catch:{ all -> 0x052e }
            return
        L_0x024f:
            java.lang.String r4 = "width"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x052e }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x052e }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x052e }
            if (r4 != 0) goto L_0x026e
            defpackage.bjl.e()     // Catch:{ all -> 0x052e }
            java.lang.String r4 = "width"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x052e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x052e }
            int r4 = defpackage.cmd.b(r4)     // Catch:{ all -> 0x052e }
            r2.f = r4     // Catch:{ all -> 0x052e }
        L_0x026e:
            java.lang.String r4 = "height"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x052e }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x052e }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x052e }
            if (r4 != 0) goto L_0x028d
            defpackage.bjl.e()     // Catch:{ all -> 0x052e }
            java.lang.String r4 = "height"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x052e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x052e }
            int r4 = defpackage.cmd.b(r4)     // Catch:{ all -> 0x052e }
            r2.c = r4     // Catch:{ all -> 0x052e }
        L_0x028d:
            java.lang.String r4 = "offsetX"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x052e }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x052e }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x052e }
            if (r4 != 0) goto L_0x02ac
            defpackage.bjl.e()     // Catch:{ all -> 0x052e }
            java.lang.String r4 = "offsetX"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x052e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x052e }
            int r4 = defpackage.cmd.b(r4)     // Catch:{ all -> 0x052e }
            r2.d = r4     // Catch:{ all -> 0x052e }
        L_0x02ac:
            java.lang.String r4 = "offsetY"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x052e }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x052e }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x052e }
            if (r4 != 0) goto L_0x02cb
            defpackage.bjl.e()     // Catch:{ all -> 0x052e }
            java.lang.String r4 = "offsetY"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x052e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x052e }
            int r4 = defpackage.cmd.b(r4)     // Catch:{ all -> 0x052e }
            r2.e = r4     // Catch:{ all -> 0x052e }
        L_0x02cb:
            java.lang.String r4 = "allowOffscreen"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x052e }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x052e }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x052e }
            if (r4 != 0) goto L_0x02e7
            java.lang.String r4 = "allowOffscreen"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x052e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x052e }
            boolean r4 = java.lang.Boolean.parseBoolean(r4)     // Catch:{ all -> 0x052e }
            r2.b = r4     // Catch:{ all -> 0x052e }
        L_0x02e7:
            java.lang.String r4 = "customClosePosition"
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x052e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x052e }
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x052e }
            if (r4 != 0) goto L_0x02f7
            r2.a = r0     // Catch:{ all -> 0x052e }
        L_0x02f7:
            int r0 = r2.f     // Catch:{ all -> 0x052e }
            r4 = 0
            if (r0 < 0) goto L_0x0302
            int r0 = r2.c     // Catch:{ all -> 0x052e }
            if (r0 < 0) goto L_0x0302
            r0 = 1
            goto L_0x0303
        L_0x0302:
            r0 = 0
        L_0x0303:
            if (r0 != 0) goto L_0x030c
            java.lang.String r0 = "Invalid width and height options. Cannot resize."
            r2.a(r0)     // Catch:{ all -> 0x052e }
            monitor-exit(r3)     // Catch:{ all -> 0x052e }
            return
        L_0x030c:
            android.app.Activity r0 = r2.i     // Catch:{ all -> 0x052e }
            android.view.Window r0 = r0.getWindow()     // Catch:{ all -> 0x052e }
            if (r0 == 0) goto L_0x0527
            android.view.View r10 = r0.getDecorView()     // Catch:{ all -> 0x052e }
            if (r10 != 0) goto L_0x031c
            goto L_0x0527
        L_0x031c:
            int[] r10 = r2.a()     // Catch:{ all -> 0x052e }
            if (r10 != 0) goto L_0x0329
            java.lang.String r0 = "Resize location out of screen or close button is not visible."
            r2.a(r0)     // Catch:{ all -> 0x052e }
            monitor-exit(r3)     // Catch:{ all -> 0x052e }
            return
        L_0x0329:
            defpackage.dpn.a()     // Catch:{ all -> 0x052e }
            android.app.Activity r11 = r2.i     // Catch:{ all -> 0x052e }
            int r12 = r2.f     // Catch:{ all -> 0x052e }
            int r11 = defpackage.col.a(r11, r12)     // Catch:{ all -> 0x052e }
            defpackage.dpn.a()     // Catch:{ all -> 0x052e }
            android.app.Activity r12 = r2.i     // Catch:{ all -> 0x052e }
            int r13 = r2.c     // Catch:{ all -> 0x052e }
            int r12 = defpackage.col.a(r12, r13)     // Catch:{ all -> 0x052e }
            csr r13 = r2.h     // Catch:{ all -> 0x052e }
            android.view.View r13 = r13.o()     // Catch:{ all -> 0x052e }
            android.view.ViewParent r13 = r13.getParent()     // Catch:{ all -> 0x052e }
            if (r13 == 0) goto L_0x0520
            boolean r14 = r13 instanceof android.view.ViewGroup     // Catch:{ all -> 0x052e }
            if (r14 == 0) goto L_0x0520
            r14 = r13
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14     // Catch:{ all -> 0x052e }
            csr r15 = r2.h     // Catch:{ all -> 0x052e }
            android.view.View r15 = r15.o()     // Catch:{ all -> 0x052e }
            r14.removeView(r15)     // Catch:{ all -> 0x052e }
            android.widget.PopupWindow r14 = r2.n     // Catch:{ all -> 0x052e }
            if (r14 != 0) goto L_0x038e
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13     // Catch:{ all -> 0x052e }
            r2.p = r13     // Catch:{ all -> 0x052e }
            defpackage.bjl.e()     // Catch:{ all -> 0x052e }
            csr r13 = r2.h     // Catch:{ all -> 0x052e }
            android.view.View r13 = r13.o()     // Catch:{ all -> 0x052e }
            android.graphics.Bitmap r13 = defpackage.cmd.a(r13)     // Catch:{ all -> 0x052e }
            android.widget.ImageView r14 = new android.widget.ImageView     // Catch:{ all -> 0x052e }
            android.app.Activity r15 = r2.i     // Catch:{ all -> 0x052e }
            r14.<init>(r15)     // Catch:{ all -> 0x052e }
            r2.k = r14     // Catch:{ all -> 0x052e }
            android.widget.ImageView r14 = r2.k     // Catch:{ all -> 0x052e }
            r14.setImageBitmap(r13)     // Catch:{ all -> 0x052e }
            csr r13 = r2.h     // Catch:{ all -> 0x052e }
            cue r13 = r13.v()     // Catch:{ all -> 0x052e }
            r2.j = r13     // Catch:{ all -> 0x052e }
            android.view.ViewGroup r13 = r2.p     // Catch:{ all -> 0x052e }
            android.widget.ImageView r14 = r2.k     // Catch:{ all -> 0x052e }
            r13.addView(r14)     // Catch:{ all -> 0x052e }
            goto L_0x0393
        L_0x038e:
            android.widget.PopupWindow r13 = r2.n     // Catch:{ all -> 0x052e }
            r13.dismiss()     // Catch:{ all -> 0x052e }
        L_0x0393:
            android.widget.RelativeLayout r13 = new android.widget.RelativeLayout     // Catch:{ all -> 0x052e }
            android.app.Activity r14 = r2.i     // Catch:{ all -> 0x052e }
            r13.<init>(r14)     // Catch:{ all -> 0x052e }
            r2.o = r13     // Catch:{ all -> 0x052e }
            android.widget.RelativeLayout r13 = r2.o     // Catch:{ all -> 0x052e }
            r13.setBackgroundColor(r4)     // Catch:{ all -> 0x052e }
            android.widget.RelativeLayout r13 = r2.o     // Catch:{ all -> 0x052e }
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x052e }
            r14.<init>(r11, r12)     // Catch:{ all -> 0x052e }
            r13.setLayoutParams(r14)     // Catch:{ all -> 0x052e }
            defpackage.bjl.e()     // Catch:{ all -> 0x052e }
            android.widget.RelativeLayout r13 = r2.o     // Catch:{ all -> 0x052e }
            android.widget.PopupWindow r13 = defpackage.cmd.a(r13, r11, r12)     // Catch:{ all -> 0x052e }
            r2.n = r13     // Catch:{ all -> 0x052e }
            android.widget.PopupWindow r13 = r2.n     // Catch:{ all -> 0x052e }
            r13.setOutsideTouchable(r9)     // Catch:{ all -> 0x052e }
            android.widget.PopupWindow r13 = r2.n     // Catch:{ all -> 0x052e }
            r13.setTouchable(r9)     // Catch:{ all -> 0x052e }
            android.widget.PopupWindow r13 = r2.n     // Catch:{ all -> 0x052e }
            boolean r14 = r2.b     // Catch:{ all -> 0x052e }
            if (r14 != 0) goto L_0x03c8
            r14 = 1
            goto L_0x03c9
        L_0x03c8:
            r14 = 0
        L_0x03c9:
            r13.setClippingEnabled(r14)     // Catch:{ all -> 0x052e }
            android.widget.RelativeLayout r13 = r2.o     // Catch:{ all -> 0x052e }
            csr r14 = r2.h     // Catch:{ all -> 0x052e }
            android.view.View r14 = r14.o()     // Catch:{ all -> 0x052e }
            r13.addView(r14, r7, r7)     // Catch:{ all -> 0x052e }
            android.widget.LinearLayout r13 = new android.widget.LinearLayout     // Catch:{ all -> 0x052e }
            android.app.Activity r14 = r2.i     // Catch:{ all -> 0x052e }
            r13.<init>(r14)     // Catch:{ all -> 0x052e }
            r2.l = r13     // Catch:{ all -> 0x052e }
            android.widget.RelativeLayout$LayoutParams r13 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x052e }
            defpackage.dpn.a()     // Catch:{ all -> 0x052e }
            android.app.Activity r14 = r2.i     // Catch:{ all -> 0x052e }
            r15 = 50
            int r14 = defpackage.col.a(r14, r15)     // Catch:{ all -> 0x052e }
            defpackage.dpn.a()     // Catch:{ all -> 0x052e }
            android.app.Activity r7 = r2.i     // Catch:{ all -> 0x052e }
            int r7 = defpackage.col.a(r7, r15)     // Catch:{ all -> 0x052e }
            r13.<init>(r14, r7)     // Catch:{ all -> 0x052e }
            java.lang.String r7 = r2.a     // Catch:{ all -> 0x052e }
            int r14 = r7.hashCode()     // Catch:{ all -> 0x052e }
            r15 = 2
            switch(r14) {
                case -1364013995: goto L_0x0436;
                case -1012429441: goto L_0x042c;
                case -655373719: goto L_0x0422;
                case 1163912186: goto L_0x0418;
                case 1288627767: goto L_0x040e;
                case 1755462605: goto L_0x0404;
                default: goto L_0x0403;
            }     // Catch:{ all -> 0x052e }
        L_0x0403:
            goto L_0x0440
        L_0x0404:
            java.lang.String r14 = "top-center"
            boolean r7 = r7.equals(r14)     // Catch:{ all -> 0x052e }
            if (r7 == 0) goto L_0x0440
            r7 = 1
            goto L_0x0441
        L_0x040e:
            java.lang.String r14 = "bottom-center"
            boolean r7 = r7.equals(r14)     // Catch:{ all -> 0x052e }
            if (r7 == 0) goto L_0x0440
            r7 = 4
            goto L_0x0441
        L_0x0418:
            java.lang.String r14 = "bottom-right"
            boolean r7 = r7.equals(r14)     // Catch:{ all -> 0x052e }
            if (r7 == 0) goto L_0x0440
            r7 = 5
            goto L_0x0441
        L_0x0422:
            java.lang.String r14 = "bottom-left"
            boolean r7 = r7.equals(r14)     // Catch:{ all -> 0x052e }
            if (r7 == 0) goto L_0x0440
            r7 = 3
            goto L_0x0441
        L_0x042c:
            java.lang.String r14 = "top-left"
            boolean r7 = r7.equals(r14)     // Catch:{ all -> 0x052e }
            if (r7 == 0) goto L_0x0440
            r7 = 0
            goto L_0x0441
        L_0x0436:
            java.lang.String r14 = "center"
            boolean r7 = r7.equals(r14)     // Catch:{ all -> 0x052e }
            if (r7 == 0) goto L_0x0440
            r7 = 2
            goto L_0x0441
        L_0x0440:
            r7 = -1
        L_0x0441:
            r14 = 9
            r4 = 10
            if (r7 == 0) goto L_0x047a
            if (r7 == r9) goto L_0x0476
            if (r7 == r15) goto L_0x0470
            r15 = 12
            if (r7 == r6) goto L_0x0469
            if (r7 == r8) goto L_0x0460
            r6 = 11
            if (r7 == r5) goto L_0x045c
            r13.addRule(r4)     // Catch:{ all -> 0x052e }
        L_0x0458:
            r13.addRule(r6)     // Catch:{ all -> 0x052e }
            goto L_0x047e
        L_0x045c:
            r13.addRule(r15)     // Catch:{ all -> 0x052e }
            goto L_0x0458
        L_0x0460:
            r13.addRule(r15)     // Catch:{ all -> 0x052e }
        L_0x0463:
            r4 = 14
            r13.addRule(r4)     // Catch:{ all -> 0x052e }
            goto L_0x047e
        L_0x0469:
            r13.addRule(r15)     // Catch:{ all -> 0x052e }
        L_0x046c:
            r13.addRule(r14)     // Catch:{ all -> 0x052e }
            goto L_0x047e
        L_0x0470:
            r4 = 13
            r13.addRule(r4)     // Catch:{ all -> 0x052e }
            goto L_0x047e
        L_0x0476:
            r13.addRule(r4)     // Catch:{ all -> 0x052e }
            goto L_0x0463
        L_0x047a:
            r13.addRule(r4)     // Catch:{ all -> 0x052e }
            goto L_0x046c
        L_0x047e:
            android.widget.LinearLayout r4 = r2.l     // Catch:{ all -> 0x052e }
            cbw r5 = new cbw     // Catch:{ all -> 0x052e }
            r5.<init>(r2)     // Catch:{ all -> 0x052e }
            r4.setOnClickListener(r5)     // Catch:{ all -> 0x052e }
            android.widget.LinearLayout r4 = r2.l     // Catch:{ all -> 0x052e }
            java.lang.String r5 = "Close button"
            r4.setContentDescription(r5)     // Catch:{ all -> 0x052e }
            android.widget.RelativeLayout r4 = r2.o     // Catch:{ all -> 0x052e }
            android.widget.LinearLayout r5 = r2.l     // Catch:{ all -> 0x052e }
            r4.addView(r5, r13)     // Catch:{ all -> 0x052e }
            android.widget.PopupWindow r4 = r2.n     // Catch:{ RuntimeException -> 0x04d8 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ RuntimeException -> 0x04d8 }
            defpackage.dpn.a()     // Catch:{ RuntimeException -> 0x04d8 }
            android.app.Activity r5 = r2.i     // Catch:{ RuntimeException -> 0x04d8 }
            r6 = 0
            r7 = r10[r6]     // Catch:{ RuntimeException -> 0x04d8 }
            int r5 = defpackage.col.a(r5, r7)     // Catch:{ RuntimeException -> 0x04d8 }
            defpackage.dpn.a()     // Catch:{ RuntimeException -> 0x04d8 }
            android.app.Activity r6 = r2.i     // Catch:{ RuntimeException -> 0x04d8 }
            r7 = r10[r9]     // Catch:{ RuntimeException -> 0x04d8 }
            int r6 = defpackage.col.a(r6, r7)     // Catch:{ RuntimeException -> 0x04d8 }
            r7 = 0
            r4.showAtLocation(r0, r7, r5, r6)     // Catch:{ RuntimeException -> 0x04d8 }
            ccf r0 = r2.m     // Catch:{ all -> 0x052e }
            if (r0 == 0) goto L_0x04c0
            ccf r0 = r2.m     // Catch:{ all -> 0x052e }
            r0.N()     // Catch:{ all -> 0x052e }
        L_0x04c0:
            csr r0 = r2.h     // Catch:{ all -> 0x052e }
            cue r4 = defpackage.cue.a(r11, r12)     // Catch:{ all -> 0x052e }
            r0.a(r4)     // Catch:{ all -> 0x052e }
            r0 = 0
            r0 = r10[r0]     // Catch:{ all -> 0x052e }
            r4 = r10[r9]     // Catch:{ all -> 0x052e }
            r2.a(r0, r4)     // Catch:{ all -> 0x052e }
            java.lang.String r0 = "resized"
            r2.b(r0)     // Catch:{ all -> 0x052e }
            monitor-exit(r3)     // Catch:{ all -> 0x052e }
            return
        L_0x04d8:
            r0 = move-exception
            java.lang.String r4 = "Cannot show popup window: "
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x052e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x052e }
            int r5 = r0.length()     // Catch:{ all -> 0x052e }
            if (r5 == 0) goto L_0x04ee
            java.lang.String r0 = r4.concat(r0)     // Catch:{ all -> 0x052e }
            goto L_0x04f3
        L_0x04ee:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x052e }
            r0.<init>(r4)     // Catch:{ all -> 0x052e }
        L_0x04f3:
            r2.a(r0)     // Catch:{ all -> 0x052e }
            android.widget.RelativeLayout r0 = r2.o     // Catch:{ all -> 0x052e }
            csr r4 = r2.h     // Catch:{ all -> 0x052e }
            android.view.View r4 = r4.o()     // Catch:{ all -> 0x052e }
            r0.removeView(r4)     // Catch:{ all -> 0x052e }
            android.view.ViewGroup r0 = r2.p     // Catch:{ all -> 0x052e }
            if (r0 == 0) goto L_0x051e
            android.view.ViewGroup r0 = r2.p     // Catch:{ all -> 0x052e }
            android.widget.ImageView r4 = r2.k     // Catch:{ all -> 0x052e }
            r0.removeView(r4)     // Catch:{ all -> 0x052e }
            android.view.ViewGroup r0 = r2.p     // Catch:{ all -> 0x052e }
            csr r4 = r2.h     // Catch:{ all -> 0x052e }
            android.view.View r4 = r4.o()     // Catch:{ all -> 0x052e }
            r0.addView(r4)     // Catch:{ all -> 0x052e }
            csr r0 = r2.h     // Catch:{ all -> 0x052e }
            cue r2 = r2.j     // Catch:{ all -> 0x052e }
            r0.a(r2)     // Catch:{ all -> 0x052e }
        L_0x051e:
            monitor-exit(r3)     // Catch:{ all -> 0x052e }
            return
        L_0x0520:
            java.lang.String r0 = "Webview is detached, probably in the middle of a resize or expand."
            r2.a(r0)     // Catch:{ all -> 0x052e }
            monitor-exit(r3)     // Catch:{ all -> 0x052e }
            return
        L_0x0527:
            java.lang.String r0 = "Activity context is not ready, cannot get window or decor view."
            r2.a(r0)     // Catch:{ all -> 0x052e }
            monitor-exit(r3)     // Catch:{ all -> 0x052e }
            return
        L_0x052e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x052e }
            goto L_0x0532
        L_0x0531:
            throw r0
        L_0x0532:
            goto L_0x0531
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfk.zza(java.lang.Object, java.util.Map):void");
    }

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7)};
        Map a2 = bzh.a(7);
        for (int i = 0; i < 7; i++) {
            a2.put(strArr[i], numArr[i]);
        }
        d = Collections.unmodifiableMap(a2);
    }
}
