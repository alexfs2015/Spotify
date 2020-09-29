package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: khx reason: default package */
public class khx extends vtv {
    public Observable<StoriesPlaybackState> T;
    private Disposable U = Disposables.b();
    private khw V;
    private TextView W;
    private TextView Y;
    private StackImageView Z;
    public kfn a;
    private StackImageView aa;
    private ImageView ab;
    private StackImageView ac;
    private AnimatorSet ad;
    private ConstraintLayout ae;
    private ConstraintLayout af;
    public Picasso b;

    /* renamed from: khx$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.khx.AnonymousClass1.<clinit>():void");
        }
    }

    public static khx a(i iVar) {
        khx khx = new khx();
        Bundle bundle = new Bundle();
        bundle.putParcelable("season", khw.j().a(iVar.a()).c(iVar.b).b(iVar.a).d(iVar.c).e(iVar.d).f(iVar.e).g(iVar.f).h(iVar.g).a(iVar.h).a());
        khx.g(bundle);
        return khx;
    }

    public final void a(View view, Bundle bundle) {
        this.Y = (TextView) ip.c(view, (int) R.id.season_label);
        this.W = (TextView) ip.c(view, (int) R.id.season_caption);
        this.Z = (StackImageView) ip.c(view, (int) R.id.top_left_image);
        this.aa = (StackImageView) ip.c(view, (int) R.id.top_right_image);
        this.ab = (ImageView) ip.c(view, (int) R.id.bottom_right_image);
        this.ac = (StackImageView) ip.c(view, (int) R.id.bottom_left_image);
        this.ae = (ConstraintLayout) ip.c(view, (int) R.id.constraint_layout);
        this.af = (ConstraintLayout) ip.c(view, (int) R.id.image_constraint_layout);
        this.Y.setText(this.V.b());
        this.W.setText(this.V.c());
        this.b.a(this.V.d()).a((vsr) this.Z);
        this.b.a(this.V.e()).a((vsr) this.aa);
        this.b.a(this.V.f()).a(this.ab);
        this.b.a(this.V.g()).a((vsr) this.ac);
    }

    public final void g() {
        super.g();
        this.U = this.T.a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$khx$L4hJEKQBj3nJ8kSiuQLP4Zu_X8<Object>(this), (Consumer<? super Throwable>) $$Lambda$khx$hU3AhTqq1nlyvL95Mpv1P49KFc.INSTANCE);
        this.a.a(this.V.h());
        y().post(new $$Lambda$khx$utW_C1cgDFBss0KW3GE3Xmiqjak(this));
    }

    /* access modifiers changed from: private */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void c() {
        /*
            r16 = this;
            r6 = r16
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r6.ad = r0
            android.animation.AnimatorSet r7 = r6.ad
            r8 = 2
            android.animation.Animator[] r9 = new android.animation.Animator[r8]
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            khw r0 = r6.V
            java.lang.String r0 = r0.a()
            int r1 = r0.hashCode()
            r11 = 3
            r12 = 0
            r13 = 1
            switch(r1) {
                case -895679987: goto L_0x0042;
                case -891207761: goto L_0x0038;
                case -787736891: goto L_0x002e;
                case 3135355: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x004c
        L_0x0024:
            java.lang.String r1 = "fall"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            r0 = 3
            goto L_0x004d
        L_0x002e:
            java.lang.String r1 = "winter"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            r0 = 0
            goto L_0x004d
        L_0x0038:
            java.lang.String r1 = "summer"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            r0 = 2
            goto L_0x004d
        L_0x0042:
            java.lang.String r1 = "spring"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = -1
        L_0x004d:
            r14 = 4
            r1 = 5
            if (r0 == 0) goto L_0x0106
            if (r0 == r13) goto L_0x0106
            if (r0 == r8) goto L_0x00ba
            if (r0 != r11) goto L_0x00a4
            android.animation.Animator[] r15 = new android.animation.Animator[r1]
            android.widget.ImageView r1 = r6.ab
            r2 = 2000(0x7d0, double:9.88E-321)
            r4 = 0
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r12] = r0
            com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView r1 = r6.ac
            r2 = 1950(0x79e, double:9.634E-321)
            r4 = 50
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r13] = r0
            android.widget.TextView r1 = r6.Y
            r2 = 1900(0x76c, double:9.387E-321)
            r4 = 100
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r8] = r0
            com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView r1 = r6.Z
            r2 = 1850(0x73a, double:9.14E-321)
            r4 = 150(0x96, double:7.4E-322)
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r11] = r0
            com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView r1 = r6.aa
            r2 = 1800(0x708, double:8.893E-321)
            r4 = 200(0xc8, double:9.9E-322)
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r14] = r0
            r10.playTogether(r15)
            goto L_0x0151
        L_0x00a4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Object[] r1 = new java.lang.Object[r13]
            khw r2 = r6.V
            java.lang.String r2 = r2.a()
            r1[r12] = r2
            java.lang.String r2 = "Animation doesn't exist for %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x00ba:
            android.animation.Animator[] r15 = new android.animation.Animator[r1]
            android.widget.ImageView r1 = r6.ab
            r2 = 2000(0x7d0, double:9.88E-321)
            r4 = 0
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r12] = r0
            com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView r1 = r6.aa
            r2 = 1950(0x79e, double:9.634E-321)
            r4 = 50
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r13] = r0
            com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView r1 = r6.ac
            r2 = 1900(0x76c, double:9.387E-321)
            r4 = 100
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r8] = r0
            android.widget.TextView r1 = r6.Y
            r2 = 1850(0x73a, double:9.14E-321)
            r4 = 150(0x96, double:7.4E-322)
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r11] = r0
            com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView r1 = r6.Z
            r2 = 1800(0x708, double:8.893E-321)
            r4 = 200(0xc8, double:9.9E-322)
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r14] = r0
            r10.playTogether(r15)
            goto L_0x0151
        L_0x0106:
            android.animation.Animator[] r15 = new android.animation.Animator[r1]
            com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView r1 = r6.ac
            r2 = 2000(0x7d0, double:9.88E-321)
            r4 = 0
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r12] = r0
            android.widget.ImageView r1 = r6.ab
            r2 = 1950(0x79e, double:9.634E-321)
            r4 = 50
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r13] = r0
            com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView r1 = r6.aa
            r2 = 1900(0x76c, double:9.387E-321)
            r4 = 100
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r8] = r0
            android.widget.TextView r1 = r6.Y
            r2 = 1850(0x73a, double:9.14E-321)
            r4 = 150(0x96, double:7.4E-322)
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r11] = r0
            com.spotify.mobile.android.wrapped2019.stories.templates.stack.StackImageView r1 = r6.Z
            r2 = 1800(0x708, double:8.893E-321)
            r4 = 200(0xc8, double:9.9E-322)
            r0 = r16
            android.animation.AnimatorSet r0 = r0.a(r1, r2, r4)
            r15[r14] = r0
            r10.playTogether(r15)
        L_0x0151:
            r9[r12] = r10
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1 = 0
            r2 = 1054280253(0x3ed70a3d, float:0.42)
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r4 = defpackage.je.a(r2, r1, r3, r3)
            androidx.constraintlayout.widget.ConstraintLayout r5 = r6.af
            android.util.Property r10 = android.view.View.SCALE_X
            float[] r14 = new float[r8]
            r14 = {1065353216, 1098907648} // fill-array
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r10, r14)
            android.animation.AnimatorSet$Builder r5 = r0.play(r5)
            androidx.constraintlayout.widget.ConstraintLayout r10 = r6.af
            android.util.Property r14 = android.view.View.SCALE_Y
            float[] r15 = new float[r8]
            r15 = {1065353216, 1098907648} // fill-array
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r10, r14, r15)
            r5.with(r10)
            r14 = 600(0x258, double:2.964E-321)
            r0.setDuration(r14)
            r0.setInterpolator(r4)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            androidx.constraintlayout.widget.ConstraintLayout r10 = r6.af
            android.util.Property r14 = android.view.View.ALPHA
            float[] r15 = new float[r8]
            r15 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r10, r14, r15)
            r5.play(r10)
            r5.setInterpolator(r4)
            r14 = 550(0x226, double:2.717E-321)
            r5.setStartDelay(r14)
            r14 = 10
            r5.setDuration(r14)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            khw r10 = r6.V
            boolean r10 = r10.i()
            if (r10 == 0) goto L_0x01e2
            android.animation.Animator[] r10 = new android.animation.Animator[r11]
            r10[r12] = r0
            r10[r13] = r5
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            android.view.animation.Interpolator r1 = defpackage.je.a(r2, r1, r3, r3)
            android.widget.TextView r2 = r6.W
            android.util.Property r3 = android.view.View.ALPHA
            float[] r5 = new float[r8]
            r5 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r3, r5)
            r0.play(r2)
            r0.setInterpolator(r1)
            r10[r8] = r0
            r4.playTogether(r10)
            goto L_0x01eb
        L_0x01e2:
            android.animation.Animator[] r1 = new android.animation.Animator[r8]
            r1[r12] = r0
            r1[r13] = r5
            r4.playTogether(r1)
        L_0x01eb:
            r9[r13] = r4
            r7.playSequentially(r9)
            android.animation.AnimatorSet r0 = r6.ad
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khx.c():void");
    }

    public final void h() {
        this.U.bf_();
        super.h();
    }

    /* access modifiers changed from: private */
    public void a(StoriesPlaybackState storiesPlaybackState) {
        if (VERSION.SDK_INT < 19) {
            Logger.e("TODO: figure out animation pausing for lower APIs", new Object[0]);
            return;
        }
        int i = AnonymousClass1.a[storiesPlaybackState.ordinal()];
        if (i == 1) {
            this.a.c();
            AnimatorSet animatorSet = this.ad;
            if (animatorSet != null) {
                animatorSet.pause();
            }
        } else if (i == 2) {
            this.a.d();
            AnimatorSet animatorSet2 = this.ad;
            if (animatorSet2 != null) {
                animatorSet2.resume();
            }
        }
    }

    private AnimatorSet a(View view, long j, long j2) {
        Interpolator a2 = je.a(0.25f, 0.1f, 0.25f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        float width = ((float) (this.ae.getWidth() - view.getWidth())) / 2.0f;
        float height = ((float) (this.ae.getHeight() - view.getHeight())) / 2.0f;
        animatorSet.play(ObjectAnimator.ofFloat(view, View.X, new float[]{width, view.getX()})).with(ObjectAnimator.ofFloat(view, View.Y, new float[]{height, view.getY()})).with(ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{0.1f, 1.0f})).with(ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{0.1f, 1.0f}));
        animatorSet.setInterpolator(a2);
        animatorSet.setDuration(j);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f, 1.0f}));
        animatorSet2.setInterpolator(a2);
        animatorSet2.setDuration(50);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(new Animator[]{animatorSet, animatorSet2});
        animatorSet3.setStartDelay(j2);
        return animatorSet3;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            android.os.Bundle r8 = r5.l()
            java.lang.String r0 = "season"
            android.os.Parcelable r8 = r8.getParcelable(r0)
            khw r8 = (defpackage.khw) r8
            java.lang.String r0 = "Can't find season in args."
            java.lang.Object r8 = defpackage.fay.a(r8, r0)
            khw r8 = (defpackage.khw) r8
            r5.V = r8
            khw r8 = r5.V
            java.lang.String r8 = r8.a()
            int r0 = r8.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            switch(r0) {
                case -895679987: goto L_0x0046;
                case -891207761: goto L_0x003c;
                case -787736891: goto L_0x0032;
                case 3135355: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x0050
        L_0x0028:
            java.lang.String r0 = "fall"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0050
            r8 = 3
            goto L_0x0051
        L_0x0032:
            java.lang.String r0 = "winter"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0050
            r8 = 0
            goto L_0x0051
        L_0x003c:
            java.lang.String r0 = "summer"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0050
            r8 = 1
            goto L_0x0051
        L_0x0046:
            java.lang.String r0 = "spring"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0050
            r8 = 2
            goto L_0x0051
        L_0x0050:
            r8 = -1
        L_0x0051:
            if (r8 == 0) goto L_0x0087
            if (r8 == r3) goto L_0x007f
            if (r8 == r2) goto L_0x0077
            if (r8 != r1) goto L_0x0061
            r8 = 2131624685(0x7f0e02ed, float:1.8876557E38)
            android.view.View r6 = r6.inflate(r8, r7, r4)
            return r6
        L_0x0061:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.Object[] r7 = new java.lang.Object[r3]
            khw r8 = r5.V
            java.lang.String r8 = r8.a()
            r7[r4] = r8
            java.lang.String r8 = "Layout doesn't exist: %s"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            r6.<init>(r7)
            throw r6
        L_0x0077:
            r8 = 2131624686(0x7f0e02ee, float:1.8876559E38)
            android.view.View r6 = r6.inflate(r8, r7, r4)
            return r6
        L_0x007f:
            r8 = 2131624687(0x7f0e02ef, float:1.887656E38)
            android.view.View r6 = r6.inflate(r8, r7, r4)
            return r6
        L_0x0087:
            r8 = 2131624688(0x7f0e02f0, float:1.8876563E38)
            android.view.View r6 = r6.inflate(r8, r7, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khx.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
