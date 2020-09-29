package defpackage;

import com.spotify.libs.connect.volume.VolumeState;
import io.reactivex.Observer;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$gtp$-pIEPH-N1VZG-1PZ_PWPFW5n52A reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$gtp$pIEPHN1VZG1PZ_PWPFW5n52A implements Consumer {
    private final /* synthetic */ gtp f$0;
    private final /* synthetic */ Observer f$1;

    public /* synthetic */ $$Lambda$gtp$pIEPHN1VZG1PZ_PWPFW5n52A(gtp gtp, Observer observer) {
        this.f$0 = gtp;
        this.f$1 = observer;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (VolumeState) obj);
    }
}
