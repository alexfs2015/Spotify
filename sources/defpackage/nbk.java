package defpackage;

import android.content.res.Resources;
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

/* renamed from: nbk reason: default package */
public final class nbk implements kjd<nba, naw>, nbi, nbj {
    private final a a;
    private final jxn b;
    private final nbg c;
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
    public jxm y;

    /* renamed from: nbk$2 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.nbk.AnonymousClass2.<clinit>():void");
        }
    }

    /* renamed from: nbk$a */
    public interface a {
        View ah();

        void ai();
    }

    public nbk(a aVar, jxn jxn, nbg nbg, DisplayMetrics displayMetrics, Picasso picasso) {
        this.a = aVar;
        this.c = nbg;
        this.d = (DisplayMetrics) fay.a(displayMetrics);
        this.e = picasso;
        this.b = jxn;
    }

    public final kje<nba> connect(kkn<naw> kkn) {
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
        ((ImageView) fay.a(this.n)).setOnClickListener(new $$Lambda$nbk$lOHGRl5KjKldp5ESQb_D3g3vHE(kkn));
        fay.b(this.y == null);
        jxn jxn = this.b;
        jxn.d = "fullscreen_story";
        jxn.e = false;
        jxn.a = this.g;
        this.y = jxn.a(Collections.singletonList(this.c)).a();
        this.o = (HeartButton) ((View) fay.a(this.f)).findViewById(R.id.heart_button);
        this.p = ((View) fay.a(this.f)).findViewById(R.id.context_menu_button);
        ((HeartButton) fay.a(this.o)).setOnClickListener(new $$Lambda$nbk$Nz2DwbQJ9sdIuqClb2MFhtRKY(kkn));
        ((View) fay.a(this.p)).setOnClickListener(new $$Lambda$nbk$AQ5_xT4nCET_r35vT0XTjXL3baE(kkn));
        this.q = (MarqueeTrackInfoView) this.f.findViewById(R.id.track_info_view);
        this.r = this.f.findViewById(R.id.track_overlay_surface);
        fay.a(this.f);
        View view = this.f;
        view.setOnTouchListener(new FullscreenStoryTouchListener(view.getContext(), this.d, new $$Lambda$nbk$Xiof8oYvUTayVhV1gIs1zxHE7o(kkn)));
        this.f.findViewById(R.id.close_button).setOnClickListener(new $$Lambda$nbk$tfYldSuMUdEeTsz9Yo6DX7CE4Vg(kkn));
        return new kje<nba>() {
            public final /* synthetic */ void accept(Object obj) {
                nbk.a(nbk.this, (nba) obj);
            }

            public final void dispose() {
                fay.a(nbk.this.f);
                nbk.this.f.setOnTouchListener(null);
                nbk.this.f.findViewById(R.id.close_button).setOnClickListener(null);
                ((ImageView) fay.a(nbk.this.n)).setOnClickListener(null);
                ((HeartButton) fay.a(nbk.this.o)).setOnClickListener(null);
                ((View) fay.a(nbk.this.p)).setOnClickListener(null);
                if (nbk.this.y != null) {
                    nbk.this.y.al_();
                    nbk.this.y = null;
                }
                nbk.this.f = null;
                nbk.this.s = null;
                nbk.this.w = null;
                nbk.this.j = null;
                nbk.this.x = null;
                nbk.this.h = null;
                nbk.this.i = null;
                nbk.this.g = null;
                nbk.this.k = null;
                nbk.this.l = null;
                nbk.this.m = null;
                nbk.this.n = null;
                nbk.this.o = null;
                nbk.this.q = null;
                nbk.this.r = null;
                nbk.this.t = null;
                nbk.this.u = null;
                nbk.this.v = null;
            }
        };
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(kkn kkn, TouchEvent touchEvent) {
        int i2 = AnonymousClass2.a[touchEvent.ordinal()];
        if (i2 == 1) {
            kkn.accept(new n());
        } else if (i2 == 2) {
            kkn.accept(new j());
        } else if (i2 == 3) {
            kkn.accept(naw.a(false));
            kkn.accept(naw.b(false));
        } else if (i2 == 4) {
            kkn.accept(naw.a(true));
            kkn.accept(naw.b(true));
        } else {
            throw new IllegalStateException("Unhandled state for: ".concat(touchEvent.name()));
        }
    }

    public final void a() {
        this.a.ai();
    }

    public final void a(boolean z) {
        fay.a(this.y);
        if (z) {
            this.y.b();
        } else {
            this.y.an_();
        }
    }

    private void a(int i2, float f2) {
        int i3 = (int) (f2 * 10000.0f);
        fay.a(this.k);
        ((ProgressBar) this.k.getChildAt(i2)).setProgress(i3);
    }

    private void a(String str, jxx jxx) {
        ((jxm) fay.a(this.y)).a(a(str), jxx);
    }

    private static jyb a(String str) {
        return jyb.e().a(str).a(false).b(false).c();
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

    public final void a(Chapter chapter, long j2) {
        VideoChapter videoChapter;
        jxx c2 = jxx.c().a(Long.valueOf(j2)).a(true).c();
        if (ChapterCase.a(chapter.d) == ChapterCase.VIDEO_CHAPTER) {
            if (chapter.d == 2) {
                videoChapter = (VideoChapter) chapter.e;
            } else {
                videoChapter = VideoChapter.k();
            }
            a(kbq.a(videoChapter.d), c2);
            return;
        }
        if (ChapterCase.a(chapter.d) == ChapterCase.TRACK_CHAPTER) {
            a(chapter.k().e, c2);
        }
    }

    static /* synthetic */ void a(nbk nbk, nba nba) {
        int i2;
        if (nba.a() == FullscreenStoryViewState.OFFLINE || nba.a() == FullscreenStoryViewState.ERROR) {
            FullscreenStoryViewState a2 = nba.a();
            fay.b(a2 == FullscreenStoryViewState.OFFLINE || a2 == FullscreenStoryViewState.ERROR);
            int i3 = a2 == FullscreenStoryViewState.OFFLINE ? R.string.fullscreen_story_error_no_connection_title : R.string.fullscreen_story_error_error_title;
            int i4 = a2 == FullscreenStoryViewState.OFFLINE ? R.string.fullscreen_story_error_no_connection_body : R.string.fullscreen_story_error_error_body;
            ((ImageView) fay.a(nbk.t)).setImageDrawable(fzg.a(((View) fay.a(nbk.f)).getContext(), a2 == FullscreenStoryViewState.OFFLINE ? SpotifyIconV2.OFFLINE : SpotifyIconV2.WARNING, (float) uts.b(32.0f, ((View) fay.a(nbk.f)).getResources())));
            ((TextView) fay.a(nbk.u)).setText(i3);
            ((TextView) fay.a(nbk.v)).setText(i4);
        }
        int i5 = 8;
        ((View) fay.a(nbk.s)).setVisibility((nba.a() == FullscreenStoryViewState.OFFLINE || nba.a() == FullscreenStoryViewState.ERROR) ? 0 : 8);
        ((View) fay.a(nbk.w)).setVisibility(nba.a() == FullscreenStoryViewState.LOADING ? 0 : 8);
        ((VideoSurfaceView) fay.a(nbk.g)).setVisibility(nba.a() == FullscreenStoryViewState.PLAYING_VIDEO ? 0 : 8);
        ViewGroup viewGroup = (ViewGroup) fay.a(nbk.j);
        if (nba.a() == FullscreenStoryViewState.PLAYING_AUDIO) {
            i5 = 0;
        }
        viewGroup.setVisibility(i5);
        if (nba.c().b()) {
            Story story = (Story) nba.c().c();
            boolean h2 = nba.h();
            fay.a(nbk.m);
            fay.a(nbk.l);
            nbk.l.setText(story.d);
            nbk.m.setText(story.e);
            nbk.e.a(story.f).a(nbk.n);
            fay.a(nbk.x);
            if (h2) {
                gac.a(nbk.x, 400);
            } else {
                gac.b(nbk.x, 4);
            }
            int k2 = story.k();
            int b2 = nba.b();
            fay.a(nbk.k);
            if (nbk.k.getChildCount() != k2) {
                nbk.k.removeAllViews();
                LayoutInflater from = LayoutInflater.from(nbk.k.getContext());
                int i6 = 0;
                while (i6 < k2) {
                    ProgressBar progressBar = (ProgressBar) from.inflate(R.layout.fullscreen_story_progress_bar, nbk.k, false);
                    progressBar.setMax(10000);
                    Resources resources = nbk.k.getContext().getResources();
                    if (i6 == k2 + -1) {
                        i2 = 0;
                    } else {
                        i2 = resources.getDimensionPixelSize(R.dimen.progress_bar_padding);
                    }
                    progressBar.setPadding(0, 0, i2, 0);
                    nbk.k.addView(progressBar);
                    i6++;
                }
            }
            if (b2 >= 0) {
                Chapter chapter = (Chapter) story.g.get(b2);
                if (ChapterCase.a(chapter.d) == ChapterCase.TRACK_CHAPTER) {
                    View view = (View) fay.a(nbk.f);
                    int color = nbk.f.getResources().getColor(R.color.playlist_story_default_background);
                    if (ChapterCase.a(chapter.d) == ChapterCase.TRACK_CHAPTER) {
                        color = a(color, chapter.k().g);
                    }
                    view.setBackgroundColor(color);
                    TrackChapter k3 = chapter.k();
                    boolean booleanValue = ((Boolean) nba.d().get(nba.b())).booleanValue();
                    fay.a(k3);
                    fay.a(nbk.q);
                    nbk.q.a(k3.k().d);
                    nbk.q.b(k3.k().e);
                    int a3 = a(((View) fay.a(nbk.f)).getResources().getColor(R.color.playlist_story_track_overlay_default_background), k3.k().g);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(a3);
                    gradientDrawable.setCornerRadius((float) nbk.f.getResources().getDimensionPixelSize(R.dimen.fullscreen_story_track_overlay_corner_radius));
                    ((View) fay.a(nbk.r)).setBackground(gradientDrawable);
                    ((HeartButton) fay.a(nbk.o)).a(booleanValue);
                    nbk.e.a(k3.k().f).a((int) R.drawable.bg_placeholder_album).a((ImageView) fay.a(nbk.i));
                    nbk.e.a(k3.f).a((int) R.drawable.bg_placeholder_album).a((ImageView) fay.a(nbk.h));
                }
                for (int i7 = 0; i7 < k2; i7++) {
                    if (i7 < b2) {
                        nbk.a(i7, 1.0f);
                    } else {
                        float f2 = 0.0f;
                        if (i7 == b2) {
                            if (nba.f() != 0) {
                                f2 = ((float) nba.e()) / ((float) nba.f());
                            }
                            nbk.a(i7, f2);
                        } else {
                            nbk.a(i7, 0.0f);
                        }
                    }
                }
            }
        }
    }
}
