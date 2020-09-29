package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.spotify.music.features.fullscreen.story.FullscreenStoryActivity;

/* renamed from: nah reason: default package */
public final class nah implements rsj {
    private final Activity a;

    public nah(Activity activity) {
        this.a = (Activity) fay.a(activity);
    }

    public final void a(String str, fpt fpt) {
        Intent a2 = FullscreenStoryActivity.a(this.a);
        a2.putExtra("fullscreen_story_playlist_uri", str);
        fpu.a(a2, fpt);
        this.a.startActivity(a2);
    }
}
