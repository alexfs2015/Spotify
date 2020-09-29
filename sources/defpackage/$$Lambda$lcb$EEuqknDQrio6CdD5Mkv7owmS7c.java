package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.spotify.music.features.playlistallsongs.PlaylistAllSongsActivity;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$lcb$EEuqknDQrio6Cd-D5Mkv7owmS7c reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$lcb$EEuqknDQrio6CdD5Mkv7owmS7c implements Function {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ $$Lambda$lcb$EEuqknDQrio6CdD5Mkv7owmS7c(Context context) {
        this.f$0 = context;
    }

    public final Object apply(Object obj) {
        return ((Intent) obj).setComponent(new ComponentName(this.f$0, PlaylistAllSongsActivity.class));
    }
}
