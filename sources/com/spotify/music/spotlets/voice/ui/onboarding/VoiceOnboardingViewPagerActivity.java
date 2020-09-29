package com.spotify.music.spotlets.voice.ui.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.paste.widgets.ViewPagerIndicator;

public class VoiceOnboardingViewPagerActivity extends lbm {
    public sxw g;
    public uyq h;
    private a i;
    private ViewPager j;
    /* access modifiers changed from: private */
    public String k = "Complete";
    /* access modifiers changed from: private */
    public String l = "";

    static final class a extends kq {
        private static final int[] a = {R.drawable.voice_onboarding_01, R.drawable.voice_onboarding_02, R.drawable.voice_onboarding_03};
        private static final int[] b = {R.string.voice_onboarding_title_1, R.string.voice_onboarding_title_2, R.string.voice_onboarding_title_3};
        private static final int[] c = {R.string.voice_onboarding_description_1, R.string.voice_onboarding_description_2, R.string.voice_onboarding_description_3};
        private static final int[] d = {R.string.voice_onboarding_content_desc_1, R.string.voice_onboarding_content_desc_2, R.string.voice_onboarding_content_desc_3};

        public a(kk kkVar) {
            super(kkVar);
        }

        public final Fragment a(int i) {
            int i2 = b[i];
            int i3 = c[i];
            int i4 = d[i];
            int i5 = a[i];
            boolean z = true;
            boolean z2 = i == 2;
            if (i != 0) {
                z = false;
            }
            return uyn.a(i2, i3, i4, i5, z2, z);
        }

        public final int b() {
            return 3;
        }
    }

    public static Intent a(Context context, fqn fqn, String str) {
        Intent intent = new Intent(context, VoiceOnboardingViewPagerActivity.class);
        intent.putExtra("voice_internal_referrer", str);
        fqo.a(intent, fqn);
        return intent;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.VOICERECOGNITION_LISTENINGOVERLAY, ViewUris.bX.toString());
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.k = "Back";
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_voice_onboarding);
        if (!uvx.a(fqo.a((Activity) this))) {
            Logger.d("Somehow started %s, but will not allow access", getClass().getSimpleName());
            finish();
            return;
        }
        this.l = getIntent().getStringExtra("voice_internal_referrer");
        this.j = (ViewPager) findViewById(R.id.onboarding_pager);
        this.i = new a(i());
        this.j.a((sf) this.i);
        ViewPagerIndicator viewPagerIndicator = (ViewPagerIndicator) findViewById(R.id.page_indicator);
        viewPagerIndicator.setVisibility(0);
        viewPagerIndicator.a(this.j);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable((Context) this, SpotifyIconV2.X, (float) getResources().getDimensionPixelSize(R.dimen.action_bar_close_icon));
        spotifyIconDrawable.a(fr.c(getBaseContext(), R.color.white));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.b((Drawable) spotifyIconDrawable);
        toolbar.b((int) R.string.voice_onboarding_close_content_description);
        toolbar.a((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                VoiceOnboardingViewPagerActivity.this.k = "Close";
                VoiceOnboardingViewPagerActivity.this.h.a(InteractionIntent.CLOSE);
                sxw sxw = VoiceOnboardingViewPagerActivity.this.g;
                VoiceOnboardingViewPagerActivity voiceOnboardingViewPagerActivity = VoiceOnboardingViewPagerActivity.this;
                sxw.a(voiceOnboardingViewPagerActivity, fqo.a((Activity) voiceOnboardingViewPagerActivity), VoiceOnboardingViewPagerActivity.this.l);
            }
        });
    }

    public void onDestroy() {
        super.onDestroy();
        uyq uyq = this.h;
        String str = this.l;
        long j2 = (long) (this.j.c + 1);
        a aVar = this.i;
        long j3 = (long) 3;
        String str2 = this.k;
        String str3 = "1";
        Logger.a("Logging Onboarding mesg %s %s %s %s %s %s", uyq.a, str, Long.valueOf(j2), Long.valueOf(j3), str3, str2);
        jlr jlr = uyq.b;
        bp bpVar = new bp(uyq.a, str, j2, j3, str3, str2);
        jlr.a(bpVar);
    }
}
