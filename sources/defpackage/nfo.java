package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.music.features.fullscreen.story.FullscreenStoryActivity;

/* renamed from: nfo reason: default package */
public final class nfo implements sbq {
    private final Activity a;

    public nfo(Activity activity) {
        this.a = (Activity) fbp.a(activity);
    }

    public final void a(String str, fqn fqn) {
        Intent a2 = FullscreenStoryActivity.a(this.a);
        a2.putExtra("fullscreen_story_playlist_uri", str);
        fqo.a(a2, fqn);
        this.a.startActivity(a2);
    }
}
