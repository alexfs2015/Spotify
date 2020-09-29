package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.presenter.like.ContentType;
import java.util.Map;

/* renamed from: qkk reason: default package */
public final class qkk implements vua<qkj> {
    private final wlc<Map<ContentType, wlc<qki>>> a;

    private qkk(wlc<Map<ContentType, wlc<qki>>> wlc) {
        this.a = wlc;
    }

    public static qkk a(wlc<Map<ContentType, wlc<qki>>> wlc) {
        return new qkk(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qkj((Map) this.a.get());
    }
}
