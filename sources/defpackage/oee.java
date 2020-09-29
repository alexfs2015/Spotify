package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.nowplayingbar.domain.model.Track;
import com.spotify.music.features.nowplayingbar.domain.model.Track.Type;
import com.spotify.player.model.ContextTrack;

/* renamed from: oee reason: default package */
public final class oee {
    public static Track a(ContextTrack contextTrack) {
        ImmutableMap metadata = contextTrack.metadata();
        String str = (String) contextTrack.metadata().get("context_uri");
        StringBuilder sb = new StringBuilder();
        sb.append(contextTrack.uid());
        sb.append(str);
        return Track.a(sb.toString(), contextTrack.uri(), fbo.b((String) metadata.get("title")), b(contextTrack) == Type.AD ? fbo.b((String) contextTrack.metadata().get("advertiser")) : fbo.b((String) contextTrack.metadata().get("artist_name")), Boolean.parseBoolean((String) metadata.get("collection.can_add")), Boolean.parseBoolean((String) metadata.get("collection.in_collection")), b(contextTrack));
    }

    private static Type b(ContextTrack contextTrack) {
        return vif.b(contextTrack) ? Type.INTERRUPTION : vif.a(contextTrack) ? Type.AD : Type.TRACK;
    }
}
