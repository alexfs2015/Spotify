package com.spotify.music.slate.container.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.cardview.widget.CardView;
import androidx.percentlayout.widget.PercentRelativeLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.music.slate.container.view.card.CardInteractionHandler;
import com.spotify.music.slate.container.view.card.CardInteractionHandler.SwipeDirection;

public class SlateView extends PercentRelativeLayout implements com.spotify.music.slate.container.view.card.CardInteractionHandler.a {
    private static a b = new a() {
        public final boolean canDismiss(DisplayMode displayMode) {
            return displayMode == DisplayMode.CARD;
        }
    };
    public com.spotify.music.slate.container.view.card.CardInteractionHandler.a a;
    private CardView c;
    private FrameLayout d;
    private FrameLayout e;
    private View f;
    private CardInteractionHandler g;
    private defpackage.ulh.a h;
    private a i = b;
    private DisplayMode j = DisplayMode.CARD;

    public enum DisplayMode {
        CARD,
        FULL_SCREEN
    }

    public interface a {
        boolean canDismiss(DisplayMode displayMode);
    }

    public SlateView(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public SlateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public SlateView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, defpackage.ula.a.a, 0, 0);
            try {
                this.j = obtainStyledAttributes.getBoolean(defpackage.ula.a.b, false) ? DisplayMode.FULL_SCREEN : DisplayMode.CARD;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        LayoutInflater.from(getContext()).inflate(R.layout.slate_view, this);
        setBackgroundColor(Color.parseColor("#70121314"));
        this.c = (CardView) findViewById(R.id.slate_content_container);
        this.d = (FrameLayout) findViewById(R.id.slate_header_container);
        this.e = (FrameLayout) findViewById(R.id.slate_footer_container);
        this.f = findViewById(R.id.slate_content_view_container);
    }

    private void a(DisplayMode displayMode) {
        this.g.a = this.i.canDismiss(displayMode);
    }

    public final void a(double d2, float f2, SwipeDirection swipeDirection) {
        com.spotify.music.slate.container.view.card.CardInteractionHandler.a aVar = this.a;
        if (aVar != null) {
            aVar.a(d2, f2, swipeDirection);
        }
    }

    public final void a(a aVar) {
        this.i = aVar;
        a(this.j);
    }

    public final void a(SwipeDirection swipeDirection) {
        com.spotify.music.slate.container.view.card.CardInteractionHandler.a aVar = this.a;
        if (aVar != null) {
            aVar.a(swipeDirection);
        }
    }

    public void a(ulf ulf) {
        this.c.removeAllViews();
        LayoutInflater from = LayoutInflater.from(getContext());
        CardView cardView = this.c;
        cardView.addView(ulf.getSlateContentView(from, cardView));
        this.g = new CardInteractionHandler(this.f, this);
        this.c.setOnTouchListener(this.g);
    }

    public final void a(ulg ulg) {
        this.d.removeAllViews();
        this.d.addView(ulg.getView(LayoutInflater.from(getContext()), this.d));
    }

    public final void aC_() {
        com.spotify.music.slate.container.view.card.CardInteractionHandler.a aVar = this.a;
        if (aVar != null) {
            aVar.aC_();
        }
    }

    public final void b() {
        com.spotify.music.slate.container.view.card.CardInteractionHandler.a aVar = this.a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void b(ulg ulg) {
        this.e.removeAllViews();
        this.e.addView(ulg.getView(LayoutInflater.from(getContext()), this.e));
    }

    public void onMeasure(int i2, int i3) {
        int size = MeasureSpec.getSize(i2);
        int size2 = MeasureSpec.getSize(i3);
        defpackage.ulh.a aVar = this.h;
        boolean z = true;
        if (aVar == null) {
            Logger.b("No dimensions calculated yet", new Object[0]);
        } else if (aVar.d == size && this.h.c == size2) {
            z = false;
        } else {
            Logger.b("SlateView Dimensions Changed. Changed from %dhx%dw to %dhx%dw", Integer.valueOf(this.h.c), Integer.valueOf(this.h.d), Integer.valueOf(size2), Integer.valueOf(size));
        }
        if (z) {
            Resources resources = getResources();
            float integer = ((float) resources.getInteger(R.integer.card_aspect_ratio)) / 100.0f;
            float integer2 = ((float) resources.getInteger(R.integer.card_height_percentage)) / 100.0f;
            defpackage.ulh.a aVar2 = new defpackage.ulh.a();
            aVar2.a = (int) Math.min(((float) size2) * integer2, ((float) size) / integer);
            aVar2.b = (int) (((float) aVar2.a) * integer);
            aVar2.c = size2;
            aVar2.d = size;
            this.h = aVar2;
            LayoutParams layoutParams = (LayoutParams) this.c.getLayoutParams();
            if (this.j == DisplayMode.FULL_SCREEN) {
                layoutParams.height = this.h.c;
                layoutParams.width = this.h.d;
                this.c.a(0.0f);
            } else {
                layoutParams.height = this.h.a;
                layoutParams.width = this.h.b;
                this.c.a(20.0f);
            }
        }
        super.onMeasure(i2, i3);
    }
}
