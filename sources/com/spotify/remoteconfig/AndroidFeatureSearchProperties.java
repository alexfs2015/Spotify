package com.spotify.remoteconfig;

public abstract class AndroidFeatureSearchProperties implements vum {

    public enum NewPodcastResultComponents implements vuc {
        OFF("off"),
        WITH_SHOW_NAME("with_show_name"),
        WITH_DURATION("with_duration");
        
        final String value;

        private NewPodcastResultComponents(String str) {
            this.value = str;
        }

        public final String a() {
            return this.value;
        }
    }

    public static abstract class a {
        public abstract a a(NewPodcastResultComponents newPodcastResultComponents);

        public abstract a a(boolean z);

        public abstract AndroidFeatureSearchProperties a();
    }

    public static AndroidFeatureSearchProperties a(vuo vuo) {
        String str = "android-feature-search";
        boolean a2 = vuo.a(str, "enable_search_proto", false);
        return new defpackage.vtg.a().a(false).a(NewPodcastResultComponents.OFF).a(a2).a((NewPodcastResultComponents) vuo.a(str, "new_podcast_result_components", NewPodcastResultComponents.OFF)).a();
    }

    public abstract boolean a();

    public abstract NewPodcastResultComponents b();
}
