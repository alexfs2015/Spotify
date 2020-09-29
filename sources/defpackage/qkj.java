package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.presenter.like.ContentType;
import java.util.Map;

/* renamed from: qkj reason: default package */
public final class qkj {
    private final Map<ContentType, wlc<qki>> a;

    public qkj(Map<ContentType, wlc<qki>> map) {
        this.a = map;
    }

    public final qki a(String str) {
        return (qki) ((wlc) this.a.get(ContentType.valueOf(jst.a(str).b.toString()))).get();
    }
}
