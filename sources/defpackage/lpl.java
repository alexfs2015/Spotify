package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings.Style;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.music.R;
import java.util.EnumSet;

/* renamed from: lpl reason: default package */
public final class lpl extends defpackage.rev.a<a> {
    private final HubsGlueImageDelegate a;

    /* renamed from: lpl$a */
    static class a extends defpackage.gui.c.a<View> {
        private final TextView b;
        private final TextView c;
        private final ImageView d;
        private final ImageView e;
        private final TextView f;
        private final View g;
        private final HubsGlueImageDelegate h;
        private final ImageView i;
        private final TextView j;
        private final View k;
        private final lpi l;

        protected a(View view, HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(view);
            this.b = (TextView) view.findViewById(16908308);
            this.c = (TextView) view.findViewById(16908309);
            this.d = (ImageView) view.findViewById(16908294);
            this.e = (ImageView) view.findViewById(R.id.artistspick_comment_image);
            this.f = (TextView) view.findViewById(R.id.artistspick_comment_text);
            this.g = view.findViewById(R.id.artistspick_comment);
            this.i = (ImageView) view.findViewById(R.id.artistspick_nocomment_image);
            this.j = (TextView) view.findViewById(R.id.artistspick_nocomment_text);
            this.k = view.findViewById(R.id.artistspick_nocomment);
            this.l = new lpi(view.findViewById(R.id.artistspick_comment_container));
            this.h = hubsGlueImageDelegate;
            uui.b(view).b(this.d).a(this.b, this.c).a();
        }

        public final void a(gzt gzt, gum gum, b bVar) {
            ImageView imageView;
            ValueAnimator valueAnimator;
            guj.a(gum, this.a, gzt);
            String title = gzt.text().title();
            String str = "";
            if (fax.a(title)) {
                title = str;
            }
            String subtitle = gzt.text().subtitle();
            if (fax.a(subtitle)) {
                subtitle = str;
            }
            this.b.setText(title);
            this.c.setText(subtitle);
            boolean boolValue = gzt.custom().boolValue("artistAddedComment", false);
            String string = gzt.custom().string("commentText");
            gzw gzw = (gzw) gzt.images().custom().get("artistImage");
            if (boolValue) {
                this.g.setVisibility(0);
                this.k.setVisibility(8);
                this.f.setText(string);
                lpi lpi = this.l;
                LayoutParams layoutParams = (LayoutParams) lpi.a.getLayoutParams();
                TextView textView = (TextView) lpi.a.findViewById(R.id.artistspick_comment_text);
                int dimension = (int) lpi.a.getResources().getDimension(R.dimen.mobile_artistspickrow_comment_minimum_left_margin);
                if (VERSION.SDK_INT >= 17) {
                    valueAnimator = ValueAnimator.ofInt(new int[]{layoutParams.getMarginStart(), dimension});
                } else {
                    valueAnimator = ValueAnimator.ofInt(new int[]{layoutParams.leftMargin, dimension});
                }
                valueAnimator.setDuration(1000).setStartDelay(1000);
                valueAnimator.addUpdateListener(new AnimatorUpdateListener(textView, layoutParams) {
                    private /* synthetic */ TextView a;
                    private /* synthetic */ LayoutParams b;

                    {
                        this.a = r2;
                        this.b = r3;
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
                        if (r0.getEllipsisCount(r2 - 1) > 0) goto L_0x0018;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void onAnimationUpdate(android.animation.ValueAnimator r4) {
                        /*
                            r3 = this;
                            android.widget.TextView r0 = r3.a
                            android.text.Layout r0 = r0.getLayout()
                            r1 = 1
                            if (r0 == 0) goto L_0x0017
                            int r2 = r0.getLineCount()
                            if (r2 <= 0) goto L_0x0017
                            int r2 = r2 - r1
                            int r0 = r0.getEllipsisCount(r2)
                            if (r0 <= 0) goto L_0x0017
                            goto L_0x0018
                        L_0x0017:
                            r1 = 0
                        L_0x0018:
                            if (r1 == 0) goto L_0x0034
                            java.lang.Object r4 = r4.getAnimatedValue()
                            java.lang.Integer r4 = (java.lang.Integer) r4
                            int r4 = r4.intValue()
                            android.widget.RelativeLayout$LayoutParams r0 = r3.b
                            defpackage.ia.a(r0, r4)
                            android.widget.RelativeLayout$LayoutParams r0 = r3.b
                            r0.leftMargin = r4
                            lpi r4 = defpackage.lpi.this
                            android.view.View r4 = r4.a
                            r4.requestLayout()
                        L_0x0034:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpi.AnonymousClass1.onAnimationUpdate(android.animation.ValueAnimator):void");
                    }
                });
                valueAnimator.start();
                imageView = this.e;
            } else {
                this.g.setVisibility(8);
                this.k.setVisibility(0);
                this.j.setText(string);
                imageView = this.i;
            }
            if (gzw != null) {
                gzw a = gzw.toBuilder().b(Style.CIRCULAR.mSetting).a();
                this.h.a(imageView);
                this.h.a(imageView, a, HubsGlueImageConfig.THUMBNAIL);
            }
            this.h.a(this.d);
            this.h.a(this.d, gzt.images().main(), HubsGlueImageConfig.THUMBNAIL);
        }

        public final void a(gzt gzt, defpackage.gui.a<View> aVar, int... iArr) {
            haq.a(this.a, gzt, aVar, iArr);
        }
    }

    public final int b() {
        return R.id.hubs_artist_pick_row_component;
    }

    public lpl(HubsGlueImageDelegate hubsGlueImageDelegate) {
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
    }

    public final EnumSet<Trait> a() {
        return EnumSet.of(Trait.STACKABLE);
    }

    public final /* synthetic */ defpackage.gui.c.a b(ViewGroup viewGroup, gum gum) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.artistspick_row, viewGroup, false), this.a);
    }
}
