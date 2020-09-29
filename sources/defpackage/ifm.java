package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.music.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: ifm reason: default package */
public final class ifm extends LinearLayout implements ifl {
    public a a;
    public Picasso b;
    private TextView c;
    /* access modifiers changed from: private */
    public ImageView d;
    private final vsr e = new vsr() {
        public final void b(Drawable drawable) {
        }

        public final void a(Bitmap bitmap, LoadedFrom loadedFrom) {
            fay.a(!bitmap.isRecycled());
            ifm.this.d.setAlpha(0.0f);
            ifm.this.d.setImageBitmap(bitmap);
            ifm.this.d.animate().setDuration(350).alpha(1.0f);
            if (ifm.this.a != null) {
                ifm.this.a.a();
            }
            fay.a(!bitmap.isRecycled());
        }

        public final void a(Drawable drawable) {
            ifm.this.d.setVisibility(8);
            if (ifm.this.a != null) {
                ifm.this.a.a("Failed to load logo");
            }
        }
    };

    public ifm(Context context) {
        super(context);
        setOrientation(1);
        setGravity(1);
        LayoutInflater.from(context).inflate(R.layout.sponsored_header_section, this, true);
        this.c = (TextView) findViewById(R.id.sponsored_title);
        this.d = (ImageView) findViewById(R.id.sponsored_logo);
        this.d.setOnClickListener(new $$Lambda$ifm$HutK2aUK6pxJAhEcQOdWg3k7lj8(this, context));
        uuu.b(context, this.c, R.attr.pasteTextAppearanceMetadata);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, View view) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(context);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.a;
        if (aVar != null) {
            aVar.a((ifl) this);
        }
    }

    public final void a() {
        ((Activity) getContext()).runOnUiThread(new $$Lambda$ifm$6vK2Z1ytkPd6kpsUC0uBXqIU(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.c.setVisibility(8);
        this.d.setVisibility(8);
    }

    public final void a(String str) {
        ((Activity) getContext()).runOnUiThread(new $$Lambda$ifm$rXN793liftmL45bvyQDdXbQNIk(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str) {
        this.c.setText(String.format(getResources().getString(R.string.ads_title_sponsored_playlist), new Object[]{str}));
        this.c.setVisibility(0);
    }

    public final void b(String str) {
        ((Activity) getContext()).runOnUiThread(new $$Lambda$ifm$_34LJldISMrOE7HQFb4QB1I9Oo(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        Picasso picasso = this.b;
        if (picasso != null) {
            picasso.a(str).a((int) R.dimen.widget_cover_size, (int) R.dimen.device_volume_bar_height).e().g().a().a(this.e);
            this.d.setVisibility(0);
        }
    }
}
