package defpackage;

import android.app.Activity;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import java.util.List;

/* renamed from: ans reason: default package */
public final class ans extends ama<aon, Object> {
    private static final int e = RequestCodeOffset.DeviceShare.a();

    public final List<a> b() {
        return null;
    }

    public final alt c() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            aon r4 = (defpackage.aon) r4
            if (r4 == 0) goto L_0x0084
            boolean r5 = r4 instanceof defpackage.aop
            if (r5 != 0) goto L_0x002c
            boolean r5 = r4 instanceof defpackage.aow
            if (r5 == 0) goto L_0x000d
            goto L_0x002c
        L_0x000d:
            com.facebook.FacebookException r4 = new com.facebook.FacebookException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r5.append(r0)
            java.lang.String r0 = " only supports ShareLinkContent or ShareOpenGraphContent"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x002c:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.content.Context r0 = defpackage.akc.g()
            java.lang.Class<com.facebook.FacebookActivity> r1 = com.facebook.FacebookActivity.class
            r5.setClass(r0, r1)
            java.lang.String r0 = "DeviceShareDialogFragment"
            r5.setAction(r0)
            java.lang.String r0 = "content"
            r5.putExtra(r0, r4)
            int r4 = r3.d
            r0 = 0
            android.app.Activity r1 = r3.b
            java.lang.String r2 = "Failed to find Activity or Fragment to startActivityForResult "
            if (r1 == 0) goto L_0x0053
            android.app.Activity r1 = r3.b
            r1.startActivityForResult(r5, r4)
            goto L_0x0072
        L_0x0053:
            ami r1 = r3.c
            if (r1 == 0) goto L_0x0073
            ami r1 = r3.c
            android.app.Fragment r1 = r1.b
            if (r1 == 0) goto L_0x0065
            ami r1 = r3.c
            android.app.Fragment r1 = r1.b
            r1.startActivityForResult(r5, r4)
            goto L_0x0072
        L_0x0065:
            ami r1 = r3.c
            androidx.fragment.app.Fragment r1 = r1.a
            if (r1 == 0) goto L_0x0073
            ami r1 = r3.c
            androidx.fragment.app.Fragment r1 = r1.a
            r1.startActivityForResult(r5, r4)
        L_0x0072:
            r2 = r0
        L_0x0073:
            if (r2 == 0) goto L_0x0083
            com.facebook.LoggingBehavior r4 = com.facebook.LoggingBehavior.DEVELOPER_ERRORS
            r5 = 6
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            defpackage.amp.a(r4, r5, r0, r2)
        L_0x0083:
            return
        L_0x0084:
            com.facebook.FacebookException r4 = new com.facebook.FacebookException
            java.lang.String r5 = "Must provide non-null content to share"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ans.a(java.lang.Object, java.lang.Object):void");
    }

    public ans(Activity activity) {
        super(activity, e);
    }
}
