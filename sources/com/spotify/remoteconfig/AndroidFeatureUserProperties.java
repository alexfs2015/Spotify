package com.spotify.remoteconfig;

public abstract class AndroidFeatureUserProperties implements vhh {

    public enum ProfileViewMoreLinkTextResource implements vgx {
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

    public abstract ProfileViewMoreLinkTextResource a();

    public static AndroidFeatureUserProperties a(vhj vhj) {
        return new defpackage.vge.a().a(ProfileViewMoreLinkTextResource.PROFILE_VIEW_ALL_FOOTER).a((ProfileViewMoreLinkTextResource) vhj.a("android-feature-user", "profile_view_more_link_text_resource", ProfileViewMoreLinkTextResource.PROFILE_VIEW_ALL_FOOTER)).a();
    }
}
