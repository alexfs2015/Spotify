package defpackage;

import android.content.Context;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$rih$kvMwnX-23DlSxWGebwkMp-rvirc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$rih$kvMwnX23DlSxWGebwkMprvirc implements Consumer {
    private final /* synthetic */ rih f$0;
    private final /* synthetic */ Context f$1;
    private final /* synthetic */ fyh f$2;
    private final /* synthetic */ knw f$3;

    public /* synthetic */ $$Lambda$rih$kvMwnX23DlSxWGebwkMprvirc(rih rih, Context context, fyh fyh, knw knw) {
        this.f$0 = rih;
        this.f$1 = context;
        this.f$2 = fyh;
        this.f$3 = knw;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, (MusicPagesModel) obj);
    }
}
