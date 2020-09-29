package defpackage;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import com.spotify.music.R;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: mq reason: default package */
public final class mq extends p {
    static final boolean b = Log.isLoggable("MediaRouteCtrlDialog", 3);
    static final int c = ((int) TimeUnit.SECONDS.toMillis(30));
    Map<defpackage.nd.f, SeekBar> A;
    MediaControllerCompat B;
    c C;
    PlaybackStateCompat D;
    MediaDescriptionCompat E;
    b F;
    Bitmap G;
    Uri H;
    boolean I;
    Bitmap J;
    int K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    int Q;
    int R;
    int S;
    Interpolator T;
    final AccessibilityManager U;
    Runnable V;
    private final d W;
    private boolean X;
    private boolean Y;
    private int Z;
    private Button aa;
    private Button ab;
    private ImageButton ac;
    private ImageButton ad;
    private MediaRouteExpandCollapseButton ae;
    private FrameLayout af;
    private TextView ag;
    private TextView ah;
    private TextView ai;
    private boolean aj;
    private LinearLayout ak;
    private View al;
    private Interpolator am;
    private Interpolator an;
    private Interpolator ao;
    final nd d;
    final defpackage.nd.f e;
    Context f;
    View g;
    FrameLayout h;
    LinearLayout i;
    FrameLayout j;
    ImageView k;
    LinearLayout l;
    RelativeLayout m;
    OverlayListView n;
    f o;
    List<defpackage.nd.f> p;
    Set<defpackage.nd.f> q;
    Set<defpackage.nd.f> r;
    Set<defpackage.nd.f> s;
    SeekBar t;
    e u;
    defpackage.nd.f v;
    int w;
    int x;
    int y;
    final int z;

    /* renamed from: mq$a */
    final class a implements OnClickListener {
        a() {
        }

        public final void onClick(View view) {
            int id = view.getId();
            int i = 1;
            if (id == 16908313 || id == 16908314) {
                if (mq.this.e.a()) {
                    if (id == 16908313) {
                        i = 2;
                    }
                    nd.a(i);
                }
                mq.this.dismiss();
                return;
            }
            if (id == R.id.mr_control_playback_ctrl) {
                if (!(mq.this.B == null || mq.this.D == null)) {
                    int i2 = 0;
                    if (mq.this.D.a != 3) {
                        i = 0;
                    }
                    if (i != 0 && mq.this.e()) {
                        mq.this.B.a().b();
                        i2 = R.string.mr_controller_pause;
                    } else if (i != 0 && mq.this.f()) {
                        mq.this.B.a().c();
                        i2 = R.string.mr_controller_stop;
                    } else if (i == 0 && mq.this.d()) {
                        mq.this.B.a().a();
                        i2 = R.string.mr_controller_play;
                    }
                    if (!(mq.this.U == null || !mq.this.U.isEnabled() || i2 == 0)) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                        obtain.setPackageName(mq.this.f.getPackageName());
                        obtain.setClassName(getClass().getName());
                        obtain.getText().add(mq.this.f.getString(i2));
                        mq.this.U.sendAccessibilityEvent(obtain);
                    }
                }
            } else if (id == R.id.mr_close) {
                mq.this.dismiss();
            }
        }
    }

    /* renamed from: mq$b */
    class b extends AsyncTask<Void, Void, Bitmap> {
        final Bitmap a;
        final Uri b;
        private int c;
        private long d;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return a();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            mq mqVar = mq.this;
            mqVar.F = null;
            if (!hn.a(mqVar.G, this.a) || !hn.a(mq.this.H, this.b)) {
                mq mqVar2 = mq.this;
                mqVar2.G = this.a;
                mqVar2.J = bitmap;
                mqVar2.H = this.b;
                mqVar2.K = this.c;
                boolean z = true;
                mqVar2.I = true;
                long uptimeMillis = SystemClock.uptimeMillis() - this.d;
                mq mqVar3 = mq.this;
                if (uptimeMillis <= 120) {
                    z = false;
                }
                mqVar3.a(z);
            }
        }

        b() {
            Uri uri = null;
            Bitmap bitmap = mq.this.E == null ? null : mq.this.E.d;
            if (mq.a(bitmap)) {
                bitmap = null;
            }
            this.a = bitmap;
            if (mq.this.E != null) {
                uri = mq.this.E.e;
            }
            this.b = uri;
        }

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            this.d = SystemClock.uptimeMillis();
            mq.this.h();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:(3:5|6|(4:8|9|(2:11|12)|13)(3:15|16|(2:(2:46|47)|48)(8:20|21|22|23|(3:25|(2:27|28)|29)|31|32|(2:(2:35|36)|37)(3:39|40|(2:42|43)))))|54|55|(2:57|58)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:20|21|22|23|(3:25|(2:27|28)|29)|31|32|(2:(2:35|36)|37)(3:39|40|(2:42|43))) */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a3, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0093 */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0048 A[Catch:{ IOException -> 0x0093 }] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x009f A[SYNTHETIC, Splitter:B:57:0x009f] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00a6 A[SYNTHETIC, Splitter:B:61:0x00a6] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.graphics.Bitmap a() {
            /*
                r9 = this;
                java.lang.String r0 = "Unable to open: "
                android.graphics.Bitmap r1 = r9.a
                r2 = 0
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x000c
                r0 = r1
                goto L_0x00ab
            L_0x000c:
                android.net.Uri r1 = r9.b
                if (r1 == 0) goto L_0x00aa
                java.io.InputStream r1 = r9.a(r1)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
                if (r1 != 0) goto L_0x0026
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0093 }
                r5.<init>(r0)     // Catch:{ IOException -> 0x0093 }
                android.net.Uri r6 = r9.b     // Catch:{ IOException -> 0x0093 }
                r5.append(r6)     // Catch:{ IOException -> 0x0093 }
                if (r1 == 0) goto L_0x0025
                r1.close()     // Catch:{ IOException -> 0x0025 }
            L_0x0025:
                return r4
            L_0x0026:
                android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0093 }
                r5.<init>()     // Catch:{ IOException -> 0x0093 }
                r5.inJustDecodeBounds = r3     // Catch:{ IOException -> 0x0093 }
                android.graphics.BitmapFactory.decodeStream(r1, r4, r5)     // Catch:{ IOException -> 0x0093 }
                int r6 = r5.outWidth     // Catch:{ IOException -> 0x0093 }
                if (r6 == 0) goto L_0x0089
                int r6 = r5.outHeight     // Catch:{ IOException -> 0x0093 }
                if (r6 != 0) goto L_0x0039
                goto L_0x0089
            L_0x0039:
                r1.reset()     // Catch:{ IOException -> 0x003d }
                goto L_0x0058
            L_0x003d:
                r1.close()     // Catch:{ IOException -> 0x0093 }
                android.net.Uri r6 = r9.b     // Catch:{ IOException -> 0x0093 }
                java.io.InputStream r1 = r9.a(r6)     // Catch:{ IOException -> 0x0093 }
                if (r1 != 0) goto L_0x0058
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0093 }
                r5.<init>(r0)     // Catch:{ IOException -> 0x0093 }
                android.net.Uri r6 = r9.b     // Catch:{ IOException -> 0x0093 }
                r5.append(r6)     // Catch:{ IOException -> 0x0093 }
                if (r1 == 0) goto L_0x0057
                r1.close()     // Catch:{ IOException -> 0x0057 }
            L_0x0057:
                return r4
            L_0x0058:
                r5.inJustDecodeBounds = r2     // Catch:{ IOException -> 0x0093 }
                mq r6 = defpackage.mq.this     // Catch:{ IOException -> 0x0093 }
                int r7 = r5.outWidth     // Catch:{ IOException -> 0x0093 }
                int r8 = r5.outHeight     // Catch:{ IOException -> 0x0093 }
                int r6 = r6.a(r7, r8)     // Catch:{ IOException -> 0x0093 }
                int r7 = r5.outHeight     // Catch:{ IOException -> 0x0093 }
                int r7 = r7 / r6
                int r6 = java.lang.Integer.highestOneBit(r7)     // Catch:{ IOException -> 0x0093 }
                int r6 = java.lang.Math.max(r3, r6)     // Catch:{ IOException -> 0x0093 }
                r5.inSampleSize = r6     // Catch:{ IOException -> 0x0093 }
                boolean r6 = r9.isCancelled()     // Catch:{ IOException -> 0x0093 }
                if (r6 == 0) goto L_0x007d
                if (r1 == 0) goto L_0x007c
                r1.close()     // Catch:{ IOException -> 0x007c }
            L_0x007c:
                return r4
            L_0x007d:
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1, r4, r5)     // Catch:{ IOException -> 0x0093 }
                if (r1 == 0) goto L_0x00ab
                r1.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x00ab
            L_0x0087:
                goto L_0x00ab
            L_0x0089:
                if (r1 == 0) goto L_0x008e
                r1.close()     // Catch:{ IOException -> 0x008e }
            L_0x008e:
                return r4
            L_0x008f:
                r0 = move-exception
                r1 = r4
                goto L_0x00a4
            L_0x0092:
                r1 = r4
            L_0x0093:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a3 }
                r5.<init>(r0)     // Catch:{ all -> 0x00a3 }
                android.net.Uri r0 = r9.b     // Catch:{ all -> 0x00a3 }
                r5.append(r0)     // Catch:{ all -> 0x00a3 }
                if (r1 == 0) goto L_0x00aa
                r1.close()     // Catch:{ IOException -> 0x00aa }
                goto L_0x00aa
            L_0x00a3:
                r0 = move-exception
            L_0x00a4:
                if (r1 == 0) goto L_0x00a9
                r1.close()     // Catch:{ IOException -> 0x00a9 }
            L_0x00a9:
                throw r0
            L_0x00aa:
                r0 = r4
            L_0x00ab:
                boolean r1 = defpackage.mq.a(r0)
                if (r1 == 0) goto L_0x00bc
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Can't use recycled bitmap: "
                r1.<init>(r2)
                r1.append(r0)
                return r4
            L_0x00bc:
                if (r0 == 0) goto L_0x00f0
                int r1 = r0.getWidth()
                int r4 = r0.getHeight()
                if (r1 >= r4) goto L_0x00f0
                nl$a r1 = new nl$a
                r1.<init>(r0)
                r1.a = r3
                nl r1 = r1.a()
                java.util.List<nl$d> r3 = r1.a
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x00e0
                goto L_0x00ee
            L_0x00e0:
                java.util.List<nl$d> r1 = r1.a
                java.util.List r1 = java.util.Collections.unmodifiableList(r1)
                java.lang.Object r1 = r1.get(r2)
                nl$d r1 = (defpackage.nl.d) r1
                int r2 = r1.a
            L_0x00ee:
                r9.c = r2
            L_0x00f0:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mq.b.a():android.graphics.Bitmap");
        }

        private InputStream a(Uri uri) {
            InputStream inputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStream = mq.this.f.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(mq.c);
                openConnection.setReadTimeout(mq.c);
                inputStream = openConnection.getInputStream();
            }
            if (inputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStream);
        }
    }

    /* renamed from: mq$c */
    final class c extends android.support.v4.media.session.MediaControllerCompat.a {
        c() {
        }

        public final void a() {
            if (mq.this.B != null) {
                mq.this.B.b(mq.this.C);
                mq.this.B = null;
            }
        }

        public final void a(PlaybackStateCompat playbackStateCompat) {
            mq mqVar = mq.this;
            mqVar.D = playbackStateCompat;
            mqVar.a(false);
        }

        public final void a(MediaMetadataCompat mediaMetadataCompat) {
            mq.this.E = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
            mq.this.g();
            mq.this.a(false);
        }
    }

    /* renamed from: mq$d */
    final class d extends defpackage.nd.a {
        d() {
        }

        public final void a() {
            mq.this.a(false);
        }

        public final void c(nd ndVar, defpackage.nd.f fVar) {
            mq.this.a(true);
        }

        public final void b(defpackage.nd.f fVar) {
            SeekBar seekBar = (SeekBar) mq.this.A.get(fVar);
            int i = fVar.n;
            if (mq.b) {
                new StringBuilder("onRouteVolumeChanged(), route.getVolume:").append(i);
            }
            if (seekBar != null && mq.this.v != fVar) {
                seekBar.setProgress(i);
            }
        }
    }

    /* renamed from: mq$e */
    class e implements OnSeekBarChangeListener {
        private final Runnable b = new Runnable() {
            public final void run() {
                if (mq.this.v != null) {
                    mq.this.v = null;
                    if (mq.this.L) {
                        mq.this.a(mq.this.M);
                    }
                }
            }
        };

        e() {
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            if (mq.this.v != null) {
                mq.this.t.removeCallbacks(this.b);
            }
            mq.this.v = (defpackage.nd.f) seekBar.getTag();
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            mq.this.t.postDelayed(this.b, 500);
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                defpackage.nd.f fVar = (defpackage.nd.f) seekBar.getTag();
                if (mq.b) {
                    StringBuilder sb = new StringBuilder("onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(");
                    sb.append(i);
                    sb.append(")");
                }
                fVar.a(i);
            }
        }
    }

    /* renamed from: mq$f */
    class f extends ArrayAdapter<defpackage.nd.f> {
        private float a;

        public final boolean isEnabled(int i) {
            return false;
        }

        public f(Context context, List<defpackage.nd.f> list) {
            super(context, 0, list);
            this.a = mw.i(context);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            int i2;
            int i3 = 0;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
            } else {
                mq mqVar = mq.this;
                mq.b((LinearLayout) view.findViewById(R.id.volume_item_container), mqVar.x);
                View findViewById = view.findViewById(R.id.mr_volume_item_icon);
                LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.width = mqVar.w;
                layoutParams.height = mqVar.w;
                findViewById.setLayoutParams(layoutParams);
            }
            defpackage.nd.f fVar = (defpackage.nd.f) getItem(i);
            if (fVar != null) {
                boolean z = fVar.g;
                TextView textView = (TextView) view.findViewById(R.id.mr_name);
                textView.setEnabled(z);
                textView.setText(fVar.d);
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
                mw.a(viewGroup.getContext(), mediaRouteVolumeSlider, (View) mq.this.n);
                mediaRouteVolumeSlider.setTag(fVar);
                mq.this.A.put(fVar, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.a(!z);
                mediaRouteVolumeSlider.setEnabled(z);
                if (z) {
                    if (mq.this.a(fVar)) {
                        mediaRouteVolumeSlider.setMax(fVar.o);
                        mediaRouteVolumeSlider.setProgress(fVar.n);
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(mq.this.u);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.mr_volume_item_icon);
                if (z) {
                    i2 = 255;
                } else {
                    i2 = (int) (this.a * 255.0f);
                }
                imageView.setAlpha(i2);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.volume_item_container);
                if (mq.this.s.contains(fVar)) {
                    i3 = 4;
                }
                linearLayout.setVisibility(i3);
                if (mq.this.q != null && mq.this.q.contains(fVar)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }
    }

    public mq(Context context) {
        this(context, 0);
    }

    private mq(Context context, int i2) {
        Context a2 = mw.a(context, 0, true);
        super(a2, mw.h(a2));
        this.aj = true;
        this.V = new Runnable() {
            public final void run() {
                mq mqVar = mq.this;
                mqVar.f(true);
                mqVar.n.requestLayout();
                mqVar.n.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                    public final void onGlobalLayout() {
                        mq.this.n.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        mq mqVar = mq.this;
                        if (mqVar.q == null || mqVar.q.size() == 0) {
                            mqVar.e(true);
                            return;
                        }
                        AnonymousClass4 r1 = new AnimationListener() {
                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                            }

                            public final void onAnimationEnd(Animation animation) {
                                mq.this.e(true);
                            }
                        };
                        int firstVisiblePosition = mqVar.n.getFirstVisiblePosition();
                        boolean z = false;
                        for (int i = 0; i < mqVar.n.getChildCount(); i++) {
                            View childAt = mqVar.n.getChildAt(i);
                            if (mqVar.q.contains((defpackage.nd.f) mqVar.o.getItem(firstVisiblePosition + i))) {
                                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                                alphaAnimation.setDuration((long) mqVar.R);
                                alphaAnimation.setFillEnabled(true);
                                alphaAnimation.setFillAfter(true);
                                if (!z) {
                                    alphaAnimation.setAnimationListener(r1);
                                    z = true;
                                }
                                childAt.clearAnimation();
                                childAt.startAnimation(alphaAnimation);
                            }
                        }
                    }
                });
            }
        };
        this.f = getContext();
        this.C = new c();
        this.d = nd.a(this.f);
        this.W = new d();
        this.e = nd.c();
        a(nd.d());
        this.z = this.f.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.U = (AccessibilityManager) this.f.getSystemService("accessibility");
        if (VERSION.SDK_INT >= 21) {
            this.am = AnimationUtils.loadInterpolator(a2, R.interpolator.mr_linear_out_slow_in);
            this.an = AnimationUtils.loadInterpolator(a2, R.interpolator.mr_fast_out_slow_in);
        }
        this.ao = new AccelerateDecelerateInterpolator();
    }

    private void a(Token token) {
        MediaMetadataCompat mediaMetadataCompat;
        MediaDescriptionCompat mediaDescriptionCompat;
        MediaControllerCompat mediaControllerCompat = this.B;
        PlaybackStateCompat playbackStateCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.b(this.C);
            this.B = null;
        }
        if (token != null && this.Y) {
            try {
                this.B = new MediaControllerCompat(this.f, token);
            } catch (RemoteException e2) {
                Log.e("MediaRouteCtrlDialog", "Error creating media controller in setMediaSession.", e2);
            }
            MediaControllerCompat mediaControllerCompat2 = this.B;
            if (mediaControllerCompat2 != null) {
                mediaControllerCompat2.a(this.C);
            }
            MediaControllerCompat mediaControllerCompat3 = this.B;
            if (mediaControllerCompat3 == null) {
                mediaMetadataCompat = null;
            } else {
                mediaMetadataCompat = mediaControllerCompat3.c();
            }
            if (mediaMetadataCompat == null) {
                mediaDescriptionCompat = null;
            } else {
                mediaDescriptionCompat = mediaMetadataCompat.a();
            }
            this.E = mediaDescriptionCompat;
            MediaControllerCompat mediaControllerCompat4 = this.B;
            if (mediaControllerCompat4 != null) {
                playbackStateCompat = mediaControllerCompat4.b();
            }
            this.D = playbackStateCompat;
            g();
            a(false);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView((int) R.layout.mr_controller_material_dialog_b);
        findViewById(16908315).setVisibility(8);
        a aVar = new a();
        this.h = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.h.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                mq.this.dismiss();
            }
        });
        this.i = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.i.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
            }
        });
        int j2 = mw.j(this.f);
        this.aa = (Button) findViewById(16908314);
        this.aa.setText(R.string.mr_controller_disconnect);
        this.aa.setTextColor(j2);
        this.aa.setOnClickListener(aVar);
        this.ab = (Button) findViewById(16908313);
        this.ab.setText(R.string.mr_controller_stop_casting);
        this.ab.setTextColor(j2);
        this.ab.setOnClickListener(aVar);
        this.ai = (TextView) findViewById(R.id.mr_name);
        this.ad = (ImageButton) findViewById(R.id.mr_close);
        this.ad.setOnClickListener(aVar);
        this.af = (FrameLayout) findViewById(R.id.mr_custom_control);
        this.j = (FrameLayout) findViewById(R.id.mr_default_control);
        AnonymousClass7 r1 = new OnClickListener() {
            public final void onClick(View view) {
                if (mq.this.B != null) {
                    PendingIntent d = mq.this.B.a.d();
                    if (d != null) {
                        try {
                            d.send();
                            mq.this.dismiss();
                        } catch (CanceledException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(d);
                            sb.append(" was not sent, it had been canceled.");
                            Log.e("MediaRouteCtrlDialog", sb.toString());
                        }
                    }
                }
            }
        };
        this.k = (ImageView) findViewById(R.id.mr_art);
        this.k.setOnClickListener(r1);
        findViewById(R.id.mr_control_title_container).setOnClickListener(r1);
        this.l = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.al = findViewById(R.id.mr_control_divider);
        this.m = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.ag = (TextView) findViewById(R.id.mr_control_title);
        this.ah = (TextView) findViewById(R.id.mr_control_subtitle);
        this.ac = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.ac.setOnClickListener(aVar);
        this.ak = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.ak.setVisibility(8);
        this.t = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.t.setTag(this.e);
        this.u = new e();
        this.t.setOnSeekBarChangeListener(this.u);
        this.n = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.p = new ArrayList();
        this.o = new f(this.n.getContext(), this.p);
        this.n.setAdapter(this.o);
        this.s = new HashSet();
        mw.a(this.f, this.l, this.n, this.e.f());
        mw.a(this.f, (MediaRouteVolumeSlider) this.t, (View) this.l);
        this.A = new HashMap();
        this.A.put(this.e, this.t);
        this.ae = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.ae.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                mq mqVar = mq.this;
                mqVar.N = !mqVar.N;
                if (mq.this.N) {
                    mq.this.n.setVisibility(0);
                }
                mq.this.c();
                mq.this.d(true);
            }
        });
        c();
        this.Q = this.f.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.R = this.f.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.S = this.f.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.g = null;
        View view = this.g;
        if (view != null) {
            this.af.addView(view);
            this.af.setVisibility(0);
        }
        this.X = true;
        a();
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        int a2 = mt.a(this.f);
        getWindow().setLayout(a2, -2);
        View decorView = getWindow().getDecorView();
        this.Z = (a2 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = this.f.getResources();
        this.w = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.x = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.y = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.G = null;
        this.H = null;
        g();
        a(false);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y = true;
        this.d.a(nc.c, this.W, 2);
        a(nd.d());
    }

    public final void onDetachedFromWindow() {
        this.d.a((defpackage.nd.a) this.W);
        a((Token) null);
        this.Y = false;
        super.onDetachedFromWindow();
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 25 && i2 != 24) {
            return super.onKeyDown(i2, keyEvent);
        }
        this.e.b(i2 == 25 ? -1 : 1);
        return true;
    }

    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 == 25 || i2 == 24) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z2) {
        if (this.v != null) {
            this.L = true;
            this.M = z2 | this.M;
            return;
        }
        int i2 = 0;
        this.L = false;
        this.M = false;
        if (!this.e.a() || this.e.c()) {
            dismiss();
        } else if (this.X) {
            this.ai.setText(this.e.d);
            Button button = this.aa;
            if (!this.e.i) {
                i2 = 8;
            }
            button.setVisibility(i2);
            if (this.g == null && this.I) {
                if (a(this.J)) {
                    new StringBuilder("Can't set artwork image with recycled bitmap: ").append(this.J);
                } else {
                    this.k.setImageBitmap(this.J);
                    this.k.setBackgroundColor(this.K);
                }
                h();
            }
            i();
            j();
            d(z2);
        }
    }

    static boolean a(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return this.g == null && !(this.E == null && this.D == null);
    }

    /* access modifiers changed from: 0000 */
    public int b(boolean z2) {
        if (!z2 && this.ak.getVisibility() != 0) {
            return 0;
        }
        int paddingTop = this.l.getPaddingTop() + this.l.getPaddingBottom() + 0;
        if (z2) {
            paddingTop += this.m.getMeasuredHeight();
        }
        if (this.ak.getVisibility() == 0) {
            paddingTop += this.ak.getMeasuredHeight();
        }
        int i2 = paddingTop;
        return (!z2 || this.ak.getVisibility() != 0) ? i2 : i2 + this.al.getMeasuredHeight();
    }

    /* access modifiers changed from: 0000 */
    public void c(boolean z2) {
        int i2 = 0;
        this.al.setVisibility((this.ak.getVisibility() != 0 || !z2) ? 8 : 0);
        LinearLayout linearLayout = this.l;
        if (this.ak.getVisibility() == 8 && !z2) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
    }

    /* access modifiers changed from: 0000 */
    public final void d(final boolean z2) {
        this.j.requestLayout();
        this.j.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            /* JADX WARNING: Removed duplicated region for block: B:18:0x00a3  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x00b4  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x00b7  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x00c5  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x010f  */
            /* JADX WARNING: Removed duplicated region for block: B:41:0x0132  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x0134  */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x0140  */
            /* JADX WARNING: Removed duplicated region for block: B:46:0x0142  */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x014e  */
            /* JADX WARNING: Removed duplicated region for block: B:52:0x0162  */
            /* JADX WARNING: Removed duplicated region for block: B:53:0x0172  */
            /* JADX WARNING: Removed duplicated region for block: B:56:0x0198  */
            /* JADX WARNING: Removed duplicated region for block: B:58:0x01a3  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onGlobalLayout() {
                /*
                    r12 = this;
                    mq r0 = defpackage.mq.this
                    android.widget.FrameLayout r0 = r0.j
                    android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                    r0.removeGlobalOnLayoutListener(r12)
                    mq r0 = defpackage.mq.this
                    boolean r0 = r0.O
                    r1 = 1
                    if (r0 == 0) goto L_0x0017
                    mq r0 = defpackage.mq.this
                    r0.P = r1
                    return
                L_0x0017:
                    mq r0 = defpackage.mq.this
                    boolean r2 = r3
                    android.widget.LinearLayout r3 = r0.l
                    int r3 = defpackage.mq.a(r3)
                    android.widget.LinearLayout r4 = r0.l
                    r5 = -1
                    defpackage.mq.b(r4, r5)
                    boolean r4 = r0.b()
                    r0.c(r4)
                    android.view.Window r4 = r0.getWindow()
                    android.view.View r4 = r4.getDecorView()
                    android.view.Window r5 = r0.getWindow()
                    android.view.WindowManager$LayoutParams r5 = r5.getAttributes()
                    int r5 = r5.width
                    r6 = 1073741824(0x40000000, float:2.0)
                    int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r6)
                    r6 = 0
                    r4.measure(r5, r6)
                    android.widget.LinearLayout r5 = r0.l
                    defpackage.mq.b(r5, r3)
                    android.view.View r3 = r0.g
                    if (r3 != 0) goto L_0x008c
                    android.widget.ImageView r3 = r0.k
                    android.graphics.drawable.Drawable r3 = r3.getDrawable()
                    boolean r3 = r3 instanceof android.graphics.drawable.BitmapDrawable
                    if (r3 == 0) goto L_0x008c
                    android.widget.ImageView r3 = r0.k
                    android.graphics.drawable.Drawable r3 = r3.getDrawable()
                    android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
                    android.graphics.Bitmap r3 = r3.getBitmap()
                    if (r3 == 0) goto L_0x008c
                    int r5 = r3.getWidth()
                    int r7 = r3.getHeight()
                    int r5 = r0.a(r5, r7)
                    android.widget.ImageView r7 = r0.k
                    int r8 = r3.getWidth()
                    int r3 = r3.getHeight()
                    if (r8 < r3) goto L_0x0086
                    android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_XY
                    goto L_0x0088
                L_0x0086:
                    android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER
                L_0x0088:
                    r7.setScaleType(r3)
                    goto L_0x008d
                L_0x008c:
                    r5 = 0
                L_0x008d:
                    boolean r3 = r0.b()
                    int r3 = r0.b(r3)
                    java.util.List<nd$f> r7 = r0.p
                    int r7 = r7.size()
                    nd$f r8 = r0.e
                    boolean r8 = r8.f()
                    if (r8 == 0) goto L_0x00b4
                    int r8 = r0.x
                    nd$f r9 = r0.e
                    java.util.List<nd$f> r9 = r9.s
                    java.util.List r9 = java.util.Collections.unmodifiableList(r9)
                    int r9 = r9.size()
                    int r8 = r8 * r9
                    goto L_0x00b5
                L_0x00b4:
                    r8 = 0
                L_0x00b5:
                    if (r7 <= 0) goto L_0x00ba
                    int r7 = r0.z
                    int r8 = r8 + r7
                L_0x00ba:
                    int r7 = r0.y
                    int r7 = java.lang.Math.min(r8, r7)
                    boolean r8 = r0.N
                    if (r8 == 0) goto L_0x00c5
                    goto L_0x00c6
                L_0x00c5:
                    r7 = 0
                L_0x00c6:
                    int r8 = java.lang.Math.max(r5, r7)
                    int r8 = r8 + r3
                    android.graphics.Rect r9 = new android.graphics.Rect
                    r9.<init>()
                    r4.getWindowVisibleDisplayFrame(r9)
                    android.widget.LinearLayout r4 = r0.i
                    int r4 = r4.getMeasuredHeight()
                    android.widget.FrameLayout r10 = r0.j
                    int r10 = r10.getMeasuredHeight()
                    int r4 = r4 - r10
                    int r10 = r9.height()
                    int r10 = r10 - r4
                    android.view.View r4 = r0.g
                    r11 = 8
                    if (r4 != 0) goto L_0x00fa
                    if (r5 <= 0) goto L_0x00fa
                    if (r8 > r10) goto L_0x00fa
                    android.widget.ImageView r3 = r0.k
                    r3.setVisibility(r6)
                    android.widget.ImageView r3 = r0.k
                    defpackage.mq.b(r3, r5)
                    goto L_0x0117
                L_0x00fa:
                    androidx.mediarouter.app.OverlayListView r4 = r0.n
                    int r4 = defpackage.mq.a(r4)
                    android.widget.LinearLayout r5 = r0.l
                    int r5 = r5.getMeasuredHeight()
                    int r4 = r4 + r5
                    android.widget.FrameLayout r5 = r0.j
                    int r5 = r5.getMeasuredHeight()
                    if (r4 < r5) goto L_0x0114
                    android.widget.ImageView r4 = r0.k
                    r4.setVisibility(r11)
                L_0x0114:
                    int r8 = r7 + r3
                    r5 = 0
                L_0x0117:
                    boolean r3 = r0.b()
                    if (r3 == 0) goto L_0x0125
                    if (r8 > r10) goto L_0x0125
                    android.widget.RelativeLayout r3 = r0.m
                    r3.setVisibility(r6)
                    goto L_0x012a
                L_0x0125:
                    android.widget.RelativeLayout r3 = r0.m
                    r3.setVisibility(r11)
                L_0x012a:
                    android.widget.RelativeLayout r3 = r0.m
                    int r3 = r3.getVisibility()
                    if (r3 != 0) goto L_0x0134
                    r3 = 1
                    goto L_0x0135
                L_0x0134:
                    r3 = 0
                L_0x0135:
                    r0.c(r3)
                    android.widget.RelativeLayout r3 = r0.m
                    int r3 = r3.getVisibility()
                    if (r3 != 0) goto L_0x0142
                    r3 = 1
                    goto L_0x0143
                L_0x0142:
                    r3 = 0
                L_0x0143:
                    int r3 = r0.b(r3)
                    int r4 = java.lang.Math.max(r5, r7)
                    int r4 = r4 + r3
                    if (r4 <= r10) goto L_0x0151
                    int r4 = r4 - r10
                    int r7 = r7 - r4
                    r4 = r10
                L_0x0151:
                    android.widget.LinearLayout r5 = r0.l
                    r5.clearAnimation()
                    androidx.mediarouter.app.OverlayListView r5 = r0.n
                    r5.clearAnimation()
                    android.widget.FrameLayout r5 = r0.j
                    r5.clearAnimation()
                    if (r2 == 0) goto L_0x0172
                    android.widget.LinearLayout r5 = r0.l
                    r0.a(r5, r3)
                    androidx.mediarouter.app.OverlayListView r3 = r0.n
                    r0.a(r3, r7)
                    android.widget.FrameLayout r3 = r0.j
                    r0.a(r3, r4)
                    goto L_0x0181
                L_0x0172:
                    android.widget.LinearLayout r5 = r0.l
                    defpackage.mq.b(r5, r3)
                    androidx.mediarouter.app.OverlayListView r3 = r0.n
                    defpackage.mq.b(r3, r7)
                    android.widget.FrameLayout r3 = r0.j
                    defpackage.mq.b(r3, r4)
                L_0x0181:
                    android.widget.FrameLayout r3 = r0.h
                    int r4 = r9.height()
                    defpackage.mq.b(r3, r4)
                    nd$f r3 = r0.e
                    java.util.List<nd$f> r3 = r3.s
                    java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                    boolean r4 = r3.isEmpty()
                    if (r4 == 0) goto L_0x01a3
                    java.util.List<nd$f> r1 = r0.p
                    r1.clear()
                    mq$f r0 = r0.o
                    r0.notifyDataSetChanged()
                    return
                L_0x01a3:
                    java.util.List<nd$f> r4 = r0.p
                    java.util.HashSet r5 = new java.util.HashSet
                    r5.<init>(r4)
                    java.util.HashSet r4 = new java.util.HashSet
                    r4.<init>(r3)
                    boolean r4 = r5.equals(r4)
                    if (r4 == 0) goto L_0x01bb
                    mq$f r0 = r0.o
                    r0.notifyDataSetChanged()
                    return
                L_0x01bb:
                    r4 = 0
                    if (r2 == 0) goto L_0x01c7
                    androidx.mediarouter.app.OverlayListView r5 = r0.n
                    mq$f r7 = r0.o
                    java.util.HashMap r5 = defpackage.mt.a(r5, r7)
                    goto L_0x01c8
                L_0x01c7:
                    r5 = r4
                L_0x01c8:
                    if (r2 == 0) goto L_0x01d5
                    android.content.Context r7 = r0.f
                    androidx.mediarouter.app.OverlayListView r8 = r0.n
                    mq$f r9 = r0.o
                    java.util.HashMap r7 = defpackage.mt.a(r7, r8, r9)
                    goto L_0x01d6
                L_0x01d5:
                    r7 = r4
                L_0x01d6:
                    java.util.List<nd$f> r8 = r0.p
                    java.util.HashSet r9 = new java.util.HashSet
                    r9.<init>(r3)
                    r9.removeAll(r8)
                    r0.q = r9
                    java.util.List<nd$f> r8 = r0.p
                    java.util.Set r3 = defpackage.mt.a(r8, r3)
                    r0.r = r3
                    java.util.List<nd$f> r3 = r0.p
                    java.util.Set<nd$f> r8 = r0.q
                    r3.addAll(r6, r8)
                    java.util.List<nd$f> r3 = r0.p
                    java.util.Set<nd$f> r8 = r0.r
                    r3.removeAll(r8)
                    mq$f r3 = r0.o
                    r3.notifyDataSetChanged()
                    if (r2 == 0) goto L_0x022d
                    boolean r2 = r0.N
                    if (r2 == 0) goto L_0x022d
                    java.util.Set<nd$f> r2 = r0.q
                    int r2 = r2.size()
                    java.util.Set<nd$f> r3 = r0.r
                    int r3 = r3.size()
                    int r2 = r2 + r3
                    if (r2 <= 0) goto L_0x022d
                    androidx.mediarouter.app.OverlayListView r2 = r0.n
                    r2.setEnabled(r6)
                    androidx.mediarouter.app.OverlayListView r2 = r0.n
                    r2.requestLayout()
                    r0.O = r1
                    androidx.mediarouter.app.OverlayListView r1 = r0.n
                    android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                    mq$11 r2 = new mq$11
                    r2.<init>(r5, r7)
                    r1.addOnGlobalLayoutListener(r2)
                    return
                L_0x022d:
                    r0.q = r4
                    r0.r = r4
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mq.AnonymousClass9.onGlobalLayout():void");
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        if (VERSION.SDK_INT >= 21) {
            this.T = this.N ? this.am : this.an;
        } else {
            this.T = this.ao;
        }
    }

    private void i() {
        int i2 = 8;
        if (!a(this.e)) {
            this.ak.setVisibility(8);
        } else if (this.ak.getVisibility() == 8) {
            this.ak.setVisibility(0);
            this.t.setMax(this.e.o);
            this.t.setProgress(this.e.n);
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.ae;
            if (this.e.f()) {
                i2 = 0;
            }
            mediaRouteExpandCollapseButton.setVisibility(i2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void e(boolean z2) {
        this.q = null;
        this.r = null;
        this.O = false;
        if (this.P) {
            this.P = false;
            d(z2);
        }
        this.n.setEnabled(true);
    }

    /* access modifiers changed from: 0000 */
    public final void f(boolean z2) {
        int firstVisiblePosition = this.n.getFirstVisiblePosition();
        for (int i2 = 0; i2 < this.n.getChildCount(); i2++) {
            View childAt = this.n.getChildAt(i2);
            defpackage.nd.f fVar = (defpackage.nd.f) this.o.getItem(firstVisiblePosition + i2);
            if (z2) {
                Set<defpackage.nd.f> set = this.q;
                if (set != null && set.contains(fVar)) {
                }
            }
            ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
            alphaAnimation.setDuration(0);
            animationSet.addAnimation(alphaAnimation);
            new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            childAt.clearAnimation();
            childAt.startAnimation(animationSet);
        }
        this.n.a();
        if (!z2) {
            e(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j() {
        /*
            r8 = this;
            boolean r0 = r8.b()
            if (r0 == 0) goto L_0x00e8
            android.support.v4.media.MediaDescriptionCompat r0 = r8.E
            r1 = 0
            if (r0 != 0) goto L_0x000d
            r0 = r1
            goto L_0x000f
        L_0x000d:
            java.lang.CharSequence r0 = r0.b
        L_0x000f:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 1
            r2 = r2 ^ r3
            android.support.v4.media.MediaDescriptionCompat r4 = r8.E
            if (r4 != 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            java.lang.CharSequence r1 = r4.c
        L_0x001c:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            r4 = r4 ^ r3
            nd$f r5 = r8.e
            int r5 = r5.p
            r6 = -1
            r7 = 0
            if (r5 == r6) goto L_0x0034
            android.widget.TextView r0 = r8.ag
            r1 = 2131953058(0x7f1305a2, float:1.9542576E38)
            r0.setText(r1)
        L_0x0031:
            r0 = 1
        L_0x0032:
            r1 = 0
            goto L_0x0066
        L_0x0034:
            android.support.v4.media.session.PlaybackStateCompat r5 = r8.D
            if (r5 == 0) goto L_0x005d
            int r5 = r5.a
            if (r5 != 0) goto L_0x003d
            goto L_0x005d
        L_0x003d:
            if (r2 != 0) goto L_0x004a
            if (r4 != 0) goto L_0x004a
            android.widget.TextView r0 = r8.ag
            r1 = 2131953063(0x7f1305a7, float:1.9542586E38)
            r0.setText(r1)
            goto L_0x0031
        L_0x004a:
            if (r2 == 0) goto L_0x0053
            android.widget.TextView r2 = r8.ag
            r2.setText(r0)
            r0 = 1
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            if (r4 == 0) goto L_0x0032
            android.widget.TextView r2 = r8.ah
            r2.setText(r1)
            r1 = 1
            goto L_0x0066
        L_0x005d:
            android.widget.TextView r0 = r8.ag
            r1 = 2131953064(0x7f1305a8, float:1.9542588E38)
            r0.setText(r1)
            goto L_0x0031
        L_0x0066:
            android.widget.TextView r2 = r8.ag
            r4 = 8
            if (r0 == 0) goto L_0x006e
            r0 = 0
            goto L_0x0070
        L_0x006e:
            r0 = 8
        L_0x0070:
            r2.setVisibility(r0)
            android.widget.TextView r0 = r8.ah
            if (r1 == 0) goto L_0x0079
            r1 = 0
            goto L_0x007b
        L_0x0079:
            r1 = 8
        L_0x007b:
            r0.setVisibility(r1)
            android.support.v4.media.session.PlaybackStateCompat r0 = r8.D
            if (r0 == 0) goto L_0x00e8
            int r0 = r0.a
            r1 = 6
            if (r0 == r1) goto L_0x0091
            android.support.v4.media.session.PlaybackStateCompat r0 = r8.D
            int r0 = r0.a
            r1 = 3
            if (r0 != r1) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r0 = 0
            goto L_0x0092
        L_0x0091:
            r0 = 1
        L_0x0092:
            android.widget.ImageButton r1 = r8.ac
            android.content.Context r1 = r1.getContext()
            if (r0 == 0) goto L_0x00a7
            boolean r2 = r8.e()
            if (r2 == 0) goto L_0x00a7
            r0 = 2130969157(0x7f040245, float:1.7546988E38)
            r2 = 2131953065(0x7f1305a9, float:1.954259E38)
            goto L_0x00c8
        L_0x00a7:
            if (r0 == 0) goto L_0x00b6
            boolean r2 = r8.f()
            if (r2 == 0) goto L_0x00b6
            r0 = 2130969161(0x7f040249, float:1.7546996E38)
            r2 = 2131953067(0x7f1305ab, float:1.9542595E38)
            goto L_0x00c8
        L_0x00b6:
            if (r0 != 0) goto L_0x00c5
            boolean r0 = r8.d()
            if (r0 == 0) goto L_0x00c5
            r0 = 2130969158(0x7f040246, float:1.754699E38)
            r2 = 2131953066(0x7f1305aa, float:1.9542592E38)
            goto L_0x00c8
        L_0x00c5:
            r0 = 0
            r2 = 0
            r3 = 0
        L_0x00c8:
            android.widget.ImageButton r5 = r8.ac
            if (r3 == 0) goto L_0x00cd
            r4 = 0
        L_0x00cd:
            r5.setVisibility(r4)
            if (r3 == 0) goto L_0x00e8
            android.widget.ImageButton r3 = r8.ac
            int r0 = defpackage.mw.a(r1, r0)
            r3.setImageResource(r0)
            android.widget.ImageButton r0 = r8.ac
            android.content.res.Resources r1 = r1.getResources()
            java.lang.CharSequence r1 = r1.getText(r2)
            r0.setContentDescription(r1)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mq.j():void");
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        return (this.D.e & 516) != 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean e() {
        return (this.D.e & 514) != 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean f() {
        return (this.D.e & 1) != 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(defpackage.nd.f fVar) {
        return this.aj && fVar.m == 1;
    }

    static int a(View view) {
        return view.getLayoutParams().height;
    }

    static void b(View view, int i2) {
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    private static boolean a(Uri uri, Uri uri2) {
        if (uri == null || !uri.equals(uri2)) {
            return uri == null && uri2 == null;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final int a(int i2, int i3) {
        if (i2 >= i3) {
            return (int) (((((float) this.Z) * ((float) i3)) / ((float) i2)) + 0.5f);
        }
        return (int) (((((float) this.Z) * 9.0f) / 16.0f) + 0.5f);
    }

    /* access modifiers changed from: 0000 */
    public final void g() {
        if (this.g == null && k()) {
            b bVar = this.F;
            if (bVar != null) {
                bVar.cancel(true);
            }
            this.F = new b();
            this.F.execute(new Void[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        this.I = false;
        this.J = null;
        this.K = 0;
    }

    private boolean k() {
        MediaDescriptionCompat mediaDescriptionCompat = this.E;
        Uri uri = null;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.d;
        MediaDescriptionCompat mediaDescriptionCompat2 = this.E;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.e;
        }
        b bVar = this.F;
        Bitmap bitmap2 = bVar == null ? this.G : bVar.a;
        b bVar2 = this.F;
        Uri uri2 = bVar2 == null ? this.H : bVar2.b;
        if (bitmap2 != bitmap) {
            return true;
        }
        return bitmap2 == null && !a(uri2, uri);
    }

    /* access modifiers changed from: 0000 */
    public void a(final View view, final int i2) {
        final int i3 = view.getLayoutParams().height;
        AnonymousClass10 r1 = new Animation() {
            /* access modifiers changed from: protected */
            public final void applyTransformation(float f, Transformation transformation) {
                int i = i3;
                mq.b(view, i - ((int) (((float) (i - i2)) * f)));
            }
        };
        r1.setDuration((long) this.Q);
        if (VERSION.SDK_INT >= 21) {
            r1.setInterpolator(this.T);
        }
        view.startAnimation(r1);
    }
}
