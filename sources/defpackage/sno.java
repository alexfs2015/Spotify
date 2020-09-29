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

/* renamed from: sno reason: default package */
public final class sno implements snp {
    private final Context a;
    private final NavigationManager b;
    private final spi c;
    private final wud<Long> d;
    private final tcn e;
    private VoiceInteractionViewState f;
    private wuk g = xaj.a();

    public sno(NavigationManager navigationManager, Context context, spi spi, wud<Long> wud, tcn tcn) {
        this.b = navigationManager;
        this.a = context;
        this.c = spi;
        this.d = wud;
        this.e = tcn;
    }

    public final void a(String str, String str2, String str3, fpt fpt, Bundle bundle) {
        Logger.a("toErrorState %s, %s, %s, %s", str, str2, str3, bundle);
        a((jol) new a(fpt, str, VoiceInteractionViewState.SERVER_PROVIDED_ERROR).a(str2).b(str3).b().a().a(3000).a(VoiceInteractionViewState.FINISH).a, bundle, VoiceInteractionViewState.SERVER_PROVIDED_ERROR);
    }

    public final synchronized void a(VoiceInteractionViewState voiceInteractionViewState, fpt fpt, Activity activity, Bundle bundle) {
        if (voiceInteractionViewState != this.f) {
            this.g.unsubscribe();
            jol jol = null;
            switch (voiceInteractionViewState) {
                case INTERACTION:
                    jol = VoiceInteractionFragment.a(fpt);
                    break;
                case NO_PERMISSIONS:
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", this.a.getPackageName(), null));
                    a b2 = new a(fpt, this.a.getString(R.string.voice_error_no_permissions_title), voiceInteractionViewState).a(this.a.getString(R.string.voice_error_no_permissions_description)).b();
                    b2.b.putParcelable("voice_error_done_button_intent", intent);
                    b2.b.putString("voice_error_done_button_text", this.a.getString(R.string.voice_error_no_permissions_button));
                    if (bundle != null && bundle.getBoolean("voice_permissions_donotshow")) {
                        b2.b.putBoolean("voice_error_user_refused_permission", true);
                    }
                    jol = b2.a;
                    break;
                case OFFLINE:
                    jol = new a(fpt, this.a.getString(R.string.voice_error_offline_title), voiceInteractionViewState).a(this.a.getString(R.string.voice_error_offline_description)).b().a(3000).a(VoiceInteractionViewState.FINISH).a;
                    break;
                case APP_ERROR:
                    jol = new a(fpt, this.a.getString(R.string.voice_error_app_err_title), voiceInteractionViewState).a(this.a.getString(R.string.voice_error_app_err_description)).b().a(3000).a(VoiceInteractionViewState.FINISH).a;
                    break;
                case CONNECTION_ERROR:
                    jol = new a(fpt, this.a.getString(R.string.voice_error_connection_err_title), voiceInteractionViewState).a(this.a.getString(R.string.voice_error_connection_err_description)).b().a(3000).a(VoiceInteractionViewState.FINISH).a;
                    break;
                case TOO_MUCH_SILENCE:
                    a a2 = new a(fpt, this.a.getString(R.string.voice_error_silence_title), voiceInteractionViewState).a(this.a.getString(R.string.voice_error_silence_description)).b().a(3000).a(VoiceInteractionViewState.FINISH);
                    if (bundle != null) {
                        String string = bundle.getString("error_text");
                        if (string != null) {
                            a2.b(string);
                        }
                        jol = a2.a;
                        break;
                    } else {
                        jol = a2.a;
                        break;
                    }
                case SPEECH_RECOGNITION_FAIL:
                    jol = new a(fpt, this.a.getString(R.string.voice_error_asr_failure_title), voiceInteractionViewState).a(3000).a().b().a(VoiceInteractionViewState.FINISH).a;
                    break;
                case DID_NOT_UNDERSTAND:
                    jol = new a(fpt, this.a.getString(R.string.voice_error_nlu_failure_title), voiceInteractionViewState).a(this.a.getString(R.string.voice_error_nlu_failure_description)).a(3000).a().a(VoiceInteractionViewState.FINISH).a;
                    break;
                case ASSISTANT:
                    jol = umj.a(fpt);
                    break;
            }
            if (jol != null) {
                a(jol, bundle, voiceInteractionViewState);
            } else if (activity != null) {
                activity.finish();
            } else {
                throw new RecoverableAssertionError(String.format("Not sure how to proceed with %s state change.", new Object[]{voiceInteractionViewState.toString()}));
            }
        }
    }

    private void a(jol jol, Bundle bundle, VoiceInteractionViewState voiceInteractionViewState) {
        Logger.b("Navigating to fragment %s from %s", jol.e(), this.b.e);
        if (bundle != null) {
            ((Bundle) fay.a(jol.ae().i)).putAll(bundle);
        }
        this.g.unsubscribe();
        try {
            this.b.a(jol.ae(), jol.b(this.a), ViewUris.bV.toString(), jol.e(), jol.ag().a(), false, soq.a());
        } catch (IllegalStateException e2) {
            Logger.e(e2, "Unexpected exception while pushing fragment %s", jol.e());
        }
        this.f = voiceInteractionViewState;
    }

    public final void a() {
        if (this.a instanceof Activity) {
            this.e.a();
            ((Activity) this.a).finish();
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

    public final void a(VoiceInteractionViewState voiceInteractionViewState, fpt fpt) {
        this.g = this.d.a((wun<? super T>) new $$Lambda$sno$MGv3_IrDXLGyzw3q0n_W45rEuz8<Object>(this, voiceInteractionViewState, fpt), (wun<Throwable>) new $$Lambda$sno$1sjRcCOPiBFD8U4xWwyhpP9E8LQ<Throwable>(voiceInteractionViewState));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(VoiceInteractionViewState voiceInteractionViewState, fpt fpt, Long l) {
        a(voiceInteractionViewState, fpt, null, null);
    }

    public final void a(Activity activity, fpt fpt, String str) {
        ulx.a(activity, fpt, str, null, Boolean.TRUE);
        activity.finish();
    }

    public final void b(String str) {
        this.g = this.d.a((wun<? super T>) new $$Lambda$sno$2lVZRuIIKxTOJKDuzsE79vWRUA<Object>(this, str), (wun<Throwable>) $$Lambda$sno$SPaz3ajJEcfDDoRFXKp2SC4LP8.INSTANCE);
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

    public final VoiceInteractionViewState b() {
        return this.f;
    }
}
