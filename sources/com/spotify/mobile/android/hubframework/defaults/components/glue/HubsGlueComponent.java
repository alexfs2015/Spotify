package com.spotify.mobile.android.hubframework.defaults.components.glue;

import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.R;

public enum HubsGlueComponent implements gul, gzr {
    BACKGROUND("glue:gradient", HubsComponentCategory.ROW) {
        public final int resolve(gzt gzt) {
            return Impl.a.mId;
        }
    },
    CAROUSEL("glue:carousel", HubsComponentCategory.ROW) {
        public final int resolve(gzt gzt) {
            return Impl.b.mId;
        }
    },
    EMPTY_VIEW("glue:emptyview", HubsComponentCategory.CARD) {
        public final int resolve(gzt gzt) {
            return Impl.c.mId;
        }
    },
    HEADER("glue:header", HubsComponentCategory.HEADER) {
        public final int resolve(gzt gzt) {
            Impl impl;
            if (gzt.images().main() != null) {
                impl = Impl.g;
            } else {
                impl = Impl.f;
            }
            return impl.mId;
        }
    },
    HEADER_COVER_ART("glue:header:cover", HubsComponentCategory.HEADER) {
        public final int resolve(gzt gzt) {
            return Impl.d.mId;
        }
    },
    HEADER_LARGE("glue:header:large", HubsComponentCategory.HEADER) {
        public final int resolve(gzt gzt) {
            return Impl.e.mId;
        }
    },
    HEADER_LEGACY("glue:header:legacy", HubsComponentCategory.HEADER) {
        public final int resolve(gzt gzt) {
            return Impl.f.mId;
        }
    },
    HEADER_LEGACY_COVER_ART("glue:header:legacy:coverart", HubsComponentCategory.HEADER) {
        public final int resolve(gzt gzt) {
            return Impl.g.mId;
        }
    },
    HEADER_LEGACY_SCROLLING("glue:header:legacy:scrolling", HubsComponentCategory.HEADER) {
        public final int resolve(gzt gzt) {
            return Impl.h.mId;
        }
    },
    HEADER_NEW("glue:header:header", HubsComponentCategory.HEADER) {
        public final int resolve(gzt gzt) {
            return Impl.i.mId;
        }
    },
    SHUFFLE_BUTTON("glue:shuffleButton", HubsComponentCategory.ROW) {
        public final int resolve(gzt gzt) {
            return Impl.j.mId;
        }
    };
    
    private final String mCategory;
    private final String mComponentId;

    enum Impl implements gvo {
        public static final Impl a = null;
        public static final Impl b = null;
        public static final Impl c = null;
        public static final Impl d = null;
        public static final Impl e = null;
        public static final Impl f = null;
        public static final Impl g = null;
        public static final Impl h = null;
        public static final Impl i = null;
        public static final Impl j = null;
        /* access modifiers changed from: private */
        public static final Impl[] k = null;
        private static final /* synthetic */ Impl[] l = null;
        final int mId;

        public static Impl valueOf(String str) {
            return (Impl) Enum.valueOf(Impl.class, str);
        }

        public static Impl[] values() {
            return (Impl[]) l.clone();
        }

        /* synthetic */ Impl(String str, int i2, int i3, byte b2) {
            this(str, i2, i3);
        }

        static {
            a = new Impl("BACKGROUND", 0, R.id.hub_glue_background) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gxa();
                }
            };
            b = new Impl("CAROUSEL", 1, R.id.hub_glue_carousel) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gwi();
                }
            };
            c = new Impl("EMPTY_VIEW", 2, R.id.hub_glue_empty_view) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gwp(hubsGlueImageDelegate);
                }
            };
            d = new Impl("HEADER_COVER_ART", 3, R.id.hub_glue_header_cover_art) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new a(hubsGlueImageDelegate);
                }
            };
            e = new Impl("HEADER_LARGE", 4, R.id.hub_glue_header_large) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new c(hubsGlueImageDelegate);
                }
            };
            f = new Impl("HEADER_LEGACY", 5, R.id.hub_glue_header_legacy) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gws(hubsGlueImageDelegate);
                }
            };
            g = new Impl("HEADER_LEGACY_COVER_ART", 6, R.id.hub_glue_header_legacy_cover_art) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b(hubsGlueImageDelegate);
                }
            };
            h = new Impl("HEADER_LEGACY_SCROLLING", 7, R.id.hub_glue_header_legacy_static) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new a(hubsGlueImageDelegate);
                }
            };
            i = new Impl("HEADER_NEW", 8, R.id.hub_glue_header_header) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new b(hubsGlueImageDelegate);
                }
            };
            j = new Impl("SHUFFLE_BUTTON", 9, R.id.hub_glue_shuffle_button) {
                public final gvl<?> a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    return new gwy();
                }
            };
            l = new Impl[]{a, b, c, d, e, f, g, h, i, j};
            k = values();
        }

        private Impl(String str, int i2, int i3) {
            this.mId = i3;
        }

        public final int a() {
            return this.mId;
        }
    }

    private HubsGlueComponent(String str, HubsComponentCategory hubsComponentCategory) {
        this.mComponentId = (String) fay.a(str);
        this.mCategory = ((HubsComponentCategory) fay.a(hubsComponentCategory)).mId;
    }

    public String id() {
        return this.mComponentId;
    }

    public String category() {
        return this.mCategory;
    }

    public static guk a(HubsGlueImageDelegate hubsGlueImageDelegate) {
        return a.a(hubsGlueImageDelegate, Impl.k);
    }

    public static int a() {
        return Impl.f.mId;
    }
}
