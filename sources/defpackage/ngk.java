package defpackage;

import android.media.AudioManager;

/* renamed from: ngk reason: default package */
final class ngk {
    private final AudioManager a;

    public ngk(AudioManager audioManager) {
        this.a = audioManager;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.a.abandonAudioFocus(null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.a.requestAudioFocus(null, 3, 2);
    }

    public final void a(nga nga) {
        nga.a(new $$Lambda$ngk$g0SCC9ShrRkRirSeRIZE2XPS8w(this), new $$Lambda$ngk$twpJStxzAXUCHb8Al7NlxxMKA2U(this));
    }
}
