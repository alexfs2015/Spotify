package com.spotify.remoteconfig;

public abstract class AndroidLibsShareProperties implements vum {

    public enum FacebookShareStoryVsFeed implements vuc {
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

    public static AndroidLibsShareProperties a(vuo vuo) {
        String str = "android-libs-share";
        boolean a2 = vuo.a(str, "enable_share_reordering_experiment", false);
        return new defpackage.vtq.a().a(false).a(FacebookShareStoryVsFeed.CONTROL).a(a2).a((FacebookShareStoryVsFeed) vuo.a(str, "facebook_share_story_vs_feed", FacebookShareStoryVsFeed.CONTROL)).a();
    }

    public abstract boolean a();

    public abstract FacebookShareStoryVsFeed b();
}
