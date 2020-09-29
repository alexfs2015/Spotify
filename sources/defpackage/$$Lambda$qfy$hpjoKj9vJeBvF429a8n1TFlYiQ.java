package defpackage;

import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import io.reactivex.functions.Consumer;
import java.util.Calendar;

/* renamed from: -$$Lambda$qfy$hpjoKj9vJeBvF429a8n1TFlY-iQ reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qfy$hpjoKj9vJeBvF429a8n1TFlYiQ implements Consumer {
    private final /* synthetic */ qfy f$0;
    private final /* synthetic */ InputFieldIdentifier f$1;
    private final /* synthetic */ ScreenIdentifier f$2;

    public /* synthetic */ $$Lambda$qfy$hpjoKj9vJeBvF429a8n1TFlYiQ(qfy qfy, InputFieldIdentifier inputFieldIdentifier, ScreenIdentifier screenIdentifier) {
        this.f$0 = qfy;
        this.f$1 = inputFieldIdentifier;
        this.f$2 = screenIdentifier;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, (Calendar) obj);
    }
}
