package defpackage;

import com.spotify.player.model.command.options.LoggingParams;

/* renamed from: vii reason: default package */
public final class vii {
    private final jtz a;

    public vii(jtz jtz) {
        this.a = jtz;
    }

    public final LoggingParams a() {
        return LoggingParams.builder().commandInitiatedTime(Long.valueOf(this.a.a())).build();
    }
}
