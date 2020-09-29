package com.google.thirdparty.publicsuffix;

public enum PublicSuffixType {
    PRIVATE(':', ','),
    REGISTRY('!', '?');
    
    private final char innerNodeCode;
    private final char leafNodeCode;

    private PublicSuffixType(char c2, char c3) {
        this.innerNodeCode = c2;
        this.leafNodeCode = c3;
    }

    public static PublicSuffixType a(char c2) {
        PublicSuffixType[] values;
        for (PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.innerNodeCode == c2 || publicSuffixType.leafNodeCode == c2) {
                return publicSuffixType;
            }
        }
        StringBuilder sb = new StringBuilder("No enum corresponding to given code: ");
        sb.append(c2);
        throw new IllegalArgumentException(sb.toString());
    }
}
