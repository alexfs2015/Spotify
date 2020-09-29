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

/* renamed from: uiw reason: default package */
public final class uiw implements ujc {
    private final List<ujc> a = Lists.a();

    public uiw(ujc... ujcArr) {
        this.a.addAll(Arrays.asList(ujcArr));
    }

    public final void a(Application application) {
        for (ujc a2 : this.a) {
            a2.a(application);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier) {
        for (ujc a2 : this.a) {
            a2.a(screenIdentifier, clickIdentifier);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier, DialogIdentifier dialogIdentifier) {
        for (ujc a2 : this.a) {
            a2.a(screenIdentifier, clickIdentifier, dialogIdentifier);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier) {
        for (ujc a2 : this.a) {
            a2.a(screenIdentifier);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, DialogIdentifier dialogIdentifier) {
        for (ujc a2 : this.a) {
            a2.a(screenIdentifier, dialogIdentifier);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        for (ujc a2 : this.a) {
            a2.a(screenIdentifier, inputFieldIdentifier);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier) {
        for (ujc a2 : this.a) {
            a2.a(screenIdentifier, eventIdentifier);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier, String str) {
        for (ujc a2 : this.a) {
            a2.a(screenIdentifier, eventIdentifier, str);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier, String str) {
        for (ujc a2 : this.a) {
            a2.a(screenIdentifier, errorTypeIdentifier, inputFieldIdentifier, str);
        }
    }

    public final void a(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        for (ujc a2 : this.a) {
            a2.a(screenIdentifier, errorTypeIdentifier, inputFieldIdentifier);
        }
    }

    public final void b(ScreenIdentifier screenIdentifier) {
        for (ujc b : this.a) {
            b.b(screenIdentifier);
        }
    }

    public final void a() {
        for (ujc a2 : this.a) {
            a2.a();
        }
    }

    public final void b() {
        for (ujc b : this.a) {
            b.b();
        }
    }

    public final void c() {
        for (ujc c : this.a) {
            c.c();
        }
    }
}
