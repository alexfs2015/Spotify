package defpackage;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.VideoSurfaceView.ScaleType;
import com.spotify.music.R;
import com.spotify.music.features.fullscreen.story.FullscreenStoryTouchListener;
import com.spotify.music.features.fullscreen.story.FullscreenStoryTouchListener.TouchEvent;
import com.spotify.music.features.fullscreen.story.mobius.view.FullscreenStoryViewState;
import com.spotify.music.nowplaying.common.view.heart.HeartButton;
import com.spotify.music.nowplaying.common.view.trackinfo.MarqueeTrackInfoView;
import com.spotify.stories.v1.view.proto.Chapter;
import com.spotify.stories.v1.view.proto.Chapter.ChapterCase;
import com.spotify.stories.v1.view.proto.Story;
import com.spotify.stories.v1.view.proto.TrackChapter;
import com.spotify.stories.v1.view.proto.VideoChapter;
import com.squareup.picasso.Picasso;
import java.util.Collections;

/* renamed from: ngv reason: default package */
public final class ngv implements kmm<ngi, nge>, ngt, ngu {
    private final a a;
    private final jzn b;
    private final ngr c;
    private final DisplayMetrics d;
    private final Picasso e;
    /* access modifiers changed from: private */
    public View f;
    /* access modifiers changed from: private */
    public VideoSurfaceView g;
    /* access modifiers changed from: private */
    public ImageView h;
    /* access modifiers changed from: private */
    public ImageView i;
    /* access modifiers changed from: private */
    public ViewGroup j;
    /* access modifiers changed from: private */
    public ViewGroup k;
    /* access modifiers changed from: private */
    public TextView l;
    /* access modifiers changed from: private */
    public TextView m;
    /* access modifiers changed from: private */
    public ImageView n;
    /* access modifiers changed from: private */
    public HeartButton o;
    /* access modifiers changed from: private */
    public View p;
    /* access modifiers changed from: private */
    public MarqueeTrackInfoView q;
    /* access modifiers changed from: private */
    public View r;
    /* access modifiers changed from: private */
    public View s;
    /* access modifiers changed from: private */
    public ImageView t;
    /* access modifiers changed from: private */
    public TextView u;
    /* access modifiers changed from: private */
    public TextView v;
    /* access modifiers changed from: private */
    public View w;
    /* access modifiers changed from: private */
    public View x;
    /* access modifiers changed from: private */
    public jzm y;

    /* renamed from: ngv$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[TouchEvent.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.music.features.fullscreen.story.FullscreenStoryTouchListener$TouchEvent[] r0 = com.spotify.music.features.fullscreen.story.FullscreenStoryTouchListener.TouchEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.fullscreen.story.FullscreenStoryTouchListener$TouchEvent r1 = com.spotify.music.features.fullscreen.story.FullscreenStoryTouchListener.TouchEvent.LEFT_HALF_SCREEN_CLICK     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.fullscreen.story.FullscreenStoryTouchListener$TouchEvent r1 = com.spotify.music.features.fullscreen.story.FullscreenStoryTouchListener.TouchEvent.RIGHT_HALF_SCREEN_CLICK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.fullscreen.story.FullscreenStoryTouchListener$TouchEvent r1 = com.spotify.music.features.fullscreen.story.FullscreenStoryTouchListener.TouchEvent.LONG_PRESS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.music.features.fullscreen.story.FullscreenStoryTouchListener$TouchEvent r1 = com.spotify.music.features.fullscreen.story.FullscreenStoryTouchListener.TouchEvent.LONG_PRESS_RELEASED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ngv.AnonymousClass2.<clinit>():void");
        }
    }

    /* renamed from: ngv$a */
    public interface a {
        View ah();

        void ai();
    }

    public ngv(a aVar, jzn jzn, ngr ngr, DisplayMetrics displayMetrics, Picasso picasso) {
        this.a = aVar;
        this.c = ngr;
        this.d = (DisplayMetrics) fbp.a(displayMetrics);
        this.e = picasso;
        this.b = jzn;
    }

    private static int a(int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            return i2;
        }
        if (str.charAt(0) != '#') {
            str = "#".concat(String.valueOf(str));
        }
        return Color.parseColor(str);
    }

    private static kab a(String str) {
        return kab.e().a(str).a(false).b(false).c();
    }

    private void a(int i2, float f2) {
        int i3 = (int) (f2 * 10000.0f);
        fbp.a(this.k);
        ((ProgressBar) this.k.getChildAt(i2)).setProgress(i3);
    }

    private void a(String str, jzx jzx) {
        ((jzm) fbp.a(this.y)).a(a(str), jzx);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(knw knw, TouchEvent touchEvent) {
        int i2 = AnonymousClass2.a[touchEvent.ordinal()];
        if (i2 == 1) {
            knw.accept(new n());
        } else if (i2 == 2) {
            knw.accept(new j());
        } else if (i2 == 3) {
            knw.accept(nge.a(false));
            knw.accept(nge.b(false));
        } else if (i2 == 4) {
            knw.accept(nge.a(true));
            knw.accept(nge.b(true));
        } else {
            throw new IllegalStateException("Unhandled state for: ".concat(touchEvent.name()));
        }
    }

    static /* synthetic */ void a(ngv ngv, ngi ngi) {
        if (ngi.a() == FullscreenStoryViewState.OFFLINE || ngi.a() == FullscreenStoryViewState.ERROR) {
            FullscreenStoryViewState a2 = ngi.a();
            fbp.b(a2 == FullscreenStoryViewState.OFFLINE || a2 == FullscreenStoryViewState.ERROR);
            int i2 = a2 == FullscreenStoryViewState.OFFLINE ? R.string.fullscreen_story_error_no_connection_title : R.string.fullscreen_story_error_error_title;
            int i3 = a2 == FullscreenStoryViewState.OFFLINE ? R.string.fullscreen_story_error_no_connection_body : R.string.fullscreen_story_error_error_body;
            ((ImageView) fbp.a(ngv.t)).setImageDrawable(gaa.a(((View) fbp.a(ngv.f)).getContext(), a2 == FullscreenStoryViewState.OFFLINE ? SpotifyIconV2.OFFLINE : SpotifyIconV2.WARNING, (float) vfj.b(32.0f, ((View) fbp.a(ngv.f)).getResources())));
            ((TextView) fbp.a(ngv.u)).setText(i2);
            ((TextView) fbp.a(ngv.v)).setText(i3);
        }
        int i4 = 8;
        ((View) fbp.a(ngv.s)).setVisibility((ngi.a() == FullscreenStoryViewState.OFFLINE || ngi.a() == FullscreenStoryViewState.ERROR) ? 0 : 8);
        ((View) fbp.a(ngv.w)).setVisibility(ngi.a() == FullscreenStoryViewState.LOADING ? 0 : 8);
        ((VideoSurfaceView) fbp.a(ngv.g)).setVisibility(ngi.a() == FullscreenStoryViewState.PLAYING_VIDEO ? 0 : 8);
        ViewGroup viewGroup = (ViewGroup) fbp.a(ngv.j);
        if (ngi.a() == FullscreenStoryViewState.PLAYING_AUDIO) {
            i4 = 0;
        }
        viewGroup.setVisibility(i4);
        if (ngi.c().b()) {
            Story story = (Story) ngi.c().c();
            boolean h2 = ngi.h();
            fbp.a(ngv.m);
            fbp.a(ngv.l);
            ngv.l.setText(story.d);
            ngv.m.setText(story.e);
            ngv.e.a(story.f).a(ngv.n);
            fbp.a(ngv.x);
            if (h2) {
                gaw.a(ngv.x, 400);
            } else {
                gaw.b(ngv.x, 4);
            }
            int k2 = story.k();
            int b2 = ngi.b();
            fbp.a(ngv.k);
            if (ngv.k.getChildCount() != k2) {
                ngv.k.removeAllViews();
                LayoutInflater from = LayoutInflater.from(ngv.k.getContext());
                int i5 = 0;
                while (i5 < k2) {
                    ProgressBar progressBar = (ProgressBar) from.inflate(R.layout.fullscreen_story_progress_bar, ngv.k, false);
                    progressBar.setMax(10000);
                    progressBar.setPadding(0, 0, i5 == k2 + -1 ? 0 : ngv.k.getContext().getResources().getDimensionPixelSize(R.dimen.progress_bar_padding), 0);
                    ngv.k.addView(progressBar);
                    i5++;
                }
            }
            if (b2 >= 0) {
                Chapter chapter = (Chapter) story.g.get(b2);
                if (ChapterCase.a(chapter.d) == ChapterCase.TRACK_CHAPTER) {
                    View view = (View) fbp.a(ngv.f);
                    int color = ngv.f.getResources().getColor(R.color.playlist_story_default_background);
                    if (ChapterCase.a(chapter.d) == ChapterCase.TRACK_CHAPTER) {
                        color = a(color, chapter.k().g);
                    }
                    view.setBackgroundColor(color);
                    TrackChapter k3 = chapter.k();
                    boolean booleanValue = ((Boolean) ngi.d().get(ngi.b())).booleanValue();
                    fbp.a(k3);
                    fbp.a(ngv.q);
                    ngv.q.a(k3.k().d);
                    ngv.q.b(k3.k().e);
                    int a3 = a(((View) fbp.a(ngv.f)).getResources().getColor(R.color.playlist_story_track_overlay_default_background), k3.k().g);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(a3);
                    gradientDrawable.setCornerRadius((float) ngv.f.getResources().getDimensionPixelSize(R.dimen.fullscreen_story_track_overlay_corner_radius));
                    ((View) fbp.a(ngv.r)).setBackground(gradientDrawable);
                    ((HeartButton) fbp.a(ngv.o)).a(booleanValue);
                    ngv.e.a(k3.k().f).a((int) R.drawable.bg_placeholder_album).a((ImageView) fbp.a(ngv.i));
                    ngv.e.a(k3.f).a((int) R.drawable.bg_placeholder_album).a((ImageView) fbp.a(ngv.h));
                }
                for (int i6 = 0; i6 < k2; i6++) {
                    if (i6 < b2) {
                        ngv.a(i6, 1.0f);
                    } else {
                        float f2 = 0.0f;
                        if (i6 == b2) {
                            if (ngi.f() != 0) {
                                f2 = ((float) ngi.e()) / ((float) ngi.f());
                            }
                            ngv.a(i6, f2);
                        } else {
                            ngv.a(i6, 0.0f);
                        }
                    }
                }
            }
        }
    }

    public final void a() {
        this.a.ai();
    }

    public final void a(Chapter chapter, long j2) {
        jzx c2 = jzx.c().a(Long.valueOf(j2)).a(true).c();
        if (ChapterCase.a(chapter.d) == ChapterCase.VIDEO_CHAPTER) {
            a(kdq.a((chapter.d == 2 ? (VideoChapter) chapter.e : VideoChapter.k()).d), c2);
            return;
        }
        if (ChapterCase.a(chapter.d) == ChapterCase.TRACK_CHAPTER) {
            a(chapter.k().e, c2);
        }
    }

    public final void a(boolean z) {
        fbp.a(this.y);
        if (z) {
            this.y.b();
        } else {
            this.y.am_();
        }
    }

    public final kmn<ngi> connect(knw<nge> knw) {
        this.f = this.a.ah();
        this.s = this.f.findViewById(R.id.error_root);
        this.w = this.f.findViewById(R.id.loading_root);
        this.j = (ViewGroup) this.f.findViewById(R.id.song_root);
        this.x = this.f.findViewById(R.id.header_root);
        this.h = (ImageView) this.f.findViewById(R.id.song_image);
        this.i = (ImageView) this.f.findViewById(R.id.song_image_thumbnail);
        this.g = (VideoSurfaceView) this.f.findViewById(R.id.video_surface);
        this.g.a(ScaleType.ASPECT_FILL);
        this.k = (ViewGroup) this.f.findViewById(R.id.progress_container);
        this.l = (TextView) this.f.findViewById(R.id.title);
        this.m = (TextView) this.f.findViewById(R.id.subtitle);
        this.n = (ImageView) this.f.findViewById(R.id.playlist_cover);
        this.t = (ImageView) this.s.findViewById(R.id.fullscreen_story_error_image);
        this.u = (TextView) this.s.findViewById(R.id.fullscreen_story_error_title);
        this.v = (TextView) this.s.findViewById(R.id.fullscreen_story_error_subtitle);
        ((ImageView) fbp.a(this.n)).setOnClickListener(new $$Lambda$ngv$Nurg3XDLcByZX7pABJWZyh4WXUY(knw));
        fbp.b(this.y == null);
        jzn jzn = this.b;
        jzn.d = "fullscreen_story";
        jzn.e = false;
        jzn.a = this.g;
        this.y = jzn.a(Collections.singletonList(this.c)).a();
        this.o = (HeartButton) ((View) fbp.a(this.f)).findViewById(R.id.heart_button);
        this.p = ((View) fbp.a(this.f)).findViewById(R.id.context_menu_button);
        ((HeartButton) fbp.a(this.o)).setOnClickListener(new $$Lambda$ngv$oWoWKf0bmqMj0W9O2oQ876Gu8g(knw));
        ((View) fbp.a(this.p)).setOnClickListener(new $$Lambda$ngv$P2REgcIj4NwK8LMrx0a4joPGGH8(knw));
        this.q = (MarqueeTrackInfoView) this.f.findViewById(R.id.track_info_view);
        this.r = this.f.findViewById(R.id.track_overlay_surface);
        fbp.a(this.f);
        View view = this.f;
        view.setOnTouchListener(new FullscreenStoryTouchListener(view.getContext(), this.d, new $$Lambda$ngv$WdnpPeTg6EgMje0KiSSB0OymQ_o(knw)));
        this.f.findViewById(R.id.close_button).setOnClickListener(new $$Lambda$ngv$hlsAOvNtxza1DuhKxZM3psMkxtI(knw));
        return new kmn<ngi>() {
            public final /* synthetic */ void accept(Object obj) {
                ngv.a(ngv.this, (ngi) obj);
            }

            public final void dispose() {
                fbp.a(ngv.this.f);
                ngv.this.f.setOnTouchListener(null);
                ngv.this.f.findViewById(R.id.close_button).setOnClickListener(null);
                ((ImageView) fbp.a(ngv.this.n)).setOnClickListener(null);
                ((HeartButton) fbp.a(ngv.this.o)).setOnClickListener(null);
                ((View) fbp.a(ngv.this.p)).setOnClickListener(null);
                if (ngv.this.y != null) {
                    ngv.this.y.ak_();
                    ngv.this.y = null;
                }
                ngv.this.f = null;
                ngv.this.s = null;
                ngv.this.w = null;
                ngv.this.j = null;
                ngv.this.x = null;
                ngv.this.h = null;
                ngv.this.i = null;
                ngv.this.g = null;
                ngv.this.k = null;
                ngv.this.l = null;
                ngv.this.m = null;
                ngv.this.n = null;
                ngv.this.o = null;
                ngv.this.q = null;
                ngv.this.r = null;
                ngv.this.t = null;
                ngv.this.u = null;
                ngv.this.v = null;
            }
        };
    }
}
