package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.b;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: tog reason: default package */
public final class tog implements a {
    private static b<Object, Boolean> c = b.b("key_driving_mode_coach_mark_2");
    public boolean a = this.d.a(c, false);
    public tpe b;
    private final SpSharedPreferences<Object> d;
    private final InteractionLogger e;

    public tog(SpSharedPreferences<Object> spSharedPreferences, InteractionLogger interactionLogger) {
        this.d = spSharedPreferences;
        this.e = interactionLogger;
    }

    public final void a() {
        if (!this.a) {
            this.d.a().a(c, true).b();
            this.a = true;
            this.b.b();
            this.e.a(null, "driving_mode_dismiss_coach_marks", 0, InteractionType.HIT, "dismiss_coach_marks");
        }
    }
}
