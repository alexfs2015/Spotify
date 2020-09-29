package defpackage;

import com.spotify.music.nowplaying.drivingmode.view.ban.DrivingBanButton;
import com.spotify.music.nowplaying.drivingmode.view.shuffle.DrivingShuffleButton;

/* renamed from: tqc reason: default package */
public final class tqc implements tqd {
    private final DrivingShuffleButton a;
    private final DrivingBanButton b;

    public tqc(DrivingShuffleButton drivingShuffleButton, DrivingBanButton drivingBanButton) {
        this.a = drivingShuffleButton;
        this.b = drivingBanButton;
    }

    public final void a() {
        this.a.setVisibility(0);
        this.b.setVisibility(8);
    }

    public final void b() {
        this.a.setVisibility(8);
        this.b.setVisibility(0);
    }
}
