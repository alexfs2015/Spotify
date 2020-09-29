package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: oje reason: default package */
public final class oje {
    final Set<InputFieldIdentifier> a = EnumSet.noneOf(InputFieldIdentifier.class);
    private final uun b;

    public oje(uun uun) {
        this.b = (uun) fbp.a(uun);
    }

    public final void a(InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier) {
        if (!this.a.contains(inputFieldIdentifier)) {
            this.a.add(inputFieldIdentifier);
            Logger.a("FieldTracker - Tracking interaction %s:%s", screenIdentifier, inputFieldIdentifier);
            this.b.a(screenIdentifier, inputFieldIdentifier);
        }
    }
}
