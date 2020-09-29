package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.sociallistening.service.SocialListeningService;

/* renamed from: udp reason: default package */
public final class udp implements spt {
    private final Context a;
    private final udo b;

    public udp(Context context, udo udo) {
        this.a = context;
        this.b = udo;
    }

    public final void a(sps sps) {
        sps.a(LinkType.SOCIALSESSION, "Joins a social session from an uri", (wuu<Intent, fpt, Intent>) new $$Lambda$udp$ymZbkgXrnVrxc2AealKR17y8CIk<Intent,fpt,Intent>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Intent a(Intent intent, fpt fpt) {
        if (!ubp.a(fpt)) {
            return null;
        }
        jst a2 = jst.a(intent.getDataString());
        Logger.b("social listening route: Joining: %s", a2.b());
        SocialListeningService.a(a2.b(), this.a);
        return this.b.a(this.a, fpt);
    }
}
