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

/* renamed from: rlc reason: default package */
public final class rlc implements rlb, rlj {
    final rlh a;
    EditText b;
    private final Context c;
    private final kk d;
    private Button e;
    private a f;
    private View g;
    private ImageButton h;
    private final jzg i = new jzg() {
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            rlc.this.a.a(charSequence.toString());
        }
    };

    public rlc(Context context, kk kkVar, rlh rlh) {
        this.c = context;
        this.d = kkVar;
        this.a = rlh;
    }

    private SpotifyIconDrawable a(SpotifyIconV2 spotifyIconV2, int i2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.c, spotifyIconV2, (float) vfj.b((float) i2, this.c.getResources()));
        spotifyIconDrawable.a(fr.c(this.c, R.color.white));
        return spotifyIconDrawable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.a.e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.a.f();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        this.a.a();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, rkm rkm, a aVar) {
        this.f = aVar;
        rlh rlh = this.a;
        rlh.b = this;
        rlh.c = rkm;
        View inflate = layoutInflater.inflate(R.layout.filter_and_sort_buttons_view, viewGroup, false);
        this.e = (Button) inflate.findViewById(R.id.button_sort);
        this.e.setOnClickListener(new $$Lambda$rlc$rEzWVKNU1CKeEKdUFC8f6Skaw(this));
        ((Button) inflate.findViewById(R.id.button_filter)).setOnClickListener(new $$Lambda$rlc$XjGEtFI2OLEdXI4hdKUNu1S3WU(this));
        this.g = layoutInflater.inflate(R.layout.filter_and_sort_filter_view, viewGroup, false);
        this.b = (EditText) this.g.findViewById(R.id.edit_text_filter);
        this.b.setHint(rkm.d());
        this.b.addTextChangedListener(this.i);
        this.b.setOnClickListener(new $$Lambda$rlc$2_5T9TR9_8OhmCUpKPKmBW37HVA(this));
        ImageButton imageButton = (ImageButton) this.g.findViewById(R.id.edit_text_left_button);
        imageButton.setImageDrawable(a(SpotifyIconV2.ARROW_LEFT, 24));
        imageButton.setOnClickListener(new $$Lambda$rlc$Okbgw6LLWBTKJAbP6oMaFpWst0E(this));
        this.h = (ImageButton) this.g.findViewById(R.id.button_clear);
        this.h.setImageDrawable(a(SpotifyIconV2.X, 16));
        this.h.setOnClickListener(new $$Lambda$rlc$LmBHRp88UXckPaBnXX1hQ9RQpwA(this));
        View view = new View(this.c);
        view.setLayoutParams(new LayoutParams(-1, -1));
        viewGroup.addView(view);
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && rlc.this.b.isFocused()) {
                    Rect rect = new Rect();
                    rlc.this.b.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        rlc.this.f();
                    }
                }
                return false;
            }
        });
        return inflate;
    }

    public final void a() {
        this.b.setText("");
    }

    public final void a(SortOption sortOption) {
        this.f.a(new SortOption(sortOption));
    }

    public final void a(String str) {
        this.f.a(str);
    }

    public /* synthetic */ void a(b bVar) {
        CC.$default$a(this, bVar);
    }

    public final void a(rkm rkm, SortOption sortOption) {
        rku a2 = rku.a(rkm, sortOption);
        a2.T = new a() {
            public final void a() {
                rlc.this.a.c();
            }

            public final void a(SortOption sortOption, int i) {
                rlc.this.a.a(sortOption, i);
            }

            public /* synthetic */ void a(b bVar, int i) {
                CC.$default$a(this, bVar, i);
            }
        };
        a2.a(this.d, a2.z);
    }

    public final void a(boolean z) {
        this.h.setVisibility(z ? 0 : 8);
    }

    public final void b() {
        a();
        this.f.b();
        f();
    }

    public final void b(SortOption sortOption) {
        this.a.a(sortOption);
    }

    public final void b(String str) {
        this.b.setText(str);
    }

    public final View c() {
        return this.g;
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

    /* access modifiers changed from: 0000 */
    public void f() {
        this.b.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.c.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.b.getWindowToken(), 0);
        }
    }
}
