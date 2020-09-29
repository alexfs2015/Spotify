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

/* renamed from: mss reason: default package */
public final class mss implements fxe, fxh {
    public final EditText a = ((EditText) fbp.a(this.j.findViewById(R.id.title_edit_text)));
    public final TextView b = ((TextView) fbp.a(this.j.findViewById(R.id.title_text)));
    public final View c = ((View) fbp.a(this.j.findViewById(R.id.description_container)));
    public final ImageView d = ((ImageView) fbp.a(this.j.findViewById(R.id.cover_art_image)));
    public final EditText e = ((EditText) fbp.a(this.j.findViewById(R.id.description_edit_text)));
    public final TextView f = ((TextView) fbp.a(this.j.findViewById(R.id.description_text)));
    public final Button g = ((Button) fbp.a(this.j.findViewById(R.id.add_description_button)));
    public final TextView h = ((TextView) fbp.a(this.j.findViewById(R.id.character_count_text)));
    public final ImageView i = ((ImageView) fbp.a(this.j.findViewById(R.id.camera_image)));
    private final View j;

    public mss(Context context, ViewGroup viewGroup) {
        this.j = LayoutInflater.from(context).inflate(R.layout.edit_playlist_header, viewGroup, false);
        this.a.setFilters(new InputFilter[]{new LengthFilter(100)});
        wzj.a(this.a, null, 0).a(14.0f);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.CAMERA, (float) context.getResources().getDimensionPixelSize(R.dimen.edit_playlist_header_camera_drawable_size));
        spotifyIconDrawable.a(fr.c(context, R.color.white));
        this.i.setImageDrawable(spotifyIconDrawable);
        this.a.clearFocus();
        this.e.clearFocus();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.a.isFocused()) {
            Rect rect = new Rect();
            this.a.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.a.clearFocus();
                ((InputMethodManager) fbp.a((InputMethodManager) getView().getContext().getSystemService("input_method"))).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
                this.a.clearFocus();
            }
        }
        return false;
    }

    public final View a() {
        View view = new View(getView().getContext());
        view.setLayoutParams(new LayoutParams(-1, -1));
        view.setOnTouchListener(new $$Lambda$mss$o3uhcNu95sqXZrbB3eFDRFHzcuU(this));
        return view;
    }

    public final void a(int i2, float f2) {
        this.j.setTranslationY((float) i2);
    }

    public final View getView() {
        return this.j;
    }
}
