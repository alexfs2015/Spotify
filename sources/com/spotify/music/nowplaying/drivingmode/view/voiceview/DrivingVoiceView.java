package com.spotify.music.nowplaying.drivingmode.view.voiceview;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Space;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher.ViewFactory;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.e;
import androidx.viewpager.widget.ViewPager.h;
import com.spotify.music.R;
import com.spotify.music.nowplaying.drivingmode.presenter.voice.DrivingVoiceState;
import com.spotify.music.nowplaying.drivingmode.view.micbutton.DrivingMicButton;
import com.spotify.music.nowplaying.drivingmode.view.voiceinputanimation.VoiceInputAnimationView;
import java.util.List;

public class DrivingVoiceView extends ConstraintLayout implements tql, tqo {
    public a b;
    public tqn c;
    private ViewPager d;
    /* access modifiers changed from: private */
    public a e;
    private TextSwitcher f;
    private TextSwitcher g;
    private AppCompatTextView h;
    private AppCompatTextView i;
    private VoiceInputAnimationView j;
    private View k;
    private int l;
    private int m;
    private DrivingMicButton n;

    public DrivingVoiceView(Context context) {
        super(context);
        d();
    }

    public DrivingVoiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public DrivingVoiceView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d();
    }

    private int a(float f2) {
        return (int) (((float) this.l) * f2);
    }

    private TextView a(float f2, int i2) {
        TextView textView = new TextView(getContext());
        vgl.a(getContext(), textView, i2);
        textView.setGravity(1);
        textView.setTextSize(2, f2);
        textView.setMaxLines(1);
        textView.setMinLines(1);
        textView.setEllipsize(TruncateAt.END);
        return textView;
    }

    /* access modifiers changed from: private */
    public void a(tqm tqm) {
        this.f.setText(tqm.a());
        this.g.setText(tqm.b());
    }

    private void a(boolean z) {
        int i2 = 0;
        this.f.setVisibility(z ? 0 : 8);
        TextSwitcher textSwitcher = this.g;
        if (!z) {
            i2 = 8;
        }
        textSwitcher.setVisibility(i2);
    }

    private int b(float f2) {
        return (int) (((float) this.m) * f2);
    }

    private void b(int i2) {
        this.i.setText(i2);
    }

    private void b(boolean z) {
        this.i.setVisibility(z ? 0 : 8);
    }

    private void c(int i2) {
        ip.a(this.k, fr.b(getContext(), i2));
    }

    private void c(boolean z) {
        this.n.setVisibility(z ? 0 : 4);
    }

    private void d() {
        inflate(getContext(), R.layout.driving_voice_view, this);
        i();
        this.k = findViewById(R.id.driving_voice_view_title_background);
        this.h = (AppCompatTextView) findViewById(R.id.driving_voice_view_intent_title);
        vgl.a(getContext(), this.h, 2132017622);
        this.i = (AppCompatTextView) findViewById(R.id.driving_voice_error_hint_text);
        vgl.a(getContext(), this.i, 2132017621);
        this.j = (VoiceInputAnimationView) findViewById(R.id.driving_voice_input_animation_view);
        this.n = (DrivingMicButton) findViewById(R.id.driving_mic_button);
        e();
        f();
        g();
        h();
    }

    private void d(int i2) {
        this.h.setTextColor(fr.c(getContext(), i2));
    }

    private void e() {
        Guideline guideline = (Guideline) findViewById(R.id.driving_voice_view_top_guideline);
        LayoutParams layoutParams = (LayoutParams) guideline.getLayoutParams();
        layoutParams.a = b(0.12f);
        guideline.setLayoutParams(layoutParams);
    }

    private void f() {
        Space space = (Space) findViewById(R.id.driving_voice_view_pager_title_space);
        LayoutParams layoutParams = (LayoutParams) space.getLayoutParams();
        layoutParams.height = b(0.02f);
        space.setLayoutParams(layoutParams);
        Space space2 = (Space) findViewById(R.id.driving_voice_title_subtitle_space);
        LayoutParams layoutParams2 = (LayoutParams) space2.getLayoutParams();
        layoutParams2.height = b(0.01f);
        space2.setLayoutParams(layoutParams2);
        Space space3 = (Space) findViewById(R.id.driving_voice_view_pager_intent_title_space);
        LayoutParams layoutParams3 = (LayoutParams) space3.getLayoutParams();
        layoutParams3.height = b(0.04f);
        space3.setLayoutParams(layoutParams3);
    }

    private void g() {
        this.f = (TextSwitcher) findViewById(R.id.driving_voice_view_context_title);
        this.g = (TextSwitcher) findViewById(R.id.driving_voice_view_context_subtitle);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), 17432576);
        loadAnimation.setDuration(150);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), 17432577);
        loadAnimation2.setDuration(150);
        this.f.setFactory(new ViewFactory() {
            public final View makeView() {
                return DrivingVoiceView.this.l();
            }
        });
        this.f.setInAnimation(loadAnimation);
        this.f.setOutAnimation(loadAnimation2);
        this.g.setFactory(new ViewFactory() {
            public final View makeView() {
                return DrivingVoiceView.this.k();
            }
        });
        this.g.setInAnimation(loadAnimation);
        this.g.setOutAnimation(loadAnimation2);
    }

    private void h() {
        this.d = (ViewPager) findViewById(R.id.driving_voice_result_viewpager);
        LayoutParams layoutParams = (LayoutParams) this.d.getLayoutParams();
        layoutParams.height = a(0.6f);
        this.d.setLayoutParams(layoutParams);
        int a = a(0.15f);
        int a2 = a(0.04f);
        this.c = new tqn();
        this.d.a((sf) this.c);
        this.d.setClipToPadding(false);
        this.d.setPadding(a, 0, a, 0);
        this.d.c(a2);
        j();
    }

    private void i() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            this.l = point.x;
            this.m = point.y;
        }
    }

    private void j() {
        this.d.a((e) new h() {
            public final void b(int i) {
                tqm tqm = (tqm) DrivingVoiceView.this.c.b.get(i);
                DrivingVoiceView.this.a(tqm);
                if (DrivingVoiceView.this.e != null) {
                    DrivingVoiceView.this.e.a(tqm.d());
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View k() {
        return a(20.0f, 2132017623);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View l() {
        return a(26.0f, 2132017624);
    }

    public final void a(List<tqm> list, String str) {
        this.j.setVisibility(8);
        this.h.setText(str);
        this.d.setVisibility(0);
        tqn tqn = this.c;
        tqn.b = list;
        tqn.c();
        this.d.a(0, false);
        a(true);
        a((tqm) list.get(0));
        b(false);
        c(true);
        c((int) R.color.driving_voice_title_background_default_color);
        d(R.color.black);
        this.b.a(DrivingVoiceState.SUCCESS);
    }

    public final void a(a aVar) {
        this.e = aVar;
    }

    public final void aR_() {
        this.j.setVisibility(0);
        this.h.setText(R.string.driving_voice_state_listening);
        this.d.setVisibility(8);
        a(false);
        b(false);
        c(false);
        c((int) R.color.driving_voice_title_background_default_color);
        d(R.color.black);
        this.b.a(DrivingVoiceState.LISTENING);
    }

    public final void b() {
        this.j.setVisibility(8);
        this.h.setText(R.string.driving_voice_state_rescue);
        this.d.setVisibility(8);
        a(false);
        b(true);
        b((int) R.string.driving_voice_state_rescue_hint);
        c(true);
        c((int) R.color.driving_voice_title_background_rescue_color);
        d(R.color.white);
        this.b.a(DrivingVoiceState.ERROR);
    }

    public final void c() {
        this.j.setVisibility(8);
        this.h.setText(R.string.driving_voice_state_network_error);
        this.d.setVisibility(8);
        a(false);
        b(true);
        b((int) R.string.driving_voice_state_network_error_hint);
        c(true);
        c((int) R.color.driving_voice_title_background_error_color);
        d(R.color.white);
        this.b.a(DrivingVoiceState.ERROR);
    }
}
