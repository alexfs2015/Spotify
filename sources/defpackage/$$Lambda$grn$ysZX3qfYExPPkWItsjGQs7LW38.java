package defpackage;

import com.spotify.libs.connect.volume.VolumeState;
import io.reactivex.Observer;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$grn$-ysZX3qfYExPPkWItsjGQs7LW38 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$grn$ysZX3qfYExPPkWItsjGQs7LW38 implements Consumer {
    private final /* synthetic */ grn f$0;
    private final /* synthetic */ Observer f$1;

    public /* synthetic */ $$Lambda$grn$ysZX3qfYExPPkWItsjGQs7LW38(grn grn, Observer observer) {
        this.f$0 = grn;
        this.f$1 = observer;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (VolumeState) obj);
    }
}
