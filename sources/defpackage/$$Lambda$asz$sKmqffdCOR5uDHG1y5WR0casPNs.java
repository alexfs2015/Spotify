package defpackage;

import android.media.MediaDrm;
import android.media.MediaDrm.OnEventListener;

/* renamed from: -$$Lambda$asz$sKmqffdCOR5uDHG1y5WR0casPNs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$asz$sKmqffdCOR5uDHG1y5WR0casPNs implements OnEventListener {
    private final /* synthetic */ asz f$0;
    private final /* synthetic */ b f$1;

    public /* synthetic */ $$Lambda$asz$sKmqffdCOR5uDHG1y5WR0casPNs(asz asz, b bVar) {
        this.f$0 = asz;
        this.f$1 = bVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        this.f$0.a(this.f$1, mediaDrm, bArr, i, i2, bArr2);
    }
}
