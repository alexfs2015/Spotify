package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.spotify.music.features.playlistallsongs.PlaylistAllSongsActivity;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$lfo$5TU6eLDvW6O2ocp5zkgoi5LhzTk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$lfo$5TU6eLDvW6O2ocp5zkgoi5LhzTk implements Function {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ $$Lambda$lfo$5TU6eLDvW6O2ocp5zkgoi5LhzTk(Context context) {
        this.f$0 = context;
    }

    public final Object apply(Object obj) {
        return ((Intent) obj).setComponent(new ComponentName(this.f$0, PlaylistAllSongsActivity.class));
    }
}
