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

public class MiniPlayerPageView extends FrameLayout implements defpackage.iwo.a {
    public TextView a;
    public View b;
    public View c;
    public gto d;
    public fqn e;
    private TextView f;
    private TextView g;
    private ConnectView h;
    private b i;
    private b j;
    private iwt k;
    private ixy l;
    private View m;
    private iwo n;
    private mjc o;

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

        private static void a(ObjectAnimator objectAnimator) {
            if (objectAnimator.getTarget() != null) {
                ((View) objectAnimator.getTarget()).setTranslationY(0.0f);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            a((ObjectAnimator) animator);
        }

        public final void onAnimationEnd(Animator animator) {
            a((ObjectAnimator) animator);
        }
    }

    static class b extends AnimatorListenerAdapter {
        boolean a;
        private boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.a = false;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.a = false;
        }

        public final void onAnimationStart(Animator animator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            View view = (View) objectAnimator.getTarget();
            if (view != null && !this.a) {
                Integer num = (Integer) view.getTag(R.id.mini_player_animation_direction_tag);
                int i = -1;
                if (num == null || num.intValue() != -1) {
                    i = 1;
                }
                float f = 0.0f;
                float measuredHeight = this.b ? (float) (view.getMeasuredHeight() * i) : 0.0f;
                float measuredHeight2 = this.b ? 0.0f : (float) (view.getMeasuredHeight() * i);
                float f2 = this.b ? 0.0f : 1.0f;
                if (this.b) {
                    f = 1.0f;
                }
                objectAnimator.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{measuredHeight, measuredHeight2}), PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{f2, f})});
            }
        }
    }

    public MiniPlayerPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private View a(Item item) {
        View view;
        int i2 = AnonymousClass1.a[item.ordinal()];
        if (i2 == 1) {
            view = this.h;
        } else if (i2 == 2) {
            view = this.g;
        } else {
            String str = "nnskoet iUtypenwm";
            throw new IllegalStateException("Unknown item type");
        }
        return view;
    }

    private static void a(View view, int i2) {
        view.setTag(R.id.mini_player_animation_direction_tag, Integer.valueOf(i2));
        view.setVisibility(8);
    }

    private static void b(View view, int i2) {
        view.setTag(R.id.mini_player_animation_direction_tag, Integer.valueOf(1));
        view.setVisibility(0);
    }

    private boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void a() {
        iwt iwt = this.k;
        if (iwt != null) {
            View view = null;
            if (iwt.a()) {
                view = a(this.k.b());
            }
            if (view == null) {
                a(new MiniPlayerDisplayRule());
                return;
            }
            View view2 = this.m;
            if (view2 != null && !view2.equals(view)) {
                a(view2, -1);
                b(view, 1);
            } else if (view2 == null) {
                b(view, 1);
            }
            this.m = view;
        }
    }

    public final void a(PlayerTrack playerTrack) {
        this.l.a(playerTrack);
    }

    public final void a(MiniPlayerDisplayRule miniPlayerDisplayRule) {
        this.l.a();
        int i2 = 0;
        View[] viewArr = {this.h, this.g};
        this.k = miniPlayerDisplayRule.b();
        if (this.k.a()) {
            this.m = a(this.k.b());
            while (i2 < 2) {
                View view = viewArr[i2];
                if (view != this.m) {
                    a(view, 1);
                }
                i2++;
            }
            b(this.m, 1);
            return;
        }
        while (i2 < 2) {
            a(viewArr[i2], 1);
            i2++;
        }
    }

    public final void a(iwo iwo) {
        iwo iwo2 = this.n;
        if (iwo2 != null) {
            iwo2.b(this);
        }
        this.n = iwo;
        iwo iwo3 = this.n;
        if (iwo3 != null) {
            iwo3.a((defpackage.iwo.a) this);
        }
    }

    public final void a(CharSequence charSequence) {
        if (!TextUtils.equals(this.a.getText(), charSequence)) {
            ixu.a(charSequence, this.a);
        }
    }

    public final gue b() {
        return this.o;
    }

    public final void c() {
        a(this.f, -1);
    }

    public final void d() {
        if (e()) {
            int i2 = 6 >> 1;
            this.i.a = true;
            this.j.a = true;
            gaw.a(this.c, this.b);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(R.id.content);
        this.a = (TextView) findViewById(R.id.title);
        this.f = (TextView) findViewById(R.id.subtitle);
        this.g = (TextView) findViewById(R.id.suggested_track_text);
        this.h = (ConnectView) findViewById(R.id.connect_view_root);
        this.c = findViewById(R.id.peek_placeholder);
        LayoutTransition layoutTransition = getLayoutTransition();
        boolean z = true & false;
        layoutTransition.setAnimateParentHierarchy(false);
        layoutTransition.setStartDelay(2, 0);
        layoutTransition.setStartDelay(1, 0);
        String str = "opt";
        String str2 = "tmomot";
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(null, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("top", new int[]{0, 1}), PropertyValuesHolder.ofInt("bottom", new int[]{0, 1})});
        layoutTransition.setAnimator(0, ofPropertyValuesHolder);
        layoutTransition.setAnimator(1, ofPropertyValuesHolder.clone());
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(null, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f, 1.0f}), PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f, 0.0f})});
        this.i = new b(false);
        ofPropertyValuesHolder2.addListener(this.i);
        ofPropertyValuesHolder2.addListener(new a(0));
        layoutTransition.setAnimator(3, ofPropertyValuesHolder2);
        ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(null, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{1.0f, 0.0f}), PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f})});
        this.j = new b(true);
        ofPropertyValuesHolder3.addListener(this.j);
        ofPropertyValuesHolder3.addListener(new a(0));
        layoutTransition.setAnimator(2, ofPropertyValuesHolder3);
        setLayerType(2, null);
        this.o = new mjc(this.h, 0, this.d, this.e);
        this.l = new ixy(this);
        fzy.a(this.a, this.f);
        fzy.a((View) this);
        this.a.setSingleLine();
        this.a.setSelected(true);
    }
}
