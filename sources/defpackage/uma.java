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

/* renamed from: uma reason: default package */
public final class uma {
    private final jjf a;
    private final ukj b;
    private final fpt c;

    public uma(jjf jjf, ukj ukj, fpt fpt) {
        this.a = jjf;
        this.b = ukj;
        this.c = fpt;
    }

    public final ImageButton a(Activity activity, ViewGroup viewGroup, a aVar) {
        ImageButton imageButton = (ImageButton) LayoutInflater.from(activity).inflate(R.layout.voice_floating_mic_button, viewGroup).findViewById(R.id.voice_floating_mic_button);
        $$Lambda$uma$RwApwQgIYl2XLlor6amIC03z3Dg r0 = new $$Lambda$uma$RwApwQgIYl2XLlor6amIC03z3Dg(this, activity, aVar);
        float dimensionPixelSize = (float) activity.getResources().getDimensionPixelSize(R.dimen.voice_button_icon_size);
        Activity activity2 = activity;
        uvv uvv = new uvv(activity2, SpotifyIconV2.MIC, dimensionPixelSize, (float) activity.getResources().getDimensionPixelSize(R.dimen.voice_button_size), fr.c(activity, R.color.white), fr.c(activity, R.color.voice_floating_mic_icon));
        ip.a((View) imageButton, (Drawable) uvv);
        imageButton.setOnClickListener(r0);
        return imageButton;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, a aVar, View view) {
        View view2 = view;
        view2.setEnabled(false);
        this.b.a(activity, this.c, VoiceInteractionReferral.SEARCH_MIC_BUTTON.name(), view2);
        jjf jjf = this.a;
        bh bhVar = new bh(null, udt.aN.a(), aVar.ae_().toString(), "MIC_FAB", 0, ViewUris.bV.toString(), InteractionType.TAP.mInteractionType, InteractionIntent.NAVIGATE.mInteractionIntent, (double) jrf.a.a());
        jjf.a(bhVar);
        view2.setEnabled(true);
    }
}
