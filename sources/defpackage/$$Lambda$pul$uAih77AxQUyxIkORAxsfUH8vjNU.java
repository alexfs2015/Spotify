package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: -$$Lambda$pul$uAih77AxQUyxIkORAxsfUH8vjNU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pul$uAih77AxQUyxIkORAxsfUH8vjNU implements OnCheckedChangeListener {
    private final /* synthetic */ pul f$0;
    private final /* synthetic */ PlayerTrack f$1;
    private final /* synthetic */ pvh f$2;

    public /* synthetic */ $$Lambda$pul$uAih77AxQUyxIkORAxsfUH8vjNU(pul pul, PlayerTrack playerTrack, pvh pvh) {
        this.f$0 = pul;
        this.f$1 = playerTrack;
        this.f$2 = pvh;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f$0.a(this.f$1, this.f$2, compoundButton, z);
    }
}
