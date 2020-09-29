package com.spotify.mobile.android.ui.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import com.spotify.playlist.models.offline.WaitingReason;

public class DownloadHeaderView extends LinearLayout implements defpackage.jqi.a {
    public boolean a;
    public a b;
    private boolean c;
    private jrj d;
    private Animator e;
    private Animator f;
    private State g = State.INIT;
    private ProgressBar h;
    private ViewGroup i;
    private SwitchCompat j;
    private TextView k;
    private TextView l;
    private int m;
    private int n;
    private jqh o;
    private final OnCheckedChangeListener p = new OnCheckedChangeListener() {
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            DownloadHeaderView.this.a(compoundButton, z);
        }
    };

    /* renamed from: com.spotify.mobile.android.ui.view.DownloadHeaderView$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[WaitingReason.values().length];
        static final /* synthetic */ int[] b = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
        static {
            /*
                com.spotify.mobile.android.ui.view.DownloadHeaderView$State[] r0 = com.spotify.mobile.android.ui.view.DownloadHeaderView.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.ui.view.DownloadHeaderView$State r2 = com.spotify.mobile.android.ui.view.DownloadHeaderView.State.DOWNLOADABLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.ui.view.DownloadHeaderView$State r3 = com.spotify.mobile.android.ui.view.DownloadHeaderView.State.DOWNLOADED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.ui.view.DownloadHeaderView$State r4 = com.spotify.mobile.android.ui.view.DownloadHeaderView.State.WAITING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.ui.view.DownloadHeaderView$State r5 = com.spotify.mobile.android.ui.view.DownloadHeaderView.State.NO_INTERNET     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.mobile.android.ui.view.DownloadHeaderView$State r5 = com.spotify.mobile.android.ui.view.DownloadHeaderView.State.OFFLINE_MODE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x004b }
                com.spotify.mobile.android.ui.view.DownloadHeaderView$State r5 = com.spotify.mobile.android.ui.view.DownloadHeaderView.State.SYNC_NOT_ALLOWED     // Catch:{ NoSuchFieldError -> 0x004b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                com.spotify.playlist.models.offline.WaitingReason[] r4 = com.spotify.playlist.models.offline.WaitingReason.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                int[] r4 = a     // Catch:{ NoSuchFieldError -> 0x005e }
                com.spotify.playlist.models.offline.WaitingReason r5 = com.spotify.playlist.models.offline.WaitingReason.IN_QUEUE     // Catch:{ NoSuchFieldError -> 0x005e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0068 }
                com.spotify.playlist.models.offline.WaitingReason r4 = com.spotify.playlist.models.offline.WaitingReason.NO_CONNECTION     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0072 }
                com.spotify.playlist.models.offline.WaitingReason r1 = com.spotify.playlist.models.offline.WaitingReason.OFFLINE_MODE     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007c }
                com.spotify.playlist.models.offline.WaitingReason r1 = com.spotify.playlist.models.offline.WaitingReason.SYNC_NOT_ALLOWED     // Catch:{ NoSuchFieldError -> 0x007c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x007c }
            L_0x007c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.ui.view.DownloadHeaderView.AnonymousClass1.<clinit>():void");
        }
    }

    public enum State {
        INIT,
        HIDDEN,
        DOWNLOADABLE,
        DOWNLOADING,
        DOWNLOADED,
        WAITING,
        NO_INTERNET,
        OFFLINE_MODE,
        SYNC_NOT_ALLOWED
    }

    public interface a {
        void a();

        void a(boolean z);
    }

    public static DownloadHeaderView a(Context context, ViewGroup viewGroup) {
        DownloadHeaderView downloadHeaderView = (DownloadHeaderView) LayoutInflater.from(context).inflate(R.layout.header_download, viewGroup, false);
        ip.a((View) downloadHeaderView, (Drawable) null);
        return downloadHeaderView;
    }

    public DownloadHeaderView(Context context) {
        super(context);
        a();
    }

    public DownloadHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private void a() {
        Resources resources = getResources();
        this.m = resources.getDimensionPixelSize(R.dimen.download_header_content_height) - 1;
        this.n = resources.getDimensionPixelSize(R.dimen.download_header_progress_bar_height) - 1;
        this.o = new jqh(getContext());
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (!isInEditMode()) {
            this.d = new jrj();
            this.e = ObjectAnimator.ofFloat(null, View.ALPHA, new float[]{0.0f, 1.0f});
            this.e.setDuration(400);
            this.f = ObjectAnimator.ofFloat(null, View.ALPHA, new float[]{1.0f, 0.0f});
            this.f.setDuration(400);
            this.i = (ViewGroup) findViewById(R.id.button_download_layout);
            this.j = new SwitchCompat(getContext(), null, R.attr.switchStyle);
            this.i.addView(this.j, new LayoutParams(-2, getResources().getDimensionPixelSize(R.dimen.download_header_button_height)));
            this.h = (ProgressBar) findViewById(R.id.progress_bar);
            this.k = (TextView) findViewById(R.id.text_waiting);
            this.l = (TextView) findViewById(R.id.title);
            c();
            uuu.a(getContext(), this.l, 2132017666);
            this.l.setTextColor(fr.c(getContext(), R.color.white));
            SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), SpotifyIconV2.DOWNLOAD, (float) uts.b(16.0f, getContext().getResources()));
            spotifyIconDrawable.a(fr.c(getContext(), R.color.cat_grayscale_55));
            this.k.setCompoundDrawablesWithIntrinsicBounds(spotifyIconDrawable, null, null, null);
            this.k.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    DownloadHeaderView.this.a(view);
                }
            });
            this.j.setOnCheckedChangeListener(this.p);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        b(false);
    }

    /* access modifiers changed from: private */
    public void b() {
        a(this.g, this.h.getProgress());
    }

    private void b(boolean z) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    public void a(uzf uzf) {
        uzf.a((gcs<f>) new gcs() {
            public final void accept(Object obj) {
                DownloadHeaderView.this.a((f) obj);
            }
        }, (gcs<h>) new gcs() {
            public final void accept(Object obj) {
                DownloadHeaderView.this.a((h) obj);
            }
        }, (gcs<b>) new gcs() {
            public final void accept(Object obj) {
                DownloadHeaderView.this.a((b) obj);
            }
        }, (gcs<defpackage.uzf.a>) new gcs() {
            public final void accept(Object obj) {
                DownloadHeaderView.this.a((a) obj);
            }
        }, (gcs<c>) new gcs() {
            public final void accept(Object obj) {
                DownloadHeaderView.this.a((c) obj);
            }
        }, (gcs<e>) new gcs() {
            public final void accept(Object obj) {
                DownloadHeaderView.this.a((e) obj);
            }
        }, (gcs<d>) new gcs() {
            public final void accept(Object obj) {
                DownloadHeaderView.this.a((d) obj);
            }
        }, (gcs<g>) new gcs() {
            public final void accept(Object obj) {
                DownloadHeaderView.this.a((g) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(f fVar) {
        a(State.DOWNLOADABLE, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        a(State.DOWNLOADING, bVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(defpackage.uzf.a aVar) {
        a(State.DOWNLOADED, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        a(State.DOWNLOADABLE, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(e eVar) {
        a(State.DOWNLOADABLE, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        a(State.DOWNLOADABLE, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(g gVar) {
        a(State.DOWNLOADABLE, 0);
    }

    private void c() {
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(a(this.g));
        }
    }

    private int a(State state) {
        int i2 = AnonymousClass1.b[state.ordinal()];
        return i2 != 1 ? i2 != 2 ? !this.c ? R.string.header_download_available_offline_new_copy_downloading : R.string.header_download_available_offline_songs_downloading : !this.c ? R.string.header_download_available_offline_new_copy_downloaded : R.string.header_download_available_offline_songs_downloaded : !this.c ? R.string.header_download_available_offline_new_copy : R.string.header_download_available_offline_songs;
    }

    public void a(State state, int i2) {
        if (state == State.DOWNLOADING) {
            this.h.setProgress(i2);
        }
        this.j.setOnCheckedChangeListener(null);
        boolean z = true;
        this.j.setChecked((state == State.DOWNLOADABLE || state == State.HIDDEN || state == State.INIT) ? false : true);
        this.j.setOnCheckedChangeListener(this.p);
        State state2 = this.g;
        if (state2 != state) {
            if (state2 == State.INIT) {
                z = false;
            }
            if (this.g == State.DOWNLOADING) {
                b(this.h, this.n, z);
            }
            boolean b2 = b(state);
            boolean b3 = b(this.g);
            boolean c2 = c(state);
            boolean c3 = c(this.g);
            if (c2) {
                this.k.setText(d(state));
            }
            if (this.g == State.HIDDEN) {
                if (b2) {
                    a((View) this.i, this.m, z);
                } else {
                    this.i.setVisibility(8);
                }
                if (c2) {
                    a((View) this.k, this.m, z);
                } else {
                    this.k.setVisibility(8);
                }
            } else if (state == State.HIDDEN) {
                if (b3) {
                    b(this.i, this.m, z);
                }
                if (c3) {
                    b(this.k, this.m, z);
                }
            } else {
                if (b3 && !b2) {
                    b(this.i, z);
                }
                if (c3 && !c2) {
                    b(this.k, z);
                }
                if (b2 && !b3) {
                    a((View) this.i, z);
                }
                if (c2 && !c3) {
                    a((View) this.k, z);
                }
            }
            if (state == State.DOWNLOADING) {
                a((View) this.h, this.n, z);
            }
            this.g = state;
            c();
        }
    }

    private static boolean b(State state) {
        return (state == State.HIDDEN || state == State.INIT) ? false : true;
    }

    private static boolean c(State state) {
        return state == State.WAITING || state == State.NO_INTERNET || state == State.OFFLINE_MODE || state == State.SYNC_NOT_ALLOWED;
    }

    private static int d(State state) {
        int i2 = AnonymousClass1.b[state.ordinal()];
        if (i2 == 3) {
            return R.string.header_download_waiting;
        }
        if (i2 == 4) {
            return R.string.header_download_waiting_no_internet;
        }
        if (i2 == 5) {
            return R.string.header_download_waiting_in_offline_mode;
        }
        if (i2 == 6) {
            return R.string.header_download_waiting_sync_not_allowed;
        }
        StringBuilder sb = new StringBuilder("State ");
        sb.append(state);
        sb.append(" is not a waiting state.");
        Assertion.a(sb.toString());
        return R.string.header_download_waiting;
    }

    private void a(View view, int i2, boolean z) {
        if (z) {
            this.d.a(view, a(view, 400, -i2, 0), false);
        } else {
            view.setVisibility(0);
        }
    }

    private void b(View view, int i2, boolean z) {
        if (z) {
            this.d.a(view, a(view, 400, 0, -i2), true);
        } else {
            view.setVisibility(8);
        }
    }

    private static ValueAnimator a(View view, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = i3;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{i3, i4});
        valueAnimator.setDuration(400);
        valueAnimator.addUpdateListener(new AnimatorUpdateListener(marginLayoutParams, view) {
            private final /* synthetic */ MarginLayoutParams f$0;
            private final /* synthetic */ View f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DownloadHeaderView.a(this.f$0, this.f$1, valueAnimator);
            }
        });
        return valueAnimator;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(MarginLayoutParams marginLayoutParams, View view, ValueAnimator valueAnimator) {
        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view.requestLayout();
    }

    private void a(View view, boolean z) {
        if (z) {
            this.d.a(view, this.e, false);
        } else {
            view.setVisibility(0);
        }
    }

    private void b(View view, boolean z) {
        if (z) {
            this.d.a(view, this.f, true);
        } else {
            view.setVisibility(8);
        }
    }

    public final void a(boolean z) {
        this.c = z;
        c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(h hVar) {
        State state;
        int i2 = AnonymousClass1.a[hVar.a.ordinal()];
        if (i2 == 1) {
            state = State.WAITING;
        } else if (i2 == 2) {
            state = State.NO_INTERNET;
        } else if (i2 == 3) {
            state = State.OFFLINE_MODE;
        } else if (i2 != 4) {
            state = State.WAITING;
        } else {
            state = State.SYNC_NOT_ALLOWED;
        }
        a(state, hVar.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(CompoundButton compoundButton, boolean z) {
        if (!this.a || this.j.isChecked()) {
            b(this.j.isChecked());
        } else {
            this.o.a((defpackage.jqh.a) new defpackage.jqh.a() {
                public final void onCancelDialog() {
                    DownloadHeaderView.this.b();
                }
            }, (b) new b() {
                public final void onRemoveDownload() {
                    DownloadHeaderView.this.d();
                }
            });
        }
    }
}
