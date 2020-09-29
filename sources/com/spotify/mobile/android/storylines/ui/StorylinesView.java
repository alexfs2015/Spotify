package com.spotify.mobile.android.storylines.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.stories.view.StoriesProgressView;
import com.spotify.android.stories.view.StoriesProgressView.a;
import com.spotify.mobile.android.storylines.model.StorylinesCardImageModel;
import com.spotify.music.R;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager.MeasureMode;
import com.spotify.paste.widgets.carousel.CarouselView;
import com.squareup.picasso.Picasso;
import java.util.List;

public class StorylinesView extends CardView implements a, StorylinesCardView.a, jlf {
    public jld i;
    public CarouselView j;
    public Picasso k;
    private StoriesProgressView l;
    private View m;
    private TextView n;
    private ImageView o;
    private a p;
    private ToggleButton q;
    private TextView r;
    private TextView s;
    /* access modifiers changed from: private */
    public View t;
    private int u;
    private int v = -1;
    private boolean w;
    private final Handler x = new Handler();
    private final Runnable y = new Runnable() {
        public final void run() {
            StorylinesView.this.g();
        }
    };

    public StorylinesView(Context context) {
        super(context);
        d();
    }

    public StorylinesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    private static double a(int i2, int i3, int[] iArr) {
        int i4 = iArr[1];
        int i5 = i4 + i3;
        if (i3 == 0) {
            return -1.0d;
        }
        if (i5 >= 0) {
            if (i4 <= i2) {
                double min = (double) (Math.min(i2, i5) - Math.max(0, i4));
                double d = (double) i3;
                Double.isNaN(min);
                Double.isNaN(d);
                return Math.floor((min / d) * 100.0d);
            }
        }
        return 0.0d;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.p;
        if (aVar != null) {
            aVar.b(this.j.n(), h());
        }
    }

    private boolean a(MotionEvent motionEvent, Runnable runnable) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        this.l.c();
                        this.x.removeCallbacks(this.y);
                        this.w = false;
                    }
                }
            }
            this.l.c();
            this.x.removeCallbacks(this.y);
            if (!this.w && motionEvent.getAction() == 1) {
                runnable.run();
            }
            this.w = false;
        } else {
            this.l.b();
            this.x.postDelayed(this.y, 200);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return a(motionEvent, (Runnable) new Runnable() {
            public final void run() {
                StorylinesView.this.e();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        a aVar = this.p;
        if (aVar != null) {
            aVar.a(this.j.n(), h());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean b(View view, MotionEvent motionEvent) {
        return a(motionEvent, (Runnable) new Runnable() {
            public final void run() {
                StorylinesView.this.f();
            }
        });
    }

    private void d() {
        inflate(getContext(), R.layout.storylines, this);
        this.l = (StoriesProgressView) ip.d((View) this, (int) R.id.progress_view);
        this.j = (CarouselView) ip.d((View) this, (int) R.id.carousel);
        this.m = ip.d((View) this, (int) R.id.artist_attribution);
        this.n = (TextView) ip.d((View) this, (int) R.id.storylines_by);
        this.o = (ImageView) ip.d((View) this, (int) R.id.artist_avatar);
        this.q = (ToggleButton) ip.d((View) this, (int) R.id.follow_button);
        this.r = (TextView) ip.d((View) this, (int) R.id.error_title);
        this.s = (TextView) ip.d((View) this, (int) R.id.error_message);
        this.t = ip.d((View) this, (int) R.id.loading_view);
        setBackground(getResources().getDrawable(R.drawable.background_empty));
        a(getResources().getDimension(R.dimen.std_8dp));
        ip.e((View) this, 0.0f);
        this.j.a((i) new CarouselLayoutManager(MeasureMode.FILL));
        ip.d((View) this, (int) R.id.reverse).setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return StorylinesView.this.b(view, motionEvent);
            }
        });
        ip.d((View) this, (int) R.id.skip).setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return StorylinesView.this.a(view, motionEvent);
            }
        });
        this.m.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                StorylinesView.this.b(view);
            }
        });
        this.q.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                StorylinesView.this.a(view);
            }
        });
        this.l.b = this;
    }

    /* access modifiers changed from: private */
    public void e() {
        int i2 = this.v;
        if (i2 >= 0 && i2 != this.u - 1) {
            this.p.c(i2, h());
        }
    }

    /* access modifiers changed from: private */
    public void f() {
        int i2 = this.v;
        if (i2 > 0) {
            this.p.d(i2, h());
        }
    }

    /* access modifiers changed from: private */
    public void g() {
        this.w = true;
        a aVar = this.p;
        if (aVar != null && this.v >= 0) {
            aVar.f(this.j.n(), h());
        }
    }

    private double h() {
        Window i2 = i();
        if (i2 == null) {
            return -1.0d;
        }
        int measuredHeight = i2.getDecorView().getMeasuredHeight();
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        return a(measuredHeight, getHeight(), iArr);
    }

    private Window i() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow();
            }
        }
        return null;
    }

    public final void a(String str) {
        boolean z = true & false;
        this.n.setText(String.format(getContext().getString(R.string.by_artist_name), new Object[]{str}));
    }

    public final void a(List<StorylinesCardImageModel> list, jlb jlb) {
        jld jld = this.i;
        jld.d = this;
        jld.e = jlb;
        jld.a.clear();
        jld.a.addAll(list);
        jld.e();
        this.j.i(0);
        this.u = list.size();
        StoriesProgressView storiesProgressView = this.l;
        storiesProgressView.a = list.size();
        storiesProgressView.a();
        this.l.a(6000);
    }

    public final void a(jlb jlb) {
        this.p.a(jlb);
    }

    public final void a(a aVar) {
        this.p = aVar;
    }

    public final void a(boolean z) {
        this.q.setTextOn(getContext().getResources().getString(R.string.track_story_following_artist));
        this.q.setTextOff(getContext().getResources().getString(R.string.track_story_follow_artist));
        this.q.setChecked(z);
    }

    public final void a(boolean z, boolean z2) {
        ViewPropertyAnimator startDelay = this.l.animate().alpha(z ? 1.0f : 0.0f).setDuration(400).setStartDelay(z ? 200 : 0);
        if (z && z2) {
            startDelay.setListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    StorylinesView.this.b(0);
                }
            });
        } else if (!z) {
            startDelay.setListener(null);
            this.v = -1;
            boolean z3 = true & false;
            this.l.a(-1, false);
        }
        startDelay.start();
    }

    public final void b() {
        this.r.setVisibility(8);
        this.s.setVisibility(8);
        this.t.setVisibility(0);
    }

    public final void b(int i2) {
        this.v = i2;
        this.i.e();
        this.j.d(this.v);
        this.l.a(this.v, true);
        this.p.e(i2, h());
    }

    public final void b(String str) {
        this.k.a(str).a(vhj.a(this.o));
    }

    public final void b(jlb jlb) {
        this.p.b(jlb);
    }

    public final void b(boolean z) {
        float f = z ? 1.0f : 0.0f;
        this.j.animate().alpha(f).setDuration(400).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                StorylinesView.this.t.setVisibility(8);
            }
        }).start();
        this.m.animate().alpha(f).setDuration(400).start();
        this.q.animate().alpha(f).setDuration(400).start();
        if (z) {
            this.p.e(0, h());
        }
    }

    public final void c() {
        this.r.setVisibility(0);
        this.s.setVisibility(0);
        this.t.setVisibility(8);
        this.r.setText(getResources().getString(R.string.loading_error_title));
        this.s.setText(getResources().getString(R.string.loading_error_message));
    }

    public final void c(jlb jlb) {
        this.p.c(jlb);
    }

    public void onMeasure(int i2, int i3) {
        double size = (double) MeasureSpec.getSize(i2);
        Double.isNaN(size);
        super.onMeasure(i2, MeasureSpec.makeMeasureSpec((int) Math.floor(size * 1.33d), 1073741824));
    }

    public void onStoryProgressComplete(int i2) {
        int i3 = this.v;
        if (i3 != this.u - 1) {
            b(i3 + 1);
        }
    }
}
