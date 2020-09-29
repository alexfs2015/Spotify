package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: uxk reason: default package */
public final class uxk implements uxj {
    private final uxe a;
    private final uxc b;
    private final uxg c;

    public uxk(uxe uxe, uxc uxc, uxg uxg) {
        this.a = uxe;
        this.b = uxc;
        this.c = uxg;
    }

    public final View a(Activity activity, ViewGroup viewGroup) {
        View.inflate(activity, R.layout.voice_mic_callout_tooltip, viewGroup);
        return viewGroup.findViewById(R.id.tooltip_container);
    }

    public final View a(Context context) {
        LayoutParams layoutParams = new LayoutParams(vfj.b(40.0f, context.getResources()), -1);
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(context);
        stateListAnimatorImageButton.setImageDrawable(new SpotifyIconDrawable(context, SpotifyIconV2.MIC, (float) vfj.b(24.0f, context.getResources())));
        stateListAnimatorImageButton.setBackgroundColor(fr.c(context, R.color.gray_7));
        stateListAnimatorImageButton.setContentDescription(context.getString(R.string.voice_mic_button_content_desc));
        stateListAnimatorImageButton.setId(R.id.search_voice_button);
        stateListAnimatorImageButton.setLayoutParams(layoutParams);
        return stateListAnimatorImageButton;
    }

    public final ImageButton a(Activity activity, ViewGroup viewGroup, a aVar) {
        return this.a.a(activity, viewGroup, aVar);
    }

    public final void a() {
        jlr jlr = this.b.a;
        bg bgVar = new bg(null, uqo.U.a(), ViewUris.ae.toString(), "MIC_BROWSE", -1, ViewUris.bU.toString(), InteractionType.TAP.mInteractionType, InteractionIntent.NAVIGATE.mInteractionIntent, (double) jtp.a.a());
        jlr.a(bgVar);
    }

    public final void a(View view, ViewGroup viewGroup, a aVar, boolean z) {
        this.c.a(view, viewGroup, aVar, true);
    }

    public final void b() {
        jlr jlr = this.b.a;
        be beVar = new be(null, uqo.U.a(), ViewUris.ae.toString(), "MIC_BROWSE", -1, ViewUris.bU.toString(), "page", null, (double) jtp.a.a());
        jlr.a(beVar);
    }
}
