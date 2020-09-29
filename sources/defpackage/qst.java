package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.presenter.like.ContentType;
import java.util.Map;

/* renamed from: qst reason: default package */
public final class qst implements wig<qss> {
    private final wzi<Map<ContentType, wzi<qsr>>> a;

    private qst(wzi<Map<ContentType, wzi<qsr>>> wzi) {
        this.a = wzi;
    }

    public static qst a(wzi<Map<ContentType, wzi<qsr>>> wzi) {
        return new qst(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qss((Map) this.a.get());
    }
}
