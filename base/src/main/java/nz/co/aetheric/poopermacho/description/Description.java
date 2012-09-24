package nz.co.aetheric.poopermacho.description;

import nz.co.aetheric.poopermacho.BaseEntity;

/** What is the purpose of this class? */
public class Description extends BaseEntity<Description> {
    public static final String TYPE_LOG = "log";

    private String descType;
    private String content;

    public Description() {
        super(Description.class);
    }

    public String getDescType() {
        return descType;
    }

    public Description setDescType(String descType) {
        this.descType = descType;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Description setContent(String content) {
        this.content = content;
        return this;
    }
}
