package defpackage;

import android.app.Activity;
import android.content.Context;
import android.widget.PopupWindow;

@cey
/* renamed from: cdh reason: default package */
public final class cdh extends cde {
    private Object e = new Object();
    private PopupWindow f;
    private boolean g = false;

    cdh(Context context, cla cla, csr csr, cdd cdd) {
        super(context, cla, csr, cdd);
    }

    private final void e() {
        synchronized (this.e) {
            this.g = true;
            if ((this.a instanceof Activity) && ((Activity) this.a).isDestroyed()) {
                this.f = null;
            }
            if (this.f != null) {
                if (this.f.isShowing()) {
                    this.f.dismiss();
                }
                this.f = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        e();
        super.a(i);
    }

    public final void b() {
        e();
        super.b();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0068 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r8 = this;
            android.content.Context r0 = r8.a
            boolean r0 = r0 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L_0x0010
            android.content.Context r0 = r8.a
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            if (r0 == 0) goto L_0x006f
            android.view.View r2 = r0.getDecorView()
            if (r2 != 0) goto L_0x001a
            goto L_0x006f
        L_0x001a:
            android.content.Context r2 = r8.a
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = r2.isDestroyed()
            if (r2 == 0) goto L_0x0025
            return
        L_0x0025:
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            android.content.Context r3 = r8.a
            r2.<init>(r3)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r2.setLayoutParams(r3)
            csr r3 = r8.b
            android.view.View r3 = r3.o()
            r2.addView(r3, r4, r4)
            java.lang.Object r3 = r8.e
            monitor-enter(r3)
            boolean r5 = r8.g     // Catch:{ all -> 0x006c }
            if (r5 == 0) goto L_0x0047
            monitor-exit(r3)     // Catch:{ all -> 0x006c }
            return
        L_0x0047:
            android.widget.PopupWindow r5 = new android.widget.PopupWindow     // Catch:{ all -> 0x006c }
            r6 = 0
            r7 = 1
            r5.<init>(r2, r7, r7, r6)     // Catch:{ all -> 0x006c }
            r8.f = r5     // Catch:{ all -> 0x006c }
            android.widget.PopupWindow r2 = r8.f     // Catch:{ all -> 0x006c }
            r2.setOutsideTouchable(r7)     // Catch:{ all -> 0x006c }
            android.widget.PopupWindow r2 = r8.f     // Catch:{ all -> 0x006c }
            r2.setClippingEnabled(r6)     // Catch:{ all -> 0x006c }
            r2 = 3
            defpackage.cow.a(r2)     // Catch:{ all -> 0x006c }
            android.widget.PopupWindow r2 = r8.f     // Catch:{ Exception -> 0x0068 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x0068 }
            r2.showAtLocation(r0, r6, r4, r4)     // Catch:{ Exception -> 0x0068 }
            goto L_0x006a
        L_0x0068:
            r8.f = r1     // Catch:{ all -> 0x006c }
        L_0x006a:
            monitor-exit(r3)     // Catch:{ all -> 0x006c }
            return
        L_0x006c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006c }
            throw r0
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdh.d():void");
    }
}
