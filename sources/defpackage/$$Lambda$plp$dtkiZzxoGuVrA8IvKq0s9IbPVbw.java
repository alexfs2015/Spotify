package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

/* renamed from: -$$Lambda$plp$dtkiZzxoGuVrA8IvKq0s9IbPVbw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$plp$dtkiZzxoGuVrA8IvKq0s9IbPVbw implements OnCheckedChangeListener {
    private final /* synthetic */ plp f$0;
    private final /* synthetic */ PlayerTrack f$1;
    private final /* synthetic */ pml f$2;

    public /* synthetic */ $$Lambda$plp$dtkiZzxoGuVrA8IvKq0s9IbPVbw(plp plp, PlayerTrack playerTrack, pml pml) {
        this.f$0 = plp;
        this.f$1 = playerTrack;
        this.f$2 = pml;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f$0.a(this.f$1, this.f$2, compoundButton, z);
    }
}
