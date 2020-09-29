package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: rcg reason: default package */
public final class rcg implements rbu, rcl {
    final rcj a;
    EditText b;
    private final Context c;
    private final kf d;
    private a e;
    private View f;
    private ImageButton g;
    private ImageButton h;
    private final jxg i = new jxg() {
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            rcg.this.a.a(charSequence.toString());
        }
    };

    public /* synthetic */ void a(b bVar) {
        CC.$default$a(this, bVar);
    }

    public /* synthetic */ void a(rbq rbq) {
        CC.$default$a(this, rbq);
    }

    public /* synthetic */ void b(boolean z) {
        CC.$default$b(this, z);
    }

    public rcg(Context context, kf kfVar, rcj rcj) {
        this.c = context;
        this.d = kfVar;
        this.a = rcj;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewGroup viewGroup2, rbq rbq, a aVar) {
        this.e = aVar;
        rcj rcj = this.a;
        rcj.b = this;
        rcj.c = rbq;
        this.f = layoutInflater.inflate(R.layout.filter_and_sort_filter_view, viewGroup, false);
        this.b = (EditText) this.f.findViewById(R.id.edit_text_filter);
        this.b.setHint(rbq.d());
        this.b.addTextChangedListener(this.i);
        this.b.setOnClickListener(new $$Lambda$rcg$DKReaNf2FO4IM6R0QjY3n7qGNys(this));
        this.h = (ImageButton) this.f.findViewById(R.id.edit_text_left_button);
        this.h.setImageDrawable(a(SpotifyIconV2.ARROW_LEFT, 24));
        this.h.setOnClickListener(new $$Lambda$rcg$rNKd1d4OL5fohjdral5kiiEuVY(this));
        this.g = (ImageButton) this.f.findViewById(R.id.button_clear);
        this.g.setImageDrawable(a(SpotifyIconV2.X, 16));
        this.g.setOnClickListener(new $$Lambda$rcg$d9gI5gQTG9aXGOzghYDjmyRzg(this));
        View view = new View(this.c);
        view.setLayoutParams(new LayoutParams(-1, -1));
        viewGroup2.addView(view);
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && rcg.this.b.isFocused()) {
                    Rect rect = new Rect();
                    rcg.this.b.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        rcg.this.f();
                    }
                }
                return false;
            }
        });
        return this.f;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.f();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.a.e();
    }

    public final void b(SortOption sortOption) {
        this.a.a(sortOption);
    }

    public final void b(String str) {
        this.b.setText(str);
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
        this.a.b();
    }

    public final void a(rbq rbq, SortOption sortOption) {
        rbw a2 = rbw.a(rbq, sortOption);
        a2.T = new a() {
            public /* synthetic */ void a(b bVar, int i) {
                CC.$default$a(this, bVar, i);
            }

            public final void a(SortOption sortOption, int i) {
                rcg.this.a.a(sortOption, i);
            }

            public final void a() {
                rcg.this.a.c();
            }
        };
        a2.a(this.d, a2.z);
    }

    public final void a(SortOption sortOption) {
        this.e.a(new SortOption(sortOption));
    }

    public final void a(String str) {
        this.e.a(str);
    }

    public final void a(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }

    public final void a() {
        this.b.setText("");
    }

    public final void b() {
        a();
        this.e.a();
        f();
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        this.b.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.c.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.b.getWindowToken(), 0);
        }
    }

    private SpotifyIconDrawable a(SpotifyIconV2 spotifyIconV2, int i2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.c, spotifyIconV2, (float) uts.b((float) i2, this.c.getResources()));
        spotifyIconDrawable.a(fr.c(this.c, R.color.white));
        return spotifyIconDrawable;
    }
}
