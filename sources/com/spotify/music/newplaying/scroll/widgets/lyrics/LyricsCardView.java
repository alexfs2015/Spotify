package com.spotify.music.newplaying.scroll.widgets.lyrics;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.music.R;
import com.spotify.music.lyrics.model.TrackLyrics;
import com.spotify.music.lyrics.views.LyricsAppearance;
import com.spotify.music.lyrics.views.LyricsView;

public class LyricsCardView extends LinearLayout implements suc {
    private LyricsView a;
    private View b;
    private GradientDrawable c;
    private int d;
    private a e;
    private slf f;
    private ViewGroup g;
    private TrackLyrics h;

    public LyricsCardView(Context context) {
        this(context, null);
    }

    public LyricsCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LyricsCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setDescendantFocusability(393216);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        a aVar = this.e;
        if (aVar != null) {
            aVar.onFocusChange(z);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (LyricsView) findViewById(R.id.lyrics_view);
        this.b = findViewById(R.id.loading_view);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.container);
        this.g = (ViewGroup) findViewById(R.id.lyrics_card_container);
        this.c = (GradientDrawable) linearLayout.getBackground();
    }

    public void a(long j) {
        this.d = (int) j;
        this.a.a(this.d);
    }

    public final void a(b bVar) {
        $$Lambda$LyricsCardView$JVLkShhXt8EIC2Jxrral5vLQ2s r0 = new OnClickListener() {
            public final void onClick(View view) {
                LyricsCardView.a(b.this, view);
            }
        };
        setOnClickListener(r0);
        this.g.setOnClickListener(r0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar, View view) {
        if (bVar != null) {
            bVar.onFullscreenClicked();
        }
    }

    public final void a(a aVar) {
        this.e = aVar;
    }

    public final void a(slf slf) {
        this.f = slf;
    }

    public final void a(int i, int i2) {
        this.a.a(i, i2);
    }

    public void setBackgroundColor(int i) {
        this.c.setColor(i);
    }

    public final void a() {
        this.a.setVisibility(8);
        this.b.setVisibility(0);
    }

    public final void b() {
        this.a.setVisibility(8);
        this.b.setVisibility(0);
    }

    public final void a(sle sle) {
        this.a.e = sle;
    }

    public final Bundle a(Display display) {
        if (this.h == null || this.f == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        Rect rect = new Rect();
        Point point = new Point();
        getGlobalVisibleRect(rect);
        display.getSize(point);
        this.a.getLocationInWindow(new int[2]);
        bundle.putInt("start_y", rect.top);
        bundle.putInt("start_height", rect.bottom - rect.top);
        bundle.putInt("end_height", point.y);
        bundle.putInt("start_width", rect.right - rect.left);
        bundle.putInt("end_width", point.x);
        bundle.putInt("player_position", this.d);
        bundle.putParcelable("lyrics_color", this.f);
        bundle.putParcelable("track_lyrics", this.h);
        return bundle;
    }

    public final void a(TrackLyrics trackLyrics) {
        q qVar;
        Context context = getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                qVar = null;
                break;
            } else if (context instanceof Activity) {
                qVar = (q) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (qVar != null) {
            this.h = trackLyrics;
            this.b.setVisibility(8);
            this.a.setVisibility(0);
            LyricsView lyricsView = this.a;
            TrackLyrics trackLyrics2 = this.h;
            lyricsView.a(trackLyrics2, qVar, slg.a(trackLyrics2.getLines()) ? LyricsAppearance.LYRICS_CJK : LyricsAppearance.WIDGET);
        }
    }
}
