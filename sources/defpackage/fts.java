package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.spotify.android.glue.patterns.contextmenu.glue.view.CheckableTextView;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel.HeaderViewType;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel.ItemAppearance;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: fts reason: default package */
public final class fts implements ftq {
    final fto a;
    private final Context b;
    private final LayoutParams c = new LayoutParams(-2, -2);
    private final ftu d;
    private ContextMenuViewModel e;

    public fts(Context context, fto fto, ftu ftu) {
        this.b = context;
        this.a = fto;
        this.d = ftu;
    }

    public final void a(ContextMenuViewModel contextMenuViewModel) {
        this.e = contextMenuViewModel;
        ftu ftu = this.d;
        ContextMenuViewModel contextMenuViewModel2 = this.e;
        ftu.e.setText(contextMenuViewModel2.c.a);
        int i = 8;
        if (TextUtils.isEmpty(contextMenuViewModel2.d) && TextUtils.isEmpty(contextMenuViewModel2.c.b)) {
            ftu.f.setVisibility(8);
        } else if (TextUtils.isEmpty(contextMenuViewModel2.d)) {
            uuu.b(ftu.a, ftu.f, R.attr.pasteTextAppearanceBodySmall);
            ftu.f.setTextColor(fr.c(ftu.a, R.color.white_70));
            ftu.f.setAllCaps(false);
            ftu.f.setText(contextMenuViewModel2.c.b);
            ftu.f.setVisibility(0);
        } else {
            uuu.b(ftu.a, ftu.f, R.attr.pasteTextAppearanceMetadata);
            ftu.f.setAllCaps(true);
            ftu.f.setTextColor(fr.c(ftu.a, R.color.white_70));
            ftu.f.setText(contextMenuViewModel2.d);
            ftu.f.setVisibility(0);
        }
        ViewGroup.LayoutParams layoutParams = ftu.d.getLayoutParams();
        if (contextMenuViewModel2.e == HeaderViewType.LARGE_IMAGE) {
            layoutParams.width = MeasureSpec.makeMeasureSpec(ftu.a.getResources().getDimensionPixelSize(R.dimen.context_menu_header_large_image_width), Integer.MIN_VALUE);
            layoutParams.height = MeasureSpec.makeMeasureSpec(ftu.a.getResources().getDimensionPixelSize(R.dimen.context_menu_header_large_image_height), 1073741824);
            ftu.d.setAdjustViewBounds(true);
        } else {
            if (contextMenuViewModel2.e == HeaderViewType.TWO_LINE_LANDSCAPE_IMAGE) {
                layoutParams.width = (int) ((((float) layoutParams.height) * 16.0f) / 9.0f);
            } else {
                layoutParams.width = layoutParams.height;
            }
        }
        ftu.d.setLayoutParams(layoutParams);
        ImageView imageView = ftu.d;
        Uri uri = contextMenuViewModel2.c.e;
        boolean z = contextMenuViewModel2.c.g;
        SpotifyIconV2 spotifyIconV2 = contextMenuViewModel2.c.f;
        Drawable drawable = null;
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            uri = null;
        }
        if (spotifyIconV2 != null) {
            drawable = fzg.a(ftu.a, spotifyIconV2, Float.NaN, false, false, (float) uts.b(32.0f, ftu.a.getResources()));
        }
        vsl a2 = ftu.b.a(uri);
        a2.a(drawable);
        if (drawable != null) {
            a2.b(drawable);
        }
        if (z) {
            a2.a(uvt.a(imageView));
        } else {
            a2.a(imageView);
        }
        ftu.g.setVisibility(TextUtils.isEmpty(contextMenuViewModel2.c.d) ? 8 : 0);
        ftu.g.setText(contextMenuViewModel2.c.d);
        if (!TextUtils.isEmpty(contextMenuViewModel2.c.c)) {
            fze.c(ftu.g);
            fze.a(ftu.c);
        }
        TextView textView = ftu.h;
        if (!TextUtils.isEmpty(contextMenuViewModel2.c.c)) {
            i = 0;
        }
        textView.setVisibility(i);
        ftu.h.setText(contextMenuViewModel2.c.c);
        ftu.c();
    }

    public final int a() {
        return this.e.b.size();
    }

    public final ftv b() {
        return this.d;
    }

    public final int c() {
        return this.b.getResources().getInteger(this.e.i.mVisibleItemsRes);
    }

    public final View a(int i, ViewGroup viewGroup) {
        ItemAppearance itemAppearance = this.e.i;
        boolean z = this.e.g || itemAppearance.mAlwaysShowIcons;
        this.c.gravity = itemAppearance.mGravity;
        final fug fug = (fug) this.e.b.get(i);
        if (!fug.i()) {
            final CheckableTextView checkableTextView = (CheckableTextView) LayoutInflater.from(this.b).inflate(itemAppearance.mLayoutRes, viewGroup, false);
            checkableTextView.setActivated(fug.a());
            uui.d(checkableTextView).a(checkableTextView).a();
            checkableTextView.setText(fug.b());
            checkableTextView.setLayoutParams(this.c);
            checkableTextView.setChecked(fug.e());
            Drawable drawable = (Drawable) fug.c().d();
            if (!z) {
                drawable = null;
            }
            jm.b(checkableTextView, drawable, null, null, null);
            checkableTextView.setEnabled(fug.d());
            checkableTextView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    fug.g();
                    if (fug.f()) {
                        fts.this.a.a();
                        return;
                    }
                    fug fug = fug;
                    fug.c(!fug.e());
                    checkableTextView.setChecked(fug.e());
                }
            });
            return checkableTextView;
        }
        View view = new View(this.b);
        LayoutParams layoutParams = new LayoutParams(-1, this.b.getResources().getDimensionPixelSize(R.dimen.solar_context_menu_divider_height));
        layoutParams.topMargin = this.b.getResources().getDimensionPixelSize(R.dimen.solar_context_menu_divider_padding_top);
        layoutParams.bottomMargin = this.b.getResources().getDimensionPixelSize(R.dimen.solar_context_menu_divider_padding_bottom);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(fr.c(this.b, R.color.gray_15));
        return view;
    }
}
