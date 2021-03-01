public class Link {
     int story_id;
     int link_id;
     String description;
     String body;

    public int getStory_id() {
        return story_id;
    }

    public String getBody() {
        return body;
    }
    public int getLink_id() {
        return link_id;
    }

    public String getDescription() {
        return description;
    }

        public Link( int story_id, int link_id,String description ){
        this.story_id=story_id;
        this.link_id=link_id;
        this.description=description;


    }
}

