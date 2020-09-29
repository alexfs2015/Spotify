package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: rbv reason: default package */
public final class rbv implements rbu, rcl {
    final rcj a;
    EditText b;
    private final Context c;
    private final kf d;
    private final Drawable e;
    private a f;
    private View g;
    private Button h;
    private ImageButton i;
    private boolean j;
    private final jxg k = new jxg() {
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            rbv.this.a.a(charSequence.toString());
        }
    };

    public rbv(Context context, kf kfVar, rcj rcj) {
        this.c = context;
        this.d = kfVar;
        this.a = rcj;
        this.e = this.c.getResources().getDrawable(R.drawable.find_and_filter_background);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewGroup viewGroup2, rbq rbq, a aVar) {
        this.f = aVar;
        rcj rcj = this.a;
        rcj.b = this;
        rcj.c = rbq;
        this.g = layoutInflater.inflate(R.layout.new_filter_and_sort_view, viewGroup, false);
        this.b = (EditText) this.g.findViewById(R.id.edit_text_filter);
        this.b.setHint(rbq.d());
        this.b.addTextChangedListener(this.k);
        this.b.setOnClickListener(new $$Lambda$rbv$4IlZpQgV_esVw5k32kdZW7ft_hU(this));
        this.b.setOnFocusChangeListener(new $$Lambda$rbv$TtO7T3NFBN5BoQ7D2w06gnWKKDY(this));
        ((ImageView) this.g.findViewById(R.id.edit_text_search_icon)).setImageDrawable(a(SpotifyIconV2.SEARCH, 16, R.color.white_70));
        this.h = (Button) this.g.findViewById(R.id.button_sort);
        this.h.setOnClickListener(new $$Lambda$rbv$nf6yId0ADhuJ6KIYiOBh0GC8Lo(this));
        this.i = (ImageButton) this.g.findViewById(R.id.button_clear);
        this.i.setImageDrawable(a(SpotifyIconV2.X, 16, R.color.white));
        this.i.setOnClickListener(new $$Lambda$rbv$Trx41WLIfdrVED4Map8MGtK57H8(this));
        View view = new View(this.c);
        view.setLayoutParams(new LayoutParams(-1, -1));
        viewGroup2.addView(view);
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && rbv.this.b.isFocused()) {
                    Rect rect = new Rect();
                    rbv.this.b.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        rbv.this.f();
                    }
                }
                return false;
            }
        });
        return this.g;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, boolean z) {
        this.f.a(z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.j) {
            this.f.a();
            this.a.f();
            return;
        }
        this.a.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.a.e();
    }

    public final void b(SortOption sortOption) {
        this.a.a(sortOption);
    }

    public final void b(String str) {
        if (!str.equals(this.b.getText().toString())) {
            this.b.setText(str);
        }
    }

    public final void c() {
        this.a.d();
        this.b.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.c.getSystemService("input_method");
        if (inputMethodManager != null && !inputMethodManager.showSoftInput(this.b, 1)) {
            inputMethodManager.toggleSoftInput(2, 0);
        }
    }

    public final void d() {
        this.b.clearFocus();
        f();
    }

    public final void e() {
        this.a.a();
    }

    public final void b(boolean z) {
        this.j = z;
        if (z) {
            this.h.setBackground(null);
            this.h.setText(R.string.cancel_text_filter_button);
            return;
        }
        this.h.setBackground(this.e);
        this.h.setText(R.string.filter_button);
    }

    public final void a(rbq rbq, SortOption sortOption) {
        rbw a2 = rbw.a(rbq, sortOption);
        a2.T = new a() {
            public final void a(b bVar, int i) {
                rcj rcj = rbv.this.a;
                boolean z = !bVar.f();
                rcj.a.a(bVar.a(), i, z);
                rcj.b.a(bVar.g().a(z).a());
            }

            public final void a(SortOption sortOption, int i) {
                rbv.this.a.a(sortOption, i);
            }

            public final void a() {
                rbv.this.a.c();
            }
        };
        a2.a(this.d, a2.z);
    }

    public final void a(SortOption sortOption) {
        this.f.a(new SortOption(sortOption));
    }

    public final void a(b bVar) {
        this.f.a(bVar);
    }

    public final void a(String str) {
        this.f.a(str);
    }

    public final void a(boolean z) {
        this.i.setVisibility(z ? 0 : 8);
    }

    public final void a() {
        this.b.setText("");
    }

    public final void b() {
        a();
        this.f.a();
        f();
    }

    public final void a(rbq rbq) {
        this.a.c = rbq;
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        this.b.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.c.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.b.getWindowToken(), 0);
        }
    }

    private SpotifyIconDrawable a(SpotifyIconV2 spotifyIconV2, int i2, int i3) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.c, spotifyIconV2, (float) uts.b(16.0f, this.c.getResources()));
        spotifyIconDrawable.a(fr.c(this.c, i3));
        return spotifyIconDrawable;
    }
}
