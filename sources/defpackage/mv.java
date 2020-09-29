package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.u;
import com.comscore.util.log.LogLevel;
import com.spotify.music.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: mv reason: default package */
public final class mv extends u {
    static final boolean a = Log.isLoggable("MediaRouteCtrlDialog", 3);
    private nc A;
    private boolean B;
    private boolean C;
    private long D;
    private e E;
    private boolean F;
    private boolean G;
    private ImageButton H;
    private Button I;
    private ImageView J;
    private View K;
    private ImageView L;
    private TextView M;
    private TextView N;
    private String O;
    final nd b;
    defpackage.nd.f c;
    final List<defpackage.nd.f> d;
    final List<defpackage.nd.f> e;
    final List<defpackage.nd.f> f;
    final List<defpackage.nd.f> g;
    Context h;
    final Handler i;
    RecyclerView j;
    g k;
    Map<String, c> l;
    defpackage.nd.f m;
    Map<String, Integer> n;
    boolean o;
    boolean p;
    MediaControllerCompat q;
    b r;
    MediaDescriptionCompat s;
    a t;
    Bitmap u;
    Uri v;
    boolean w;
    Bitmap x;
    int y;
    private final d z;

    /* renamed from: mv$a */
    class a extends AsyncTask<Void, Void, Bitmap> {
        final Bitmap a;
        final Uri b;
        private int c;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return a();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            mv mvVar = mv.this;
            mvVar.t = null;
            if (!hn.a(mvVar.u, this.a) || !hn.a(mv.this.v, this.b)) {
                mv mvVar2 = mv.this;
                mvVar2.u = this.a;
                mvVar2.x = bitmap;
                mvVar2.v = this.b;
                mvVar2.y = this.c;
                mvVar2.w = true;
                mvVar2.e();
            }
        }

        a() {
            Uri uri = null;
            Bitmap bitmap = mv.this.s == null ? null : mv.this.s.d;
            if (mv.a(bitmap)) {
                bitmap = null;
            }
            this.a = bitmap;
            if (mv.this.s != null) {
                uri = mv.this.s.e;
            }
            this.b = uri;
        }

        /* access modifiers changed from: protected */
        public final void onPreExecute() {
            mv.this.c();
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:20|21|22|23|(3:25|(2:27|28)|29)|31|32|(2:(2:35|36)|37)(3:39|40|(2:42|43))) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0098 */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0048 A[Catch:{ IOException -> 0x0098 }] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00a4 A[SYNTHETIC, Splitter:B:57:0x00a4] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00ab A[SYNTHETIC, Splitter:B:61:0x00ab] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private android.graphics.Bitmap a() {
            /*
                r8 = this;
                java.lang.String r0 = "Unable to open: "
                android.graphics.Bitmap r1 = r8.a
                r2 = 0
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x000c
                r0 = r1
                goto L_0x00b0
            L_0x000c:
                android.net.Uri r1 = r8.b
                if (r1 == 0) goto L_0x00af
                java.io.InputStream r1 = r8.a(r1)     // Catch:{ IOException -> 0x0097, all -> 0x0094 }
                if (r1 != 0) goto L_0x0026
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0098 }
                r5.<init>(r0)     // Catch:{ IOException -> 0x0098 }
                android.net.Uri r6 = r8.b     // Catch:{ IOException -> 0x0098 }
                r5.append(r6)     // Catch:{ IOException -> 0x0098 }
                if (r1 == 0) goto L_0x0025
                r1.close()     // Catch:{ IOException -> 0x0025 }
            L_0x0025:
                return r4
            L_0x0026:
                android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0098 }
                r5.<init>()     // Catch:{ IOException -> 0x0098 }
                r5.inJustDecodeBounds = r3     // Catch:{ IOException -> 0x0098 }
                android.graphics.BitmapFactory.decodeStream(r1, r4, r5)     // Catch:{ IOException -> 0x0098 }
                int r6 = r5.outWidth     // Catch:{ IOException -> 0x0098 }
                if (r6 == 0) goto L_0x008e
                int r6 = r5.outHeight     // Catch:{ IOException -> 0x0098 }
                if (r6 != 0) goto L_0x0039
                goto L_0x008e
            L_0x0039:
                r1.reset()     // Catch:{ IOException -> 0x003d }
                goto L_0x0058
            L_0x003d:
                r1.close()     // Catch:{ IOException -> 0x0098 }
                android.net.Uri r6 = r8.b     // Catch:{ IOException -> 0x0098 }
                java.io.InputStream r1 = r8.a(r6)     // Catch:{ IOException -> 0x0098 }
                if (r1 != 0) goto L_0x0058
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0098 }
                r5.<init>(r0)     // Catch:{ IOException -> 0x0098 }
                android.net.Uri r6 = r8.b     // Catch:{ IOException -> 0x0098 }
                r5.append(r6)     // Catch:{ IOException -> 0x0098 }
                if (r1 == 0) goto L_0x0057
                r1.close()     // Catch:{ IOException -> 0x0057 }
            L_0x0057:
                return r4
            L_0x0058:
                r5.inJustDecodeBounds = r2     // Catch:{ IOException -> 0x0098 }
                mv r6 = defpackage.mv.this     // Catch:{ IOException -> 0x0098 }
                android.content.Context r6 = r6.h     // Catch:{ IOException -> 0x0098 }
                android.content.res.Resources r6 = r6.getResources()     // Catch:{ IOException -> 0x0098 }
                r7 = 2131165844(0x7f070294, float:1.7945917E38)
                int r6 = r6.getDimensionPixelSize(r7)     // Catch:{ IOException -> 0x0098 }
                int r7 = r5.outHeight     // Catch:{ IOException -> 0x0098 }
                int r7 = r7 / r6
                int r6 = java.lang.Integer.highestOneBit(r7)     // Catch:{ IOException -> 0x0098 }
                int r6 = java.lang.Math.max(r3, r6)     // Catch:{ IOException -> 0x0098 }
                r5.inSampleSize = r6     // Catch:{ IOException -> 0x0098 }
                boolean r6 = r8.isCancelled()     // Catch:{ IOException -> 0x0098 }
                if (r6 == 0) goto L_0x0082
                if (r1 == 0) goto L_0x0081
                r1.close()     // Catch:{ IOException -> 0x0081 }
            L_0x0081:
                return r4
            L_0x0082:
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1, r4, r5)     // Catch:{ IOException -> 0x0098 }
                if (r1 == 0) goto L_0x00b0
                r1.close()     // Catch:{ IOException -> 0x008c }
                goto L_0x00b0
            L_0x008c:
                goto L_0x00b0
            L_0x008e:
                if (r1 == 0) goto L_0x0093
                r1.close()     // Catch:{ IOException -> 0x0093 }
            L_0x0093:
                return r4
            L_0x0094:
                r0 = move-exception
                r1 = r4
                goto L_0x00a9
            L_0x0097:
                r1 = r4
            L_0x0098:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
                r5.<init>(r0)     // Catch:{ all -> 0x00a8 }
                android.net.Uri r0 = r8.b     // Catch:{ all -> 0x00a8 }
                r5.append(r0)     // Catch:{ all -> 0x00a8 }
                if (r1 == 0) goto L_0x00af
                r1.close()     // Catch:{ IOException -> 0x00af }
                goto L_0x00af
            L_0x00a8:
                r0 = move-exception
            L_0x00a9:
                if (r1 == 0) goto L_0x00ae
                r1.close()     // Catch:{ IOException -> 0x00ae }
            L_0x00ae:
                throw r0
            L_0x00af:
                r0 = r4
            L_0x00b0:
                boolean r1 = defpackage.mv.a(r0)
                if (r1 == 0) goto L_0x00c1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Can't use recycled bitmap: "
                r1.<init>(r2)
                r1.append(r0)
                return r4
            L_0x00c1:
                if (r0 == 0) goto L_0x00f5
                int r1 = r0.getWidth()
                int r4 = r0.getHeight()
                if (r1 >= r4) goto L_0x00f5
                nl$a r1 = new nl$a
                r1.<init>(r0)
                r1.a = r3
                nl r1 = r1.a()
                java.util.List<nl$d> r3 = r1.a
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x00e5
                goto L_0x00f3
            L_0x00e5:
                java.util.List<nl$d> r1 = r1.a
                java.util.List r1 = java.util.Collections.unmodifiableList(r1)
                java.lang.Object r1 = r1.get(r2)
                nl$d r1 = (defpackage.nl.d) r1
                int r2 = r1.a
            L_0x00f3:
                r8.c = r2
            L_0x00f5:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mv.a.a():android.graphics.Bitmap");
        }

        private InputStream a(Uri uri) {
            InputStream inputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
                inputStream = mv.this.h.getContentResolver().openInputStream(uri);
            } else {
                URLConnection openConnection = new URL(uri.toString()).openConnection();
                openConnection.setConnectTimeout(LogLevel.NONE);
                openConnection.setReadTimeout(LogLevel.NONE);
                inputStream = openConnection.getInputStream();
            }
            if (inputStream == null) {
                return null;
            }
            return new BufferedInputStream(inputStream);
        }
    }

    /* renamed from: mv$b */
    final class b extends android.support.v4.media.session.MediaControllerCompat.a {
        b() {
        }

        public final void a() {
            if (mv.this.q != null) {
                mv.this.q.b(mv.this.r);
                mv.this.q = null;
            }
        }

        public final void a(MediaMetadataCompat mediaMetadataCompat) {
            mv.this.s = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
            mv.this.b();
            mv.this.e();
        }
    }

    /* renamed from: mv$c */
    abstract class c extends u {
        defpackage.nd.f a;
        final ImageButton b;
        final MediaRouteVolumeSlider c;

        c(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            super(view);
            this.b = imageButton;
            this.c = mediaRouteVolumeSlider;
            this.b.setImageDrawable(mw.a(mv.this.h));
            mw.a(mv.this.h, this.c);
        }

        /* access modifiers changed from: 0000 */
        public final void a(defpackage.nd.f fVar) {
            this.a = fVar;
            int i = this.a.n;
            this.b.setActivated(i == 0);
            this.b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    if (mv.this.m != null) {
                        mv.this.i.removeMessages(2);
                    }
                    mv.this.m = c.this.a;
                    int i = 1;
                    boolean z = !view.isActivated();
                    if (z) {
                        i = 0;
                    } else {
                        c cVar = c.this;
                        Integer num = (Integer) mv.this.n.get(cVar.a.c);
                        if (num != null) {
                            i = Math.max(1, num.intValue());
                        }
                    }
                    c.this.a(z);
                    c.this.c.setProgress(i);
                    c.this.a.a(i);
                    mv.this.i.sendEmptyMessageDelayed(2, 500);
                }
            });
            this.c.setTag(this.a);
            this.c.setMax(fVar.o);
            this.c.setProgress(i);
            this.c.setOnSeekBarChangeListener(mv.this.k);
        }

        /* access modifiers changed from: 0000 */
        public final void a(boolean z) {
            if (this.b.isActivated() != z) {
                this.b.setActivated(z);
                if (z) {
                    mv.this.n.put(this.a.c, Integer.valueOf(this.c.getProgress()));
                } else {
                    mv.this.n.remove(this.a.c);
                }
            }
        }
    }

    /* renamed from: mv$d */
    final class d extends defpackage.nd.a {
        d() {
        }

        public final void a(nd ndVar, defpackage.nd.f fVar) {
            mv.this.g();
        }

        public final void b(nd ndVar, defpackage.nd.f fVar) {
            mv.this.g();
        }

        public final void a(defpackage.nd.f fVar) {
            mv mvVar = mv.this;
            mvVar.c = fVar;
            mvVar.o = false;
            mvVar.d();
            mv.this.h();
        }

        public final void a() {
            mv.this.g();
        }

        public final void c(nd ndVar, defpackage.nd.f fVar) {
            boolean z;
            if (fVar == mv.this.c && fVar.g() != null) {
                Iterator it = fVar.a.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    defpackage.nd.f fVar2 = (defpackage.nd.f) it.next();
                    if (!Collections.unmodifiableList(mv.this.c.s).contains(fVar2)) {
                        defpackage.nd.f.a g = fVar2.g();
                        if (g != null && g.b() && !mv.this.e.contains(fVar2)) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
            if (z) {
                mv.this.d();
                mv.this.h();
                return;
            }
            mv.this.g();
        }

        public final void b(defpackage.nd.f fVar) {
            int i = fVar.n;
            if (mv.a) {
                new StringBuilder("onRouteVolumeChanged(), route.getVolume:").append(i);
            }
            if (mv.this.m != fVar) {
                c cVar = (c) mv.this.l.get(fVar.c);
                if (cVar != null) {
                    int i2 = cVar.a.n;
                    cVar.a(i2 == 0);
                    cVar.c.setProgress(i2);
                }
            }
        }
    }

    /* renamed from: mv$e */
    final class e extends androidx.recyclerview.widget.RecyclerView.a<u> {
        private final ArrayList<d> d = new ArrayList<>();
        private final LayoutInflater e;
        private final Drawable f;
        private final Drawable g;
        private final Drawable h;
        private final Drawable i;
        private d j;
        private final int k;
        private final Interpolator l;

        /* renamed from: mv$e$a */
        class a extends u {
            final View a;
            final ImageView b;
            final ProgressBar c;
            final TextView d;
            final float e;
            defpackage.nd.f f;

            a(View view) {
                super(view);
                this.a = view;
                this.b = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
                this.c = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
                this.d = (TextView) view.findViewById(R.id.mr_cast_group_name);
                this.e = mw.i(mv.this.h);
                mw.a(mv.this.h, this.c);
            }
        }

        /* renamed from: mv$e$b */
        class b extends c {
            final int e;
            private final TextView f;

            b(View view) {
                super(view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
                this.f = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
                Resources resources = mv.this.h.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
                this.e = (int) typedValue.getDimension(displayMetrics);
            }

            /* access modifiers changed from: 0000 */
            public final void a(d dVar) {
                mv.a(this.o, e.this.a() ? this.e : 0);
                defpackage.nd.f fVar = (defpackage.nd.f) dVar.a;
                super.a(fVar);
                this.f.setText(fVar.d);
            }
        }

        /* renamed from: mv$e$c */
        class c extends u {
            final TextView a;

            c(View view) {
                super(view);
                this.a = (TextView) view.findViewById(R.id.mr_cast_header_name);
            }
        }

        /* renamed from: mv$e$d */
        class d {
            final Object a;
            final int b;

            d(Object obj, int i) {
                this.a = obj;
                this.b = i;
            }
        }

        /* renamed from: mv$e$e reason: collision with other inner class name */
        class C0058e extends c {
            private int D;
            final View e;
            final ImageView f;
            final ProgressBar g;
            final TextView h;
            final RelativeLayout i;
            final CheckBox j;
            final float k;
            final int l;
            final OnClickListener m = new OnClickListener() {
                public final void onClick(View view) {
                    boolean z = true;
                    boolean z2 = !C0058e.b(C0058e.this.a);
                    boolean f = C0058e.this.a.f();
                    if (z2) {
                        nd.b(C0058e.this.a);
                    } else {
                        nd.c(C0058e.this.a);
                    }
                    C0058e.this.a(z2, !f);
                    if (f) {
                        List unmodifiableList = Collections.unmodifiableList(mv.this.c.s);
                        for (defpackage.nd.f fVar : Collections.unmodifiableList(C0058e.this.a.s)) {
                            if (unmodifiableList.contains(fVar) != z2) {
                                c cVar = (c) mv.this.l.get(fVar.c);
                                if (cVar instanceof C0058e) {
                                    ((C0058e) cVar).a(z2, true);
                                }
                            }
                        }
                    }
                    e eVar = e.this;
                    defpackage.nd.f fVar2 = C0058e.this.a;
                    List unmodifiableList2 = Collections.unmodifiableList(mv.this.c.s);
                    int max = Math.max(1, unmodifiableList2.size());
                    int i = -1;
                    if (fVar2.f()) {
                        for (defpackage.nd.f contains : Collections.unmodifiableList(fVar2.s)) {
                            if (unmodifiableList2.contains(contains) != z2) {
                                max += z2 ? 1 : -1;
                            }
                        }
                    } else {
                        if (z2) {
                            i = 1;
                        }
                        max += i;
                    }
                    boolean a2 = eVar.a();
                    int i2 = 0;
                    if (max < 2) {
                        z = false;
                    }
                    if (a2 != z) {
                        u g = mv.this.j.g(0);
                        if (g instanceof b) {
                            b bVar = (b) g;
                            View view2 = bVar.o;
                            if (z) {
                                i2 = bVar.e;
                            }
                            eVar.a(view2, i2);
                        }
                    }
                }
            };

            C0058e(View view) {
                super(view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
                this.e = view;
                this.f = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
                this.g = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
                this.h = (TextView) view.findViewById(R.id.mr_cast_route_name);
                this.i = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
                this.j = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
                this.j.setButtonDrawable(mw.b(mv.this.h));
                mw.a(mv.this.h, this.g);
                this.k = mw.i(mv.this.h);
                Resources resources = mv.this.h.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
                this.l = (int) typedValue.getDimension(displayMetrics);
                this.D = 0;
            }

            static boolean b(defpackage.nd.f fVar) {
                if (fVar.a()) {
                    return true;
                }
                defpackage.nd.f.a g2 = fVar.g();
                if (g2 != null) {
                    if ((defpackage.nd.f.this.r != null ? defpackage.nd.f.this.r.b : 1) == 3) {
                        return true;
                    }
                }
                return false;
            }

            /* access modifiers changed from: 0000 */
            public final void a(boolean z, boolean z2) {
                int i2 = 0;
                this.j.setEnabled(false);
                this.e.setEnabled(false);
                this.j.setChecked(z);
                if (z) {
                    this.f.setVisibility(4);
                    this.g.setVisibility(0);
                }
                if (z2) {
                    e eVar = e.this;
                    RelativeLayout relativeLayout = this.i;
                    if (z) {
                        i2 = this.l;
                    }
                    eVar.a((View) relativeLayout, i2);
                }
            }
        }

        e() {
            this.e = LayoutInflater.from(mv.this.h);
            this.f = mw.c(mv.this.h);
            this.g = mw.d(mv.this.h);
            this.h = mw.e(mv.this.h);
            this.i = mw.f(mv.this.h);
            this.k = mv.this.h.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
            this.l = new AccelerateDecelerateInterpolator();
            c();
        }

        /* access modifiers changed from: 0000 */
        public final boolean a() {
            return Collections.unmodifiableList(mv.this.c.s).size() > 1;
        }

        /* access modifiers changed from: 0000 */
        public final void a(final View view, final int i2) {
            final int i3 = view.getLayoutParams().height;
            AnonymousClass1 r1 = new Animation() {
                /* access modifiers changed from: protected */
                public final void applyTransformation(float f, Transformation transformation) {
                    int i = i2;
                    int i2 = i3;
                    mv.a(view, i2 + ((int) (((float) (i - i2)) * f)));
                }
            };
            r1.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                    mv.this.p = true;
                }

                public final void onAnimationEnd(Animation animation) {
                    mv.this.p = false;
                    mv.this.d();
                }
            });
            r1.setDuration((long) this.k);
            r1.setInterpolator(this.l);
            view.startAnimation(r1);
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            this.d.clear();
            this.j = new d(mv.this.c, 1);
            if (!mv.this.d.isEmpty()) {
                for (defpackage.nd.f dVar : mv.this.d) {
                    this.d.add(new d(dVar, 3));
                }
            } else {
                this.d.add(new d(mv.this.c, 3));
            }
            boolean z = false;
            if (!mv.this.e.isEmpty()) {
                boolean z2 = false;
                for (defpackage.nd.f fVar : mv.this.e) {
                    if (!mv.this.d.contains(fVar)) {
                        if (!z2) {
                            defpackage.mz.b h2 = defpackage.nd.f.h();
                            String a2 = h2 != null ? h2.a() : null;
                            if (TextUtils.isEmpty(a2)) {
                                a2 = mv.this.h.getString(R.string.mr_dialog_groupable_header);
                            }
                            this.d.add(new d(a2, 2));
                            z2 = true;
                        }
                        this.d.add(new d(fVar, 3));
                    }
                }
            }
            if (!mv.this.f.isEmpty()) {
                for (defpackage.nd.f fVar2 : mv.this.f) {
                    if (mv.this.c != fVar2) {
                        if (!z) {
                            defpackage.mz.b h3 = defpackage.nd.f.h();
                            String b2 = h3 != null ? h3.b() : null;
                            if (TextUtils.isEmpty(b2)) {
                                b2 = mv.this.h.getString(R.string.mr_dialog_transferable_header);
                            }
                            this.d.add(new d(b2, 2));
                            z = true;
                        }
                        this.d.add(new d(fVar2, 4));
                    }
                }
            }
            d();
        }

        /* access modifiers changed from: 0000 */
        public final void d() {
            mv.this.g.clear();
            mv.this.g.addAll(mt.a(mv.this.e, mv.this.f()));
            e();
        }

        public final u a(ViewGroup viewGroup, int i2) {
            if (i2 == 1) {
                return new b(this.e.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
            }
            if (i2 == 2) {
                return new c(this.e.inflate(R.layout.mr_cast_header_item, viewGroup, false));
            }
            if (i2 == 3) {
                return new C0058e(this.e.inflate(R.layout.mr_cast_route_item, viewGroup, false));
            }
            if (i2 != 4) {
                return null;
            }
            return new a(this.e.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0132, code lost:
            if (r10.a() != false) goto L_0x0134;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(androidx.recyclerview.widget.RecyclerView.u r9, int r10) {
            /*
                r8 = this;
                int r0 = r8.a(r10)
                mv$e$d r10 = r8.f(r10)
                r1 = 1
                if (r0 == r1) goto L_0x01cd
                r2 = 2
                if (r0 == r2) goto L_0x01bf
                r3 = 3
                r4 = 1065353216(0x3f800000, float:1.0)
                r5 = 4
                r6 = 0
                if (r0 == r3) goto L_0x0078
                if (r0 == r5) goto L_0x0019
                goto L_0x01a0
            L_0x0019:
                mv$e$a r9 = (defpackage.mv.e.a) r9
                java.lang.Object r10 = r10.a
                nd$f r10 = (defpackage.nd.f) r10
                r9.f = r10
                android.widget.ImageView r0 = r9.b
                r0.setVisibility(r6)
                android.widget.ProgressBar r0 = r9.c
                r0.setVisibility(r5)
                mv$e r0 = defpackage.mv.e.this
                mv r0 = defpackage.mv.this
                nd$f r0 = r0.c
                nd$f$a r0 = r0.g()
                if (r0 == 0) goto L_0x0050
                mv$e r0 = defpackage.mv.e.this
                mv r0 = defpackage.mv.this
                nd$f r0 = r0.c
                java.util.List<nd$f> r0 = r0.s
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                int r2 = r0.size()
                if (r2 != r1) goto L_0x0050
                java.lang.Object r0 = r0.get(r6)
                if (r0 != r10) goto L_0x0050
                r1 = 0
            L_0x0050:
                android.view.View r0 = r9.a
                if (r1 == 0) goto L_0x0055
                goto L_0x0057
            L_0x0055:
                float r4 = r9.e
            L_0x0057:
                r0.setAlpha(r4)
                android.view.View r0 = r9.a
                mv$e$a$1 r1 = new mv$e$a$1
                r1.<init>()
                r0.setOnClickListener(r1)
                android.widget.ImageView r0 = r9.b
                mv$e r1 = defpackage.mv.e.this
                android.graphics.drawable.Drawable r1 = r1.a(r10)
                r0.setImageDrawable(r1)
                android.widget.TextView r9 = r9.d
                java.lang.String r10 = r10.d
                r9.setText(r10)
                goto L_0x01a0
            L_0x0078:
                java.lang.Object r0 = r10.a
                nd$f r0 = (defpackage.nd.f) r0
                mv r3 = defpackage.mv.this
                java.util.Map<java.lang.String, mv$c> r3 = r3.l
                java.lang.String r0 = r0.c
                r7 = r9
                mv$c r7 = (defpackage.mv.c) r7
                r3.put(r0, r7)
                mv$e$e r9 = (defpackage.mv.e.C0058e) r9
                java.lang.Object r10 = r10.a
                nd$f r10 = (defpackage.nd.f) r10
                mv$e r0 = defpackage.mv.e.this
                mv r0 = defpackage.mv.this
                nd$f r0 = r0.c
                if (r10 != r0) goto L_0x00c5
                java.util.List<nd$f> r0 = r10.s
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                int r0 = r0.size()
                if (r0 <= 0) goto L_0x00c5
                java.util.List<nd$f> r0 = r10.s
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                java.util.Iterator r0 = r0.iterator()
            L_0x00ac:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x00c5
                java.lang.Object r3 = r0.next()
                nd$f r3 = (defpackage.nd.f) r3
                mv$e r7 = defpackage.mv.e.this
                mv r7 = defpackage.mv.this
                java.util.List<nd$f> r7 = r7.e
                boolean r7 = r7.contains(r3)
                if (r7 != 0) goto L_0x00ac
                r10 = r3
            L_0x00c5:
                r9.a(r10)
                android.widget.ImageView r0 = r9.f
                mv$e r3 = defpackage.mv.e.this
                android.graphics.drawable.Drawable r3 = r3.a(r10)
                r0.setImageDrawable(r3)
                android.widget.TextView r0 = r9.h
                java.lang.String r3 = r10.d
                r0.setText(r3)
                mv$e r0 = defpackage.mv.e.this
                mv r0 = defpackage.mv.this
                nd$f r0 = r0.c
                nd$f$a r0 = r0.g()
                if (r0 == 0) goto L_0x01a1
                android.widget.CheckBox r0 = r9.j
                r0.setVisibility(r6)
                boolean r0 = defpackage.mv.e.C0058e.b(r10)
                mv$e r3 = defpackage.mv.e.this
                mv r3 = defpackage.mv.this
                java.util.List<nd$f> r3 = r3.g
                boolean r3 = r3.contains(r10)
                if (r3 == 0) goto L_0x00fd
            L_0x00fb:
                r10 = 0
                goto L_0x0135
            L_0x00fd:
                boolean r3 = defpackage.mv.e.C0058e.b(r10)
                if (r3 == 0) goto L_0x0116
                mv$e r3 = defpackage.mv.e.this
                mv r3 = defpackage.mv.this
                nd$f r3 = r3.c
                java.util.List<nd$f> r3 = r3.s
                java.util.List r3 = java.util.Collections.unmodifiableList(r3)
                int r3 = r3.size()
                if (r3 >= r2) goto L_0x0116
                goto L_0x00fb
            L_0x0116:
                boolean r2 = defpackage.mv.e.C0058e.b(r10)
                if (r2 == 0) goto L_0x0134
                mv$e r2 = defpackage.mv.e.this
                mv r2 = defpackage.mv.this
                nd$f r2 = r2.c
                nd$f$a r2 = r2.g()
                if (r2 == 0) goto L_0x0134
                nd$f$a r10 = r10.g()
                if (r10 == 0) goto L_0x00fb
                boolean r10 = r10.a()
                if (r10 == 0) goto L_0x00fb
            L_0x0134:
                r10 = 1
            L_0x0135:
                android.widget.CheckBox r2 = r9.j
                r2.setChecked(r0)
                android.widget.ProgressBar r2 = r9.g
                r2.setVisibility(r5)
                android.widget.ImageView r2 = r9.f
                r2.setVisibility(r6)
                android.view.View r2 = r9.e
                r2.setEnabled(r10)
                android.widget.CheckBox r2 = r9.j
                r2.setEnabled(r10)
                android.widget.ImageButton r2 = r9.b
                if (r10 != 0) goto L_0x0157
                if (r0 == 0) goto L_0x0155
                goto L_0x0157
            L_0x0155:
                r3 = 0
                goto L_0x0158
            L_0x0157:
                r3 = 1
            L_0x0158:
                r2.setEnabled(r3)
                androidx.mediarouter.app.MediaRouteVolumeSlider r2 = r9.c
                if (r10 != 0) goto L_0x0163
                if (r0 == 0) goto L_0x0162
                goto L_0x0163
            L_0x0162:
                r1 = 0
            L_0x0163:
                r2.setEnabled(r1)
                android.view.View r1 = r9.e
                android.view.View$OnClickListener r2 = r9.m
                r1.setOnClickListener(r2)
                android.widget.CheckBox r1 = r9.j
                android.view.View$OnClickListener r2 = r9.m
                r1.setOnClickListener(r2)
                android.widget.RelativeLayout r1 = r9.i
                if (r0 == 0) goto L_0x0182
                nd$f r2 = r9.a
                boolean r2 = r2.f()
                if (r2 != 0) goto L_0x0182
                int r6 = r9.l
            L_0x0182:
                defpackage.mv.a(r1, r6)
                android.view.View r1 = r9.e
                if (r10 != 0) goto L_0x018f
                if (r0 == 0) goto L_0x018c
                goto L_0x018f
            L_0x018c:
                float r2 = r9.k
                goto L_0x0191
            L_0x018f:
                r2 = 1065353216(0x3f800000, float:1.0)
            L_0x0191:
                r1.setAlpha(r2)
                android.widget.CheckBox r1 = r9.j
                if (r10 != 0) goto L_0x019d
                if (r0 != 0) goto L_0x019b
                goto L_0x019d
            L_0x019b:
                float r4 = r9.k
            L_0x019d:
                r1.setAlpha(r4)
            L_0x01a0:
                return
            L_0x01a1:
                android.widget.CheckBox r10 = r9.j
                r0 = 8
                r10.setVisibility(r0)
                android.widget.ProgressBar r10 = r9.g
                r10.setVisibility(r5)
                android.widget.ImageView r10 = r9.f
                r10.setVisibility(r6)
                android.widget.RelativeLayout r10 = r9.i
                int r0 = r9.l
                defpackage.mv.a(r10, r0)
                android.view.View r9 = r9.e
                r9.setAlpha(r4)
                return
            L_0x01bf:
                mv$e$c r9 = (defpackage.mv.e.c) r9
                java.lang.Object r10 = r10.a
                java.lang.String r10 = r10.toString()
                android.widget.TextView r9 = r9.a
                r9.setText(r10)
                return
            L_0x01cd:
                java.lang.Object r0 = r10.a
                nd$f r0 = (defpackage.nd.f) r0
                mv r1 = defpackage.mv.this
                java.util.Map<java.lang.String, mv$c> r1 = r1.l
                java.lang.String r0 = r0.c
                r2 = r9
                mv$c r2 = (defpackage.mv.c) r2
                r1.put(r0, r2)
                mv$e$b r9 = (defpackage.mv.e.b) r9
                r9.a(r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mv.e.a(androidx.recyclerview.widget.RecyclerView$u, int):void");
        }

        public final void a(u uVar) {
            super.a(uVar);
            mv.this.l.values().remove(uVar);
        }

        public final int b() {
            return this.d.size() + 1;
        }

        public final int a(int i2) {
            return f(i2).b;
        }

        private d f(int i2) {
            if (i2 == 0) {
                return this.j;
            }
            return (d) this.d.get(i2 - 1);
        }

        /* access modifiers changed from: 0000 */
        public final Drawable a(defpackage.nd.f fVar) {
            Uri uri = fVar.f;
            if (uri != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(mv.this.h.getContentResolver().openInputStream(uri), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException unused) {
                    new StringBuilder("Failed to load ").append(uri);
                }
            }
            int i2 = fVar.l;
            if (i2 == 1) {
                return this.g;
            }
            if (i2 == 2) {
                return this.h;
            }
            if (fVar.f()) {
                return this.i;
            }
            return this.f;
        }
    }

    /* renamed from: mv$f */
    static final class f implements Comparator<defpackage.nd.f> {
        static final f a = new f();

        f() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((defpackage.nd.f) obj).d.compareToIgnoreCase(((defpackage.nd.f) obj2).d);
        }
    }

    /* renamed from: mv$g */
    class g implements OnSeekBarChangeListener {
        g() {
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            if (mv.this.m != null) {
                mv.this.i.removeMessages(2);
            }
            mv.this.m = (defpackage.nd.f) seekBar.getTag();
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            mv.this.i.sendEmptyMessageDelayed(2, 500);
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                defpackage.nd.f fVar = (defpackage.nd.f) seekBar.getTag();
                c cVar = (c) mv.this.l.get(fVar.c);
                if (cVar != null) {
                    cVar.a(i == 0);
                }
                fVar.a(i);
            }
        }
    }

    public mv(Context context) {
        this(context, 0);
    }

    private mv(Context context, int i2) {
        Context a2 = mw.a(context, 0, false);
        super(a2, mw.h(a2));
        this.A = nc.c;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = new Handler() {
            public final void handleMessage(Message message) {
                int i = message.what;
                if (i != 1) {
                    if (i == 2 && mv.this.m != null) {
                        mv mvVar = mv.this;
                        mvVar.m = null;
                        mvVar.d();
                    }
                    return;
                }
                mv.this.g();
            }
        };
        this.h = getContext();
        this.b = nd.a(this.h);
        this.z = new d();
        this.c = nd.c();
        this.r = new b();
        a(nd.d());
    }

    private void a(Token token) {
        MediaMetadataCompat mediaMetadataCompat;
        MediaControllerCompat mediaControllerCompat = this.q;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.b(this.r);
            this.q = null;
        }
        if (token != null && this.C) {
            try {
                this.q = new MediaControllerCompat(this.h, token);
            } catch (RemoteException e2) {
                Log.e("MediaRouteCtrlDialog", "Error creating media controller in setMediaSession.", e2);
            }
            MediaControllerCompat mediaControllerCompat2 = this.q;
            if (mediaControllerCompat2 != null) {
                mediaControllerCompat2.a(this.r);
            }
            MediaControllerCompat mediaControllerCompat3 = this.q;
            if (mediaControllerCompat3 == null) {
                mediaMetadataCompat = null;
            } else {
                mediaMetadataCompat = mediaControllerCompat3.c();
            }
            if (mediaMetadataCompat != null) {
                mediaDescriptionCompat = mediaMetadataCompat.a();
            }
            this.s = mediaDescriptionCompat;
            b();
            e();
        }
    }

    public final void a(nc ncVar) {
        if (ncVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.A.equals(ncVar)) {
            this.A = ncVar;
            if (this.C) {
                this.b.a((defpackage.nd.a) this.z);
                this.b.a(ncVar, this.z, 1);
                h();
            }
        }
    }

    private void a(List<defpackage.nd.f> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            defpackage.nd.f fVar = (defpackage.nd.f) list.get(size);
            if (!(!fVar.c() && fVar.g && fVar.a(this.A) && this.c != fVar)) {
                list.remove(size);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.mr_cast_dialog);
        mw.a(this.h, (Dialog) this);
        this.H = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.H.setColorFilter(-1);
        this.H.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                mv.this.dismiss();
            }
        });
        this.I = (Button) findViewById(R.id.mr_cast_stop_button);
        this.I.setTextColor(-1);
        this.I.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (mv.this.c.a()) {
                    nd.a(2);
                }
                mv.this.dismiss();
            }
        });
        this.E = new e();
        this.j = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.j.a((androidx.recyclerview.widget.RecyclerView.a) this.E);
        this.j.a((i) new LinearLayoutManager(this.h));
        this.k = new g();
        this.l = new HashMap();
        this.n = new HashMap();
        this.J = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.K = findViewById(R.id.mr_cast_meta_black_scrim);
        this.L = (ImageView) findViewById(R.id.mr_cast_meta_art);
        this.M = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.M.setTextColor(-1);
        this.N = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.N.setTextColor(-1);
        this.O = this.h.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.B = true;
        a();
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        getWindow().setLayout(mt.b(this.h), mt.c(this.h));
        this.u = null;
        this.v = null;
        b();
        e();
        g();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C = true;
        this.b.a(this.A, this.z, 1);
        h();
        a(nd.d());
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C = false;
        this.b.a((defpackage.nd.a) this.z);
        this.i.removeCallbacksAndMessages(null);
        a((Token) null);
    }

    static boolean a(Bitmap bitmap) {
        return bitmap != null && bitmap.isRecycled();
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        MediaDescriptionCompat mediaDescriptionCompat = this.s;
        Uri uri = null;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.d;
        MediaDescriptionCompat mediaDescriptionCompat2 = this.s;
        if (mediaDescriptionCompat2 != null) {
            uri = mediaDescriptionCompat2.e;
        }
        a aVar = this.t;
        Bitmap bitmap2 = aVar == null ? this.u : aVar.a;
        a aVar2 = this.t;
        Uri uri2 = aVar2 == null ? this.v : aVar2.b;
        if (bitmap2 != bitmap || (bitmap2 == null && !hn.a(uri2, uri))) {
            a aVar3 = this.t;
            if (aVar3 != null) {
                aVar3.cancel(true);
            }
            this.t = new a();
            this.t.execute(new Void[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        this.w = false;
        this.x = null;
        this.y = 0;
    }

    private boolean i() {
        if (this.m != null || this.o || this.p || !this.B) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        if (this.F) {
            g();
        }
        if (this.G) {
            e();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        if (i()) {
            this.G = true;
            return;
        }
        this.G = false;
        if (!this.c.a() || this.c.c()) {
            dismiss();
        }
        CharSequence charSequence = null;
        if (!this.w || a(this.x) || this.x == null) {
            if (a(this.x)) {
                new StringBuilder("Can't set artwork image with recycled bitmap: ").append(this.x);
            }
            this.L.setVisibility(8);
            this.K.setVisibility(8);
            this.J.setImageBitmap(null);
        } else {
            this.L.setVisibility(0);
            this.L.setImageBitmap(this.x);
            this.L.setBackgroundColor(this.y);
            this.K.setVisibility(0);
            if (VERSION.SDK_INT >= 17) {
                this.J.setImageBitmap(a(this.x, 10.0f, this.h));
            } else {
                this.J.setImageBitmap(Bitmap.createBitmap(this.x));
            }
        }
        c();
        MediaDescriptionCompat mediaDescriptionCompat = this.s;
        CharSequence charSequence2 = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b;
        boolean z2 = !TextUtils.isEmpty(charSequence2);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.s;
        if (mediaDescriptionCompat2 != null) {
            charSequence = mediaDescriptionCompat2.c;
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(charSequence);
        if (z2) {
            this.M.setText(charSequence2);
        } else {
            this.M.setText(this.O);
        }
        if (isEmpty) {
            this.N.setText(charSequence);
            this.N.setVisibility(0);
            return;
        }
        this.N.setVisibility(8);
    }

    static void a(View view, int i2) {
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    public final List<defpackage.nd.f> f() {
        ArrayList arrayList = new ArrayList();
        if (this.c.g() != null) {
            for (defpackage.nd.f fVar : this.c.a.b()) {
                defpackage.nd.f.a g2 = fVar.g();
                if (g2 != null && g2.b()) {
                    arrayList.add(fVar);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    public final void g() {
        if (this.C) {
            if (SystemClock.uptimeMillis() - this.D < 300) {
                this.i.removeMessages(1);
                this.i.sendEmptyMessageAtTime(1, this.D + 300);
            } else if (i()) {
                this.F = true;
            } else {
                this.F = false;
                if (!this.c.a() || this.c.c()) {
                    dismiss();
                }
                this.D = SystemClock.uptimeMillis();
                this.E.d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.d.addAll(Collections.unmodifiableList(this.c.s));
        if (this.c.g() != null) {
            for (defpackage.nd.f fVar : this.c.a.b()) {
                defpackage.nd.f.a g2 = fVar.g();
                if (g2 != null) {
                    if (g2.b()) {
                        this.e.add(fVar);
                    }
                    if (g2.c()) {
                        this.f.add(fVar);
                    }
                }
            }
        }
        a(this.e);
        a(this.f);
        Collections.sort(this.d, f.a);
        Collections.sort(this.e, f.a);
        Collections.sort(this.f, f.a);
        this.E.c();
    }

    private static Bitmap a(Bitmap bitmap, float f2, Context context) {
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(10.0f);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        createTyped.copyTo(bitmap);
        createFromBitmap.destroy();
        createTyped.destroy();
        create2.destroy();
        create.destroy();
        return bitmap;
    }
}
