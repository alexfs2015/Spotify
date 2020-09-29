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
        private final gug a;
        private final SparseIntArray b = new SparseIntArray();
        private final int c;
        private final int d;
        private final int e;
        private final int f;
        private final int g;

        a(Context context) {
            fay.a(context);
            this.c = context.getResources().getDimensionPixelSize(R.dimen.hugs_card_row_gap);
            this.d = context.getResources().getDimensionPixelSize(R.dimen.hub_big_card_top_padding);
            this.e = context.getResources().getDimensionPixelSize(R.dimen.hub_big_card_bottom_padding);
            this.g = context.getResources().getDimensionPixelSize(R.dimen.hugs_spinner_padding_top_bottom);
            int i = this.c;
            this.f = i / 4;
            this.a = new gug(i, uur.a(context));
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

        public final void a(Rect rect, Set<Trait> set, Set<Trait> set2, Set<Trait> set3, int i, b bVar) {
            int i2;
            int i3;
            int i4;
            if (set2.contains(Trait.CARD)) {
                gug gug = this.a;
                if (gug.b) {
                    i2 = gug.b((gug.c(i, bVar) + bVar.b(i)) - 1, bVar);
                } else {
                    i2 = gug.a(gug.c(i, bVar), bVar);
                }
                int i5 = this.b.get(i, -1);
                if (i5 < 0) {
                    i5 = bVar.c(i);
                    this.b.put(i, i5);
                }
                if (i5 == 0) {
                    i3 = this.c;
                } else {
                    i3 = 0;
                }
                gug gug2 = this.a;
                if (gug2.b) {
                    i4 = gug2.a(gug2.c(i, bVar), bVar);
                } else {
                    i4 = gug2.b((gug2.c(i, bVar) + bVar.b(i)) - 1, bVar);
                }
                rect.set(i2, i3, i4, this.c);
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
                int i6 = this.g;
                rect.top = i6;
                rect.bottom = i6;
            }
            if (set2.contains(Trait.BIG_CARD)) {
                rect.top = this.d;
                if (!set3.contains(Trait.STACKABLE)) {
                    rect.bottom = this.e;
                }
            }
        }

        public final void a() {
            this.a.a.clear();
            this.b.clear();
        }
    }

    public static jps a(Context context, c<Trait> cVar) {
        return new jps(cVar, new a(context));
    }
}
