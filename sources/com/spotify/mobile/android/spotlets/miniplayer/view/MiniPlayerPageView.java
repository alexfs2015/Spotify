package com.spotify.mobile.android.spotlets.miniplayer.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.mobile.android.connect.view.ConnectView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule;
import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item;
import com.spotify.music.R;

public class MiniPlayerPageView extends FrameLayout implements defpackage.iud.a {
    public TextView a;
    public View b;
    public View c;
    private TextView d;
    private TextView e;
    private ConnectView f;
    private b g;
    private b h;
    private iui i;
    private ivn j;
    private View k;
    private iud l;
    private meq m;

    /* renamed from: com.spotify.mobile.android.spotlets.miniplayer.view.MiniPlayerPageView$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Item.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule$Item[] r0 = com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule$Item r1 = com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item.CONNECT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule$Item r1 = com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item.SUGGESTED_TRACK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.spotlets.miniplayer.view.MiniPlayerPageView.AnonymousClass1.<clinit>():void");
        }
    }

    static class a extends AnimatorListenerAdapter {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final void onAnimationEnd(Animator animator) {
            a((ObjectAnimator) animator);
        }

        public final void onAnimationCancel(Animator animator) {
            a((ObjectAnimator) animator);
        }

        private static void a(ObjectAnimator objectAnimator) {
            if (objectAnimator.getTarget() != null) {
                ((View) objectAnimator.getTarget()).setTranslationY(0.0f);
            }
        }
    }

    static class b extends AnimatorListenerAdapter {
        boolean a;
        private boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final void onAnimationStart(Animator animator) {
            float f;
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            View view = (View) objectAnimator.getTarget();
            if (view != null && !this.a) {
                Integer num = (Integer) view.getTag(R.id.mini_player_animation_direction_tag);
                int i = -1;
                if (num == null || num.intValue() != -1) {
                    i = 1;
                }
                float f2 = 0.0f;
                float measuredHeight = this.b ? (float) (view.getMeasuredHeight() * i) : 0.0f;
                if (this.b) {
                    f = 0.0f;
                } else {
                    f = (float) (view.getMeasuredHeight() * i);
                }
                float f3 = this.b ? 0.0f : 1.0f;
                if (this.b) {
                    f2 = 1.0f;
                }
                objectAnimator.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{measuredHeight, f}), PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{f3, f2})});
            }
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.a = false;
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.a = false;
        }
    }

    public MiniPlayerPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static void a(View view, int i2) {
        view.setTag(R.id.mini_player_animation_direction_tag, Integer.valueOf(i2));
        view.setVisibility(8);
    }

    private static void b(View view, int i2) {
        view.setTag(R.id.mini_player_animation_direction_tag, Integer.valueOf(1));
        view.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(R.id.content);
        this.a = (TextView) findViewById(R.id.title);
        this.d = (TextView) findViewById(R.id.subtitle);
        this.e = (TextView) findViewById(R.id.suggested_track_text);
        this.f = (ConnectView) findViewById(R.id.connect_view_root);
        this.c = findViewById(R.id.peek_placeholder);
        LayoutTransition layoutTransition = getLayoutTransition();
        layoutTransition.setAnimateParentHierarchy(false);
        layoutTransition.setStartDelay(2, 0);
        layoutTransition.setStartDelay(1, 0);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(null, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("top", new int[]{0, 1}), PropertyValuesHolder.ofInt("bottom", new int[]{0, 1})});
        layoutTransition.setAnimator(0, ofPropertyValuesHolder);
        layoutTransition.setAnimator(1, ofPropertyValuesHolder.clone());
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(null, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f, 1.0f}), PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f})});
        this.g = new b(false);
        ofPropertyValuesHolder2.addListener(this.g);
        ofPropertyValuesHolder2.addListener(new a(0));
        layoutTransition.setAnimator(3, ofPropertyValuesHolder2);
        ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(null, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{1.0f, 0.0f}), PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f})});
        this.h = new b(true);
        ofPropertyValuesHolder3.addListener(this.h);
        ofPropertyValuesHolder3.addListener(new a(0));
        layoutTransition.setAnimator(2, ofPropertyValuesHolder3);
        setLayerType(2, null);
        this.m = new meq(this.f, 0);
        this.j = new ivn(this);
        fze.a(this.a, this.d);
        fze.a((View) this);
        this.a.setSingleLine();
        this.a.setSelected(true);
    }

    private View a(Item item) {
        int i2 = AnonymousClass1.a[item.ordinal()];
        if (i2 == 1) {
            return this.f;
        }
        if (i2 == 2) {
            return this.e;
        }
        throw new IllegalStateException("Unknown item type");
    }

    public final void a(PlayerTrack playerTrack) {
        this.j.a(playerTrack);
    }

    public final void a(iud iud) {
        iud iud2 = this.l;
        if (iud2 != null) {
            iud2.b(this);
        }
        this.l = iud;
        iud iud3 = this.l;
        if (iud3 != null) {
            iud3.a((defpackage.iud.a) this);
        }
    }

    public final void a() {
        iui iui = this.i;
        if (iui != null) {
            View view = null;
            if (iui.a()) {
                view = a(this.i.b());
            }
            if (view == null) {
                a(new MiniPlayerDisplayRule());
                return;
            }
            View view2 = this.k;
            if (view2 != null && !view2.equals(view)) {
                a(view2, -1);
                b(view, 1);
            } else if (view2 == null) {
                b(view, 1);
            }
            this.k = view;
        }
    }

    public final void a(MiniPlayerDisplayRule miniPlayerDisplayRule) {
        this.j.a();
        int i2 = 0;
        View[] viewArr = {this.f, this.e};
        this.i = miniPlayerDisplayRule.b();
        if (this.i.a()) {
            this.k = a(this.i.b());
            while (i2 < 2) {
                View view = viewArr[i2];
                if (view != this.k) {
                    a(view, 1);
                }
                i2++;
            }
            b(this.k, 1);
            return;
        }
        while (i2 < 2) {
            a(viewArr[i2], 1);
            i2++;
        }
    }

    public final gse b() {
        return this.m;
    }

    public final void a(CharSequence charSequence) {
        if (!TextUtils.equals(this.a.getText(), charSequence)) {
            ivj.a(charSequence, this.a);
        }
    }

    public final void c() {
        a(this.d, -1);
    }

    private boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void d() {
        if (e()) {
            this.g.a = true;
            this.h.a = true;
            gac.a(this.c, this.b);
        }
    }
}
