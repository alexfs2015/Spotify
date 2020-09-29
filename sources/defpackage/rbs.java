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

/* renamed from: rbs reason: default package */
public final class rbs implements rcl {
    final rcj a;
    private final Context b;
    private final kf c;
    private final jxg d = new jxg() {
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            rbs.this.a.a(charSequence.toString());
        }
    };
    private final OnFocusChangeListener e = new OnFocusChangeListener() {
        public final void onFocusChange(View view, boolean z) {
            ImageButton imageButton = null;
            if (z) {
                imageButton.setImageDrawable(rbs.a(rbs.this, SpotifyIconV2.ARROW_LEFT));
            } else {
                imageButton.setImageDrawable(rbs.a(rbs.this, SpotifyIconV2.SEARCH));
            }
        }
    };

    public final void a(String str) {
    }

    public /* synthetic */ void a(b bVar) {
        CC.$default$a(this, bVar);
    }

    public rbs(Context context, kf kfVar, rcj rcj) {
        this.b = context;
        this.c = kfVar;
        this.a = rcj;
    }

    public final void a(rbq rbq, SortOption sortOption) {
        rbw a2 = rbw.a(rbq, sortOption);
        a2.T = new a() {
            public /* synthetic */ void a(b bVar, int i) {
                CC.$default$a(this, bVar, i);
            }

            public final void a(SortOption sortOption, int i) {
                rbs.this.a.a(sortOption, i);
            }

            public final void a() {
                rbs.this.a.c();
            }
        };
        a2.a(this.c, a2.z);
    }

    public final void a(SortOption sortOption) {
        new SortOption(sortOption);
    }

    public final void a(boolean z) {
        ImageButton imageButton = null;
        imageButton.setVisibility(z ? 0 : 8);
    }

    public final void a() {
        EditText editText = null;
        editText.setText("");
    }

    public final void b() {
        EditText editText = null;
        editText.clearFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.b.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    static /* synthetic */ SpotifyIconDrawable a(rbs rbs, SpotifyIconV2 spotifyIconV2) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(rbs.b, spotifyIconV2, (float) uts.b(16.0f, rbs.b.getResources()));
        spotifyIconDrawable.a(fr.c(rbs.b, R.color.gray_70));
        return spotifyIconDrawable;
    }
}
