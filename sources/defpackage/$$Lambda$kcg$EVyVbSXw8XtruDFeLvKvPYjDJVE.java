package defpackage;

import com.spotify.mobile.android.video.drm.EncryptionType;

/* renamed from: -$$Lambda$kcg$EVyVbSXw8XtruDFeLvKvPYjDJVE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kcg$EVyVbSXw8XtruDFeLvKvPYjDJVE implements Runnable {
    private final /* synthetic */ kch f$0;
    private final /* synthetic */ EncryptionType f$1;
    private final /* synthetic */ long f$2;

    public /* synthetic */ $$Lambda$kcg$EVyVbSXw8XtruDFeLvKvPYjDJVE(kch kch, EncryptionType encryptionType, long j) {
        this.f$0 = kch;
        this.f$1 = encryptionType;
        this.f$2 = j;
    }

    public final void run() {
        this.f$0.a(this.f$1);
    }
}
