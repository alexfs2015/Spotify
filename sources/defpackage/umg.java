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

/* renamed from: umg reason: default package */
public final class umg implements umf {
    private final uma a;
    private final uly b;
    private final umc c;

    public umg(uma uma, uly uly, umc umc) {
        this.a = uma;
        this.b = uly;
        this.c = umc;
    }

    public final ImageButton a(Activity activity, ViewGroup viewGroup, a aVar) {
        return this.a.a(activity, viewGroup, aVar);
    }

    public final void a(View view, ViewGroup viewGroup, a aVar, boolean z) {
        this.c.a(view, viewGroup, aVar, true);
    }

    public final void a() {
        jjf jjf = this.b.a;
        bh bhVar = new bh(null, udt.U.a(), ViewUris.af.toString(), "MIC_BROWSE", -1, ViewUris.bV.toString(), InteractionType.TAP.mInteractionType, InteractionIntent.NAVIGATE.mInteractionIntent, (double) jrf.a.a());
        jjf.a(bhVar);
    }

    public final void b() {
        jjf jjf = this.b.a;
        bf bfVar = new bf(null, udt.U.a(), ViewUris.af.toString(), "MIC_BROWSE", -1, ViewUris.bV.toString(), "page", null, (double) jrf.a.a());
        jjf.a(bfVar);
    }

    public final View a(Context context) {
        LayoutParams layoutParams = new LayoutParams(uts.b(40.0f, context.getResources()), -1);
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(context);
        stateListAnimatorImageButton.setImageDrawable(new SpotifyIconDrawable(context, SpotifyIconV2.MIC, (float) uts.b(24.0f, context.getResources())));
        stateListAnimatorImageButton.setBackgroundColor(fr.c(context, R.color.gray_7));
        stateListAnimatorImageButton.setContentDescription(context.getString(R.string.voice_mic_button_content_desc));
        stateListAnimatorImageButton.setId(R.id.search_voice_button);
        stateListAnimatorImageButton.setLayoutParams(layoutParams);
        return stateListAnimatorImageButton;
    }

    public final View a(Activity activity, ViewGroup viewGroup) {
        View.inflate(activity, R.layout.voice_mic_callout_tooltip, viewGroup);
        return viewGroup.findViewById(R.id.tooltip_container);
    }
}
