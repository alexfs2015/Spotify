package com.spotify.mobile.android.glue;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseIntArray;
import com.spotify.music.R;
import java.util.Set;

public final class GlueLayoutTraits {

    public enum Trait {
        BIG_CARD,
        CARD,
        HEADER,
        ONE_COLUMN,
        SPACED_VERTICALLY,
        SPINNER,
        STACKABLE,
        THREE_COLUMN,
        TWO_COLUMN
    }

    static final class a implements d<Trait> {
        private final gwg a;
        private final SparseIntArray b = new SparseIntArray();
        private final int c;
        private final int d;
        private final int e;
        private final int f;
        private final int g;

        a(Context context) {
            fbp.a(context);
            this.c = context.getResources().getDimensionPixelSize(R.dimen.hugs_card_row_gap);
            this.d = context.getResources().getDimensionPixelSize(R.dimen.hub_big_card_top_padding);
            this.e = context.getResources().getDimensionPixelSize(R.dimen.hub_big_card_bottom_padding);
            this.g = context.getResources().getDimensionPixelSize(R.dimen.hugs_spinner_padding_top_bottom);
            int i = this.c;
            this.f = i / 4;
            this.a = new gwg(i, vgi.a(context));
        }

        public final int a(Set<Trait> set, int i) {
            if (set.contains(Trait.ONE_COLUMN)) {
                return 1;
            }
            if (set.contains(Trait.TWO_COLUMN)) {
                return 2;
            }
            if (set.contains(Trait.THREE_COLUMN)) {
                return 3;
            }
            return i;
        }

        public final void a() {
            this.a.a.clear();
            this.b.clear();
        }

        public final void a(Rect rect, Set<Trait> set, Set<Trait> set2, Set<Trait> set3, int i, b bVar) {
            if (set2.contains(Trait.CARD)) {
                gwg gwg = this.a;
                int b2 = gwg.b ? gwg.b((gwg.c(i, bVar) + bVar.b(i)) - 1, bVar) : gwg.a(gwg.c(i, bVar), bVar);
                int i2 = this.b.get(i, -1);
                if (i2 < 0) {
                    i2 = bVar.c(i);
                    this.b.put(i, i2);
                }
                int i3 = i2 == 0 ? this.c : 0;
                gwg gwg2 = this.a;
                rect.set(b2, i3, gwg2.b ? gwg2.a(gwg2.c(i, bVar), bVar) : gwg2.b((gwg2.c(i, bVar) + bVar.b(i)) - 1, bVar), this.c);
            } else if (set3.contains(Trait.CARD)) {
                if (set2.contains(Trait.HEADER)) {
                    rect.bottom = this.f;
                } else {
                    rect.bottom = this.c;
                }
            }
            if (set2.contains(Trait.SPACED_VERTICALLY)) {
                if (!set.contains(Trait.HEADER)) {
                    rect.top += this.c;
                }
                if (!set3.contains(Trait.STACKABLE) && !set3.contains(Trait.HEADER)) {
                    rect.bottom += this.c;
                }
            }
            if (set2.contains(Trait.SPINNER)) {
                int i4 = this.g;
                rect.top = i4;
                rect.bottom = i4;
            }
            if (set2.contains(Trait.BIG_CARD)) {
                rect.top = this.d;
                if (!set3.contains(Trait.STACKABLE)) {
                    rect.bottom = this.e;
                }
            }
        }
    }

    public static jse a(Context context, c<Trait> cVar) {
        return new jse(cVar, new a(context));
    }
}
