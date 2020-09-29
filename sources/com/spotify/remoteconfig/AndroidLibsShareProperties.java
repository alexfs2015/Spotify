package com.spotify.remoteconfig;

public abstract class AndroidLibsShareProperties implements vhh {

    public enum FacebookShareStoryVsFeed implements vgx {
        CONTROL("control"),
        SEPARATE_MENU_ITEMS("separate_menu_items"),
        POP_UP("pop_up");
        
        public final String value;

        private FacebookShareStoryVsFeed(String str) {
            this.value = str;
        }

        public final String a() {
            return this.value;
        }
    }

    public static abstract class a {
        public abstract a a(FacebookShareStoryVsFeed facebookShareStoryVsFeed);

        public abstract a a(boolean z);

        public abstract AndroidLibsShareProperties a();
    }

    public abstract boolean a();

    public abstract FacebookShareStoryVsFeed b();

    public static AndroidLibsShareProperties a(vhj vhj) {
        String str = "android-libs-share";
        boolean a2 = vhj.a(str, "enable_share_reordering_experiment", false);
        return new defpackage.vgm.a().a(false).a(FacebookShareStoryVsFeed.CONTROL).a(a2).a((FacebookShareStoryVsFeed) vhj.a(str, "facebook_share_story_vs_feed", FacebookShareStoryVsFeed.CONTROL)).a();
    }
}
