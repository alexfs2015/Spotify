package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.music.R;

public class TrialActivationService extends whv {
    public jmo a;
    public lbs b;
    public jlr c;
    public jtz d;
    public jmn e;
    private boolean f;
    private TrialActivationPresenter g;

    public static void a(Context context) {
        Class<TrialActivationService> cls = TrialActivationService.class;
        context.startService(new Intent(context, TrialActivationService.class));
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        TrialActivationPresenter trialActivationPresenter = this.g;
        if (trialActivationPresenter != null) {
            trialActivationPresenter.a.b();
            if (trialActivationPresenter.b != null) {
                trialActivationPresenter.b.unsubscribe();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (!this.f) {
            this.f = true;
            jmn jmn = this.e;
            PremiumActivationNotificationStyleStrategy premiumActivationNotificationStyleStrategy = r0;
            PremiumActivationNotificationStyleStrategy premiumActivationNotificationStyleStrategy2 = new PremiumActivationNotificationStyleStrategy(this, fl.a((Context) this), jmn.a, jmn.b, getString(R.string.trial_activation_notification_title), getString(R.string.trial_activation_notification_text), getString(R.string.trial_activation_notification_ticker), getString(R.string.trial_activation_done_notification_title), getString(R.string.trial_activation_done_notification_text), getString(R.string.trial_activation_done_notification_ticker), getString(R.string.trial_activation_failed_notification_title), getString(R.string.trial_activation_failed_notification_text), getString(R.string.trial_activation_failed_notification_ticker));
            TrialActivationPresenter trialActivationPresenter = r1;
            PremiumActivationNotificationStyleStrategy premiumActivationNotificationStyleStrategy3 = premiumActivationNotificationStyleStrategy2;
            TrialActivationPresenter trialActivationPresenter2 = new TrialActivationPresenter(this.a, premiumActivationNotificationStyleStrategy2, this.b, this.c, this.d, new xir() {
                public final void call() {
                    TrialActivationService.this.stopSelf();
                }
            });
            this.g = trialActivationPresenter2;
            this.g.a();
        }
        return 2;
    }
}
