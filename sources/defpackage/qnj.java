package defpackage;

import com.spotify.music.features.trackcredits.adapter.TrackCreditsAdapter.ViewType;

/* renamed from: qnj reason: default package */
public abstract class qnj {
    public abstract String a();

    public abstract ViewType b();

    public static qnj a(String str, ViewType viewType) {
        return new qni(str, viewType);
    }
}
