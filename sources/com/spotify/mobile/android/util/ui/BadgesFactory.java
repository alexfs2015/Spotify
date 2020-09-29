package com.spotify.mobile.android.util.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.ui.BadgesFactory.Badge;
import com.spotify.mobile.android.util.ui.BadgesFactory.BadgeSize;
import com.spotify.music.R;
import com.spotify.paste.graphics.drawable.BadgedDrawable;
import com.spotify.paste.graphics.drawable.BadgedDrawable.BadgePosition;
import com.spotify.paste.graphics.drawable.BadgedDrawable.a;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

public final class BadgesFactory {

    public enum Badge {
        VERIFIED {
            /* access modifiers changed from: 0000 */
            public final Drawable a(Context context, Drawable drawable, BadgeSize badgeSize) {
                Context context2 = context;
                Drawable drawable2 = drawable;
                return new BadgesFactory().a(context, drawable, SpotifyIconV2.CHECK, BadgePosition.BOTTOM_RIGHT, fr.c(context, R.color.cat_white), fr.c(context, R.color.cat_light_cyan), context.getResources().getDimensionPixelSize(badgeSize.sizeRes), context.getResources().getDimensionPixelSize(badgeSize.marginRes));
            }
        };

        /* access modifiers changed from: 0000 */
        public abstract Drawable a(Context context, Drawable drawable, BadgeSize badgeSize);
    }

    public enum BadgeSize {
        SMALL(R.dimen.badge_small_size, R.dimen.badge_small_margin),
        MEDIUM(R.dimen.badge_medium_size, R.dimen.badge_medium_margin),
        LARGE(R.dimen.badge_large_size, R.dimen.badge_large_margin);
        
        public final int marginRes;
        public final int sizeRes;

        private BadgeSize(int i, int i2) {
            this.marginRes = i2;
            this.sizeRes = i;
        }
    }

    private static vfk a(Context context, Badge badge, BadgeSize badgeSize, vfk vfk) {
        return vhj.a(context, vfk, (gcr<Drawable, Drawable>) new gcr(context, badgeSize) {
            private final /* synthetic */ Context f$1;
            private final /* synthetic */ BadgeSize f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object apply(Object obj) {
                return Badge.this.a(this.f$1, (Drawable) obj, this.f$2);
            }
        });
    }

    public final Drawable a(Context context, Drawable drawable, SpotifyIconV2 spotifyIconV2, BadgePosition badgePosition, int i, int i2, int i3, int i4) {
        SpotifyIconDrawable spotifyIconDrawable = new SpotifyIconDrawable(context, spotifyIconV2, ((float) i3) * 0.6f);
        spotifyIconDrawable.a(i);
        vgr vgr = new vgr(spotifyIconDrawable, 0.6f);
        vgr.a(i2);
        a a = BadgedDrawable.a();
        a.a = badgePosition;
        a.d = i4;
        a.e = i4;
        a.f = true;
        return new BadgedDrawable(drawable, vgr, a);
    }

    public final vfk a(Context context, BadgeSize badgeSize, vfk vfk) {
        return a(context, Badge.VERIFIED, badgeSize, vfk);
    }
}
