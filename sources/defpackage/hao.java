package defpackage;

import android.content.Context;
import com.spotify.music.follow.FollowManager;

@Deprecated
/* renamed from: hao reason: default package */
public final class hao implements hce {
    private final Context b;
    private final a c;
    private final has d;
    private final FollowManager e;

    public hao(Context context, a aVar, has has, FollowManager followManager) {
        this.b = (Context) fbp.a(context);
        this.c = (a) fbp.a(aVar);
        this.d = (has) fbp.a(has);
        this.e = (FollowManager) fbp.a(followManager);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(defpackage.hcr r7, defpackage.hcm r8) {
        /*
            r6 = this;
            java.util.List r0 = r7.actions()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "toggle-follow"
            boolean r1 = r2.equals(r1)
            r2 = 1
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = r7.uri()
            if (r1 == 0) goto L_0x0067
            com.spotify.music.follow.FollowManager r3 = r6.e
            com.spotify.music.follow.FollowManager$a r3 = r3.a(r1)
            if (r3 == 0) goto L_0x0047
            boolean r3 = r3.d
            r3 = r3 ^ r2
            com.spotify.music.follow.FollowManager r4 = r6.e
            r4.a(r1, r3)
            has r4 = r6.d
            if (r3 == 0) goto L_0x003a
            java.lang.String r5 = "follow"
            goto L_0x003c
        L_0x003a:
            java.lang.String r5 = "unfollow"
        L_0x003c:
            if (r3 == 0) goto L_0x0041
            com.spotify.music.ubi.interactions.InteractionAction r3 = com.spotify.music.ubi.interactions.InteractionAction.FOLLOW
            goto L_0x0043
        L_0x0041:
            com.spotify.music.ubi.interactions.InteractionAction r3 = com.spotify.music.ubi.interactions.InteractionAction.UNFOLLOW
        L_0x0043:
            r4.logInteraction(r1, r8, r5, r3)
            goto L_0x0068
        L_0x0047:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Follow Data missing for URI: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = ", owner: "
            r3.append(r1)
            sso$a r1 = r6.c
            sso r1 = r1.ae_()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.spotify.mobile.android.util.Assertion.b(r1)
            goto L_0x0068
        L_0x0067:
            r2 = 0
        L_0x0068:
            if (r2 == 0) goto L_0x0008
            return
        L_0x006b:
            java.lang.String r7 = r7.uri()
            if (r7 == 0) goto L_0x0095
            szk$a r0 = defpackage.szk.a(r7)
            szk r0 = r0.a()
            szl r1 = new szl
            android.content.Context r2 = r6.b
            android.content.Context r2 = r2.getApplicationContext()
            r1.<init>(r2)
            android.content.Intent r0 = r1.a(r0)
            android.content.Context r1 = r6.b
            r1.startActivity(r0)
            has r0 = r6.d
            r1 = 0
            java.lang.String r2 = "navigate-forward"
            r0.logInteraction(r7, r8, r2, r1)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hao.onClick(hcr, hcm):void");
    }
}
