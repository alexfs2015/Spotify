package defpackage;

import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;

/* renamed from: skn reason: default package */
public final class skn implements skc {
    private final boolean a;
    private final sjs b;

    public skn(boolean z, sjs sjs) {
        this.a = z;
        this.b = sjs;
    }

    public final a a(a aVar, Entity entity) {
        if (!(this.a && EntityCase.a(entity.d) == EntityCase.AUDIO_SHOW && entity.m().e)) {
            return aVar;
        }
        return aVar.c("subtitle_tag", this.b.a());
    }
}
