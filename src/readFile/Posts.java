package readFile;

public class Posts {
    private String id;
    private String title;
    private String subtitle;
    private String content;
    private long views;

    public Posts() {
    }

    public Posts(String id, String title, String subtitle, String content, long views) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.content = content;
        this.views = views;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", content='" + content + '\'' +
                ", views=" + views +
                '}';
    }

    public String convertLine() {
        return getId() + getTitle() + getSubtitle() + getContent() + getViews();
    }
}
