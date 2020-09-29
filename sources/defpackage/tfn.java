package defpackage;

import com.spotify.music.nowplaying.drivingmode.view.ban.DrivingBanButton;
import com.spotify.music.nowplaying.drivingmode.view.shuffle.DrivingShuffleButton;

/* renamed from: tfn reason: default package */
public final class tfn implements tfo {
    private final DrivingShuffleButton a;
    private final DrivingBanButton b;

    public tfn(DrivingShuffleButton drivingShuffleButton, DrivingBanButton drivingBanButton) {
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
