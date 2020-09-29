package com.spotify.music.util.filterheader;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.List;

public class FilterHeaderView extends RelativeLayout {
    public TextView a;
    public a b;
    /* access modifiers changed from: private */
    public ImageButton c;
    private boolean d;
    private boolean e;
    private Drawable f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    /* access modifiers changed from: private */
    public InteractionLogger j;
    /* access modifiers changed from: private */
    public upq k;
    private final defpackage.upq.a l = new defpackage.upq.a() {
        public final void a(SortOption sortOption) {
            if (FilterHeaderView.this.b != null) {
                FilterHeaderView.this.b.a(sortOption);
            }
            if (FilterHeaderView.this.j != null) {
                FilterHeaderView.this.j.a(null, "sort", 0, InteractionType.HIT, "sort-changed");
            }
            FilterHeaderView.this.a(sortOption);
        }
    };
    private final OnTouchListener m = new OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                Drawable drawable = FilterHeaderView.this.a.getCompoundDrawables()[2];
                if (drawable != null && motionEvent.getX() >= ((float) (((FilterHeaderView.this.a.getWidth() - FilterHeaderView.this.a.getPaddingRight()) - FilterHeaderView.this.a.getCompoundPaddingRight()) - drawable.getBounds().width()))) {
                    FilterHeaderView.this.a.setText("");
                    FilterHeaderView.this.a();
                    FilterHeaderView.this.a.clearFocus();
                }
            }
            return false;
        }
    };
    private final OnClickListener n = new OnClickListener() {
        public final void onClick(View view) {
            if (FilterHeaderView.this.j != null) {
                FilterHeaderView.this.j.a(null, "sort", 0, InteractionType.HIT, "show-sort-options");
            }
            FilterHeaderView.this.k.a((View) FilterHeaderView.this.c);
        }
    };
    private final TextWatcher o = new jxg() {
        public final void afterTextChanged(Editable editable) {
            if (FilterHeaderView.this.b != null) {
                FilterHeaderView.this.b.a(editable.toString());
            }
            FilterHeaderView.g(FilterHeaderView.this);
            if (FilterHeaderView.this.b != null && !FilterHeaderView.this.b()) {
                FilterHeaderView.this.b;
            }
        }
    };
    private final OnEditorActionListener p = new OnEditorActionListener() {
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if ((i & 255) == 0) {
                return false;
            }
            FilterHeaderView.this.a();
            return true;
        }
    };
    private final OnFocusChangeListener q = new OnFocusChangeListener() {
        public final void onFocusChange(View view, boolean z) {
            if (z) {
                FilterHeaderView.this.a(true);
            }
        }
    };

    public interface a {
        void a();

        void a(SortOption sortOption);

        void a(String str);
    }

    public FilterHeaderView(Context context) {
        super(context);
        c();
    }

    public FilterHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    private void c() {
        this.k = new upq(getContext(), LayoutInflater.from(getContext()), this.l);
        this.g = a(SpotifyIcon.SORT_32);
        this.h = a(SpotifyIcon.SORTDOWN_32);
        this.i = a(SpotifyIcon.SORTUP_32);
        this.f = new SpotifyIconDrawable(getContext(), SpotifyIcon.X_16);
    }

    private Drawable a(SpotifyIcon spotifyIcon) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(getContext(), spotifyIcon);
        spotifyIconDrawable.a(fr.c(getContext(), R.color.cat_white));
        spotifyIconDrawable.a((float) uts.b(24.0f, getResources()));
        return spotifyIconDrawable;
    }

    public final void a(sih sih, gjf gjf) {
        this.j = new InteractionLogger((jjf) ggw.a(jjg.class), sih, gjf);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (!isInEditMode()) {
            this.c = (ImageButton) findViewById(R.id.button_sort);
            this.a = (TextView) findViewById(R.id.filter);
            this.c.setOnClickListener(this.n);
            this.a.addTextChangedListener(this.o);
            this.a.setOnEditorActionListener(this.p);
            this.a.setOnFocusChangeListener(this.q);
            this.d = false;
            this.e = false;
            this.a.setOnTouchListener(this.m);
            a((SortOption) null);
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        if (this.e != z) {
            this.e = z;
            a aVar = this.b;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final void a() {
        this.a.clearFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
        a(false);
    }

    private void a(String str) {
        if (!TextUtils.equals(str, this.a.getText())) {
            TextView textView = this.a;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            this.d = b();
        }
    }

    public final void a(int i2) {
        this.a.setHint(i2);
    }

    public final boolean b() {
        return !this.a.getText().toString().isEmpty();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.k.a();
        super.onDetachedFromWindow();
    }

    private void a(List<SortOption> list, SortOption sortOption) {
        this.k.a(list, sortOption);
        a(sortOption);
    }

    public static FilterHeaderView a(LayoutInflater layoutInflater, String str, List<SortOption> list, SortOption sortOption, a aVar) {
        FilterHeaderView filterHeaderView = (FilterHeaderView) layoutInflater.inflate(R.layout.header_filter, null);
        filterHeaderView.a(str);
        filterHeaderView.a(list, sortOption);
        filterHeaderView.b = aVar;
        return filterHeaderView;
    }

    public static FilterHeaderView a(LayoutInflater layoutInflater, String str, List<SortOption> list, SortOption sortOption, List<upp> list2, a aVar) {
        FilterHeaderView filterHeaderView = (FilterHeaderView) layoutInflater.inflate(R.layout.header_filter, null);
        filterHeaderView.a(str);
        filterHeaderView.k.a(list2);
        filterHeaderView.a(list, sortOption);
        filterHeaderView.b = aVar;
        return filterHeaderView;
    }

    /* access modifiers changed from: private */
    public void a(SortOption sortOption) {
        if (sortOption == null || !sortOption.mIsReversible) {
            this.c.setImageDrawable(this.g);
        } else if (sortOption.b()) {
            this.c.setImageDrawable(this.i);
        } else {
            this.c.setImageDrawable(this.h);
        }
    }

    public static void a(FilterHeaderView filterHeaderView) {
        filterHeaderView.b = null;
    }

    public static void a(View view, final FilterHeaderView filterHeaderView) {
        final TextView textView = filterHeaderView.a;
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && textView.isFocused()) {
                    Rect rect = new Rect();
                    textView.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        filterHeaderView.a();
                    }
                }
                return false;
            }
        });
    }

    static /* synthetic */ void g(FilterHeaderView filterHeaderView) {
        boolean b2 = filterHeaderView.b();
        if (b2) {
            filterHeaderView.a.setCompoundDrawablesWithIntrinsicBounds(null, null, filterHeaderView.f, null);
        } else {
            filterHeaderView.a.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
        InteractionLogger interactionLogger = filterHeaderView.j;
        if (!(interactionLogger == null || filterHeaderView.d == b2)) {
            interactionLogger.a(null, "filter", 0, InteractionType.HIT, b2 ? "set-text-filter" : "clear-text-filter");
        }
        filterHeaderView.d = b2;
    }
}
