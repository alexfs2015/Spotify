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

/* renamed from: rkr reason: default package */
public final class rkr implements rkq, rlj {
    final rlh a;
    EditText b;
    private final Context c;
    private final kk d;
    private final Drawable e;
    private final boolean f;
    private a g;
    private View h;
    private Button i;
    private ImageButton j;
    private boolean k;
    private final jzg l = new jzg() {
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            rkr.this.a.a(charSequence.toString());
        }
    };

    public rkr(Context context, kk kkVar, rlh rlh, boolean z) {
        this.c = context;
        this.d = kkVar;
        this.a = rlh;
        this.e = this.c.getResources().getDrawable(z ? R.drawable.translucent_find_and_filter_background : R.drawable.find_and_filter_background);
        this.f = z;
    }

    private SpotifyIconDrawable a(SpotifyIconV2 spotifyIconV2, int i2, int i3) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(this.c, spotifyIconV2, (float) vfj.b(16.0f, this.c.getResources()));
        spotifyIconDrawable.a(fr.c(this.c, i3));
        return spotifyIconDrawable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.a.e();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, boolean z) {
        this.g.a(z);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.k) {
            this.g.a();
            this.a.f();
            return;
        }
        this.a.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.a.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewGroup viewGroup2, rkm rkm, a aVar) {
        this.g = aVar;
        rlh rlh = this.a;
        rlh.b = this;
        rlh.c = rkm;
        this.h = layoutInflater.inflate(this.f ? R.layout.translucent_filter_and_sort_view : R.layout.new_filter_and_sort_view, viewGroup, false);
        this.b = (EditText) this.h.findViewById(R.id.edit_text_filter);
        this.b.setHint(rkm.d());
        this.b.addTextChangedListener(this.l);
        this.b.setOnClickListener(new $$Lambda$rkr$EjPPPzfk8DFQfjRgKS6eiUU_wDY(this));
        this.b.setOnFocusChangeListener(new $$Lambda$rkr$0NDQUzqlgit9nWyu3FfOSTD1g0(this));
        ((ImageView) this.h.findViewById(R.id.edit_text_search_icon)).setImageDrawable(a(SpotifyIconV2.SEARCH, 16, R.color.white_70));
        this.i = (Button) this.h.findViewById(R.id.button_sort);
        this.i.setOnClickListener(new $$Lambda$rkr$q63Iw5WpI9502XD1KfihNOgxQwM(this));
        this.j = (ImageButton) this.h.findViewById(R.id.button_clear);
        this.j.setImageDrawable(a(SpotifyIconV2.X, 16, R.color.white));
        this.j.setOnClickListener(new $$Lambda$rkr$QjgBMcV0R2HI3NarnhtpXqngyGQ(this));
        View view = new View(this.c);
        view.setLayoutParams(new LayoutParams(-1, -1));
        viewGroup2.addView(view);
        view.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && rkr.this.b.isFocused()) {
                    Rect rect = new Rect();
                    rkr.this.b.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                        rkr.this.f();
                    }
                }
                return false;
            }
        });
        return this.h;
    }

    public final void a() {
        this.b.setText("");
    }

    public final void a(SortOption sortOption) {
        this.g.a(new SortOption(sortOption));
    }

    public final void a(String str) {
        this.g.a(str);
    }

    public final void a(b bVar) {
        this.g.a(bVar);
    }

    public final void a(rkm rkm) {
        this.a.c = rkm;
    }

    public final void a(rkm rkm, SortOption sortOption) {
        rku a2 = rku.a(rkm, sortOption);
        a2.T = new a() {
            public final void a() {
                rkr.this.a.c();
            }

            public final void a(SortOption sortOption, int i) {
                rkr.this.a.a(sortOption, i);
            }

            public final void a(b bVar, int i) {
                rlh rlh = rkr.this.a;
                boolean z = !bVar.f();
                rlh.a.a(bVar.a(), i, z);
                rlh.b.a(bVar.g().a(z).a());
            }
        };
        a2.a(this.d, a2.z);
    }

    public final void a(boolean z) {
        this.j.setVisibility(z ? 0 : 8);
    }

    public final void b() {
        a();
        this.g.a();
        f();
    }

    public final void b(SortOption sortOption) {
        this.a.a(sortOption);
    }

    public final void b(String str) {
        if (!str.equals(this.b.getText().toString())) {
            this.b.setText(str);
        }
    }

    public final void b(boolean z) {
        this.k = z;
        if (z) {
            this.i.setBackground(null);
            this.i.setText(R.string.cancel_text_filter_button);
            return;
        }
        this.i.setBackground(this.e);
        this.i.setText(R.string.filter_button);
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

    /* access modifiers changed from: 0000 */
    public void f() {
        this.b.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.c.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.b.getWindowToken(), 0);
        }
    }
}
