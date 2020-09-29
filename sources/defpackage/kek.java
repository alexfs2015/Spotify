package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.android.stories.view.StoriesProgressView;
import com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesBottomActionContainerView;
import com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesGesturesView;
import com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesGesturesView.StoryGesture;
import com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconView;
import java.util.List;

/* renamed from: kek reason: default package */
public final class kek implements kjd<kef, ked> {
    public final View a;
    private final kft b;
    private final kf c;
    /* access modifiers changed from: private */
    public final StoriesGesturesView d;
    /* access modifiers changed from: private */
    public final SpotifyIconView e;
    /* access modifiers changed from: private */
    public final SpotifyIconView f;
    /* access modifiers changed from: private */
    public final StoriesProgressView g;
    /* access modifiers changed from: private */
    public final StoriesBottomActionContainerView h;
    /* access modifiers changed from: private */
    public final gcx<kef> i;
    /* access modifiers changed from: private */
    public Runnable j = fem.a();

    /* renamed from: kek$2 reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[StoryGesture.values().length];
        static final /* synthetic */ int[] b = new int[StoryStatus.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005c */
        static {
            /*
                com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus[] r0 = com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus r2 = com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus.LOADING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus r3 = com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus r4 = com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus.READY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesGesturesView$StoryGesture[] r3 = com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesGesturesView.StoryGesture.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                int[] r3 = a     // Catch:{ NoSuchFieldError -> 0x003d }
                com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesGesturesView$StoryGesture r4 = com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesGesturesView.StoryGesture.LEFT_CLICK     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesGesturesView$StoryGesture r3 = com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesGesturesView.StoryGesture.RIGHT_CLICK     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesGesturesView$StoryGesture r1 = com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesGesturesView.StoryGesture.SCREEN_PRESS     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x005c }
                com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesGesturesView$StoryGesture r1 = com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesGesturesView.StoryGesture.SCREEN_PRESS_RELEASE     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0067 }
                com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesGesturesView$StoryGesture r1 = com.spotify.mobile.android.wrapped2019.stories.container.view.StoriesGesturesView.StoryGesture.SWIPE_TOP_DOWN     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kek.AnonymousClass2.<clinit>():void");
        }
    }

    public kek(LayoutInflater layoutInflater, ViewGroup viewGroup, kft kft, kf kfVar) {
        this.b = kft;
        this.c = kfVar;
        this.a = layoutInflater.inflate(R.layout.stories_container_fragment, viewGroup, false);
        this.d = (StoriesGesturesView) ip.c(this.a, (int) R.id.gestures_view);
        this.g = (StoriesProgressView) ip.c(this.a, (int) R.id.story_progress);
        this.e = (SpotifyIconView) ip.c(this.a, (int) R.id.mute_button);
        this.f = (SpotifyIconView) ip.c(this.a, (int) R.id.close_button);
        this.h = (StoriesBottomActionContainerView) ip.c(this.a, (int) R.id.bottom_action_menu);
        this.i = gcx.a((gcx<A>[]) new gcx[]{gcx.a((gcv<A, B>) $$Lambda$DjD59l2AQtqGkvLnwmsep9rcfk.INSTANCE, gcx.a((gcu<A>) new $$Lambda$kek$ltA1woLwkmUf3gdlXwR8rfJCa0s<A>(this))), new gcx($$Lambda$kek$QMnForKYT08Y86Xi967x6pMZXpI.INSTANCE, new $$Lambda$kek$wFUNlPJU8VrI7aq6E459yXwJoSM(this)), gcx.a((gcv<A, B>) $$Lambda$ZcJu5KwSyZf4hv6YK_LUpueoeu0.INSTANCE, gcx.a((gcu<A>) new $$Lambda$kek$htuEFni7mpgiYpP9ycwugRTXp8<A>(this))), gcx.a((gcv<A, B>) $$Lambda$OHV_X6ZJ4RsATXKRPO5lJaPF_Q0.INSTANCE, gcx.a((gcu<A>) new $$Lambda$kek$bfdxPdkzGjQ4aRLrsdvO_discgg<A>(this)))});
    }

    public final kje<kef> connect(kkn<ked> kkn) {
        this.d.a = new $$Lambda$kek$Ou1Zc3XpKN85xZtFwUyaEmEeK0(kkn);
        this.g.b = new $$Lambda$kek$4w2sTw3GcuQHpDcCgzwGGnZEdK0(kkn);
        this.e.setOnClickListener(new $$Lambda$kek$fx5wcJk4yCYNtOblQp53mo50Zc8(kkn));
        this.f.setOnClickListener(new $$Lambda$kek$X6cqQtapbO7LmNQKH2SffEnLALM(kkn));
        this.j = new $$Lambda$kek$CJOao3t9toNgZbA7na63RHpFarM(kkn);
        this.h.setOnClickListener(new $$Lambda$kek$Y9qWUw5DEmAAkZ4Rqw4evp3ydI(kkn));
        return new kje<kef>() {
            public final /* synthetic */ void accept(Object obj) {
                kek.this.i.a((kef) obj);
            }

            public final void dispose() {
                kek.this.d.a = null;
                kek.this.g.b = null;
                kek.this.e.setOnClickListener(null);
                kek.this.f.setOnClickListener(null);
                kek.this.j = fem.a();
                kek.this.h.setOnClickListener(null);
            }
        };
    }

    /* access modifiers changed from: private */
    public static boolean a(kef kef, kef kef2) {
        return (kef.c() == kef2.c() && kef.h() == kef2.h() && kef.a().equals(kef2.a())) ? false : true;
    }

    /* access modifiers changed from: private */
    public void a(List<kdo> list) {
        this.g.a(kdp.a(list));
    }

    /* access modifiers changed from: private */
    public void a(kef kef) {
        kdo g2 = kef.g();
        if (g2 != null) {
            int c2 = kef.c();
            int i2 = AnonymousClass2.b[kef.h().ordinal()];
            if (i2 == 1) {
                a(khd.a(g2), c2, false);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    a(kft.a(g2), c2, true);
                }
            } else {
                kgm a2 = kgm.a(g2);
                a2.b = this.j;
                a(a2, c2, false);
            }
        }
    }

    private void a(Fragment fragment, int i2, boolean z) {
        this.c.a().b(R.id.story_content, fragment, null).a((Runnable) new $$Lambda$kek$CcmYoFMC7pOxqOF2obf11ymwXM(this, i2, z)).b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, boolean z) {
        this.g.a(i2, z);
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.e.a(z ? SpotifyIconV2.VOLUME_OFF : SpotifyIconV2.VOLUME);
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            this.g.b();
        } else {
            this.g.c();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(kkn kkn, StoryGesture storyGesture) {
        Object obj;
        int i2 = AnonymousClass2.a[storyGesture.ordinal()];
        if (i2 == 1) {
            obj = new e();
        } else if (i2 == 2) {
            obj = new h();
        } else if (i2 == 3) {
            obj = new g();
        } else if (i2 == 4) {
            obj = new f();
        } else if (i2 == 5) {
            obj = new i();
        } else {
            StringBuilder sb = new StringBuilder("Gesture not recognized: ");
            sb.append(storyGesture);
            throw new IllegalStateException(sb.toString());
        }
        kkn.accept(obj);
    }
}
