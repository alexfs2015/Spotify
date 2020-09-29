package com.spotify.music.behindthelyrics.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.comscore.android.id.IdHelperAndroid;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class BehindTheLyricsViewStateManager implements ksu {
    private final ksq a;
    private final ksl b;
    private final Map<State, ViewGroup> c;
    private final ksn d;
    private final ksr e;
    private final Resources f;
    private State g;
    private Animator h;

    enum State {
        INTRODUCTION,
        LYRICS,
        INSIGHT,
        ARTIST_ANNOTATION,
        CREDITS
    }

    static class a implements ksp {
        private final int a;

        a(int i) {
            this.a = i;
        }

        public final void a(ImageView imageView) {
            imageView.setImageResource(this.a);
        }
    }

    public BehindTheLyricsViewStateManager(Map<State, ViewGroup> map, ksq ksq, ksl ksl, ksn ksn, ksr ksr, Resources resources) {
        this.a = ksq;
        this.b = ksl;
        this.c = map;
        this.d = ksn;
        this.e = ksr;
        this.f = resources;
    }

    private List<Animator> b(State state) {
        State state2 = this.g;
        if (state2 == null) {
            Logger.b("Revealing container for %s state", state.toString());
            return ImmutableList.a(ksn.a((View) this.c.get(state)));
        } else if (this.c.get(state2) == this.c.get(state)) {
            return Collections.emptyList();
        } else {
            Logger.b("Transitioning containers of %s state to %s state", this.g.toString(), state.toString());
            return ImmutableList.a(ksn.a((View) this.c.get(this.g), kss.a, (View) this.c.get(state)));
        }
    }

    private void a(final Animator animator) {
        Animator animator2 = this.h;
        if (animator2 == null || !animator2.isRunning()) {
            this.h = animator;
            this.h.start();
            return;
        }
        this.h.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                animator.start();
            }
        });
        this.h = animator;
    }

    public final void a(String str, ksp ksp, String str2) {
        String charSequence = this.e.call(str2).toString();
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList(b(State.ARTIST_ANNOTATION));
        if (this.g == State.ARTIST_ANNOTATION) {
            Logger.b("Staying within artist state", new Object[0]);
            arrayList.add(this.b.a(str, ksp, charSequence));
        } else {
            State state = this.g;
            Logger.b("Transitioning from %s state to %s state", state == null ? IdHelperAndroid.NO_ID_AVAILABLE : state.toString(), State.ARTIST_ANNOTATION);
            arrayList.add(this.b.a(this.a, this.b.b(str, ksp, charSequence)));
            arrayList.addAll(this.b.a());
            arrayList.add(this.a.b());
        }
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new defpackage.kss.a(new wum(State.ARTIST_ANNOTATION) {
            private final /* synthetic */ State f$1;

            {
                this.f$1 = r2;
            }

            public final void call() {
                BehindTheLyricsViewStateManager.this.c(this.f$1);
            }
        }));
        a((Animator) animatorSet);
    }

    public final void a(String str) {
        Animator a2 = this.b.a(this.e.call(str).toString());
        a2.addListener(new defpackage.kss.a(new wum(State.ARTIST_ANNOTATION) {
            private final /* synthetic */ State f$1;

            {
                this.f$1 = r2;
            }

            public final void call() {
                BehindTheLyricsViewStateManager.this.c(this.f$1);
            }
        }));
        a(a2);
    }

    public final void b(String str) {
        a(this.a.c, this.a.b, State.INSIGHT, R.drawable.icon_insights, R.string.btl_info_card_insight, str);
    }

    public final void c(String str) {
        a(this.a.b, this.a.c, State.LYRICS, R.drawable.icon_lyrics, R.string.btl_info_card_lyrics, str);
    }

    private void a(TextView textView, TextView textView2, State state, int i, int i2, String str) {
        String string = this.f.getString(i2);
        c b2 = this.a.b(string);
        c cVar = new c(textView, this.e.call(str));
        a aVar = new a(i);
        b a2 = this.a.a((ksp) aVar);
        ArrayList arrayList = new ArrayList(b(state));
        Logger.b("Transitioning to: %s", state.toString());
        State state2 = this.g;
        if (state2 == null) {
            Logger.b("No current state", new Object[0]);
            arrayList.addAll(b(textView, textView2, string, cVar, aVar));
        } else if (state2 == State.ARTIST_ANNOTATION) {
            Logger.b("Transitioning from artist state to %s", state);
            arrayList.addAll(a(textView, b2, cVar, a2));
        } else {
            State state3 = this.g;
            if (state3 == state) {
                Logger.b("Transitioning to self", new Object[0]);
                arrayList.add(ksn.a(textView, cVar, textView));
            } else {
                Logger.b("Transitioning from %s state to %s state", state3, state);
                arrayList.addAll(a(textView, textView2, string, cVar, aVar));
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new defpackage.kss.a(new wum(state) {
            private final /* synthetic */ State f$1;

            {
                this.f$1 = r2;
            }

            public final void call() {
                BehindTheLyricsViewStateManager.this.c(this.f$1);
            }
        }));
        a((Animator) animatorSet);
    }

    private List<Animator> a(TextView textView, TextView textView2, String str, c cVar, a aVar) {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(this.a.a(str));
        arrayList.add(this.a.b((ksp) aVar));
        arrayList.add(ksn.a(textView2, cVar, textView));
        arrayList.add(ksn.a(this.a.a));
        return arrayList;
    }

    private List<Animator> a(TextView textView, c cVar, c cVar2, b bVar) {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(this.a.a(this.b, new d(cVar, bVar, cVar2)));
        arrayList.add(ksn.a(textView));
        arrayList.add(this.a.a());
        arrayList.add(this.b.b());
        return arrayList;
    }

    private List<Animator> b(TextView textView, TextView textView2, String str, c cVar, a aVar) {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.a.b((ksp) aVar));
        arrayList.add(this.a.a(str));
        arrayList.add(ksn.a(textView, cVar, textView));
        arrayList.add(ksn.a(this.a.a));
        arrayList.add(ksn.b(textView2));
        return arrayList;
    }

    public final void a() {
        a(State.CREDITS);
    }

    public final void b() {
        a(State.INTRODUCTION);
    }

    /* access modifiers changed from: 0000 */
    public void a(State state) {
        if (this.g != state) {
            ArrayList arrayList = new ArrayList(b(state));
            arrayList.addAll(d());
            arrayList.addAll(c());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new defpackage.kss.a(new wum(state) {
                private final /* synthetic */ State f$1;

                {
                    this.f$1 = r2;
                }

                public final void call() {
                    BehindTheLyricsViewStateManager.this.c(this.f$1);
                }
            }));
            animatorSet.playTogether(arrayList);
            a((Animator) animatorSet);
        }
    }

    private List<Animator> c() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(ksn.b(this.a.a));
        arrayList.add(this.a.b());
        return arrayList;
    }

    private List<Animator> d() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(ksn.b(this.b.a));
        arrayList.add(this.b.b());
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(State state) {
        Logger.b("Setting current state to: %s", state.toString());
        this.g = state;
    }
}
