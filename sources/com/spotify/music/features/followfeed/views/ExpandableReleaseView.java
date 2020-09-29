package com.spotify.music.features.followfeed.views;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;

public class ExpandableReleaseView extends LinearLayout {
    public Picasso a;
    public ArtistHeaderView b;
    public ItemEntityCardView c;
    public LinearLayout d;
    public ViewGroup e;
    public ViewGroup f;
    public boolean g;
    public int h;
    public b i;
    private ViewGroup j;
    private TextView k;

    public ExpandableReleaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ExpandableReleaseView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }

    public ExpandableReleaseView(Context context, Picasso picasso) {
        super(context);
        this.a = picasso;
        a();
    }

    private void a() {
        this.j = (ViewGroup) inflate(getContext(), R.layout.expandable_release_feed_item, this);
        this.e = (ViewGroup) ip.d((View) this.j, (int) R.id.expandable_footer);
        this.f = (ViewGroup) ip.d((View) this.e, (int) R.id.footer_layout);
        this.k = (TextView) ip.d((View) this.j, (int) R.id.item_footer_label);
        this.d = (LinearLayout) ip.d((View) this.e, (int) R.id.item_track_holder);
        ViewGroup viewGroup = (ViewGroup) ip.d((View) this.j, (int) R.id.static_entity_layout);
        this.b = (ArtistHeaderView) ip.d((View) viewGroup, (int) R.id.feed_artist_header_view);
        this.c = (ItemEntityCardView) ip.d((View) viewGroup, (int) R.id.feed_entity_card_view);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        b(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public int a(int i2) {
        return (c(R.dimen.feed_expandable_item_track_height) * i2) + c(R.dimen.feed_expandable_item_footer_height);
    }

    public void a(int i2, int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i2, i3});
        ofInt.setDuration(500);
        ofInt.addUpdateListener(new AnimatorUpdateListener(ofInt) {
            private final /* synthetic */ ValueAnimator f$1;

            {
                this.f$1 = r2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandableReleaseView.this.a(this.f$1, valueAnimator);
            }
        });
        ofInt.start();
    }

    public final void a(int i2, boolean z) {
        this.k.setText(String.format(z ? getContext().getString(R.string.follow_feed_item_footer_text_hide) : getContext().getString(R.string.follow_feed_item_footer_text_view), new Object[]{String.valueOf(i2)}));
    }

    public void b(int i2) {
        LayoutParams layoutParams = this.e.getLayoutParams();
        layoutParams.height = i2;
        this.e.setLayoutParams(layoutParams);
    }

    public int c(int i2) {
        return getResources().getDimensionPixelSize(i2);
    }
}
