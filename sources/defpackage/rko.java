package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: rko reason: default package */
public final class rko implements rlj {
    final rlh a;
    private final Context b;
    private final kk c;
    private final jzg d = new jzg() {
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            rko.this.a.a(charSequence.toString());
        }
    };
    private final OnFocusChangeListener e = new OnFocusChangeListener() {
        public final void onFocusChange(View view, boolean z) {
            ImageButton imageButton = null;
            if (z) {
                imageButton.setImageDrawable(rko.a(rko.this, SpotifyIconV2.ARROW_LEFT));
            } else {
                imageButton.setImageDrawable(rko.a(rko.this, SpotifyIconV2.SEARCH));
            }
        }
    };

    public rko(Context context, kk kkVar, rlh rlh) {
        this.b = context;
        this.c = kkVar;
        this.a = rlh;
    }

    static /* synthetic */ SpotifyIconDrawable a(rko rko, SpotifyIconV2 spotifyIconV2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(rko.b, spotifyIconV2, (float) vfj.b(16.0f, rko.b.getResources()));
        spotifyIconDrawable.a(fr.c(rko.b, R.color.gray_70));
        return spotifyIconDrawable;
    }

    public final void a() {
        EditText editText = null;
        editText.setText("");
    }

    public final void a(SortOption sortOption) {
        new SortOption(sortOption);
    }

    public final void a(String str) {
    }

    public /* synthetic */ void a(b bVar) {
        CC.$default$a(this, bVar);
    }

    public final void a(rkm rkm, SortOption sortOption) {
        rku a2 = rku.a(rkm, sortOption);
        a2.T = new a() {
            public final void a() {
                rko.this.a.c();
            }

            public final void a(SortOption sortOption, int i) {
                rko.this.a.a(sortOption, i);
            }

            public /* synthetic */ void a(b bVar, int i) {
                CC.$default$a(this, bVar, i);
            }
        };
        a2.a(this.c, a2.z);
    }

    public final void a(boolean z) {
        ImageButton imageButton = null;
        imageButton.setVisibility(z ? 0 : 8);
    }

    public final void b() {
        EditText editText = null;
        editText.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }
}
