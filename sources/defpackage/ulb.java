package defpackage;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.media.MediaPlayer;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;

/* renamed from: ulb reason: default package */
public final class ulb implements ula {
    private final Context a;
    private MediaPlayer b;

    ulb(Context context) {
        this.a = context;
    }

    public final void a() {
        a(R.raw.voice_interaction_cue_error);
    }

    public final void b() {
        a(R.raw.voice_interaction_cue_listening);
    }

    public final void c() {
        a(R.raw.voice_interaction_cue_skip_next);
    }

    public final void d() {
        a(R.raw.voice_interaction_cue_skip_prev);
    }

    public final void e() {
        a(R.raw.voice_interaction_cue_play);
    }

    public final void f() {
        a(R.raw.voice_interaction_cue_pause);
    }

    public final void g() {
        MediaPlayer mediaPlayer = this.b;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.b = null;
        }
    }

    private void a(int i) {
        try {
            g();
            this.b = MediaPlayer.create(this.a, i);
            this.b.start();
        } catch (NotFoundException e) {
            Logger.e(e, "Unable to play voice audio cue.", new Object[0]);
        }
    }
}
