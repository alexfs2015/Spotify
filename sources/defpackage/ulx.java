package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.spotlets.voice.ui.VoiceActivity;
import com.spotify.music.spotlets.voice.ui.onboarding.VoiceOnboardingViewPagerActivity;

/* renamed from: ulx reason: default package */
public final class ulx {
    public static void a(Activity activity, fpt fpt, String str, View view) {
        Logger.b("launchVoice from referrer %s", str);
        a(activity, fpt, str, view, null);
    }

    public static void a(Activity activity, fpt fpt, String str, View view, Boolean bool) {
        fay.a(activity);
        fay.a(fpt);
        if (!ukr.a(fpt)) {
            Logger.c("Will not allow access to the Voice UX for OS lower than M.", new Object[0]);
            return;
        }
        wud a = vun.a((wrf<T>) ((hvl) ggw.a(hvl.class)).a).j($$Lambda$K6LBDee2P7uQjQt0uNTOG54xquk.INSTANCE).a(vun.a(((heg) ggw.a(heg.class)).c()));
        $$Lambda$ulx$cM76hJZnlNxCZaSYU1Ap9kdkta0 r1 = new $$Lambda$ulx$cM76hJZnlNxCZaSYU1Ap9kdkta0(activity, bool, fpt, str, view);
        a.a((wun<? super T>) r1, (wun<Throwable>) $$Lambda$ulx$lVmxPEFW8N5zA3gMyij7I6HupnQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Activity activity, Boolean bool, fpt fpt, String str, View view, SessionState sessionState) {
        if (!ukz.a(activity, bool, sessionState)) {
            activity.startActivity(VoiceOnboardingViewPagerActivity.a(activity, fpt, str));
            return;
        }
        Intent a = VoiceActivity.a(activity, fpt, str);
        if (view != null) {
            activity.startActivity(a, fb.a(activity, view, "clickedView").a());
        } else {
            activity.startActivity(a);
        }
    }
}
