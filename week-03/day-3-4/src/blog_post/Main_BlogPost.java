package blog_post;

public class Main_BlogPost {

    public static void main(String[] args) {

        BlogPost lorum = new BlogPost("Jhon Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet." +"\n",
                "2000.05.04.");

        BlogPost why = new BlogPost("Tim Urban", "Wait but why" +"\n",
                "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");

        BlogPost enginer = new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump" +"\n",
        "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " + "\n" +
                "When I asked to take his picture outside one of IBM’s New York City offices, " +"\n" +
                "he told me that he wasn’t really into the whole organizer profile thing.","2017.03.28.");

    }
}
