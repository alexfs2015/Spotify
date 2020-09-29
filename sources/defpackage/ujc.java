package defpackage;

import android.app.Application;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;

/* renamed from: ujc reason: default package */
public interface ujc {
    void a();

    void a(Application application);

    void a(ScreenIdentifier screenIdentifier);

    void a(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier);

    void a(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier, DialogIdentifier dialogIdentifier);

    void a(ScreenIdentifier screenIdentifier, DialogIdentifier dialogIdentifier);

    void a(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier);

    void a(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier, String str);

    void a(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier);

    void a(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier, String str);

    void a(ScreenIdentifier screenIdentifier, InputFieldIdentifier inputFieldIdentifier);

    void b();

    void b(ScreenIdentifier screenIdentifier);

    void c();
}
