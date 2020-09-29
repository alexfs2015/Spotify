package defpackage;

import com.spotify.player.model.command.PlayCommand;
import io.reactivex.Single;

/* renamed from: vit reason: default package */
public final class vit implements viv {
    private final vik a;
    private final vir b;
    private final vii c;

    public vit(vik vik, vir vir, vii vii) {
        this.a = vik;
        this.b = vir;
        this.c = vii;
    }

    public final Single<vhy> a(PlayCommand playCommand) {
        return this.a.a("play", playCommand.toBuilder().loggingParams(this.c.a()).build());
    }
}
