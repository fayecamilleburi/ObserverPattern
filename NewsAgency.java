import java.util.*;

public class NewsAgency implements NewsAgencySubject{
    private String news;
    private List<Subscriber> subscriberList;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public void subscribe(Subscriber s) {
            subscriberList.add(s);
            System.out.println(s.getSubscriberName() + " has subscribed.");
    }

    @Override
    public void unsubscribe(Subscriber s) {
          subscriberList.remove(s);
          System.out.println(s.getSubscriberName() + " has unsubscribed.");
    }

    @Override
    public String notifySubscribers() {
        String output = new String();
        System.out.println("\nBREAKING NEWS: " + news);

        for(Subscriber s : subscriberList) {
            System.out.println(s.getSubscriberName() + " has been notified: " + news);
        }
        return output;
    }
}