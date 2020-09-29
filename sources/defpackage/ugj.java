package defpackage;

import android.content.Context;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import com.spotify.music.spotlets.radio.service.RadioActionsService.a;
import com.spotify.music.spotlets.radio.service.RadioStateObserver;

/* renamed from: ugj reason: default package */
public final class ugj extends hgc<a> {
    private final RadioStateObserver f;

    public ugj(Context context, RadioStateObserver radioStateObserver, String str) {
        super(context, RadioActionsService.class, str);
        this.f = radioStateObserver;
    }

    public final void g() {
        super.g();
        a aVar = (a) i();
        RadioStateObserver radioStateObserver = this.f;
        ugv ugv = RadioActionsService.this.a.c;
        ugv.a.add(radioStateObserver);
        radioStateObserver.a(ugv.c);
        radioStateObserver.a(ugv.d);
    }

    public final void b() {
        if (d()) {
            a aVar = (a) i();
            RadioActionsService.this.a.c.a.remove(this.f);
        }
        super.b();
    }

    public final wud<RadioStationModel> a(sih sih) {
        return ((a) i()).a(sih);
    }
}
