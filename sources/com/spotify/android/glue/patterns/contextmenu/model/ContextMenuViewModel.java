package com.spotify.android.glue.patterns.contextmenu.model;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.spotify.music.R;
import java.util.List;

public final class ContextMenuViewModel {
    public final List<fvb> a = Lists.a();
    public final List<fva> b = Lists.a();
    public fuz c = new fuz();
    public String d;
    public HeaderViewType e = HeaderViewType.TWO_LINE_SQUARE_IMAGE;
    public boolean f;
    public boolean g;
    public boolean h = true;
    public final ItemAppearance i = ItemAppearance.LEFT_ALIGNED_WITH_ICONS;

    public enum HeaderViewType {
        TWO_LINE_SQUARE_IMAGE,
        TWO_LINE_LANDSCAPE_IMAGE,
        LARGE_IMAGE
    }

    public enum ItemAppearance {
        LEFT_ALIGNED_WITH_ICONS(R.layout.solar_context_menu_item, 8388611, R.integer.solar_context_menu_initial_visible_items, true);
        
        public final boolean mAlwaysShowIcons;
        public final int mGravity;
        public final int mLayoutRes;
        public final int mVisibleItemsRes;

        private ItemAppearance(int i, int i2, int i3, boolean z) {
            this.mLayoutRes = i;
            this.mGravity = 8388611;
            this.mVisibleItemsRes = i3;
            this.mAlwaysShowIcons = true;
        }
    }

    public final ContextMenuViewModel a(Uri uri) {
        this.c.e = uri;
        return this;
    }

    public final ContextMenuViewModel a(String str) {
        this.c.a = str;
        return this;
    }

    public final ContextMenuViewModel a(boolean z) {
        this.c.g = z;
        return this;
    }

    public final fva a(int i2, CharSequence charSequence) {
        b bVar = new b(i2, charSequence);
        this.b.add(bVar);
        return bVar;
    }

    public final fva a(int i2, CharSequence charSequence, Drawable drawable) {
        b bVar = new b(i2, charSequence, drawable);
        this.b.add(bVar);
        return bVar;
    }

    public final fva a(int i2, CharSequence charSequence, Drawable drawable, int i3) {
        b bVar = new b(i2, charSequence, drawable);
        this.b.add(i3, bVar);
        return bVar;
    }

    public final fvb a(int i2, CharSequence charSequence, ImmutableList<Drawable> immutableList) {
        fvb fvb = new fvb(i2, charSequence, immutableList, 0);
        this.a.add(fvb);
        return fvb;
    }

    public final void a() {
        this.b.add(new a());
    }

    public final ContextMenuViewModel b(String str) {
        this.c.c = str;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextMenuViewModel)) {
            return false;
        }
        ContextMenuViewModel contextMenuViewModel = (ContextMenuViewModel) obj;
        if (this.f != contextMenuViewModel.f) {
            return false;
        }
        fuz fuz = this.c;
        if (fuz == null ? contextMenuViewModel.c != null : !fuz.equals(contextMenuViewModel.c)) {
            return false;
        }
        String str = this.d;
        if (str == null ? contextMenuViewModel.d != null : !str.equals(contextMenuViewModel.d)) {
            return false;
        }
        if (this.e != contextMenuViewModel.e) {
            return false;
        }
        List<fva> list = this.b;
        return list != null ? list.equals(contextMenuViewModel.b) : contextMenuViewModel.b == null;
    }

    public final int hashCode() {
        fuz fuz = this.c;
        int i2 = 0;
        int hashCode = (fuz != null ? fuz.hashCode() : 0) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        HeaderViewType headerViewType = this.e;
        int hashCode3 = (((hashCode2 + (headerViewType != null ? headerViewType.hashCode() : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        List<fva> list = this.b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }
}
