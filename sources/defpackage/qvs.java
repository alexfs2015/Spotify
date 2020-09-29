package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.features.trackcredits.adapter.TrackCreditsAdapter.ViewType;

/* renamed from: qvs reason: default package */
public abstract class qvs {
    public static qvs a(String str, ViewType viewType) {
        return new qvr(str, Optional.e(), viewType);
    }

    public abstract String a();

    public abstract Optional<String> b();

    public abstract ViewType c();
}
