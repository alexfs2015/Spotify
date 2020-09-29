package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.spotify.music.R;

public class TrialActivationService extends vtp {
    public jkc a;
    public kyj b;
    public jjf c;
    public jrp d;
    public jkb e;
    private boolean f;
    private TrialActivationPresenter g;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void a(Context context) {
        context.startService(new Intent(context, TrialActivationService.class));
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (!this.f) {
            this.f = true;
            jkb jkb = this.e;
            PremiumActivationNotificationStyleStrategy premiumActivationNotificationStyleStrategy = new PremiumActivationNotificationStyleStrategy(this, fl.a((Context) this), jkb.a, jkb.b, getString(R.string.trial_activation_notification_title), getString(R.string.trial_activation_notification_text), getString(R.string.trial_activation_notification_ticker), getString(R.string.trial_activation_done_notification_title), getString(R.string.trial_activation_done_notification_text), getString(R.string.trial_activation_done_notification_ticker), getString(R.string.trial_activation_failed_notification_title), getString(R.string.trial_activation_failed_notification_text), getString(R.string.trial_activation_failed_notification_ticker));
            TrialActivationPresenter trialActivationPresenter = new TrialActivationPresenter(this.a, premiumActivationNotificationStyleStrategy, this.b, this.c, this.d, new wum() {
                public final void call() {
                    TrialActivationService.this.stopSelf();
                }
            });
            this.g = trialActivationPresenter;
            this.g.a();
        }
        return 2;
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
}
