package com.spotify.android.glue.patterns.prettylist.compat;

import android.content.Context;
import androidx.fragment.app.Fragment;

public enum GluePrettyListCompatStates {
    PRETTY_LIST_VIEW {
        public final <T extends fyv> fyk<T> a(fym fym, Context context, Fragment fragment, fyh fyh, fyb fyb) {
            vhn vhn = fym.m;
            int i = fym.b;
            if (vhn != null) {
                fzc fzc = new fzc(fym, context, fragment, vhn, fyb);
                return fzc;
            } else if (i == 1) {
                return new fzd(fym, context, fragment, fyb);
            } else {
                if (i != 2) {
                    return new fze(fym, context, fragment, fyb);
                }
                throw new UnsupportedOperationException("Not implemented");
            }
        }
    },
    GLUE_HEADER_LAYOUT {
        public final <T extends fyv> fyk<T> a(fym fym, Context context, Fragment fragment, fyh fyh, fyb fyb) {
            vhn vhn = fym.m;
            int i = fym.b;
            if (vhn != null) {
                fyy fyy = new fyy(fym, context, fragment, vhn, fyh);
                return fyy;
            } else if (i == 1) {
                return new fyz(context, fym, fyh);
            } else {
                if (i != 2) {
                    return i == 3 ? new fza(context, fym) : new fzb(context, fym);
                }
                throw new UnsupportedOperationException("Not implemented");
            }
        }
    },
    PRETTY_RECYCLER_VIEW {
        public final <T extends fyv> fyk<T> a(fym fym, Context context, Fragment fragment, fyh fyh, fyb fyb) {
            vhn vhn = fym.m;
            int i = fym.b;
            if (vhn != null) {
                fzf fzf = new fzf(fym, context, fragment, vhn, fyb);
                return fzf;
            } else if (i == 1) {
                return new fzg(fym, context, fragment, fyb);
            } else {
                if (i != 2) {
                    return new fzh(fym, context, fragment, fyb);
                }
                throw new UnsupportedOperationException("Not implemented");
            }
        }
    };

    public abstract <T extends fyv> fyk<T> a(fym fym, Context context, Fragment fragment, fyh fyh, fyb fyb);
}
