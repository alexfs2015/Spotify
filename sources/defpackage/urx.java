package defpackage;

import android.content.Context;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import com.spotify.music.spotlets.radio.service.RadioActionsService.a;
import com.spotify.music.spotlets.radio.service.RadioStateObserver;

/* renamed from: urx reason: default package */
public final class urx extends hiy<a> {
    private final RadioStateObserver g;

    public urx(Context context, RadioStateObserver radioStateObserver, String str, hjw hjw) {
        super(context, RadioActionsService.class, str, hjw);
        this.g = radioStateObserver;
    }

    public final xii<RadioStationModel> a(sso sso) {
        return ((a) h()).a(sso);
    }

    public final void b() {
        if (c()) {
            a aVar = (a) h();
            RadioActionsService.this.a.c.a.remove(this.g);
        }
        super.b();
    }

    public final void f() {
        super.f();
        a aVar = (a) h();
        RadioStateObserver radioStateObserver = this.g;
        usj usj = RadioActionsService.this.a.c;
        usj.a.add(radioStateObserver);
        radioStateObserver.a(usj.c);
        radioStateObserver.a(usj.d);
    }
}
