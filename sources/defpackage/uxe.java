package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.spotlets.voice.VoiceInteractionReferral;

/* renamed from: uxe reason: default package */
public final class uxe {
    private final jlr a;
    private final uvu b;
    private final fqn c;

    public uxe(jlr jlr, uvu uvu, fqn fqn) {
        this.a = jlr;
        this.b = uvu;
        this.c = fqn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, a aVar, View view) {
        View view2 = view;
        view2.setEnabled(false);
        this.b.a(activity, this.c, VoiceInteractionReferral.SEARCH_MIC_BUTTON.name(), view2);
        jlr jlr = this.a;
        bg bgVar = new bg(null, uqo.aN.a(), aVar.ae_().toString(), "MIC_FAB", 0, ViewUris.bU.toString(), InteractionType.TAP.mInteractionType, InteractionIntent.NAVIGATE.mInteractionIntent, (double) jtp.a.a());
        jlr.a(bgVar);
        view2.setEnabled(true);
    }

    public final ImageButton a(Activity activity, ViewGroup viewGroup, a aVar) {
        ImageButton imageButton = (ImageButton) LayoutInflater.from(activity).inflate(R.layout.voice_floating_mic_button, viewGroup).findViewById(R.id.voice_floating_mic_button);
        $$Lambda$uxe$5Sr5xx_XRKbjjCRCcOumBBbTE r0 = new $$Lambda$uxe$5Sr5xx_XRKbjjCRCcOumBBbTE(this, activity, aVar);
        float dimensionPixelSize = (float) activity.getResources().getDimensionPixelSize(R.dimen.voice_button_icon_size);
        Activity activity2 = activity;
        vhl vhl = new vhl(activity2, SpotifyIconV2.MIC, dimensionPixelSize, (float) activity.getResources().getDimensionPixelSize(R.dimen.voice_button_size), fr.c(activity, R.color.white), fr.c(activity, R.color.voice_floating_mic_icon));
        ip.a((View) imageButton, (Drawable) vhl);
        imageButton.setOnClickListener(r0);
        return imageButton;
    }
}
