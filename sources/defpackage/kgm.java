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

/* renamed from: kgm reason: default package */
public final class kgm implements kmm<kgh, kgf> {
    public final View a;
    private final kig b;
    private final kk c;
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
    public final gei<kgh> i;
    /* access modifiers changed from: private */
    public Runnable j = ffg.a();

    /* renamed from: kgm$2 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.kgm.AnonymousClass2.<clinit>():void");
        }
    }

    public kgm(LayoutInflater layoutInflater, ViewGroup viewGroup, kig kig, kk kkVar) {
        this.b = kig;
        this.c = kkVar;
        this.a = layoutInflater.inflate(R.layout.stories_container_fragment, viewGroup, false);
        this.d = (StoriesGesturesView) ip.d(this.a, (int) R.id.gestures_view);
        this.g = (StoriesProgressView) ip.d(this.a, (int) R.id.story_progress);
        this.e = (SpotifyIconView) ip.d(this.a, (int) R.id.mute_button);
        this.f = (SpotifyIconView) ip.d(this.a, (int) R.id.close_button);
        this.h = (StoriesBottomActionContainerView) ip.d(this.a, (int) R.id.bottom_action_menu);
        this.i = gei.a((gei<A>[]) new gei[]{gei.a((geg<A, B>) $$Lambda$od6raPFsydt6zJTl1MgXMYj3A6s.INSTANCE, gei.a((gef<A>) new $$Lambda$kgm$psjxAZoBNE5f568skqp0rt4LqhI<A>(this))), new gei($$Lambda$kgm$a0srtenoYn099CcsYFJr9W8qvo.INSTANCE, new $$Lambda$kgm$QBlhCV_Lf5KMZmxsvz2TQ8AevU(this)), gei.a((geg<A, B>) $$Lambda$d1BVwjdQOhy6DzaC67oZVyjJ_oM.INSTANCE, gei.a((gef<A>) new $$Lambda$kgm$peRJxXcffY9Uvho77EiZirqsd0<A>(this))), gei.a((geg<A, B>) $$Lambda$MO9hLwsWaeniSs8mfeOPxnEcVg.INSTANCE, gei.a((gef<A>) new $$Lambda$kgm$EIf7BEd9GFeq72sa0NJzrcQoDs<A>(this)))});
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, boolean z) {
        this.g.a(i2, z);
    }

    private void a(Fragment fragment, int i2, boolean z) {
        this.c.a().b(R.id.story_content, fragment, null).a((Runnable) new $$Lambda$kgm$vuGayZ4E_Ql5jTbtR4R2coLHYtc(this, i2, z)).b();
    }

    /* access modifiers changed from: private */
    public void a(List<kfp> list) {
        this.g.a(kfq.a(list));
    }

    /* access modifiers changed from: private */
    public void a(kgh kgh) {
        kfp g2 = kgh.g();
        if (g2 != null) {
            int c2 = kgh.c();
            int i2 = AnonymousClass2.b[kgh.h().ordinal()];
            int i3 = 0;
            if (i2 == 1) {
                a(kjq.a(g2), c2, false);
            } else if (i2 != 2) {
                if (i2 == 3) {
                    a(kig.a(g2), c2, true);
                    boolean b2 = kfq.b(g2);
                    StoriesBottomActionContainerView storiesBottomActionContainerView = this.h;
                    if (!b2) {
                        i3 = 8;
                    }
                    storiesBottomActionContainerView.setVisibility(i3);
                }
            } else {
                kiz a2 = kiz.a(g2);
                a2.b = this.j;
                a(a2, c2, false);
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(knw knw, StoryGesture storyGesture) {
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
        knw.accept(obj);
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        this.e.a(z ? SpotifyIconV2.VOLUME_OFF : SpotifyIconV2.VOLUME);
    }

    /* access modifiers changed from: private */
    public static boolean a(kgh kgh, kgh kgh2) {
        return (kgh.c() == kgh2.c() && kgh.h() == kgh2.h() && kgh.a().equals(kgh2.a())) ? false : true;
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        if (z) {
            this.g.b();
        } else {
            this.g.c();
        }
    }

    public final kmn<kgh> connect(knw<kgf> knw) {
        this.d.a = new $$Lambda$kgm$qPTITHkaQ72R6YkBya4aq9SYGOU(knw);
        this.g.b = new $$Lambda$kgm$bzxiyQ2GLJPx3r6JEcm0NF5y3lU(knw);
        this.e.setOnClickListener(new $$Lambda$kgm$9hw2n_wUl52qwMRTrqr33Cfb2j4(knw));
        this.f.setOnClickListener(new $$Lambda$kgm$O49CFyWiIf5VFoU_w2hHXECZ8U8(knw));
        this.j = new $$Lambda$kgm$yd_isbMPD3DQSp9DqLkZ8Afm3ek(knw);
        this.h.setOnClickListener(new $$Lambda$kgm$U_68syDrf6D9P29u4GxL2dNNhXE(knw));
        return new kmn<kgh>() {
            public final /* synthetic */ void accept(Object obj) {
                kgm.this.i.a((kgh) obj);
            }

            public final void dispose() {
                kgm.this.d.a = null;
                kgm.this.g.b = null;
                kgm.this.e.setOnClickListener(null);
                kgm.this.f.setOnClickListener(null);
                kgm.this.j = ffg.a();
                kgm.this.h.setOnClickListener(null);
            }
        };
    }
}
