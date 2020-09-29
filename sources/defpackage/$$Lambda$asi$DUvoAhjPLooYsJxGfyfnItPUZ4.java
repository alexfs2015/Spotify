package defpackage;

import android.media.MediaDrm;
import android.media.MediaDrm.OnEventListener;

/* renamed from: -$$Lambda$asi$DUvoAhjPLooYsJxGfyf-nItPUZ4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$asi$DUvoAhjPLooYsJxGfyfnItPUZ4 implements OnEventListener {
    private final /* synthetic */ asi f$0;
    private final /* synthetic */ b f$1;

    public /* synthetic */ $$Lambda$asi$DUvoAhjPLooYsJxGfyfnItPUZ4(asi asi, b bVar) {
        this.f$0 = asi;
        this.f$1 = bVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.f$0.a(this.f$1, mediaDrm, bArr, i, i2, bArr2);
    }
}
