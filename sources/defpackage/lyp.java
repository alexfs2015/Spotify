package defpackage;

import com.spotify.player.model.Context;
import com.spotify.player.model.command.PlayCommand;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.internal.functions.Functions;

/* renamed from: lyp reason: default package */
public final class lyp implements lyt {
    private final viv a;
    private final vig b;
    private final SerialDisposable c = new SerialDisposable();

    public lyp(viv viv, vig vig) {
        this.a = viv;
        this.b = vig;
    }

    public final void a(String str) {
        this.c.a(this.a.a(PlayCommand.builder(Context.fromUri(str), this.b.a).build()).a(Functions.b(), Functions.c));
    }
}
