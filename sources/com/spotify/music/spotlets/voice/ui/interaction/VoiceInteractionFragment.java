package com.spotify.music.spotlets.voice.ui.interaction;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.InteractionType;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.paste.spotifyicon.SpotifyIconView;

public class VoiceInteractionFragment extends jor implements jol, uni {
    private TextView T;
    private TextView U;
    private TextView V;
    private LinearLayout W;
    private LinearLayout X;
    private float Y;
    private GradientDrawable Z;
    public unh a;
    private TextView aa;
    private View ab;
    private View ac;
    private View ad;
    private State ae;
    private FrameLayout af;
    private final AnimatorSet ag = new AnimatorSet();
    private final AnimatorSet ah = new AnimatorSet();
    private final AnimatorSet ai = new AnimatorSet();
    public umz b;

    /* renamed from: com.spotify.music.spotlets.voice.ui.interaction.VoiceInteractionFragment$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.music.spotlets.voice.ui.interaction.VoiceInteractionFragment$State[] r0 = com.spotify.music.spotlets.voice.ui.interaction.VoiceInteractionFragment.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.spotlets.voice.ui.interaction.VoiceInteractionFragment$State r1 = com.spotify.music.spotlets.voice.ui.interaction.VoiceInteractionFragment.State.PROMPT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.spotlets.voice.ui.interaction.VoiceInteractionFragment$State r1 = com.spotify.music.spotlets.voice.ui.interaction.VoiceInteractionFragment.State.QUERY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.spotlets.voice.ui.interaction.VoiceInteractionFragment.AnonymousClass1.<clinit>():void");
        }
    }

    enum State {
        PROMPT,
        QUERY
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "voice-interaction-fragment";
    }

    public static VoiceInteractionFragment a(fpt fpt) {
        VoiceInteractionFragment voiceInteractionFragment = new VoiceInteractionFragment();
        fpu.a((Fragment) voiceInteractionFragment, fpt);
        return voiceInteractionFragment;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.fragment_voice_interaction, viewGroup, false);
        View findViewById = viewGroup2.findViewById(R.id.voice_activity_background);
        SpotifyIconView spotifyIconView = (SpotifyIconView) viewGroup2.findViewById(R.id.microphone);
        this.U = (TextView) viewGroup2.findViewById(R.id.text_query);
        this.T = (TextView) viewGroup2.findViewById(R.id.text_prompt);
        this.V = (TextView) viewGroup2.findViewById(R.id.text_suggestion);
        this.W = (LinearLayout) viewGroup2.findViewById(R.id.container_suggestion);
        this.X = (LinearLayout) viewGroup2.findViewById(R.id.layout_prompt);
        this.aa = (TextView) viewGroup2.findViewById(R.id.text_error_connection);
        Context context = (Context) fay.a(n());
        GradientDrawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{fr.c(context, R.color.voice_listening_gradient_top), fr.c(context, R.color.gray_7)});
        gradientDrawable.setGradientType(1);
        gradientDrawable.setGradientCenter(0.5f, 1.0f);
        this.Z = gradientDrawable;
        this.af = (FrameLayout) viewGroup2.findViewById(R.id.voice_mic_wrapper);
        this.ab = viewGroup2.findViewById(R.id.circle_small);
        this.ac = viewGroup2.findViewById(R.id.circle_middle);
        this.ad = viewGroup2.findViewById(R.id.circle_large);
        int color = o().getResources().getColor(R.color.voice_mic_background);
        int color2 = o().getResources().getColor(17170443);
        int color3 = o().getResources().getColor(R.color.voice_listening_gradient_top);
        if (VERSION.SDK_INT >= 17) {
            this.ab.setBackground(new jqf(color2, color2, 0));
            this.ac.setBackground(new jqf(color, color, 0));
            this.ad.setBackground(new jqf(color, color, 0));
            findViewById.setBackground(this.Z);
        }
        spotifyIconView.a(color3);
        spotifyIconView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                VoiceInteractionFragment.this.b(view);
            }
        });
        spotifyIconView.setContentDescription(context.getString(R.string.voice_mic_button_content_desc));
        this.T.setTypeface(utw.a(context, 2132017668));
        this.U.setTypeface(utw.a(context, 2132017668));
        return viewGroup2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        unh unh = this.a;
        unh.d.a(this.b.a, ViewUris.bV.toString(), ViewUris.bV.toString(), "mic_button", 0, InteractionIntent.PREVIOUS, InteractionType.TAP);
        unh.a();
    }

    public final void c() {
        this.aa.clearAnimation();
        this.aa.setAlpha(1.0f);
        this.aa.setVisibility(0);
        this.aa.animate().alpha(0.0f).setStartDelay(2000);
    }

    public final void b(String str) {
        gac.a((View) this.W, 400);
        this.V.setText(str);
        this.V.setContentDescription(str);
    }

    public final void ah() {
        gac.a((View) this.W, 400);
        this.V.setText(R.string.voice_activation_suggestion_text);
        this.V.setContentDescription(a((int) R.string.voice_activation_suggestion_text));
    }

    public final void ai() {
        Logger.c("Starting animations.", new Object[0]);
        a(this.ag, this.ab, 0);
        a(this.ah, this.ac, 100);
        a(this.ai, this.ad, 200);
    }

    public final void aj() {
        Logger.c("Stopping animations.", new Object[0]);
        a(this.ag);
        a(this.ah);
        a(this.ai);
    }

    private static void a(AnimatorSet animatorSet, View view, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{1.0f, 0.9f});
        ofFloat.setDuration(400);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{1.0f, 0.9f});
        ofFloat2.setDuration(400);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setStartDelay(j);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
    }

    private static void a(AnimatorSet animatorSet) {
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void z() {
        super.z();
        Display defaultDisplay = ((Activity) fay.a(p())).getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.Y = ((float) point.y) - (((float) point.y) * 0.25f);
        unh unh = this.a;
        rda rda = unh.c;
        String str = PageIdentifiers.VOICERECOGNITION_LISTENINGOVERLAY.mPageIdentifier;
        StringBuilder sb = new StringBuilder();
        sb.append(ViewUris.bV);
        sb.append(":interaction");
        rda.a(str, sb.toString());
        unh.g = new xag();
        unh.h = this;
        unh.f = false;
        unh.h.ai();
        unh.c();
        unh.a();
        unh.b();
    }

    public final void A() {
        super.A();
        unh unh = this.a;
        unh.g.a();
        if (!unh.f && unh.i) {
            unh.b.resume();
            unh.i = false;
        }
        unh.h.aj();
    }

    public final void a(float f) {
        GradientDrawable gradientDrawable = this.Z;
        float f2 = this.Y;
        gradientDrawable.setGradientRadius(f2 + (f * f2));
    }

    public final void ak() {
        a(State.PROMPT);
        this.T.setText(o().getResources().getString(R.string.voice_activation_listening));
    }

    public final void a(String str, boolean z) {
        a(State.QUERY);
        this.U.setText(str);
        this.U.setTextColor(fr.c((Context) fay.a(n()), z ? R.color.voice_listening_text_secondary_color : R.color.voice_listening_text_primary_color));
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.VOICERECOGNITION_LISTENINGOVERLAY, null);
    }

    public final udr ag() {
        return udt.bg;
    }

    private void a(State state) {
        if (state != this.ae) {
            Logger.d("Setting new state: %s", state);
            int i = AnonymousClass1.a[state.ordinal()];
            if (i == 1) {
                gac.a((View) this.af, 400);
                gac.a((View) this.X, 400);
                gac.b(this.U, 8);
            } else if (i == 2) {
                gac.a((View) this.U, 400);
                gac.b(this.W, 8);
                gac.b(this.X, 8);
            }
            this.ae = state;
        }
    }
}
