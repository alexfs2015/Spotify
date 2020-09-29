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

/* renamed from: rle reason: default package */
public final class rle implements rkq, rlj {
    final rlh a;
    EditText b;
    private final Context c;
    private final kk d;
    private a e;
    private View f;
    private ImageButton g;
    private ImageButton h;
    private final jzg i = new jzg() {
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            rle.this.a.a(charSequence.toString());
        }
    };

    public rle(Context context, kk kkVar, rlh rlh) {
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

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewGroup viewGroup2, rkm rkm, a aVar) {
        this.e = aVar;
        rlh rlh = this.a;
        rlh.b = this;
        rlh.c = rkm;
        this.f = layoutInflater.inflate(R.layout.filter_and_sort_filter_view, viewGroup, false);
        this.b = (EditText) this.f.findViewById(R.id.edit_text_filter);
        this.b.setHint(rkm.d());
        this.b.addTextChangedListener(this.i);
        this.b.setOnClickListener(new $$Lambda$rle$dnTuS6OqXFQCTrwi8ejRVOkpg(this));
        this.h = (ImageButton) this.f.findViewById(R.id.edit_text_left_button);
        this.h.setImageDrawable(a(SpotifyIconV2.ARROW_LEFT, 24));
        this.h.setOnClickListener(new $$Lambda$rle$3PBtUQSyii1tw3nmSRys2M8zi8(this));
        this.g = (ImageButton) this.f.findViewById(R.id.button_clear);
        this.g.setImageDrawable(a(SpotifyIconV2.X, 16));
        this.g.setOnClickListener(new $$Lambda$rle$lLGmkn_MpOfQ3MYyU6S75JdoC4(this));
        View view = new View(this.c);
        view.setLayoutParams(new LayoutParams(-1, -1));
        viewGroup2.addView(view);
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && rle.this.b.isFocused()) {
                    Rect rect = new Rect();
                    rle.this.b.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        rle.this.f();
                    }
                }
                return false;
            }
        });
        return this.f;
    }

    public final void a() {
        this.b.setText("");
    }

    public final void a(SortOption sortOption) {
        this.e.a(new SortOption(sortOption));
    }

    public final void a(String str) {
        this.e.a(str);
    }

    public /* synthetic */ void a(b bVar) {
        CC.$default$a(this, bVar);
    }

    public /* synthetic */ void a(rkm rkm) {
        CC.$default$a(this, rkm);
    }

    public final void a(rkm rkm, SortOption sortOption) {
        rku a2 = rku.a(rkm, sortOption);
        a2.T = new a() {
            public final void a() {
                rle.this.a.c();
            }

            public final void a(SortOption sortOption, int i) {
                rle.this.a.a(sortOption, i);
            }

            public /* synthetic */ void a(b bVar, int i) {
                CC.$default$a(this, bVar, i);
            }
        };
        a2.a(this.d, a2.z);
    }

    public final void a(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }

    public final void b() {
        a();
        this.e.a();
        f();
    }

    public final void b(SortOption sortOption) {
        this.a.a(sortOption);
    }

    public final void b(String str) {
        this.b.setText(str);
    }

    public /* synthetic */ void b(boolean z) {
        CC.$default$b(this, z);
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

    /* access modifiers changed from: 0000 */
    public void f() {
        this.b.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.c.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.b.getWindowToken(), 0);
        }
    }
}
