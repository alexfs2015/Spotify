package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: mnz reason: default package */
public final class mnz implements fwk, fwn {
    public final EditText a = ((EditText) fay.a(this.j.findViewById(R.id.title_edit_text)));
    public final TextView b = ((TextView) fay.a(this.j.findViewById(R.id.title_text)));
    public final View c = ((View) fay.a(this.j.findViewById(R.id.description_container)));
    public final ImageView d = ((ImageView) fay.a(this.j.findViewById(R.id.cover_art_image)));
    public final EditText e = ((EditText) fay.a(this.j.findViewById(R.id.description_edit_text)));
    public final TextView f = ((TextView) fay.a(this.j.findViewById(R.id.description_text)));
    public final Button g = ((Button) fay.a(this.j.findViewById(R.id.add_description_button)));
    public final TextView h = ((TextView) fay.a(this.j.findViewById(R.id.character_count_text)));
    public final ImageView i = ((ImageView) fay.a(this.j.findViewById(R.id.camera_image)));
    private final View j;

    public mnz(Context context, ViewGroup viewGroup) {
        this.j = LayoutInflater.from(context).inflate(R.layout.edit_playlist_header, viewGroup, false);
        this.a.setFilters(new InputFilter[]{new LengthFilter(100)});
        wld.a(this.a, null, 0).a(14.0f);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CAMERA, (float) context.getResources().getDimensionPixelSize(R.dimen.edit_playlist_header_camera_drawable_size));
        spotifyIconDrawable.a(fr.c(context, R.color.white));
        this.i.setImageDrawable(spotifyIconDrawable);
        this.a.clearFocus();
        this.e.clearFocus();
    }

    public final void a(int i2, float f2) {
        this.j.setTranslationY((float) i2);
    }

    public final View a() {
        View view = new View(getView().getContext());
        view.setLayoutParams(new LayoutParams(-1, -1));
        view.setOnTouchListener(new $$Lambda$mnz$_RnIdbDt41mND5J252uCPScR6k8(this));
        return view;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.a.isFocused()) {
            Rect rect = new Rect();
            this.a.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.a.clearFocus();
                ((InputMethodManager) fay.a((InputMethodManager) getView().getContext().getSystemService("input_method"))).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
                this.a.clearFocus();
            }
        }
        return false;
    }

    public final View getView() {
        return this.j;
    }
}
