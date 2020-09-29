package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.presenter.like.ContentType;
import java.util.Map;

/* renamed from: qss reason: default package */
public final class qss {
    private final Map<ContentType, wzi<qsr>> a;

    public qss(Map<ContentType, wzi<qsr>> map) {
        this.a = map;
    }

    public final qsr a(String str) {
        return (qsr) ((wzi) this.a.get(ContentType.valueOf(jva.a(str).b.toString()))).get();
    }
}
