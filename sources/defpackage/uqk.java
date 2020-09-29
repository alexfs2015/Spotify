package defpackage;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.sociallistening.service.SocialListeningService;

/* renamed from: uqk reason: default package */
public final class uqk implements taa {
    private final Context a;
    private final uqj b;

    public uqk(Context context, uqj uqj) {
        this.a = context;
        this.b = uqj;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Intent a(Intent intent, fqn fqn) {
        if (!uok.a(fqn)) {
            return null;
        }
        jva a2 = jva.a(intent.getDataString());
        Logger.b("social listening route: Joining: %s", a2.b());
        SocialListeningService.a(a2.b(), this.a);
        return this.b.a(this.a, fqn);
    }

    public final void a(szz szz) {
        szz.a(LinkType.SOCIALSESSION, "Joins a social session from an uri", (xiz<Intent, fqn, Intent>) new $$Lambda$uqk$8nnBMSwfGtg4PtXn5SjLFpfsAIM<Intent,fqn,Intent>(this));
    }
}
