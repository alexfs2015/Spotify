package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.spotlets.voice.ui.VoiceActivity;
import com.spotify.music.spotlets.voice.ui.onboarding.VoiceOnboardingViewPagerActivity;

/* renamed from: uxb reason: default package */
public final class uxb {
    public static void a(Activity activity, fqn fqn, String str, View view) {
        Logger.b("launchVoice from referrer %s", str);
        a(activity, fqn, str, view, null);
    }

    public static void a(Activity activity, fqn fqn, String str, View view, Boolean bool) {
        fbp.a(activity);
        fbp.a(fqn);
        if (!uvx.a(fqn)) {
            Logger.c("Will not allow access to the Voice UX for OS lower than M.", new Object[0]);
            return;
        }
        xii a = wit.a((xfk<T>) ((hxx) gih.a(hxx.class)).a).i($$Lambda$TqnEXuCpi0iJVFC5FQQtiiwXxE.INSTANCE).a(wit.a(((hhc) gih.a(hhc.class)).c()));
        $$Lambda$uxb$uFXroXooHRWt2FDQm0WVAJiVSdU r1 = new $$Lambda$uxb$uFXroXooHRWt2FDQm0WVAJiVSdU(activity, bool, fqn, str, view);
        a.a((xis<? super T>) r1, (xis<Throwable>) $$Lambda$uxb$mS3d0d3HRTwTnSpnNiqIx1UUv1s.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Activity activity, Boolean bool, fqn fqn, String str, View view, SessionState sessionState) {
        if (!uwd.a(activity, bool, sessionState)) {
            activity.startActivity(VoiceOnboardingViewPagerActivity.a(activity, fqn, str));
            return;
        }
        Intent a = VoiceActivity.a(activity, fqn, str);
        if (view != null) {
            activity.startActivity(a, fb.a(activity, view, "clickedView").a());
        } else {
            activity.startActivity(a);
        }
    }
}
