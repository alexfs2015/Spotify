package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.spotlets.voice.ui.VoiceInteractionViewState;

/* renamed from: uxx reason: default package */
public class uxx extends jrd implements jqx, uyb {
    private boolean T;
    private Button U;
    private View V;
    public sxw a;
    public uya b;

    /* renamed from: uxx$a */
    public static class a {
        public final uxx a = new uxx();
        public final Bundle b;

        public a(fqn fqn, String str, VoiceInteractionViewState voiceInteractionViewState) {
            fqo.a((Fragment) this.a, fqn);
            this.b = (Bundle) fbp.a(this.a.i);
            this.b.putString("voice_error_title", str);
            this.b.putSerializable("voice_error_type", voiceInteractionViewState);
        }

        public final a a() {
            this.b.putBoolean("voice_error_show_mic", true);
            return this;
        }

        public final a a(long j) {
            this.b.putLong("voice_error_display_ttl", 3000);
            return this;
        }

        public final a a(VoiceInteractionViewState voiceInteractionViewState) {
            this.b.putSerializable("voice_next_view_state", voiceInteractionViewState);
            return this;
        }

        public final a a(String str) {
            if (str != null) {
                this.b.putString("voice_error_description", str);
            }
            return this;
        }

        public final a b() {
            this.b.putBoolean("voice_error_show_ok", true);
            return this;
        }

        public final a b(String str) {
            this.b.putString("voice_error_log_statement", str);
            return this;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent, View view) {
        if (intent == null) {
            this.b.a("ok_button");
            this.a.a(VoiceInteractionViewState.FINISH, fqo.a((Fragment) this), p(), null);
            return;
        }
        a(intent);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.b.a("mic_button");
        this.a.a(VoiceInteractionViewState.INTERACTION, fqo.a((Fragment) this), p(), null);
    }

    public final void B() {
        super.B();
        this.b.a.a();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_voice_error, viewGroup, false);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.content_description);
        Bundle bundle3 = (Bundle) fbp.a(this.i);
        ((TextView) viewGroup2.findViewById(R.id.content_title)).setText(bundle3.getString("voice_error_title"));
        String str = "voice_error_description";
        String string = bundle3.getString(str);
        textView.setText(bundle3.getString(str));
        if (fbo.a(string)) {
            textView.setVisibility(8);
        }
        this.V = viewGroup2.findViewById(R.id.voice_mic_wrapper);
        this.U = (Button) viewGroup2.findViewById(R.id.ok_button);
        ImageButton imageButton = (ImageButton) viewGroup2.findViewById(R.id.microphone);
        ip.a((View) imageButton, uxm.a((Context) fbp.a(n())));
        imageButton.setOnClickListener(new $$Lambda$uxx$GPqfsLJVm_PqQtFBpwvZQlm1FxQ(this));
        this.T = bundle2 != null && bundle2.getBoolean("voice_error_has_already_logged", false);
        String string2 = bundle3.getString("voice_error_log_statement");
        VoiceInteractionViewState voiceInteractionViewState = (VoiceInteractionViewState) bundle3.getSerializable("voice_error_type");
        VoiceInteractionViewState voiceInteractionViewState2 = (VoiceInteractionViewState) bundle3.getSerializable("voice_next_view_state");
        this.U.setOnClickListener(new $$Lambda$uxx$GvQD0REU07oiMKi73u7xHWj0SM(this, (Intent) bundle3.getParcelable("voice_error_done_button_intent")));
        this.b.a(this, this.T, voiceInteractionViewState, string2, bundle3.getLong("voice_error_display_ttl"), voiceInteractionViewState2, bundle3.getBoolean("voice_error_show_mic", false), bundle3.getBoolean("voice_error_show_ok", false), bundle3.getString("voice_error_done_button_text"), bundle3.getBoolean("voice_error_user_refused_permission"));
        this.T = true;
        return viewGroup2;
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.VOICERECOGNITION_LISTENINGOVERLAY, null);
    }

    public final uqm ag() {
        return uqo.bg;
    }

    public final void ah() {
        this.U.setVisibility(4);
    }

    public final void ai() {
        this.V.setVisibility(0);
    }

    public final void aj() {
        this.V.setVisibility(4);
    }

    public final String b(Context context) {
        return "";
    }

    public final void b(String str) {
        this.U.setText(str);
    }

    public final void c() {
        this.U.setVisibility(0);
    }

    public final String e() {
        return "voice-interaction-error-fragment";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("voice_error_has_already_logged", this.T);
    }
}
