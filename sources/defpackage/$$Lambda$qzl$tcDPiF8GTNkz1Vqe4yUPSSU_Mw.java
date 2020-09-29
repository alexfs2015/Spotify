package defpackage;

import android.content.Context;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qzl$tcDPiF8GTNkz-1Vqe4yUPSSU_Mw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qzl$tcDPiF8GTNkz1Vqe4yUPSSU_Mw implements Consumer {
    private final /* synthetic */ qzl f$0;
    private final /* synthetic */ Context f$1;
    private final /* synthetic */ fxn f$2;
    private final /* synthetic */ kkn f$3;

    public /* synthetic */ $$Lambda$qzl$tcDPiF8GTNkz1Vqe4yUPSSU_Mw(qzl qzl, Context context, fxn fxn, kkn kkn) {
        this.f$0 = qzl;
        this.f$1 = context;
        this.f$2 = fxn;
        this.f$3 = kkn;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, (MusicPagesModel) obj);
    }
}
