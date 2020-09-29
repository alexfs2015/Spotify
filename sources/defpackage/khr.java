package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import com.spotify.mobile.android.wrapped2019.stories.templates.StoryParagraphDecorator;
import com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: khr reason: default package */
public class khr extends kfs {
    public Picasso T;
    public Observable<StoriesPlaybackState> U;
    private Disposable V = Disposables.b();
    private Animator W;
    private String Y;
    public kfn b;

    /* renamed from: khr$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[StoriesPlaybackState.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState[] r0 = com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState r1 = com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState.PAUSED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState r1 = com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState.RESUMED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.khr.AnonymousClass1.<clinit>():void");
        }
    }

    public static khr a(h hVar) {
        khr khr = new khr();
        Bundle a = a(hVar);
        a.putString("preview", hVar.a);
        a.putString("image", hVar.g);
        a.putString("greetings-message", hVar.b);
        a.putInt("greetings-year", hVar.c);
        a.putString("title", hVar.d);
        a.putString("paragraph1", hVar.e.text());
        a.putStringArray("paragraph1Values", hVar.e.valuesArray());
        a.putString("paragraph2", hVar.f.text());
        a.putStringArray("paragraph2Values", hVar.f.valuesArray());
        khr.g(a);
        return khr;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.story_premium_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        View c = ip.c(view, (int) R.id.greetings);
        TextView textView = (TextView) ip.c(view, (int) R.id.greetingsMessage);
        TextView textView2 = (TextView) ip.c(view, (int) R.id.greetingsYear);
        TextView textView3 = (TextView) ip.c(view, (int) R.id.title);
        StackImageView stackImageView = (StackImageView) ip.c(view, (int) R.id.image);
        TextView textView4 = (TextView) ip.c(view, (int) R.id.paragraph1);
        TextView textView5 = (TextView) ip.c(view, (int) R.id.paragraph2);
        Bundle l = l();
        textView.setText(l.getString("greetings-message"));
        textView2.setText(String.valueOf(l.getInt("greetings-year")));
        textView3.setText(l.getString("title"));
        int c2 = fr.c(view.getContext(), R.color.wrapped_citric);
        textView4.setText(StoryParagraphDecorator.a((String) fay.a(l.getString("paragraph1")), (String[]) fay.a(l.getStringArray("paragraph1Values")), c2));
        textView5.setText(StoryParagraphDecorator.a((String) fay.a(l.getString("paragraph2")), (String[]) fay.a(l.getStringArray("paragraph2Values")), c2));
        this.T.a(l.getString("image")).a((vsr) stackImageView);
        this.Y = l.getString("preview");
        this.W = AnimatorInflater.loadAnimator(view.getContext(), R.animator.fade_out_animator);
        this.W.setStartDelay(TimeUnit.SECONDS.toMillis(3));
        this.W.setTarget(c);
        this.W.start();
    }

    public final void g() {
        super.g();
        String str = this.Y;
        if (str != null) {
            this.b.a(str);
        }
        this.V = this.U.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$khr$b78lPmixvZSdPtVFI7395j0UE<Object>(this), (Consumer<? super Throwable>) $$Lambda$khr$ESu8RwMvZc7vbdH_bOj_Khx3VsM.INSTANCE);
    }

    public final void h() {
        this.V.bf_();
        super.h();
    }

    /* access modifiers changed from: private */
    public void a(StoriesPlaybackState storiesPlaybackState) {
        int i = AnonymousClass1.a[storiesPlaybackState.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.b.d();
                if (VERSION.SDK_INT >= 19) {
                    Animator animator = this.W;
                    if (animator != null) {
                        animator.resume();
                    }
                }
            }
            return;
        }
        this.b.c();
        if (VERSION.SDK_INT >= 19) {
            Animator animator2 = this.W;
            if (animator2 != null) {
                animator2.pause();
            }
        }
    }
}
