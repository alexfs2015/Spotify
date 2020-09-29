package defpackage;

import com.spotify.music.search.podcasts.SearchPodcastComponent;
import com.spotify.searchview.proto.AudioEpisode;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: skj reason: default package */
public final class skj implements skc {
    private final boolean a;
    private final sjs b;

    public skj(boolean z, sjs sjs) {
        this.a = z;
        this.b = sjs;
    }

    private static hcm a(int i, String str) {
        a builder = hcx.builder();
        StringBuilder sb = new StringBuilder("tag-");
        sb.append(i);
        return builder.a(sb.toString()).a((hck) SearchPodcastComponent.TAG_CARD).a(hcy.builder().a(str)).a();
    }

    public final a a(a aVar, Entity entity) {
        if (!(this.a && EntityCase.a(entity.d) == EntityCase.AUDIO_EPISODE)) {
            return aVar;
        }
        AudioEpisode n = entity.n();
        ArrayList arrayList = new ArrayList(n.f.size());
        if (n.g) {
            arrayList.add(a(arrayList.size(), this.b.a()));
        }
        for (String a2 : n.f) {
            arrayList.add(a(arrayList.size(), a2));
        }
        return aVar.b((List<? extends hcm>) arrayList);
    }
}
