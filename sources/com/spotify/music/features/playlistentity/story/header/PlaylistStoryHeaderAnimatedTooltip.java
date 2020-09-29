package com.spotify.music.features.playlistentity.story.header;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

public class PlaylistStoryHeaderAnimatedTooltip extends ConstraintLayout {
    private static final kb n = new kb().b(1.0f).a(500.0f);
    private static final kb o = new kb().b(1.0f).a(1000.0f);
    private static final kb p = new kb().b(1.0f).a(10000.0f);
    private static final kb q = new kb().b(0.75f).a(500.0f);
    public View b;
    public ImageView c;
    public ka d;
    public ka e;
    public ka f;
    public ka g;
    public ka h;
    public ka i;
    public ka j;
    public ka k;
    public float l;
    public float m;

    public PlaylistStoryHeaderAnimatedTooltip(Context context) {
        super(context);
        a((AttributeSet) null, context);
    }

    public PlaylistStoryHeaderAnimatedTooltip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, context);
    }

    public PlaylistStoryHeaderAnimatedTooltip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet, context);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i2, int i3, jy jyVar, boolean z, float f2, float f3) {
        this.g.a((float) i2);
        this.j.a((float) i3);
        this.k.a(1.0f);
        this.h.a(1.0f);
        this.i.a(1.0f);
        this.f.a(1.0f);
    }

    private void a(AttributeSet attributeSet, Context context) {
        this.b = inflate(context, R.layout.playlist_story_header_tooltip, this);
        this.c = (ImageView) this.b.findViewById(R.id.image);
        TextView textView = (TextView) this.b.findViewById(R.id.title);
        View findViewById = this.b.findViewById(R.id.background);
        View findViewById2 = this.b.findViewById(R.id.arrow);
        a(attributeSet, textView, context);
        a(textView, findViewById2, findViewById);
        measure(0, 0);
        a(this.c, findViewById2);
        a(this.b, findViewById2);
        a(textView, findViewById2, findViewById, this.c, this.l);
    }

    private static void a(AttributeSet attributeSet, TextView textView, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.a);
        textView.setText(obtainStyledAttributes.getString(a.b));
        obtainStyledAttributes.recycle();
    }

    public static void a(View view, int i2, ka kaVar) {
        Object tag = view.getTag(i2);
        if (tag instanceof b) {
            kaVar.b((b) tag);
        }
    }

    private void a(View view, View view2) {
        view.setTag(R.id.show_animation_end_listener, new b(vfj.a(getResources().getDimension(R.dimen.tooltip_image_margin), getResources()), (int) Math.floor((double) ((((float) getMeasuredHeight()) / 2.0f) + (((float) view2.getMeasuredHeight()) / 2.0f)))) {
            private final /* synthetic */ int f$1;
            private final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onAnimationEnd(jy jyVar, boolean z, float f, float f2) {
                PlaylistStoryHeaderAnimatedTooltip.this.a(this.f$1, this.f$2, jyVar, z, f, f2);
            }
        });
        view.setTag(R.id.hide_animation_end_listener, new b() {
            public final void onAnimationEnd(jy jyVar, boolean z, float f, float f2) {
                PlaylistStoryHeaderAnimatedTooltip.this.a(jyVar, z, f, f2);
            }
        });
    }

    private void a(ImageView imageView, View view) {
        this.l = (((float) getMeasuredWidth()) / 2.0f) - (((float) imageView.getMaxWidth()) / 2.0f);
        this.m = (((float) getMeasuredHeight()) / 2.0f) - ((float) view.getMeasuredHeight());
    }

    private void a(TextView textView, View view, View view2) {
        ka kaVar = new ka(this.c, ka.a);
        kaVar.i = 0.0f;
        ka kaVar2 = kaVar;
        kaVar2.h = 1.0f;
        this.d = kaVar2;
        ka kaVar3 = new ka(this.c, ka.b);
        kaVar3.i = 0.0f;
        ka kaVar4 = kaVar3;
        kaVar4.h = 1.0f;
        this.e = kaVar4;
        ka kaVar5 = new ka(textView, ka.a);
        kaVar5.i = 0.0f;
        ka kaVar6 = kaVar5;
        kaVar6.h = 1.0f;
        this.f = kaVar6;
        this.g = new ka(this.c, ka.c);
        this.j = new ka(view, ka.d);
        ka kaVar7 = new ka(view, ka.a);
        kaVar7.i = 0.0f;
        ka kaVar8 = kaVar7;
        kaVar8.h = 1.0f;
        this.k = kaVar8;
        ka kaVar9 = new ka(view2, ka.a);
        kaVar9.i = 0.0f;
        ka kaVar10 = kaVar9;
        kaVar10.h = 1.0f;
        this.h = kaVar10;
        ka kaVar11 = new ka(view2, ka.b);
        kaVar11.i = 0.0f;
        ka kaVar12 = kaVar11;
        kaVar12.h = 1.0f;
        this.i = kaVar12;
        this.g.k = n;
        ka kaVar13 = this.h;
        kb kbVar = q;
        kaVar13.k = kbVar;
        this.i.k = kbVar;
        this.j.k = o;
        this.k.k = p;
        this.f.k = kbVar;
    }

    private static void a(TextView textView, View view, View view2, ImageView imageView, float f2) {
        imageView.setX(f2);
        imageView.setScaleX(0.0f);
        imageView.setScaleY(0.0f);
        view.setScaleX(0.0f);
        view2.setScaleX(0.0f);
        view2.setScaleY(0.0f);
        textView.setScaleX(0.0f);
        view.setY((float) (-view.getMeasuredHeight()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(jy jyVar, boolean z, float f2, float f3) {
        this.d.a(0.0f);
        this.e.a(0.0f);
    }
}
