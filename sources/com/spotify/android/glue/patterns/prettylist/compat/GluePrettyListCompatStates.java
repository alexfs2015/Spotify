package com.spotify.android.glue.patterns.prettylist.compat;

import android.content.Context;
import androidx.fragment.app.Fragment;

public enum GluePrettyListCompatStates {
    PRETTY_LIST_VIEW {
        public final <T extends fyb> fxq<T> a(fxs fxs, Context context, Fragment fragment, fxn fxn, fxh fxh) {
            uvx uvx = fxs.m;
            int i = fxs.b;
            if (uvx != null) {
                fyi fyi = new fyi(fxs, context, fragment, uvx, fxh);
                return fyi;
            } else if (i == 1) {
                return new fyj(fxs, context, fragment, fxh);
            } else {
                if (i != 2) {
                    return new fyk(fxs, context, fragment, fxh);
                }
                throw new UnsupportedOperationException("Not implemented");
            }
        }
    },
    GLUE_HEADER_LAYOUT {
        public final <T extends fyb> fxq<T> a(fxs fxs, Context context, Fragment fragment, fxn fxn, fxh fxh) {
            uvx uvx = fxs.m;
            int i = fxs.b;
            if (uvx != null) {
                fye fye = new fye(fxs, context, fragment, uvx, fxn);
                return fye;
            } else if (i == 1) {
                return new fyf(context, fxs, fxn);
            } else {
                if (i == 2) {
                    throw new UnsupportedOperationException("Not implemented");
                } else if (i == 3) {
                    return new fyg(context, fxs);
                } else {
                    return new fyh(context, fxs);
                }
            }
        }
    },
    PRETTY_RECYCLER_VIEW {
        public final <T extends fyb> fxq<T> a(fxs fxs, Context context, Fragment fragment, fxn fxn, fxh fxh) {
            uvx uvx = fxs.m;
            int i = fxs.b;
            if (uvx != null) {
                fyl fyl = new fyl(fxs, context, fragment, uvx, fxh);
                return fyl;
            } else if (i == 1) {
                return new fym(fxs, context, fragment, fxh);
            } else {
                if (i != 2) {
                    return new fyn(fxs, context, fragment, fxh);
                }
                throw new UnsupportedOperationException("Not implemented");
            }
        }
    };

    public abstract <T extends fyb> fxq<T> a(fxs fxs, Context context, Fragment fragment, fxn fxn, fxh fxh);
}
