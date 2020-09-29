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

/* renamed from: fum reason: default package */
public final class fum implements fuk {
    final fui a;
    private final Context b;
    private final LayoutParams c = new LayoutParams(-2, -2);
    private final fuo d;
    private ContextMenuViewModel e;

    public fum(Context context, fui fui, fuo fuo) {
        this.b = context;
        this.a = fui;
        this.d = fuo;
    }

    public final int a() {
        return this.e.b.size();
    }

    public final View a(int i, ViewGroup viewGroup) {
        ItemAppearance itemAppearance = this.e.i;
        boolean z = this.e.g || itemAppearance.mAlwaysShowIcons;
        this.c.gravity = itemAppearance.mGravity;
        final fva fva = (fva) this.e.b.get(i);
        if (!fva.i()) {
            final CheckableTextView checkableTextView = (CheckableTextView) LayoutInflater.from(this.b).inflate(itemAppearance.mLayoutRes, viewGroup, false);
            checkableTextView.setActivated(fva.a());
            vfz.d(checkableTextView).a(checkableTextView).a();
            checkableTextView.setText(fva.b());
            checkableTextView.setLayoutParams(this.c);
            checkableTextView.setChecked(fva.e());
            Drawable drawable = (Drawable) fva.c().d();
            if (!z) {
                drawable = null;
            }
            jm.b(checkableTextView, drawable, null, null, null);
            checkableTextView.setEnabled(fva.d());
            checkableTextView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    fva.g();
                    if (fva.f()) {
                        fum.this.a.a();
                        return;
                    }
                    fva fva = fva;
                    fva.c(!fva.e());
                    checkableTextView.setChecked(fva.e());
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

    public final void a(ContextMenuViewModel contextMenuViewModel) {
        this.e = contextMenuViewModel;
        fuo fuo = this.d;
        ContextMenuViewModel contextMenuViewModel2 = this.e;
        fuo.e.setText(contextMenuViewModel2.c.a);
        int i = 8;
        if (TextUtils.isEmpty(contextMenuViewModel2.d) && TextUtils.isEmpty(contextMenuViewModel2.c.b)) {
            fuo.f.setVisibility(8);
        } else if (TextUtils.isEmpty(contextMenuViewModel2.d)) {
            vgl.b(fuo.a, fuo.f, R.attr.pasteTextAppearanceBodySmall);
            fuo.f.setTextColor(fr.c(fuo.a, R.color.white_70));
            fuo.f.setAllCaps(false);
            fuo.f.setText(contextMenuViewModel2.c.b);
            fuo.f.setVisibility(0);
        } else {
            vgl.b(fuo.a, fuo.f, R.attr.pasteTextAppearanceMetadata);
            fuo.f.setAllCaps(true);
            fuo.f.setTextColor(fr.c(fuo.a, R.color.white_70));
            fuo.f.setText(contextMenuViewModel2.d);
            fuo.f.setVisibility(0);
        }
        ViewGroup.LayoutParams layoutParams = fuo.d.getLayoutParams();
        if (contextMenuViewModel2.e == HeaderViewType.LARGE_IMAGE) {
            layoutParams.width = MeasureSpec.makeMeasureSpec(fuo.a.getResources().getDimensionPixelSize(R.dimen.context_menu_header_large_image_width), Integer.MIN_VALUE);
            layoutParams.height = MeasureSpec.makeMeasureSpec(fuo.a.getResources().getDimensionPixelSize(R.dimen.context_menu_header_large_image_height), 1073741824);
            fuo.d.setAdjustViewBounds(true);
        } else {
            if (contextMenuViewModel2.e == HeaderViewType.TWO_LINE_LANDSCAPE_IMAGE) {
                layoutParams.width = (int) ((((float) layoutParams.height) * 16.0f) / 9.0f);
            } else {
                layoutParams.width = layoutParams.height;
            }
        }
        fuo.d.setLayoutParams(layoutParams);
        ImageView imageView = fuo.d;
        Uri uri = contextMenuViewModel2.c.e;
        boolean z = contextMenuViewModel2.c.g;
        SpotifyIconV2 spotifyIconV2 = contextMenuViewModel2.c.f;
        Drawable drawable = null;
        if (uri == null || TextUtils.isEmpty(uri.toString())) {
            uri = null;
        }
        if (spotifyIconV2 != null) {
            drawable = gaa.a(fuo.a, spotifyIconV2, Float.NaN, false, false, (float) vfj.b(32.0f, fuo.a.getResources()));
        }
        wgr a2 = fuo.b.a(uri);
        a2.a(drawable);
        if (drawable != null) {
            a2.b(drawable);
        }
        if (z) {
            a2.a(vhj.a(imageView));
        } else {
            a2.a(imageView);
        }
        fuo.g.setVisibility(TextUtils.isEmpty(contextMenuViewModel2.c.d) ? 8 : 0);
        fuo.g.setText(contextMenuViewModel2.c.d);
        if (!TextUtils.isEmpty(contextMenuViewModel2.c.c)) {
            fzy.c(fuo.g);
            fzy.a(fuo.c);
        }
        TextView textView = fuo.h;
        if (!TextUtils.isEmpty(contextMenuViewModel2.c.c)) {
            i = 0;
        }
        textView.setVisibility(i);
        fuo.h.setText(contextMenuViewModel2.c.c);
        fuo.c();
    }

    public final fup b() {
        return this.d;
    }

    public final int c() {
        return this.b.getResources().getInteger(this.e.i.mVisibleItemsRes);
    }
}
