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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: rce reason: default package */
public final class rce implements rcd, rcl {
    final rcj a;
    EditText b;
    private final Context c;
    private final kf d;
    private Button e;
    private a f;
    private View g;
    private ImageButton h;
    private final jxg i = new jxg() {
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            rce.this.a.a(charSequence.toString());
        }
    };

    public /* synthetic */ void a(b bVar) {
        CC.$default$a(this, bVar);
    }

    public rce(Context context, kf kfVar, rcj rcj) {
        this.c = context;
        this.d = kfVar;
        this.a = rcj;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, rbq rbq, a aVar) {
        this.f = aVar;
        rcj rcj = this.a;
        rcj.b = this;
        rcj.c = rbq;
        View inflate = layoutInflater.inflate(R.layout.filter_and_sort_buttons_view, viewGroup, false);
        this.e = (Button) inflate.findViewById(R.id.button_sort);
        this.e.setOnClickListener(new $$Lambda$rce$xLKW5rW1yh0lxXC1MaX92v3Lrc(this));
        ((Button) inflate.findViewById(R.id.button_filter)).setOnClickListener(new $$Lambda$rce$4c_U9qvmILetGtHDVFN2c39QDA4(this));
        this.g = layoutInflater.inflate(R.layout.filter_and_sort_filter_view, viewGroup, false);
        this.b = (EditText) this.g.findViewById(R.id.edit_text_filter);
        this.b.setHint(rbq.d());
        this.b.addTextChangedListener(this.i);
        this.b.setOnClickListener(new $$Lambda$rce$cid_D_Yp1po60162sXA1VCjMo(this));
        ImageButton imageButton = (ImageButton) this.g.findViewById(R.id.edit_text_left_button);
        imageButton.setImageDrawable(a(SpotifyIconV2.ARROW_LEFT, 24));
        imageButton.setOnClickListener(new $$Lambda$rce$RYDONcm7l0oe4qHdi1BywIui3PI(this));
        this.h = (ImageButton) this.g.findViewById(R.id.button_clear);
        this.h.setImageDrawable(a(SpotifyIconV2.X, 16));
        this.h.setOnClickListener(new $$Lambda$rce$9hwUuSgdGibjwB6O0sYfkC2RDGY(this));
        View view = new View(this.c);
        view.setLayoutParams(new LayoutParams(-1, -1));
        viewGroup.addView(view);
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && rce.this.b.isFocused()) {
                    Rect rect = new Rect();
                    rce.this.b.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        rce.this.f();
                    }
                }
                return false;
            }
        });
        return inflate;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        this.a.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f.a();
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

    public final View c() {
        return this.g;
    }

    public final void b(SortOption sortOption) {
        this.a.a(sortOption);
    }

    public final void b(String str) {
        this.b.setText(str);
    }

    public final void d() {
        this.a.d();
        this.b.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.c.getSystemService("input_method");
        if (inputMethodManager != null && !inputMethodManager.showSoftInput(this.b, 1)) {
            inputMethodManager.toggleSoftInput(2, 0);
        }
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
                rce.this.a.a(sortOption, i);
            }

            public final void a() {
                rce.this.a.c();
            }
        };
        a2.a(this.d, a2.z);
    }

    public final void a(SortOption sortOption) {
        this.f.a(new SortOption(sortOption));
    }

    public final void a(String str) {
        this.f.a(str);
    }

    public final void a(boolean z) {
        this.h.setVisibility(z ? 0 : 8);
    }

    public final void a() {
        this.b.setText("");
    }

    public final void b() {
        a();
        this.f.b();
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
