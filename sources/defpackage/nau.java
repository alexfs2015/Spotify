package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.android.glue.patterns.header.GlueHeaderLayout;
import com.spotify.android.glue.patterns.header.behavior.GlueNoHeaderBehavior;
import com.spotify.android.glue.patterns.header.behavior.HeaderBehavior;
import com.spotify.android.glue.patterns.header.headers.GlueNoHeaderView;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.music.R;

/* renamed from: nau reason: default package */
public final class nau extends gwh {
    private final RecyclerView a;
    private final RecyclerView b;
    private final FrameLayout c;
    private final GlueHeaderLayout d;

    public nau(Context context, gwm gwm, Fragment fragment, rok rok) {
        boolean a2 = ToolbarConfig.a((Context) fbp.a(context), fragment);
        this.a = a(context);
        this.a.setId(R.id.free_tier_album_glue_header_layout_recycler);
        this.a.a((i) gxu.b(context, gwm));
        this.b = b(context);
        this.b.setId(R.id.free_tier_album_hub_glue_header_layout_overlays);
        this.c = new FrameLayout(context);
        this.c.setId(R.id.free_tier_album_hub_glue_header_layout_container);
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        if (a2) {
            layoutParams.topMargin = gav.b(context);
        }
        this.c.addView(this.b, layoutParams);
        RecyclerView recyclerView = this.a;
        GlueHeaderLayout glueHeaderLayout = new GlueHeaderLayout(context);
        glueHeaderLayout.e((View) recyclerView);
        glueHeaderLayout.a(new GlueNoHeaderView((Context) fbp.a(context)), (HeaderBehavior<T>) new GlueNoHeaderBehavior<T>());
        glueHeaderLayout.a(a2);
        glueHeaderLayout.e = ftc.a(context);
        this.d = glueHeaderLayout;
        this.c.addView(this.d, -1, -1);
        if (rok != null) {
            rok.c = true;
            rok.a(this.a);
        }
    }

    public final void a(hcs hcs) {
        fbp.a(hcs);
        a(this.b, !hcs.overlays().isEmpty());
        String title = hcs.title();
        if (title != null) {
            this.d.a((CharSequence) title);
        }
    }

    public final RecyclerView c() {
        return this.a;
    }

    public final RecyclerView d() {
        return this.b;
    }

    public final View e() {
        return this.c;
    }
}
