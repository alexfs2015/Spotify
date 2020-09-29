package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion.RecoverableAssertionError;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.navigation.NavigationManager;
import com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState;
import com.spotify.music.spotlets.voice.ui.interaction.VoiceInteractionFragment;

/* renamed from: sxv reason: default package */
public final class sxv implements sxw {
    private final Context a;
    private final NavigationManager b;
    private final szp c;
    private final xii<Long> d;
    private final tmu e;
    private VoiceInteractionViewState f;
    private xip g = xon.a();

    public sxv(NavigationManager navigationManager, Context context, szp szp, xii<Long> xii, tmu tmu) {
        this.b = navigationManager;
        this.a = context;
        this.c = szp;
        this.d = xii;
        this.e = tmu;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(VoiceInteractionViewState voiceInteractionViewState, fqn fqn, Long l) {
        a(voiceInteractionViewState, fqn, null, null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Long l) {
        if (str != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("force_navigation_key", true);
            this.c.a(str, bundle);
        }
        Context context = this.a;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    private void a(jqx jqx, Bundle bundle, VoiceInteractionViewState voiceInteractionViewState) {
        Logger.b("Navigating to fragment %s from %s", jqx.e(), this.b.e);
        if (bundle != null) {
            ((Bundle) fbp.a(jqx.ae().i)).putAll(bundle);
        }
        this.g.unsubscribe();
        try {
            this.b.a(jqx.ae(), jqx.b(this.a), ViewUris.bU.toString(), jqx.e(), jqx.ag().a(), false, syx.a());
        } catch (IllegalStateException e2) {
            Logger.e(e2, "Unexpected exception while pushing fragment %s", jqx.e());
        }
        this.f = voiceInteractionViewState;
    }

    public final void a() {
        if (this.a instanceof Activity) {
            this.e.a();
            ((Activity) this.a).finish();
        }
    }

    public final void a(Activity activity, fqn fqn, String str) {
        uxb.a(activity, fqn, str, null, Boolean.TRUE);
        activity.finish();
    }

    public final void a(VoiceInteractionViewState voiceInteractionViewState, fqn fqn) {
        this.g = this.d.a((xis<? super T>) new $$Lambda$sxv$mjbT1r28ABmq2x21O5Drg56pHco<Object>(this, voiceInteractionViewState, fqn), (xis<Throwable>) new $$Lambda$sxv$wSs46CETC_TVe1FPpRMti8Ky3Q<Throwable>(voiceInteractionViewState));
    }

    public final synchronized void a(VoiceInteractionViewState voiceInteractionViewState, fqn fqn, Activity activity, Bundle bundle) {
        if (voiceInteractionViewState != this.f) {
            this.g.unsubscribe();
            jqx jqx = null;
            switch (voiceInteractionViewState) {
                case INTERACTION:
                    jqx = VoiceInteractionFragment.a(fqn);
                    break;
                case NO_PERMISSIONS:
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", this.a.getPackageName(), null));
                    a b2 = new a(fqn, this.a.getString(R.string.voice_error_no_permissions_title), voiceInteractionViewState).a(this.a.getString(R.string.voice_error_no_permissions_description)).b();
                    b2.b.putParcelable("voice_error_done_button_intent", intent);
                    b2.b.putString("voice_error_done_button_text", this.a.getString(R.string.voice_error_no_permissions_button));
                    if (bundle != null && bundle.getBoolean("voice_permissions_donotshow")) {
                        b2.b.putBoolean("voice_error_user_refused_permission", true);
                    }
                    jqx = b2.a;
                    break;
                case OFFLINE:
                    jqx = new a(fqn, this.a.getString(R.string.voice_error_offline_title), voiceInteractionViewState).a(this.a.getString(R.string.voice_error_offline_description)).b().a(3000).a(VoiceInteractionViewState.FINISH).a;
                    break;
                case APP_ERROR:
                    jqx = new a(fqn, this.a.getString(R.string.voice_error_app_err_title), voiceInteractionViewState).a(this.a.getString(R.string.voice_error_app_err_description)).b().a(3000).a(VoiceInteractionViewState.FINISH).a;
                    break;
                case CONNECTION_ERROR:
                    jqx = new a(fqn, this.a.getString(R.string.voice_error_connection_err_title), voiceInteractionViewState).a(this.a.getString(R.string.voice_error_connection_err_description)).b().a(3000).a(VoiceInteractionViewState.FINISH).a;
                    break;
                case TOO_MUCH_SILENCE:
                    a a2 = new a(fqn, this.a.getString(R.string.voice_error_silence_title), voiceInteractionViewState).a(this.a.getString(R.string.voice_error_silence_description)).b().a(3000).a(VoiceInteractionViewState.FINISH);
                    if (bundle != null) {
                        String string = bundle.getString("error_text");
                        if (string != null) {
                            a2.b(string);
                        }
                        jqx = a2.a;
                        break;
                    } else {
                        jqx = a2.a;
                        break;
                    }
                case SPEECH_RECOGNITION_FAIL:
                    jqx = new a(fqn, this.a.getString(R.string.voice_error_asr_failure_title), voiceInteractionViewState).a(3000).a().b().a(VoiceInteractionViewState.FINISH).a;
                    break;
                case DID_NOT_UNDERSTAND:
                    jqx = new a(fqn, this.a.getString(R.string.voice_error_nlu_failure_title), voiceInteractionViewState).a(this.a.getString(R.string.voice_error_nlu_failure_description)).a(3000).a().a(VoiceInteractionViewState.FINISH).a;
                    break;
                case ASSISTANT:
                    jqx = uxn.a(fqn);
                    break;
            }
            if (jqx != null) {
                a(jqx, bundle, voiceInteractionViewState);
            } else if (activity != null) {
                activity.finish();
            } else {
                throw new RecoverableAssertionError(String.format("Not sure how to proceed with %s state change.", new Object[]{voiceInteractionViewState.toString()}));
            }
        }
    }

    public final void a(String str) {
        Logger.b("Deep linking: %s", str);
        if (str != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("force_navigation_key", true);
            this.c.a(str, bundle);
        }
        Context context = this.a;
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    public final void a(String str, String str2, String str3, fqn fqn, Bundle bundle) {
        Logger.a("toErrorState %s, %s, %s, %s", str, str2, str3, bundle);
        a((jqx) new a(fqn, str, VoiceInteractionViewState.SERVER_PROVIDED_ERROR).a(str2).b(str3).b().a().a(3000).a(VoiceInteractionViewState.FINISH).a, bundle, VoiceInteractionViewState.SERVER_PROVIDED_ERROR);
    }

    public final VoiceInteractionViewState b() {
        return this.f;
    }

    public final void b(String str) {
        this.g = this.d.a((xis<? super T>) new $$Lambda$sxv$Yb9PHKQDO3KcTtMRpLUAtpsjJVU<Object>(this, str), (xis<Throwable>) $$Lambda$sxv$CCiQfqt16GWhN_uGZGovztvvqI.INSTANCE);
    }
}
