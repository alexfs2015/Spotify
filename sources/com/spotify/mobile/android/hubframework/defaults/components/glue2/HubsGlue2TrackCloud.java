package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.R;

public enum HubsGlue2TrackCloud implements gul, gzr {
    TRACK_CLOUD("glue2:trackCloud") {
        public final int resolve(gzt gzt) {
            return Impl.a.mId;
        }
    };
    
    private final String mComponentId;

    enum Impl implements gvo {
        public static final Impl a = null;
        /* access modifiers changed from: private */
        public static final Impl[] b = null;
        private static final /* synthetic */ Impl[] c = null;
        final int mId;

        /* synthetic */ Impl(String str, int i, int i2, byte b2) {
            this(str, i, i2);
        }

        public static Impl valueOf(String str) {
            return (Impl) Enum.valueOf(Impl.class, str);
        }

        public static Impl[] values() {
            return (Impl[]) c.clone();
        }

        static {
            a = new Impl("TRACK_CLOUD", 0, R.id.hub_glue2_solar_track_cloud) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gxq();
                }
            };
            c = new Impl[]{a};
            b = values();
        }

        private Impl(String str, int i, int i2) {
            this.mId = i2;
        }

        public final int a() {
            return this.mId;
        }
    }

    private HubsGlue2TrackCloud(String str) {
        this.mComponentId = str;
    }

    public String id() {
        return this.mComponentId;
    }

    public static guk a(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return a.a(hubsGlueImageDelegate, Impl.b);
    }

    public String category() {
        return HubsComponentCategory.ROW.mId;
    }
}
