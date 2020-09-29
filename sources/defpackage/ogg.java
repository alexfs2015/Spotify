package defpackage;

import android.content.Intent;
import com.google.common.base.Optional;
import com.spotify.music.features.partneraccountlinking.clientprovider.samsung.SamsungLinkingRequest;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Cancellable;

/* renamed from: ogg reason: default package */
public final class ogg {
    private final oge a;
    private final ofy b;
    private Optional<SingleEmitter<SamsungLinkingRequest>> c = Optional.e();
    private Optional<String> d = Optional.e();

    ogg(oge oge, ofy ofy) {
        this.a = oge;
        this.b = ofy;
        this.b.b = new $$Lambda$ogg$AvdHIIpQsvAs81dMEv0XWel8Qo(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.c = Optional.e();
    }

    private void a(Intent intent, int i) {
        if (!this.b.a(intent, i)) {
            a("Account linking fragment is not present");
        }
    }

    private void a(String str) {
        if (this.c.b()) {
            ((SingleEmitter) this.c.c()).a((Throwable) new RuntimeException(str));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, SingleEmitter singleEmitter) {
        singleEmitter.a((Cancellable) new $$Lambda$ogg$5Rq3N0QcO_XP0A94B20Trr76NhQ(this));
        this.c = Optional.b(singleEmitter);
        if (z) {
            a(oge.a(), 1213);
            return;
        }
        String packageName = this.a.a.getPackageName();
        Intent intent = new Intent("com.osp.app.signin.action.ADD_SAMSUNG_ACCOUNT");
        intent.putExtra("client_id", "q3voa1im9e");
        intent.putExtra("client_secret", "foo");
        intent.putExtra("mypackage", packageName);
        intent.putExtra("osp_ver", "OSP_02");
        intent.putExtra("mode", "ADD_ACCOUNT");
        a(intent, 1212);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r0 = 1214(0x4be, float:1.701E-42)
            r1 = 1213(0x4bd, float:1.7E-42)
            r2 = 0
            r3 = 1
            if (r7 == r1) goto L_0x0011
            r4 = 1212(0x4bc, float:1.698E-42)
            if (r7 == r4) goto L_0x0011
            if (r7 != r0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r4 = 0
            goto L_0x0012
        L_0x0011:
            r4 = 1
        L_0x0012:
            if (r4 == 0) goto L_0x00ba
            r4 = -1
            if (r8 == r4) goto L_0x001e
            java.lang.String r7 = "Samsung activity returns result not ok"
            r6.a(r7)
            goto L_0x00b9
        L_0x001e:
            switch(r7) {
                case 1212: goto L_0x00b2;
                case 1213: goto L_0x00a8;
                case 1214: goto L_0x0023;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x00b9
        L_0x0023:
            com.google.common.base.Optional<io.reactivex.SingleEmitter<com.spotify.music.features.partneraccountlinking.clientprovider.samsung.SamsungLinkingRequest>> r7 = r6.c
            boolean r7 = r7.b()
            if (r7 == 0) goto L_0x00b9
            java.lang.String r7 = "api_server_url"
            java.lang.String r8 = "auth_server_url"
            java.lang.String r0 = "access_token"
            if (r9 == 0) goto L_0x006e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            boolean r4 = r9.hasExtra(r0)
            if (r4 != 0) goto L_0x0041
            r1.add(r0)
        L_0x0041:
            boolean r4 = r9.hasExtra(r8)
            if (r4 != 0) goto L_0x004a
            r1.add(r8)
        L_0x004a:
            boolean r4 = r9.hasExtra(r7)
            if (r4 != 0) goto L_0x0053
            r1.add(r7)
        L_0x0053:
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L_0x006e
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = ", "
            fbl r5 = defpackage.fbl.a(r5)
            java.lang.String r1 = r5.a(r1)
            r4[r2] = r1
            java.lang.String r1 = "Intent extra doesn't contain: %s"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            boolean r2 = defpackage.fbo.a(r1)
            if (r2 != 0) goto L_0x0086
            com.google.common.base.Optional<io.reactivex.SingleEmitter<com.spotify.music.features.partneraccountlinking.clientprovider.samsung.SamsungLinkingRequest>> r7 = r6.c
            java.lang.Object r7 = r7.c()
            io.reactivex.SingleEmitter r7 = (io.reactivex.SingleEmitter) r7
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r8.<init>(r1)
            r7.a(r8)
            goto L_0x00b9
        L_0x0086:
            java.lang.String r0 = r9.getStringExtra(r0)
            com.google.common.base.Optional r1 = com.google.common.base.Optional.b(r0)
            r6.d = r1
            com.google.common.base.Optional<io.reactivex.SingleEmitter<com.spotify.music.features.partneraccountlinking.clientprovider.samsung.SamsungLinkingRequest>> r1 = r6.c
            java.lang.Object r1 = r1.c()
            io.reactivex.SingleEmitter r1 = (io.reactivex.SingleEmitter) r1
            java.lang.String r8 = r9.getStringExtra(r8)
            java.lang.String r7 = r9.getStringExtra(r7)
            com.spotify.music.features.partneraccountlinking.clientprovider.samsung.SamsungLinkingRequest r7 = com.spotify.music.features.partneraccountlinking.clientprovider.samsung.SamsungLinkingRequest.create(r0, r8, r7)
            r1.a(r7)
            goto L_0x00b9
        L_0x00a8:
            com.google.common.base.Optional<java.lang.String> r7 = r6.d
            android.content.Intent r7 = defpackage.oge.a(r7)
            r6.a(r7, r0)
            goto L_0x00b9
        L_0x00b2:
            android.content.Intent r7 = defpackage.oge.a()
            r6.a(r7, r1)
        L_0x00b9:
            return r3
        L_0x00ba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogg.a(int, int, android.content.Intent):boolean");
    }

    public final Single<SamsungLinkingRequest> a(boolean z) {
        return this.c.b() ? Single.a((Throwable) new RuntimeException("Only one fetch request is allowed at a time per class instance.")) : Single.a((SingleOnSubscribe<T>) new $$Lambda$ogg$KLUt7jA9C31yRuzQ4ipQTbVYJwM<T>(this, z));
    }
}
