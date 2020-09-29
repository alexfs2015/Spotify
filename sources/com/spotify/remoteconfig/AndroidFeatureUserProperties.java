package com.spotify.remoteconfig;

public abstract class AndroidFeatureUserProperties implements vum {

    public enum ProfileViewMoreLinkTextResource implements vuc {
        PROFILE_VIEW_ALL_FOOTER("profile_view_all_footer"),
        PROFILE_VIEW_MORE_FOOTER("profile_view_more_footer"),
        PROFILE_VIEW_MORE_ITEMS_FOOTER("profile_view_more_items_footer");
        
        final String value;

        private ProfileViewMoreLinkTextResource(String str) {
            this.value = str;
        }

        public final String a() {
            return this.value;
        }
    }

    public static abstract class a {
        public abstract a a(ProfileViewMoreLinkTextResource profileViewMoreLinkTextResource);

        public abstract AndroidFeatureUserProperties a();
    }

    public static AndroidFeatureUserProperties a(vuo vuo) {
        return new defpackage.vth.a().a(ProfileViewMoreLinkTextResource.PROFILE_VIEW_ALL_FOOTER).a((ProfileViewMoreLinkTextResource) vuo.a("android-feature-user", "profile_view_more_link_text_resource", ProfileViewMoreLinkTextResource.PROFILE_VIEW_ALL_FOOTER)).a();
    }

    public abstract ProfileViewMoreLinkTextResource a();
}
