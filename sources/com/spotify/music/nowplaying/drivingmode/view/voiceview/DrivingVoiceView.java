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
import java.util.List;

public class DrivingVoiceView extends ConstraintLayout implements tfu, tfx {
    public a b;
    public tfw c;
    private ViewPager d;
    /* access modifiers changed from: private */
    public a e;
    private TextSwitcher f;
    private TextSwitcher g;
    private AppCompatTextView h;
    private int i;
    private int j;

    public DrivingVoiceView(Context context) {
        super(context);
        c();
    }

    public DrivingVoiceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public DrivingVoiceView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c();
    }

    private void c() {
        inflate(getContext(), R.layout.driving_voice_view, this);
        h();
        this.h = (AppCompatTextView) findViewById(R.id.driving_voice_view_intent_title);
        uuu.a(getContext(), this.h, 2132017619);
        d();
        e();
        f();
        g();
    }

    private void d() {
        Guideline guideline = (Guideline) findViewById(R.id.driving_voice_view_top_guideline);
        LayoutParams layoutParams = (LayoutParams) guideline.getLayoutParams();
        layoutParams.a = b(0.12f);
        guideline.setLayoutParams(layoutParams);
    }

    private void e() {
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

    private void f() {
        this.f = (TextSwitcher) findViewById(R.id.driving_voice_view_context_title);
        this.g = (TextSwitcher) findViewById(R.id.driving_voice_view_context_subtitle);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), 17432576);
        loadAnimation.setDuration(150);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), 17432577);
        loadAnimation2.setDuration(150);
        this.f.setFactory(new ViewFactory() {
            public final View makeView() {
                return DrivingVoiceView.this.k();
            }
        });
        this.f.setInAnimation(loadAnimation);
        this.f.setOutAnimation(loadAnimation2);
        this.g.setFactory(new ViewFactory() {
            public final View makeView() {
                return DrivingVoiceView.this.j();
            }
        });
        this.g.setInAnimation(loadAnimation);
        this.g.setOutAnimation(loadAnimation2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View k() {
        return a(26.0f, 2132017621);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View j() {
        return a(20.0f, 2132017620);
    }

    private TextView a(float f2, int i2) {
        TextView textView = new TextView(getContext());
        uuu.a(getContext(), textView, i2);
        textView.setGravity(1);
        textView.setTextSize(2, f2);
        textView.setMaxLines(1);
        textView.setMinLines(1);
        textView.setEllipsize(TruncateAt.END);
        return textView;
    }

    private void g() {
        this.d = (ViewPager) findViewById(R.id.driving_voice_result_viewpager);
        LayoutParams layoutParams = (LayoutParams) this.d.getLayoutParams();
        layoutParams.height = a(0.6f);
        this.d.setLayoutParams(layoutParams);
        int a = a(0.15f);
        int a2 = a(0.04f);
        this.c = new tfw();
        this.d.a((sa) this.c);
        this.d.setClipToPadding(false);
        this.d.setPadding(a, 0, a, 0);
        this.d.c(a2);
        i();
    }

    private int a(float f2) {
        return (int) (((float) this.i) * f2);
    }

    private int b(float f2) {
        return (int) (((float) this.j) * f2);
    }

    private void h() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            this.i = point.x;
            this.j = point.y;
        }
    }

    private void i() {
        this.d.a((e) new h() {
            public final void b(int i) {
                tfv tfv = (tfv) DrivingVoiceView.this.c.b.get(i);
                DrivingVoiceView.this.a(tfv);
                if (DrivingVoiceView.this.e != null) {
                    DrivingVoiceView.this.e.a(tfv.d());
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(tfv tfv) {
        this.f.setText(tfv.a());
        this.g.setText(tfv.b());
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

    public final void aT_() {
        this.h.setText(R.string.driving_voice_state_listening);
        this.d.setVisibility(8);
        a(false);
        this.b.a(DrivingVoiceState.LISTENING);
    }

    public final void a(List<tfv> list, String str) {
        this.h.setText(str);
        this.d.setVisibility(0);
        tfw tfw = this.c;
        tfw.b = list;
        tfw.c();
        this.d.a(0, false);
        a(true);
        a((tfv) list.get(0));
        this.b.a(DrivingVoiceState.SUCCESS);
    }

    public final void b() {
        this.h.setText(R.string.driving_voice_state_rescue);
        this.d.setVisibility(8);
        a(false);
        this.b.a(DrivingVoiceState.ERROR);
    }

    public final void a(a aVar) {
        this.e = aVar;
    }
}
