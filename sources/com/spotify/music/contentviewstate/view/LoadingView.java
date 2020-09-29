package com.spotify.music.contentviewstate.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import com.spotify.music.R;

public class LoadingView extends FrameLayout {
    private static lcf l = new lcf() {
        public final void a() {
        }

        public final long b() {
            return 0;
        }
    };
    public lcf a;
    public int b;
    public View c;
    private View d;
    private final int e;
    private final int f;
    private final int g;
    private int h;
    /* access modifiers changed from: private */
    public Animation i;
    /* access modifiers changed from: private */
    public Animation j;
    /* access modifiers changed from: private */
    public State k;
    /* access modifiers changed from: private */
    public final Runnable m;
    /* access modifiers changed from: private */
    public final Runnable n;
    private final Runnable o;
    private final AnimationListener p;

    /* renamed from: com.spotify.music.contentviewstate.view.LoadingView$6 reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] a = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.music.contentviewstate.view.LoadingView$State[] r0 = com.spotify.music.contentviewstate.view.LoadingView.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.contentviewstate.view.LoadingView$State r1 = com.spotify.music.contentviewstate.view.LoadingView.State.FADING_IN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.contentviewstate.view.LoadingView$State r1 = com.spotify.music.contentviewstate.view.LoadingView.State.FULLY_VISIBLE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.contentviewstate.view.LoadingView$State r1 = com.spotify.music.contentviewstate.view.LoadingView.State.WAITING_TO_START_FADE_IN     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.contentviewstate.view.LoadingView$State r1 = com.spotify.music.contentviewstate.view.LoadingView.State.WAITING_TO_BE_SHOWN     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.contentviewstate.view.LoadingView.AnonymousClass6.<clinit>():void");
        }
    }

    enum State {
        WAITING_TO_BE_SHOWN,
        WAITING_TO_START_FADE_IN,
        FADING_IN,
        FULLY_VISIBLE,
        FADING_OUT,
        VISIBILITY_SET_TO_GONE
    }

    public LoadingView(Context context) {
        this(context, null, 0);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.m = new Runnable() {
            public final void run() {
                if (LoadingView.this.k == State.WAITING_TO_START_FADE_IN) {
                    LoadingView.this.k = State.FADING_IN;
                    LoadingView.b(LoadingView.this);
                    LoadingView loadingView = LoadingView.this;
                    loadingView.postDelayed(loadingView.n, LoadingView.this.a.b());
                }
            }
        };
        this.n = new Runnable() {
            public final void run() {
                if (LoadingView.this.k == State.FADING_IN || LoadingView.this.k == State.FULLY_VISIBLE) {
                    LoadingView.e(LoadingView.this);
                }
            }
        };
        this.o = new Runnable() {
            public final void run() {
                int i = AnonymousClass6.a[LoadingView.this.k.ordinal()];
                if (i == 1 || i == 2) {
                    if (LoadingView.this.k == State.FADING_IN) {
                        LoadingView.f(LoadingView.this);
                    }
                    LoadingView loadingView = LoadingView.this;
                    loadingView.removeCallbacks(loadingView.n);
                    LoadingView.this.k = State.FADING_OUT;
                    LoadingView.g(LoadingView.this);
                    LoadingView.this.a.a();
                    return;
                }
                if (i == 3 || i == 4) {
                    if (LoadingView.this.k == State.WAITING_TO_START_FADE_IN) {
                        LoadingView loadingView2 = LoadingView.this;
                        loadingView2.removeCallbacks(loadingView2.m);
                    }
                    LoadingView.this.k = State.VISIBILITY_SET_TO_GONE;
                    LoadingView.f(LoadingView.this);
                    LoadingView.this.a.a();
                    LoadingView.this.setVisibility(8);
                }
            }
        };
        this.p = new jzf() {
            public final void onAnimationEnd(Animation animation) {
                if (animation == LoadingView.this.i) {
                    if (LoadingView.this.k == State.FADING_IN) {
                        LoadingView.this.k = State.FULLY_VISIBLE;
                    }
                } else if (animation == LoadingView.this.j) {
                    LoadingView.this.k = State.VISIBILITY_SET_TO_GONE;
                    LoadingView.this.setVisibility(8);
                }
            }
        };
        this.a = l;
        this.b = getResources().getInteger(R.integer.loading_view_delay_before_showing);
        this.e = getResources().getInteger(R.integer.loading_view_duration_fade_in);
        this.f = getResources().getInteger(R.integer.loading_view_duration_fade_out);
        this.g = getResources().getInteger(R.integer.loading_view_duration_content_crossfade);
        this.k = State.WAITING_TO_BE_SHOWN;
    }

    public static LoadingView a(LayoutInflater layoutInflater) {
        return (LoadingView) layoutInflater.inflate(R.layout.loading_view, null);
    }

    public static LoadingView a(LayoutInflater layoutInflater, Context context, View view) {
        LoadingView loadingView = (LoadingView) layoutInflater.inflate(R.layout.loading_view, null);
        loadingView.c = view;
        loadingView.a = new lce(context, view);
        return loadingView;
    }

    static /* synthetic */ void b(LoadingView loadingView) {
        loadingView.i = new AlphaAnimation(0.0f, 1.0f);
        loadingView.i.setDuration((long) loadingView.e);
        loadingView.i.setInterpolator(loadingView.getContext(), 17563649);
        loadingView.i.setAnimationListener(loadingView.p);
        loadingView.startAnimation(loadingView.i);
        loadingView.setVisibility(0);
    }

    static /* synthetic */ void e(LoadingView loadingView) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration((long) loadingView.e);
        loadingView.d.startAnimation(alphaAnimation);
        loadingView.d.setVisibility(0);
    }

    static /* synthetic */ void f(LoadingView loadingView) {
        if (loadingView.c != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) loadingView.g);
            alphaAnimation.setInterpolator(loadingView.getContext(), 17563649);
            loadingView.c.startAnimation(alphaAnimation);
            loadingView.c.setVisibility(0);
        }
    }

    static /* synthetic */ void g(LoadingView loadingView) {
        loadingView.j = new AlphaAnimation(((float) loadingView.h) / 255.0f, 0.0f);
        loadingView.j.setFillAfter(true);
        loadingView.j.setFillEnabled(true);
        loadingView.j.setDuration((long) loadingView.f);
        loadingView.i.setInterpolator(loadingView.getContext(), 17563649);
        loadingView.j.setAnimationListener(loadingView.p);
        loadingView.startAnimation(loadingView.j);
    }

    public final void a() {
        a(this.b);
    }

    public final void a(int i2) {
        if (this.k == State.WAITING_TO_BE_SHOWN) {
            this.k = State.WAITING_TO_START_FADE_IN;
            postDelayed(this.m, (long) i2);
        }
    }

    public final void b() {
        post(this.o);
    }

    public final void c() {
        removeCallbacks(this.m);
        removeCallbacks(this.n);
        removeCallbacks(this.o);
        setAnimation(null);
        this.d.setAnimation(null);
        View view = this.c;
        if (view != null) {
            view.setAnimation(null);
        }
        setVisibility(8);
        this.d.setVisibility(4);
        this.k = State.WAITING_TO_BE_SHOWN;
    }

    public final boolean d() {
        return this.k == State.WAITING_TO_START_FADE_IN || this.k == State.FADING_IN || this.k == State.FULLY_VISIBLE;
    }

    public final boolean e() {
        return this.k == State.FADING_OUT;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.d = findViewById(R.id.progress);
    }

    /* access modifiers changed from: protected */
    public boolean onSetAlpha(int i2) {
        this.h = i2;
        return super.onSetAlpha(i2);
    }
}
