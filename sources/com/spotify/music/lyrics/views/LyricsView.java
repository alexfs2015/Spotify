package com.spotify.music.lyrics.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.google.common.collect.Range;
import com.spotify.music.R;
import com.spotify.music.lyrics.model.LyricsLineData;
import com.spotify.music.lyrics.model.TrackLyrics;
import com.spotify.music.lyrics.model.Word;
import java.util.HashSet;
import java.util.Set;

public class LyricsView extends LinearLayout {
    public final ListView a;
    public sll b;
    public slk c;
    int d;
    public sle e;
    boolean f;
    int g;
    final Set<Integer> h;
    private slj i;
    private int j;
    private String k;
    /* access modifiers changed from: private */
    public boolean l;

    public LyricsView(Context context) {
        this(context, null);
    }

    public LyricsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LyricsView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = -1;
        this.l = true;
        this.h = new HashSet();
        LayoutInflater.from(context).inflate(R.layout.lyrics_view, this);
        this.a = (ListView) findViewById(R.id.list_view);
    }

    public final void a(TrackLyrics trackLyrics, Activity activity, LyricsAppearance lyricsAppearance) {
        this.k = trackLyrics.getKind();
        a(b(trackLyrics, activity, lyricsAppearance));
    }

    public final void a(int i2) {
        this.j = i2;
        if (this.i != null) {
            if (!TrackLyrics.KIND_TEXT.equals(this.k)) {
                int a2 = this.i.a(i2);
                int b2 = this.i.b(a2, i2);
                int headerViewsCount = a2 + this.a.getHeaderViewsCount();
                if (Math.abs(headerViewsCount - this.d) <= 1) {
                    int i3 = this.d;
                    if (headerViewsCount >= i3) {
                        if (((float) b2) <= 250.0f && headerViewsCount != i3) {
                            this.d = headerViewsCount;
                            this.a.setItemChecked(this.d, true);
                            if (this.l) {
                                a(this.d, true);
                            }
                        }
                        return;
                    }
                }
                this.d = headerViewsCount;
                d(this.d);
                int i4 = this.d;
                if (i4 < 0) {
                    i4 = 0;
                }
                a(i4, false);
            }
        }
    }

    public final void a(int i2, int i3) {
        slj slj = this.i;
        if (slj != null) {
            slj.a(i2, i3);
            sll sll = this.b;
            if (sll != null) {
                sll.a = i3;
            }
            slk slk = this.c;
            if (slk != null) {
                slk.a = i3;
            }
            this.i.notifyDataSetChanged();
        }
    }

    private void a(slj slj) {
        this.i = slj;
        this.a.setAdapter(this.i);
        if (TrackLyrics.KIND_LINE.equals(this.k)) {
            c(slj.a(this.j));
        }
    }

    private void a(int i2, boolean z) {
        int measuredHeight = (this.a.getMeasuredHeight() / 2) - b(i2);
        if (z) {
            this.a.smoothScrollToPositionFromTop(i2, measuredHeight);
        } else {
            this.a.setSelectionFromTop(i2, measuredHeight);
        }
    }

    private int b(int i2) {
        ListView listView = this.a;
        View childAt = listView.getChildAt(i2 - listView.getFirstVisiblePosition());
        int i3 = 0;
        if (childAt instanceof slm) {
            slm slm = (slm) childAt;
            int i4 = slm.b;
            if (i4 == 0) {
                return 0;
            }
            i3 = (slm.getHeight() / i4) * (i4 - 1);
        }
        return i3;
    }

    private void c(int i2) {
        this.d = i2 + this.a.getHeaderViewsCount();
        d(this.d);
        this.a.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                LyricsView.this.a.removeOnLayoutChangeListener(this);
                LyricsView.this.a.setSelectionFromTop(LyricsView.this.d, LyricsView.this.a.getMeasuredHeight() / 2);
                new Handler().post(new Runnable() {
                    public final void run() {
                        AnonymousClass1.this.a();
                    }
                });
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a() {
                LyricsView.a(LyricsView.this);
            }
        });
    }

    private void d(int i2) {
        for (int i3 = 0; i3 <= this.a.getAdapter().getCount(); i3++) {
            if (i3 <= i2) {
                this.a.setItemChecked(i3, true);
            } else {
                this.a.setItemChecked(i3, false);
            }
        }
    }

    private static slj b(TrackLyrics trackLyrics, Activity activity, LyricsAppearance lyricsAppearance) {
        return new slj(activity, trackLyrics.getLines(), lyricsAppearance);
    }

    static /* synthetic */ void a(LyricsView lyricsView) {
        lyricsView.g = 0;
        lyricsView.f = false;
        lyricsView.h.clear();
        lyricsView.a.setOnScrollListener(new OnScrollListener() {
            public final void onScrollStateChanged(AbsListView absListView, int i) {
            }

            public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
                if (!LyricsView.this.f && LyricsView.this.e != null && LyricsView.a((View) LyricsView.this.a)) {
                    LyricsView lyricsView = LyricsView.this;
                    for (int i4 = i; i4 < i + i2; i4++) {
                        Object itemAtPosition = lyricsView.a.getItemAtPosition(i4);
                        if (!lyricsView.h.contains(Integer.valueOf(i4)) && (itemAtPosition instanceof LyricsLineData)) {
                            lyricsView.h.add(Integer.valueOf(i4));
                            lyricsView.g += ((Word) ((LyricsLineData) itemAtPosition).words().get(0)).getString().length();
                        }
                    }
                    if (lyricsView.g >= 150) {
                        lyricsView.e.onLyricsDisplayed();
                        lyricsView.f = true;
                    }
                }
                int i5 = i + (i2 / 2);
                Range a2 = Range.a(Integer.valueOf(i5 - 3), Integer.valueOf(i5 + 3));
                LyricsView lyricsView2 = LyricsView.this;
                lyricsView2.l = a2.apply(Integer.valueOf(lyricsView2.d));
            }
        });
    }

    static /* synthetic */ boolean a(View view) {
        Rect rect = new Rect();
        return view.getGlobalVisibleRect(rect) && view.getHeight() == rect.height() && view.getWidth() == rect.width();
    }
}
