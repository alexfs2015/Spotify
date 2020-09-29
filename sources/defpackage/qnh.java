package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.components.toolbar.ToolbarSide;
import com.spotify.android.glue.internal.StateListAnimatorImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.view.LoadingView;
import com.spotify.music.features.trackcredits.adapter.TrackCreditsAdapter;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import java.util.Collection;
import java.util.List;

/* renamed from: qnh reason: default package */
public final class qnh implements qng {
    private final View a;
    private final fse b;
    private final RecyclerView c = ((RecyclerView) this.a.findViewById(R.id.track_credits_recycler_view));
    private final TrackCreditsAdapter d;
    private final LoadingView e;
    private final View f;

    public qnh(LayoutInflater layoutInflater, a aVar) {
        this.a = layoutInflater.inflate(R.layout.activity_track_credits, null);
        Context context = this.a.getContext();
        FrameLayout frameLayout = (FrameLayout) this.a.findViewById(R.id.toolbar_container);
        this.b = fsi.a(context, frameLayout);
        this.b.b(fr.c(context, R.color.cat_grayscale_15));
        gaa.a(context);
        gab.a(this.b.getView(), context);
        frameLayout.addView(this.b.getView());
        StateListAnimatorImageButton stateListAnimatorImageButton = new StateListAnimatorImageButton(context);
        ip.a((View) stateListAnimatorImageButton, (Drawable) null);
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, SpotifyIconV2.X, (float) context.getResources().getDimensionPixelSize(R.dimen.toolbar_icon_size));
        spotifyIconDrawable.a(fr.c(context, R.color.white));
        stateListAnimatorImageButton.setImageDrawable(spotifyIconDrawable);
        stateListAnimatorImageButton.setContentDescription(context.getString(R.string.generic_content_description_close));
        stateListAnimatorImageButton.setOnClickListener(new $$Lambda$qnh$XZpPCKwEX0WDJHnEnmukyImmE(aVar));
        this.b.a(ToolbarSide.START, stateListAnimatorImageButton, R.id.toolbar_up_button);
        this.c.a((i) new LinearLayoutManager(context));
        this.d = new TrackCreditsAdapter();
        this.c.a((a) this.d);
        this.e = (LoadingView) this.a.findViewById(R.id.track_credits_loading_view);
        fuo b2 = fus.b(context, (ViewGroup) this.a);
        b2.a((int) R.string.error_general_title);
        b2.b((int) R.string.error_general_body);
        b2.c((int) R.string.track_credits_error_try_again_button);
        b2.V_().setOnClickListener(new $$Lambda$qnh$xGquDJZDWC9WQBG6Dmn8OSdFY4Q(aVar));
        this.f = b2.getView();
        this.f.setVisibility(8);
        ((ViewGroup) this.a).addView(this.f);
    }

    public final View a() {
        return this.a;
    }

    public final void a(String str) {
        this.b.a((CharSequence) str);
    }

    public final void a(List<qnj> list) {
        this.c.setVisibility(0);
        TrackCreditsAdapter trackCreditsAdapter = this.d;
        trackCreditsAdapter.a.clear();
        trackCreditsAdapter.a.addAll((Collection) fay.a(list));
        trackCreditsAdapter.e();
    }

    public final void b() {
        this.e.setVisibility(0);
        this.e.c();
        this.e.a();
    }

    public final void c() {
        this.e.setVisibility(8);
        this.e.b();
    }

    public final void d() {
        this.f.setVisibility(0);
    }

    public final void e() {
        this.f.setVisibility(8);
    }

    public final void f() {
        Context context = this.a.getContext();
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }
}
