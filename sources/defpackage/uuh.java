package defpackage;

import android.app.Application;
import com.google.common.collect.Lists;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import java.util.Arrays;
import java.util.List;

/* renamed from: uuh reason: default package */
public final class uuh implements uun {
    private final List<uun> a = Lists.a();

    public uuh(uun... uunArr) {
        this.a.addAll(Arrays.asList(uunArr));
    }

    public final void a() {
        for (uun a2 : this.a) {
            a2.a();
        }
    }

    public final void a(Application application) {
        for (uun a2 : this.a) {
            a2.a(application);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier) {
        for (uun a2 : this.a) {
            a2.a(screenIdentifier);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier) {
        for (uun a2 : this.a) {
            a2.a(screenIdentifier, clickIdentifier);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, DialogIdentifier dialogIdentifier) {
        for (uun a2 : this.a) {
            a2.a(screenIdentifier, dialogIdentifier);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        for (uun a2 : this.a) {
            a2.a(screenIdentifier, errorTypeIdentifier, inputFieldIdentifier);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier, String str) {
        for (uun a2 : this.a) {
            a2.a(screenIdentifier, errorTypeIdentifier, inputFieldIdentifier, str);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier) {
        for (uun a2 : this.a) {
            a2.a(screenIdentifier, eventIdentifier);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier, String str) {
        for (uun a2 : this.a) {
            a2.a(screenIdentifier, eventIdentifier, str);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        for (uun a2 : this.a) {
            a2.a(screenIdentifier, inputFieldIdentifier);
        }
    }

    public final void b() {
        for (uun b : this.a) {
            b.b();
        }
    }

    public final void b(ScreenIdentifier screenIdentifier) {
        for (uun b : this.a) {
            b.b(screenIdentifier);
        }
    }

    public final void c() {
        for (uun c : this.a) {
            c.c();
        }
    }
}
